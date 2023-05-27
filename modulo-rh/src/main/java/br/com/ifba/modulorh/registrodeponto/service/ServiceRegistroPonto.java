package br.com.ifba.modulorh.registrodeponto.service;

import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import br.com.ifba.modulorh.registrodeponto.model.RegistroPonto;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.modulorh.registrodeponto.repository.IRepositoryRegistroPonto;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Nogueira
 */
@Service
public class ServiceRegistroPonto implements IServiceRegistroPonto {
    
    private final static String REGISTRO_PONTO_NULL = "Dados do registro de ponto não preenchidos.";
    private final static String REGISTRO_PONTO_EXISTE = "Registro de ponto já existe no Banco de Dados.";
    private final static String REGISTRO_PONTO_NAO_EXISTE = "Registro de ponto não existe no Banco de Dados.";
        
    @Autowired
    private IRepositoryRegistroPonto repositoryRegistroPonto;
    
    @Override
    public RegistroPonto saveRegistroDePonto(RegistroPonto ponto) {
        if (ponto == null){
            throw new BusinessException(REGISTRO_PONTO_NULL);
        }
        
        if (repositoryRegistroPonto.existsById(ponto.getId()) == true){
            throw new BusinessException(REGISTRO_PONTO_EXISTE);
        }
        
        Optional<RegistroPonto> pontoBd = repositoryRegistroPonto
                .findFirstByFuncionarioIdOrderByIdDesc(ponto.getFuncionario().getId());
        
        // Se há ponto sem data de saída ->
        if (pontoBd.isPresent() && pontoBd.get().getSaida() == null) {
            ponto = pontoBd.get();
            ponto.setSaida(LocalDateTime.now());
            ponto.setPresente(true);
            return repositoryRegistroPonto.save(ponto);
        }
        
        // Ponto de entrada ->
        ponto.setEntrada(LocalDateTime.now());
        return repositoryRegistroPonto.save(ponto);
    }

    @Override
    public RegistroPonto updateRegistroDePonto(RegistroPonto ponto) {
        if(ponto == null){
            throw new BusinessException(REGISTRO_PONTO_NULL);
        }
        if(repositoryRegistroPonto.existsById(ponto.getId()) == false){
            throw new BusinessException(REGISTRO_PONTO_NAO_EXISTE);
        }
        return repositoryRegistroPonto.save(ponto);
    }

    @Override
    public void deleteRegistroDePonto(RegistroPonto ponto) {
        if(ponto == null){
            throw new BusinessException(REGISTRO_PONTO_NULL);
        }
        if(repositoryRegistroPonto.existsById(ponto.getId()) == false){
            throw new BusinessException(REGISTRO_PONTO_NAO_EXISTE);
        }
        repositoryRegistroPonto.deleteById(ponto.getId());
}

    @Override
    public List<RegistroPonto> getAllRegistroDePonto() {
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
