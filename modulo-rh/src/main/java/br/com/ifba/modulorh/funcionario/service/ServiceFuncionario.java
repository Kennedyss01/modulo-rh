/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.service;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.modulorh.funcionario.repository.IRepositoryFuncionario;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceFuncionario implements IServiceFuncionario{
    
    public final static String FUNCIONARIO_NULL = "Dados do Funcionario nao preenchidos";
    public final static String FUNCIONARIO_EXISTE = "Funcionario ja existente no Banco de dados";
    public final static String FUNCIONARIO_NAO_EXISTE = "Funcionario nao existente no Banco de dados";
    public final static String CPF_EXISTE = "CPF ja existente no Banco de dados";
    public final static String EMAIL_EXISTE = "Email ja existente no Banco de dados";
    
    @Autowired
     private IRepositoryFuncionario cadastroFuncionario;
    
    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(cadastroFuncionario.existsById(funcionario.getId()) == true){
            throw new BusinessException(FUNCIONARIO_EXISTE);
        } 
        if(cadastroFuncionario.existsByCpf(funcionario.getCpf()) == true){
            throw new BusinessException(CPF_EXISTE);
        }
        if(cadastroFuncionario.existsByEmail(funcionario.getEmail()) == true){
            throw new BusinessException(EMAIL_EXISTE);
        } 
            return cadastroFuncionario.save(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(cadastroFuncionario.existsById(funcionario.getId()) == false){
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);
        } 
            return cadastroFuncionario.save(funcionario);
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(this.cadastroFuncionario.existsById(funcionario.getId()) == true) {
            this.cadastroFuncionario.delete(funcionario);
            return;
        }
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);    
}

    @Override
    public List<Funcionario> getAllFuncionario() {
        return this.cadastroFuncionario.findAll();    
    }
    
    @Override
    public Funcionario findById(Long id) {
        return cadastroFuncionario.getReferenceById(id);
    }  

    @Override
    public boolean existsByCpf(String cpf) {
        if(cpf == null) {
            throw new BusinessException("Dados do CPF nao preenchidos");
        } else if(cpf.isEmpty()) {
            throw new BusinessException("O Campo CPF esta vazio");
        } else {
            return cadastroFuncionario.existsByCpf(cpf);
        }
    }    
    
    @Override
    public boolean existsByEmail(String email) {
        if(email == null) {
            throw new BusinessException("Dados do Email nao preenchidos");
        } else if(email.isEmpty()) {
            throw new BusinessException("O Campo Email esta vazio");
        } else {
            return cadastroFuncionario.existsByCpf(email);
        }
    }
    
}
