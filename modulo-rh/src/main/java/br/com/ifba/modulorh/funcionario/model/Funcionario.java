/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.model;
import br.com.ifba.modulorh.usuario.model.Usuario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kaioe
 */
@Entity
@Data
@NoArgsConstructor
public class Funcionario implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String salario;
    private String status;
    private String dataDeEntrada;
    
    @OneToOne
    private Usuario usuario;

    public Funcionario(String nome, String dataDeNascimento, String cpf, String endereco, String telefone, String email, String salario, String status, String dataDeEntrada) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
        this.status = status;
        this.dataDeEntrada = dataDeEntrada;
    }
    
}
