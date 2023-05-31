/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.avaliacaoperformance.service;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import br.com.ifba.modulorh.avaliacaoperformance.repository.IRepositoryAvaliacaoPerformance;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceAvaliacaoPerformance implements IServiceAvaliacaoPerformance{
    
    public final static String AVALIACAO_NULL = "Dados da Avaliacao nao preenchidos";
    public final static String AVALIACAO_EXISTE = "Avaliacao ja existente no Banco de dados";
    public final static String AVALIACAO_NAO_EXISTE = "Avaliacao nao existente no Banco de dados";
    
    @Autowired
     private IRepositoryAvaliacaoPerformance repositoryAvaliacaoPerformance;
    
    @Override
    public AvaliacaoPerformance saveAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        if(avaliacaoPerformance == null){
            throw new BusinessException(AVALIACAO_NULL);
        }
        if(repositoryAvaliacaoPerformance.existsById(avaliacaoPerformance.getId()) == true){
            throw new BusinessException(AVALIACAO_EXISTE);
        }  
            return repositoryAvaliacaoPerformance.save(avaliacaoPerformance);
    }

    @Override
    public AvaliacaoPerformance updateAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        if(avaliacaoPerformance == null){
            throw new BusinessException(AVALIACAO_NULL);
        }
        if(repositoryAvaliacaoPerformance.existsById(avaliacaoPerformance.getId()) == false){
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        }
            return repositoryAvaliacaoPerformance.save(avaliacaoPerformance);
    }

    @Override
    public void deleteAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        if(avaliacaoPerformance == null){
            throw new BusinessException(AVALIACAO_NULL);
        }
        if(this.repositoryAvaliacaoPerformance.existsById(avaliacaoPerformance.getId()) == false) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);   
        }
        repositoryAvaliacaoPerformance.delete(repositoryAvaliacaoPerformance.getReferenceById(avaliacaoPerformance.getId()));
}

    @Override
    public List<AvaliacaoPerformance> getAllAvaliacaoPerformance() {
        return this.repositoryAvaliacaoPerformance.findAll();    
    }

    @Override
    public AvaliacaoPerformance findById(Long id) {
        return repositoryAvaliacaoPerformance.getReferenceById(id);
    }
       
}
