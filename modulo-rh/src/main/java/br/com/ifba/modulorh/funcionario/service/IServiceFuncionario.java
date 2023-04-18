/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.service;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceFuncionario {
    
    public Funcionario saveFuncionario(Funcionario funcionario);
    public Funcionario updateFuncionario(Funcionario funcionario);
    public void deleteFuncionario(Funcionario funcionario);
    public List<Funcionario> getAllFuncionario();
    public Funcionario findById(Long id);
    public boolean existsByCpf(String cpf);
    public boolean existsByEmail(String email);
    public Funcionario findByUsuarioId(Long id);
    
}
