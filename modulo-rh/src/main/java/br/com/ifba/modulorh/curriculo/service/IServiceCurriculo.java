package br.com.ifba.modulorh.curriculo.service;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import java.util.List;

/**
 *
 * @author Gislaine
 */
public interface IServiceCurriculo {
    
    Curriculo saveCurriculo(Curriculo curriculo);
    Curriculo updateCurriculo (Curriculo curriculo);
    void deleteCurriculo (Curriculo curriculo);
    List<Curriculo> getAllCurriculo();
    Curriculo findByNome(String nome);
    
}