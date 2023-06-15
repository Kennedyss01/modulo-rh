package br.com.ifba.modulorh.adicionais.model;

import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kaio
 */
@Entity
@Data
@NoArgsConstructor
public class Adicional implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private float valorPercentual;
    private String tipo;
    
    @ManyToMany(mappedBy = "adicionais")
    private List<Pagamentos> pagamentos;

    public Adicional(String nome, float valorPercentual, String tipo) {
        this.nome = nome;
        this.valorPercentual = valorPercentual;
        this.tipo = tipo;
    }  
    
}