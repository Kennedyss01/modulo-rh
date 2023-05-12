package br.com.ifba.modulorh.registrodeponto.service;

import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import java.util.List;

/**
 *
 * @author Lucas Nogueira
 */
public interface IServiceRegistroDePonto {
    
    RegistroDePonto saveRegistroDePonto(RegistroDePonto registroDePonto);
    RegistroDePonto updateRegistroDePonto(RegistroDePonto registroDePonto);
    void deleteRegistroDePonto(RegistroDePonto registroDePonto);
    List<RegistroDePonto> getAllRegistroDePonto();
    RegistroDePonto findById(Long id);
    List<RegistroDePonto> getAllRegistroDePontoByCpf(String cpf);
    
}
