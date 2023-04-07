package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.service.IServiceUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.ifba.modulorh.funcionario.service.IServiceFuncionario;

/**
 *
 * @author Jonas Dias
 */
@Controller
public class Facade implements IFacade {

    
    //========================Usuario========================//
    private IServiceUsuario serviceUsuario;
    
    @Override
    public boolean validarLoginUsuario(Usuario usuairo) {
        return serviceUsuario.validarLogin(usuairo);
    }

    @Override
    public void salvarUsuario(Usuario usuario) {
        serviceUsuario.salvarUsuario(usuario);
    }
    
    @Override
    public void atualizarUsuario(Usuario usuario) {
    }

    @Override
    public void deletarUsuario(Usuario usuario) {
    }

    @Override
    public Usuario getById(Long id) {
        return serviceUsuario.getById(id);
    }
    
    //========================Funcionario========================//
    @Autowired
    private IServiceFuncionario serviceCadastroFuncionario;
    
    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Funcionario updateCurso(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCurso(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Funcionario> getAllFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Funcionario findById(Long id) {
        return serviceCadastroFuncionario.findById(id);
    }

    @Override
    public boolean existsByCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existsByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}