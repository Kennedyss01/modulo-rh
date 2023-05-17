package br.com.ifba.modulorh.registrodeponto.repository;

import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Nogueira
 */
@Repository
public interface IRepositoryRegistroDePonto extends JpaRepository<RegistroDePonto, Long>{

    
}
