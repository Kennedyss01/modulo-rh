/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.experienciaprofissional.model;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gisla
 */
@Entity
@Data
@NoArgsConstructor
public class ExperienciaProfissional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cargo;
    private String empresa;
    private String periodo;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

    public ExperienciaProfissional(String cargo, String empresa, String periodo, Curriculo curriculo) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.periodo = periodo;
        this.curriculo = curriculo;
    }
}

