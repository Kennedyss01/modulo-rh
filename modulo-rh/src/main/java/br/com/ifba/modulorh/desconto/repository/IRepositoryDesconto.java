package br.com.ifba.modulorh.desconto.repository;

import br.com.ifba.modulorh.desconto.model.Desconto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonas Dias
 */
@Repository
public interface IRepositoryDesconto extends JpaRepository<Desconto, Long> {
    
     boolean existsByNome(String nome);
     
}