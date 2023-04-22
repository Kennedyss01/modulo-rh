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
     private final static String SENHA_INCORRETA = "A senha informada está incorreta.";
     
    @Autowired
    private IRepositoryUsuario repositoryUsuario;
    
    @Override
    public Usuario validarLogin(Usuario usuario) {
        List<Usuario> usuarios = 
                repositoryUsuario.findByLogin(usuario.getLogin());
        if (usuarios.isEmpty()) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        if (usuarios.get(0).getSenha().equals(usuario.getSenha()) == false) {
            throw new BusinessException(SENHA_INCORRETA);
        }
        return usuarios.get(0);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByLogin(usuario.getLogin())) {
            throw new BusinessException(USUARIO_JA_EXISTE);
        }
        return repositoryUsuario.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByLogin(usuario.getLogin()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
         repositoryUsuario.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
         if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }
        if (repositoryUsuario.existsByLogin(usuario.getLogin()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        repositoryUsuario.delete(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return repositoryUsuario.getReferenceById(id);
    }

    @Override
    public Long countUsuarioByTipo(String tipo) {
        return repositoryUsuario.countByTipo(tipo);
    }
    
}
