/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.curriculo.service;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import java.util.List;

/**
 *
 * @author Gislaine
 */
public interface IServiceCurriculo {
    
    public Curriculo saveCurriculo(Curriculo curriculo);
    public Curriculo updateCurriculo (Curriculo curriculo);
    public void deleteCurriculo (Curriculo curriculo);
    public List<Curriculo> getAllCurriculo();
    public Curriculo findByNome(String nome);
    
}
