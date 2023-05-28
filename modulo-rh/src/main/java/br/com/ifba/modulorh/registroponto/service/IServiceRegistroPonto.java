package br.com.ifba.modulorh.registroponto.service;

import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import java.util.List;

/**
 *
 * @author Lucas Nogueira
 */
public interface IServiceRegistroPonto {
    
    RegistroPonto saveRegistroPonto(RegistroPonto ponto);
    RegistroPonto updateRegistroPonto(RegistroPonto ponto);
    void deleteRegistroPonto(Long id);
    List<RegistroPonto> getAllRegistrosPonto();
    RegistroPonto findById(Long id);
    List<RegistroPonto> findRegistrosByFuncionarioId(Long id);
    
}
