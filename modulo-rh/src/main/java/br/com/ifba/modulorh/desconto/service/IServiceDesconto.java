package br.com.ifba.modulorh.desconto.service;

import br.com.ifba.modulorh.desconto.model.Desconto;
import java.util.List;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceDesconto {
    
    Desconto saveDesconto(Desconto desconto);
    void updateDesconto(Desconto desconto);
    void deleteDesconto(Desconto desconto);
    Desconto findById(Long id);
    List<Desconto> getAllDescontos();
    
}