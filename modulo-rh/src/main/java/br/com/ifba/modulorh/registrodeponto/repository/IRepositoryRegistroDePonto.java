package br.com.ifba.modulorh.registrodeponto.repository;

import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas Nogueira
 */
public interface IRepositoryRegistroDePonto extends JpaRepository<RegistroDePonto, Long>{

    List<RegistroDePonto> findByCpf(String cpf);
    
}