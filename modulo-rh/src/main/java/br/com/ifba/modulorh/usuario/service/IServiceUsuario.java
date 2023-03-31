package br.com.ifba.modulorh.usuario.service;

import br.com.ifba.modulorh.usuario.model.Usuario;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceUsuario {
    
    boolean validarLogin(Usuario usuario);
    
}