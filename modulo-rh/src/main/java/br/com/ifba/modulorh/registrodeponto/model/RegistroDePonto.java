package br.com.ifba.modulorh.registrodeponto.model;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lucas Nogueira
 */
@Entity
@Data
@NoArgsConstructor
public class RegistroDePonto implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dataRegistro;
    private String presente;
    private String horaEntrada;
    private String horaSaida;
    private String cpf;
    
    public RegistroDePonto(String dataRegistro, String presente,
            String horaEntrada, String horaSaida, String cpf) {
        this.dataRegistro = dataRegistro;
        this.presente = presente;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.cpf = cpf;
    }
    
}
