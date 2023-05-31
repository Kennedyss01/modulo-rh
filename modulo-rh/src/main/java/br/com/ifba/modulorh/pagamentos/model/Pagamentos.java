package br.com.ifba.modulorh.pagamentos.model;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Pagamentos implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dataLancamento;
    private String dataPagamento;
    private float salarioBase;
    
    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToMany
    private List<Adicional> adicionais;
    
    @ManyToMany
    private List<Desconto> descontos;
    
    public Pagamentos(String dtLancamento, String dtPagamento,
            float salarioBase, Funcionario funcionario,
            List<Adicional> adicionais, List<Desconto> descontos) {
        this.dataLancamento = dtLancamento;
        this.dataPagamento = dtPagamento;
        this.salarioBase = salarioBase;
        this.funcionario = funcionario;
        this.adicionais = adicionais;
        this.descontos = descontos;
    }
    
}
