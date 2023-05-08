/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.adicionais.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.adicionais.repository.IRepositoryAdicional;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceAdicional implements IServiceAdicional{
    
    public final static String ADICIONAL_NULL = "Dados do Adicional nao preenchidos";
    public final static String ADICIONAL_EXISTE = "Adicional ja existente no Banco de dados";
    public final static String ADICIONAL_NAO_EXISTE = "Adicional nao existente no Banco de dados";
    
    @Autowired
     private IRepositoryAdicional repositoryAdicional;
    
    @Override
    public Adicional saveAdicional(Adicional adicional) {
        if(adicional == null){
            throw new BusinessException(ADICIONAL_NULL);
        }
        if(repositoryAdicional.existsById(adicional.getId()) == true){
            throw new BusinessException(ADICIONAL_EXISTE);
        } 
        return repositoryAdicional.save(adicional);
    }

    @Override
    public Adicional updateAdicional(Adicional adicional) {
        if(adicional == null){
            throw new BusinessException(ADICIONAL_NULL);
        }
        if(repositoryAdicional.existsById(adicional.getId()) == false){
            throw new BusinessException(ADICIONAL_NAO_EXISTE);
        } 
            return repositoryAdicional.save(adicional);
    }

    @Override
    public void deleteAdicional(Adicional adicional) {
        if(adicional == null){
            throw new BusinessException(ADICIONAL_NULL);
        }
        if(this.repositoryAdicional.existsById(adicional.getId()) == true) {
            this.repositoryAdicional.delete(adicional);
            return;
        }
            throw new BusinessException(ADICIONAL_NAO_EXISTE);    
}

    @Override
    public List<Adicional> getAllAdicional() {
        return this.repositoryAdicional.findAll();    
    }
    
    @Override
    public Adicional findById(Long id) {
        return repositoryAdicional.getReferenceById(id);
    }  
    
}
