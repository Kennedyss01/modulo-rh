package br.com.ifba.modulorh.registrodeponto.service;

import br.com.ifba.modulorh.registrodeponto.model.RegistroPonto;
import java.util.List;

/**
 *
 * @author Lucas Nogueira
 */
public interface IServiceRegistroPonto {
    
    RegistroPonto saveRegistroDePonto(RegistroPonto ponto);
    RegistroPonto updateRegistroDePonto(RegistroPonto ponto);
    void deleteRegistroDePonto(RegistroPonto ponto);
    List<RegistroPonto> getAllRegistroDePonto();
    RegistroPonto findById(Long id);
    List<RegistroPonto> findRegistrosByFuncionarioId(Long id);
    
}
