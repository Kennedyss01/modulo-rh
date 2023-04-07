/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.repository;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kaioe
 */
@Repository
public interface IRepositoryCadastroFuncionario extends JpaRepository<Funcionario, Long>{

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    
}
