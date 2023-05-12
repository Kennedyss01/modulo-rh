package br.com.ifba.modulorh.adicionais.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceAdicional {
    
    Adicional saveAdicional(Adicional adicional);
    Adicional updateAdicional(Adicional adicional);
    void deleteAdicional(Adicional adicional);
    List<Adicional> getAllAdicional();
    Adicional findById(Long id);
    
}