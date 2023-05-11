package br.com.ifba.modulorh.registrodeponto.service;

import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import br.com.ifba.modulorh.registrodeponto.repository.IRepositoryRegistroDePonto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Nogueira
 */
@Service
public class ServiceRegistroDePonto implements IServiceRegistroDePonto {
    
    public final static String REGISTRODEPONTO_NULL = "Dados do registro de ponto não preenchidos.";
    public final static String REGISTRODEPONTO_EXISTE = "Registro de ponto já existe no Banco de Dados.";
    public final static String REGISTRODEPONTO_NAO_EXISTE = "Registro de ponto não existe no Banco de Dados.";
    
    @Autowired
    private IRepositoryRegistroDePonto repositoryRegistroDePonto;
    
    @Override
    public RegistroDePonto saveRegistroDePonto(RegistroDePonto registroDePonto) {
        if(registroDePonto == null){
            throw new BusinessException(REGISTRODEPONTO_NULL);
        }
        if(repositoryRegistroDePonto.existsById(registroDePonto.getId()) == true){
            throw new BusinessException(REGISTRODEPONTO_EXISTE);
        }
        return repositoryRegistroDePonto.save(registroDePonto);
    }

    @Override
    public RegistroDePonto updateRegistroDePonto(RegistroDePonto registroDePonto) {
        if(registroDePonto == null){
            throw new BusinessException(REGISTRODEPONTO_NULL);
        }
        if(repositoryRegistroDePonto.existsById(registroDePonto.getId()) == false){
            throw new BusinessException(REGISTRODEPONTO_NAO_EXISTE);
        }
        return repositoryRegistroDePonto.save(registroDePonto);
    }

    @Override
    public void deleteRegistroDePonto(RegistroDePonto registroDePonto) {
        if(registroDePonto == null){
            throw new BusinessException(REGISTRODEPONTO_NULL);
        }
        if(repositoryRegistroDePonto.existsById(registroDePonto.getId()) == false){
            throw new BusinessException(REGISTRODEPONTO_NAO_EXISTE);
        }
        repositoryRegistroDePonto.delete(
                repositoryRegistroDePonto.getReferenceById(registroDePonto.getId()));
}

    @Override
    public List<RegistroDePonto> getAllRegistroDePonto() {
        return this.repositoryRegistroDePonto.findAll();    
    }
    
    @Override
    public RegistroDePonto findById(Long id) {
        return repositoryRegistroDePonto.getReferenceById(id);
    }
    
    @Override
    public List<RegistroDePonto> getAllRegistroDePontoByCpf(String cpf) {
        return repositoryRegistroDePonto.findAllByCpf(cpf);
    }
    
}
