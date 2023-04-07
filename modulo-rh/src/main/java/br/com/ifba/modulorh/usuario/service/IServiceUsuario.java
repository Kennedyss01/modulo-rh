package br.com.ifba.modulorh.usuario.service;

import br.com.ifba.modulorh.usuario.model.Usuario;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceUsuario {
    
    boolean validarLogin(Usuario usuario);
    void salvarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void deletarUsuario(Usuario usuario);
    Usuario getById(Long id);
    
}