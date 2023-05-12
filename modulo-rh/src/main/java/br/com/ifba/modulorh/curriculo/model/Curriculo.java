package br.com.ifba.modulorh.curriculo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String experienciaProfissional;
    
    public Curriculo (String nome, String endereco, String telefone, String email, String vaga, String formacaoAcademica, String experienciaProfissional){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vaga = vaga;
        this.email = email;
        this.formacaoAcademica = formacaoAcademica;
        this.experienciaProfissional = experienciaProfissional;
    }
    
}
