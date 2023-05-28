package br.com.ifba.modulorh.registroponto.service;

import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.modulorh.registroponto.repository.IRepositoryRegistroPonto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lucas Nogueira
 */
@Service
public class ServiceRegistroPonto implements IServiceRegistroPonto {
    
    private final static String REGISTRO_PONTO_NULL = "Dados do registro de ponto não preenchidos.";
    private final static String REGISTRO_PONTO_EXISTE = "Registro de ponto já existe no Banco de Dados.";
    private final static String REGISTRO_PONTO_NAO_EXISTE = "Registro de ponto não existe no Banco de Dados.";
    
    private final DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    @Autowired
    private IRepositoryRegistroPonto repositoryRegistroPonto;
    
    @Override
    public RegistroPonto saveRegistroPonto(RegistroPonto ponto) {
        if (ponto == null){
            throw new BusinessException(REGISTRO_PONTO_NULL);
        }
        
        if (repositoryRegistroPonto.existsById(ponto.getId()) == true){
            throw new BusinessException(REGISTRO_PONTO_EXISTE);
        }
        
        Optional<RegistroPonto> pontoBd = repositoryRegistroPonto
                .findFirstByFuncionarioIdOrderByIdDesc(ponto.getFuncionario().getId());
        
        // Se há ponto sem data de saída ->
        if (pontoBd.isPresent() && formatarData.format(pontoBd.get().getSaida()).equals("01/01/0001 00:00:00")) {
            ponto = pontoBd.get();
            ponto.setSaida(LocalDateTime.now());
            ponto.setPresente(true);
            return repositoryRegistroPonto.save(ponto);
        }
        
        // Ponto de entrada ->
        ponto.setEntrada(LocalDateTime.now());
        ponto.setSaida(LocalDateTime.parse("01/01/0001 00:00:00", formatarData));
        return repositoryRegistroPonto.save(ponto);
    }

    @Override
    public RegistroPonto updateRegistroPonto(RegistroPonto ponto) {
        if (ponto == null){
            throw new BusinessException(REGISTRO_PONTO_NULL);
        }
        
        if (repositoryRegistroPonto.existsById(ponto.getId()) == false){
            throw new BusinessException(REGISTRO_PONTO_NAO_EXISTE);
        }
        ponto.setPresente(true);
        return repositoryRegistroPonto.save(ponto);
    }

    @Override
    public void deleteRegistroPonto(Long id) {
        if (repositoryRegistroPonto.existsById(id) == false){
            throw new BusinessException(REGISTRO_PONTO_NAO_EXISTE);
        }
        repositoryRegistroPonto.deleteById(id);
}

    @Override
    public List<RegistroPonto> getAllRegistrosPonto() {
        return this.repositoryRegistroPonto.findAll();    
    }
    
    @Override
    public RegistroPonto findById(Long id) {
        return repositoryRegistroPonto.getReferenceById(id);
    }

    @Override
    public List<RegistroPonto> findRegistrosByFuncionarioId(Long id) {
        return repositoryRegistroPonto.findByFuncionarioId(id);
    }
    
}
