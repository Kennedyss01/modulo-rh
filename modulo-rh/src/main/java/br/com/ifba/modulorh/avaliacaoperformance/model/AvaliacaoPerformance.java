
package br.com.ifba.modulorh.avaliacaoperformance.model;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kaio
 */

@Entity
@Data
@NoArgsConstructor
public class AvaliacaoPerformance implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeFuncionario;
    private String dataDaAvaliacao;
    private String cpfFuncionario;
    private String observacoes;
    private float notaGeral;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario funcionario;

    public AvaliacaoPerformance(String nomeFuncionario, String dataDaAvaliacao, String cpfFuncionario, String observacoes) {
        this.nomeFuncionario = nomeFuncionario;
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.cpfFuncionario = cpfFuncionario;
        this.observacoes = observacoes;
    }
    
    
}
