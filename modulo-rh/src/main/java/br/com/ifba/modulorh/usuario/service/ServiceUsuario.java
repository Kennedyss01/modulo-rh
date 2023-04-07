package br.com.ifba.modulorh.usuario.service;

import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
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

    private final static String USUARIO_NULL = "Usuário null";
    
    @Autowired
    private IRepositoryUsuario repositoryUsuario;
    
    @Override
    public boolean validarLogin(Usuario usuario) {
        List<Usuario> usuarios = 
                repositoryUsuario.findByNomeUsuario(usuario.getNomeUsuario());
        if (usuarios.isEmpty()) {
            return false;
        }
        return usuarios.get(0).getSenha().equals(usuario.getSenha());
    }

    @Override
    public void salvarUsuario(Usuario usuario) {
         if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
         }
         
         repositoryUsuario.save(usuario);
    }
    
}
