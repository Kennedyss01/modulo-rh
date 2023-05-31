
package br.com.ifba.modulorh.avaliacaoperformance.repository;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kaio
 */
public interface IRepositoryAvaliacaoPerformance extends JpaRepository<AvaliacaoPerformance, Long>{
       
}
