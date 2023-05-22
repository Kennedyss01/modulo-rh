package br.com.ifba.modulorh.pagamentos.service;

import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import br.com.ifba.modulorh.pagamentos.repository.IRepositoryPagamentos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Nogueira
 */
@Service
public class ServicePagamentos implements IServicePagamentos {
    
    public final static String PAGAMENTO_NULL = "Dados do pagamento nao preenchidos.";
    public final static String PAGAMENTO_EXISTE = "Pagamento ja existe no Banco de Dados.";
    public final static String PAGAMENTO_NAO_EXISTE = "Pagamento nao existe no Banco de Dados.";
    
    @Autowired
    private IRepositoryPagamentos repositoryPagamentos;
    
    @Override
    public Pagamentos savePagamento(Pagamentos pagamento) {
        if(pagamento == null){
            throw new BusinessException(PAGAMENTO_NULL);
        }
        if(repositoryPagamentos.existsById(pagamento.getId()) == true){
            throw new BusinessException(PAGAMENTO_EXISTE);
        }
        return repositoryPagamentos.save(pagamento);
    }

    @Override
    public Pagamentos updatePagamento(Pagamentos pagamento) {
        if(pagamento == null){
            throw new BusinessException(PAGAMENTO_NULL);
        }
        if(repositoryPagamentos.existsById(pagamento.getId()) == false){
            throw new BusinessException(PAGAMENTO_NAO_EXISTE);
        }
        return repositoryPagamentos.save(pagamento);
    }

    @Override
    public void deletePagamento(Pagamentos pagamento) {
        if(pagamento == null){
            throw new BusinessException(PAGAMENTO_NULL);
        }
        if(repositoryPagamentos.existsById(pagamento.getId()) == false){
            throw new BusinessException(PAGAMENTO_NAO_EXISTE);
        }
        repositoryPagamentos.delete(
                repositoryPagamentos.getReferenceById(pagamento.getId()));
}

    @Override
    public List<Pagamentos> getAllPagamentos() {
        return this.repositoryPagamentos.findAll();    
    }
    
    @Override
    public Pagamentos findById(Long id) {
        return repositoryPagamentos.getReferenceById(id);
    }
    
}
