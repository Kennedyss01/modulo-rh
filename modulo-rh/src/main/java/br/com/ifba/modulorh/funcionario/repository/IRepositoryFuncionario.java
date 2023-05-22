package br.com.ifba.modulorh.funcionario.repository;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kaio
 */
public interface IRepositoryFuncionario extends JpaRepository<Funcionario, Long>{

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    List<Funcionario> findByUsuarioId(Long id);
    Funcionario findByCpf(String cpf);
    
}
