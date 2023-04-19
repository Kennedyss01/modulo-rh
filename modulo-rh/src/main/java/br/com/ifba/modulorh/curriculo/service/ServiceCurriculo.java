/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.curriculo.service;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.curriculo.repository.IRepositoryCurriculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gislaine
 */

@Service
public class ServiceCurriculo implements IServiceCurriculo{
    
    public final static String CURRICULO_NULL = "Dados do curriculo nao preenchidos";
    public final static String CURRICULO_EXISTE = "Curriculo ja existente no Banco de dados";
    public final static String CURRICULO_NAO_EXISTE = "Curriculo nao existente no Banco de dados";

    @Autowired
    private IRepositoryCurriculo repositoryCurriculo;
    
    @Override
    public Curriculo saveCurriculo(Curriculo curriculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Curriculo updateCurriculo(Curriculo curriculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCurriculo(Curriculo curriculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Curriculo> getAllCurriculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Curriculo findByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
