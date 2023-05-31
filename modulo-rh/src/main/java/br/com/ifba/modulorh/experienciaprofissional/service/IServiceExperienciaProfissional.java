package br.com.ifba.modulorh.experienciaprofissional.service;

import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
import java.util.List;

/**
 *
 * @author Gislaine
 */
public interface IServiceExperienciaProfissional {
    
    ExperienciaProfissional saveExperienciaProfissional(ExperienciaProfissional experienciaprofissional);
    ExperienciaProfissional updateExperienciaProfissional (ExperienciaProfissional experienciaprofissional);
    void deleteExperienciaProfissional (ExperienciaProfissional experienciaprofissional);
    List<ExperienciaProfissional> getAllExperienciaProfissional();
    ExperienciaProfissional findExperienciaProfissionalById(Long id);
    
}