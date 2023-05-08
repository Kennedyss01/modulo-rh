/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.adicionais.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Adicional(String nome, float valorPercentual, String tipo) {
        this.nome = nome;
        this.valorPercentual = valorPercentual;
        this.tipo = tipo;
    }  
    
}
