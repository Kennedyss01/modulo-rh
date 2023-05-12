package br.com.ifba.modulorh.adicionais.repository;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kaio
 */
public interface IRepositoryAdicional extends JpaRepository<Adicional, Long>{
    
}
