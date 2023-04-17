/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.repository;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kaio
 */
@Repository
public interface IRepositoryFuncionario extends JpaRepository<Funcionario, Long>{

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    List<Funcionario> findByUsuarioId(Long id);
    
}
