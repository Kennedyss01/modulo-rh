package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.usuario.model.Usuario;

/**
 *
 * @author Jonas Dias
 */
public interface IFacade {
    
    //========================Usuario========================//
    boolean validarLoginUsuario(Usuario usuairo);
    void salvarUsuario(Usuario usuario);
    
}