package br.com.ifba.modulorh.experienciaprofissional.service;

import br.com.ifba.modulorh.curriculo.service.*;
import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
import br.com.ifba.modulorh.experienciaprofissional.repository.IRepositoryExperienciaProfissional;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gislaine
 */

@Service
public class ServiceExperienciaProfissional implements IServiceExperienciaProfissional{
    
    // Constantes de mensagens de erro
    public static final String EXPERIENCIA_PROFISSIONAL_NULL = "Dados da experiência profissional não preenchidos";
    public static final String EXPERIENCIA_PROFISSIONAL_EXISTE = "Experiência profissional já existente no Banco de dados";
    public static final String EXPERIENCIA_PROFISSIONAL_NAO_EXISTE = "Experiência profissional não existente no Banco de dados";

    @Autowired
    private IRepositoryExperienciaProfissional repositoryExperienciaProfissional;
    
    @Override
    public ExperienciaProfissional saveExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
        if(experienciaprofissional == null){
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_NULL);
        }
        if(repositoryExperienciaProfissional.existsById(experienciaprofissional.getId()) == true){
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_EXISTE);
        }  
            return repositoryExperienciaProfissional.save(experienciaprofissional);
    }

    @Override
    public ExperienciaProfissional updateExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
        if(experienciaprofissional == null){
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_NULL);
        }
        if(repositoryExperienciaProfissional.existsById(experienciaprofissional.getId()) == false){
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_NAO_EXISTE);
        }
            return repositoryExperienciaProfissional.save(experienciaprofissional);
    }

    @Override
    public void deleteExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
        if(experienciaprofissional == null){
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_NULL);
        }
        if(this.repositoryExperienciaProfissional.existsById(experienciaprofissional.getId()) == false) {
            throw new BusinessException(EXPERIENCIA_PROFISSIONAL_NAO_EXISTE);   
        }
        repositoryExperienciaProfissional.delete(experienciaprofissional);
    }

    @Override
    public List<ExperienciaProfissional> getAllExperienciaProfissional() {
        return this.repositoryExperienciaProfissional.findAll(); 
    }

    @Override
    public ExperienciaProfissional findExperienciaProfissionalById(Long id) {
        return repositoryExperienciaProfissional.findExperienciaProfissionalById(id).get(0);
    }
    
}