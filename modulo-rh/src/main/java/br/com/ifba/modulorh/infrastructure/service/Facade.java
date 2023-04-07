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
    private IServiceFuncionario serviceFuncionario;
    
    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return serviceFuncionario.saveFuncionario(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        return serviceFuncionario.updateFuncionario(funcionario);
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        serviceFuncionario.deleteFuncionario(funcionario);
    }

    @Override
    public List<Funcionario> getAllFuncionario() {
        return serviceFuncionario.getAllFuncionario();
    }

    @Override
    public Funcionario findById(Long id) {
        return serviceFuncionario.findById(id);
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return serviceFuncionario.existsByCpf(cpf);
    }

    @Override
    public boolean existsByEmail(String email) {
        return serviceFuncionario.existsByEmail(email);
    }
    
}