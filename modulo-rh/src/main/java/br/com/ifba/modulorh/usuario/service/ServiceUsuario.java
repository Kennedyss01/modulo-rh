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
    
     private final static String USUARIO_NULL = "Os dados do usuário não foram preenchidos.";
     private final static String USUARIO_JA_EXISTE = "O usuário informado já existe no sistema.";
     private final static String USUARIO_NAO_EXISTE = "O usuário informado não existe no sistema.";
     
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
    public void saveUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByNomeUsuario(usuario.getNomeUsuario())) {
            throw new BusinessException(USUARIO_JA_EXISTE);
        }
         repositoryUsuario.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByNomeUsuario(usuario.getNomeUsuario()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
         repositoryUsuario.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
         if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByNomeUsuario(usuario.getNomeUsuario()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        repositoryUsuario.delete(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return repositoryUsuario.getReferenceById(id);
    }
    
}
