package br.com.ifba.modulorh.pagamentos.repository;

import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Nogueira
 */
@Repository
public interface IRepositoryPagamentos extends JpaRepository<Pagamentos, Long>{
    
    
}
