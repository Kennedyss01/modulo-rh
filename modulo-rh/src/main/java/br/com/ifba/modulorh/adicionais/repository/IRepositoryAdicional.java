/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.adicionais.repository;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kaio
 */
@Repository
public interface IRepositoryAdicional extends JpaRepository<Adicional, Long>{
    
}
