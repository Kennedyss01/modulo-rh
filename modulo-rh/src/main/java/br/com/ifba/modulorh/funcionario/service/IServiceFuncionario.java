package br.com.ifba.modulorh.funcionario.service;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceFuncionario {
    
    Funcionario saveFuncionario(Funcionario funcionario);
    Funcionario updateFuncionario(Funcionario funcionario);
    void deleteFuncionario(Funcionario funcionario);
    List<Funcionario> getAllFuncionario();
    Funcionario findById(Long id);
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    Funcionario findByUsuarioId(Long id);
    
}