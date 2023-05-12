package br.com.ifba.modulorh.usuario.repository;

import br.com.ifba.modulorh.usuario.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jonas Dias
 */
public interface IRepositoryUsuario extends JpaRepository<Usuario, Long> {
    
    List<Usuario> findByLogin(String login);
    boolean existsByLogin(String login);
    Long countByTipo(String tipo);
    
}