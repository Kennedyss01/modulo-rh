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
    @Autowired
    private IServiceUsuario serviceUsuario;
    
    @Override
    public Usuario validarLoginUsuario(Usuario usuairo) {
        return serviceUsuario.validarLogin(usuairo);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }
    
    @Override
    public void updateUsuario(Usuario usuario) {
        serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
    }

    @Override
    public Usuario findUsuarioById(Long id) {
        return serviceUsuario.findById(id);
    }
    
    @Override
    public Long countUsuarioByTipo(String tipo) {
        return serviceUsuario.countUsuarioByTipo(tipo);
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
    public Funcionario findFuncionarioById(Long id) {
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

    @Override
    public Funcionario findFuncionarioByUsuarioId(Long id) {
        return serviceFuncionario.findByUsuarioId(id);
    }
    
}