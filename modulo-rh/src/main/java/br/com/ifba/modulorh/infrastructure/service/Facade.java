package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.service.IServiceUsuario;

/**
 *
 * @author Jonas Dias
 */
public class Facade implements IFacade {

    
    //========================Usuario========================//
    private IServiceUsuario serviceUsuario;
    
    @Override
    public boolean validarLoginUsuario(Usuario usuairo) {
        return serviceUsuario.validarLogin(usuairo);
    }

    @Override
    public void salvarUsuario(Usuario usuario) {
        serviceUsuario.salvarUsuario(usuario);
    }
    
}