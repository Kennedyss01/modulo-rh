/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.curriculo.repository;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gislaine
 */
@Repository
public interface IRepositoryCurriculo extends JpaRepository<Curriculo, String>{

    List<Curriculo> findByCurriculoNome(String nome);
    boolean existsByEmail(String email);
    
}
