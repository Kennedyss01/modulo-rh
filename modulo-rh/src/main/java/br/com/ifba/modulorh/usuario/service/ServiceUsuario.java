package br.com.ifba.modulorh.usuario.service;

import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.repository.IRepositoryUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas Dias
 */
@Service
public class ServiceUsuario implements IServiceUsuario {

    @Autowired
    private IRepositoryUsuario repositoryUsuario;
    
    @Override
    public boolean validarLogin(Usuario usuario) {
        List<Usuario> usuarios = 
                repositoryUsuario.findByNomeUsuario(usuario.getNomeUsuario());
        if (usuarios.isEmpty()) {
            return false;
        }
        Usuario usuarioBd = usuarios.get(0);
        if (!usuarioBd.getNomeUsuario().equals(usuario.getNomeUsuario())) {
            return false;
        }
        return usuarioBd.getSenha().equals(usuario.getSenha());
    }
    
}
