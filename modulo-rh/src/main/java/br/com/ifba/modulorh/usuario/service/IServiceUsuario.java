package br.com.ifba.modulorh.usuario.service;

import br.com.ifba.modulorh.usuario.model.Usuario;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceUsuario {
    
    boolean validarLogin(Usuario usuario);
    void saveUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(Usuario usuario);
    Usuario findById(Long id);
    
}