/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.adicionais.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceAdicional {
    
    public Adicional saveAdicional(Adicional adicional);
    public Adicional updateAdicional(Adicional adicional);
    public void deleteAdicional(Adicional adicional);
    public List<Adicional> getAllAdicional();
    public Adicional findById(Long id);
    
}
