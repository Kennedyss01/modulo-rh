package br.com.ifba.modulorh.registrodeponto.service;

import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import java.util.List;

/**
 *
 * @author Lucas Nogueira
 */
public interface IServiceRegistroDePonto {
    
    public RegistroDePonto saveRegistroDePonto(RegistroDePonto registroDePonto);
    public RegistroDePonto updateRegistroDePonto(RegistroDePonto registroDePonto);
    public void deleteRegistroDePonto(RegistroDePonto registroDePonto);
    public List<RegistroDePonto> getAllRegistroDePonto();
    public RegistroDePonto findById(Long id);
    public List<RegistroDePonto> getAllRegistroDePontoByCpf(String cpf);
    
}
