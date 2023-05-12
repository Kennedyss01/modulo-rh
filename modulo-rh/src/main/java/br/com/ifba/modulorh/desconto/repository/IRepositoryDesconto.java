package br.com.ifba.modulorh.desconto.repository;

import br.com.ifba.modulorh.desconto.model.Desconto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jonas Dias
 */
public interface IRepositoryDesconto extends JpaRepository<Desconto, Long> {
    
     boolean existsByNome(String nome);
     
}