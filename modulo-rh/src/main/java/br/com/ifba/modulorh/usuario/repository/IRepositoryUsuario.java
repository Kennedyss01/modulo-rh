package br.com.ifba.modulorh.usuario.repository;

import br.com.ifba.modulorh.usuario.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonas Dias
 */
@Repository
public interface IRepositoryUsuario extends JpaRepository<Usuario, Long> {
    
    List<Usuario> findByNomeUsuario(String nomeUsuario);
    
}