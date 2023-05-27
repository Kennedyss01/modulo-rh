package br.com.ifba.modulorh.registrodeponto.model;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lucas Nogueira
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroPonto implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean presente;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario funcionario;
    
    public RegistroPonto(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
