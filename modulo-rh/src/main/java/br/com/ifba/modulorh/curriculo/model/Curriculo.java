package br.com.ifba.modulorh.curriculo.model;

import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Gislaine
 */

@Entity
@Data
@NoArgsConstructor
public class Curriculo implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String vaga;
    private String formacaoAcademica;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curriculo")
    private List<ExperienciaProfissional> experienciaProfissional;
    
    public Curriculo (String nome, String endereco, String telefone, String email, String vaga, String formacaoAcademica){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vaga = vaga;
        this.email = email;
        this.formacaoAcademica = formacaoAcademica;
        //this.experienciaProfissional = experienciaProfissional;
    }    
}
