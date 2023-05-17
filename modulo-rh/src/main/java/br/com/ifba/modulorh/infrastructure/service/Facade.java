package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.adicionais.service.IServiceAdicional;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.curriculo.service.IServiceCurriculo;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.desconto.service.IServiceDesconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.service.IServiceUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.ifba.modulorh.funcionario.service.IServiceFuncionario;
import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
import br.com.ifba.modulorh.registrodeponto.service.IServiceRegistroDePonto;

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
        serviceUsuario.deleteUsuario(usuario);
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
 
    //========================Adicional========================//
    
    @Autowired
    private IServiceAdicional serviceAdicional;
    
    @Override
    public Adicional saveAdicional(Adicional adicional) {
        return serviceAdicional.saveAdicional(adicional);
    }

    @Override
    public Adicional updateAdicional(Adicional adicional) {
        return serviceAdicional.updateAdicional(adicional);
    }

    @Override
    public void deleteAdicional(Adicional adicional) {  
        serviceAdicional.deleteAdicional(adicional);
    }

    @Override
    public List<Adicional> getAllAdicional() {
        return serviceAdicional.getAllAdicional();    
    }
    
    @Override
    public Adicional findById(Long id) {
        return serviceAdicional.findById(id);
    }
    
    
    //========================Desconto========================//
    @Autowired
    private IServiceDesconto serviceDesconto;
        
    @Override
    public Desconto saveDesconto(Desconto desconto) {
        return serviceDesconto.saveDesconto(desconto);
    }

    @Override
    public void updateDesconto(Desconto desconto) {
        serviceDesconto.updateDesconto(desconto);
    }

    @Override
    public void deleteDesconto(Desconto desconto) {
        serviceDesconto.deleteDesconto(desconto);
    }

    @Override
    public Desconto findDescontoById(Long id) {
        return serviceDesconto.findById(id);
    }

    @Override
    public List<Desconto> getAllDescontos() {
        return serviceDesconto.getAllDescontos();
    }
    
    //========================Curriculo========================//
    @Autowired
    private IServiceCurriculo serviceCurriculo;

    @Override
    public Curriculo saveCurriculo(Curriculo curriculo) {
        return serviceCurriculo.saveCurriculo(curriculo);
    }

    @Override
    public Curriculo updateCurriculo(Curriculo curriculo) {
       return serviceCurriculo.updateCurriculo(curriculo);
    }

    @Override
    public void deleteCurriculo(Curriculo curriculo) {
        serviceCurriculo.deleteCurriculo(curriculo);
    }

    @Override
    public List<Curriculo> getAllCurriculo() {
        return serviceCurriculo.getAllCurriculo();
    }

    @Override
    public Curriculo findByNome(String nome) {
        return serviceCurriculo.findByNome(nome);
    }
    
    @Override
    public Curriculo findCurriculoById(Long id) {
        return serviceCurriculo.findCurriculoById(id);
    }

     //========================Registro de Ponto========================//
    @Autowired
    private IServiceRegistroDePonto serviceRegistroPonto;
    
    @Override
    public RegistroDePonto saveRegistroDePonto(RegistroDePonto registroDePonto) {
        return serviceRegistroPonto.saveRegistroDePonto(registroDePonto);
    }

    @Override
    public RegistroDePonto updateRegistroDePonto(RegistroDePonto registroDePonto) {
        return serviceRegistroPonto.updateRegistroDePonto(registroDePonto);
    }

    @Override
    public void deleteRegistroDePonto(RegistroDePonto registroDePonto) {
        serviceRegistroPonto.deleteRegistroDePonto(registroDePonto);
    }

    @Override
    public List<RegistroDePonto> getAllRegistroDePonto() {
        return serviceRegistroPonto.getAllRegistroDePonto();
    }

    @Override
    public RegistroDePonto findRegistroDePontoById(Long id) {
        return serviceRegistroPonto.findById(id);
    }

    
    
}