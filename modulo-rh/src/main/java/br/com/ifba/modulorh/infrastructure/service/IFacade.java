package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author Jonas Dias
 */
public interface IFacade {
    
    //========================Usuario========================//
    boolean validarLoginUsuario(Usuario usuairo);
    void salvarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void deletarUsuario(Usuario usuario);
    Usuario getById(Long id);
    
     //========================Funcionario========================//
    Funcionario saveFuncionario(Funcionario funcionario);
    Funcionario updateCurso(Funcionario funcionario);
    void deleteCurso(Funcionario funcionario);
    List<Funcionario> getAllFuncionario();
    Funcionario findById(Long id);
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    
}