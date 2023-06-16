package br.com.ifba.modulorh.curriculo.service;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.curriculo.repository.IRepositoryCurriculo;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
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
        if(curriculo == null){
            throw new BusinessException(CURRICULO_NULL);
        }
        if(repositoryCurriculo.existsByEmail(curriculo.getEmail()) == true){
            throw new BusinessException(CURRICULO_EXISTE);
        }  
            return repositoryCurriculo.save(curriculo);
    }

    @Override
    public Curriculo updateCurriculo(Curriculo curriculo) {
        if(curriculo == null){
            throw new BusinessException(CURRICULO_NULL);
        }
        if(repositoryCurriculo.existsByEmail(curriculo.getEmail()) == false){
            throw new BusinessException(CURRICULO_NAO_EXISTE);
        }
            return repositoryCurriculo.save(curriculo);
    }

    @Override
    public void deleteCurriculo(Curriculo curriculo) {
         if(curriculo == null){
            throw new BusinessException(CURRICULO_NULL);
        }
        if(this.repositoryCurriculo.existsById(curriculo.getEmail()) == false) {
            throw new BusinessException(CURRICULO_NAO_EXISTE);   
        }
        repositoryCurriculo.delete(curriculo);
    }

    @Override
    public List<Curriculo> getAllCurriculo() {
        return this.repositoryCurriculo.findAll(); 
    }

    @Override
    public Curriculo findByNome(String nome) {
        return repositoryCurriculo.findByNome(nome).get(0);
    }

    @Override
    public Curriculo findCurriculoById(Long id) {
       return repositoryCurriculo.findCurriculoById(id).get(0);
    }
    
}