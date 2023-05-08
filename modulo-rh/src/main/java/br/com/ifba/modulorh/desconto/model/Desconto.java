package br.com.ifba.modulorh.desconto.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jonas Dias
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Desconto implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private float desconto;
    private String tipoDesconto;
    
    public Desconto(String nome, float desconto, String tipoDesconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.tipoDesconto = tipoDesconto;
    }
    
}