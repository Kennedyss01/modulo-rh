package br.com.ifba.modulorh.desconto.service;

import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.desconto.repository.IRepositoryDesconto;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas Dias
 */
@Service
public class ServiceDesconto implements IServiceDesconto {
    
    private final static String DESCONTO_NULL = "Os dados do desconto não foram preenchidos.";
    private final static String DESCONTO_JA_EXISTE = "O desconto informado já existe no sistema.";
    private final static String DESCONTO_NAO_EXISTE = "O desconto informado não existe no sistema.";
     
    @Autowired
    private IRepositoryDesconto repositoryDesconto;
    
    @Override
    public Desconto saveDesconto(Desconto desconto) {
        if (desconto == null) {
            throw new BusinessException(DESCONTO_NULL);
        }
        if (repositoryDesconto.existsByNome(desconto.getNome())) {
            throw new BusinessException(DESCONTO_JA_EXISTE);
        }
        return repositoryDesconto.save(desconto);
    }

    @Override
    public void updateDesconto(Desconto desconto) {
         if (desconto == null) {
            throw new BusinessException(DESCONTO_NULL);
        }
        if (repositoryDesconto.existsByNome(desconto.getNome()) == false) {
            throw new BusinessException(DESCONTO_NAO_EXISTE);
        }
        repositoryDesconto.save(desconto);
    }

    @Override
    public void deleteDesconto(Desconto desconto) {
          if (desconto == null) {
            throw new BusinessException(DESCONTO_NULL);
        }
        if (repositoryDesconto.existsByNome(desconto.getNome()) == false) {
            throw new BusinessException(DESCONTO_NAO_EXISTE);
        }
        repositoryDesconto.delete(desconto);
    }

    @Override
    public Desconto findById(Long id) {
        return repositoryDesconto.getReferenceById(id);
    }
    
}