package br.com.ifba.modulorh.pagamentos.service;

import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import java.util.List;

/**
 *
 * @author Lucas Nogueira
 */
public interface IServicePagamentos {
    
    public Pagamentos savePagamento(Pagamentos pagamento);
    public Pagamentos updatePagamento(Pagamentos pagamento);
    public void deletePagamento(Pagamentos pagamento);
    public List<Pagamentos> getAllPagamentos();
    public Pagamentos findById(Long id);
    
}
