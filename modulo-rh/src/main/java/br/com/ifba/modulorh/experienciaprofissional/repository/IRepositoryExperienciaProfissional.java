/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.experienciaprofissional.repository;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gisla
 */
public interface IRepositoryExperienciaProfissional extends JpaRepository<ExperienciaProfissional, String>{
    
    boolean existsById(Long id);
    List<ExperienciaProfissional> findByCurriculo(Curriculo curriculo);
    List<ExperienciaProfissional> findByCurriculoOrderByPeriodo(Curriculo curriculo);
    List<ExperienciaProfissional> findExperienciaProfissionalById(Long id);

}
