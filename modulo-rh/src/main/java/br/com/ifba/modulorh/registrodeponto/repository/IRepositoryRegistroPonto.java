package br.com.ifba.modulorh.registrodeponto.repository;

import br.com.ifba.modulorh.registrodeponto.model.RegistroPonto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas Nogueira
 */
public interface IRepositoryRegistroPonto extends JpaRepository<RegistroPonto, Long> {

        List<RegistroPonto> findByFuncionarioId(Long id);
        Optional<RegistroPonto> findFirstByFuncionarioIdOrderByIdDesc(Long id);
        
}