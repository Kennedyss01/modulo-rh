package br.com.ifba.modulorh.curriculo.repository;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Gislaine
 */
public interface IRepositoryCurriculo extends JpaRepository<Curriculo, String>{

    List<Curriculo> findByNome(String nome);
    boolean existsByEmail(String email);
    List<Curriculo> findCurriculoById(Long id);
}
