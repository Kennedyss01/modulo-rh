package br.com.ifba.modulorh.usuario.model;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class Usuario implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(unique = true)
    private String login;
    private String senha;
    private String tipo;
    
    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Funcionario funcionario;
    
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(String login, String senha, String tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    
}