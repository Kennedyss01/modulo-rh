package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.adicionais.service.IServiceAdicional;
import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import br.com.ifba.modulorh.avaliacaoperformance.service.IServiceAvaliacaoPerformance;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.curriculo.service.IServiceCurriculo;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.desconto.service.IServiceDesconto;
import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
import br.com.ifba.modulorh.experienciaprofissional.service.IServiceExperienciaProfissional;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.service.IServiceUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.ifba.modulorh.funcionario.service.IServiceFuncionario;
import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import br.com.ifba.modulorh.pagamentos.service.IServicePagamentos;
import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import br.com.ifba.modulorh.registroponto.service.IServiceRegistroPonto;

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
    
    @Override
    public Funcionario findFuncionarioByCpf(String cpf) {
        return serviceFuncionario.findByCpf(cpf);
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
    private IServiceRegistroPonto serviceRegistroPonto;
    
    @Override
    public RegistroPonto saveRegistroPonto(RegistroPonto registroPonto) {
        return serviceRegistroPonto.saveRegistroPonto(registroPonto);
    }

    @Override
    public RegistroPonto updateRegistroPonto(RegistroPonto registroPonto) {
        return serviceRegistroPonto.updateRegistroPonto(registroPonto);
    }

    @Override
    public void deleteRegistroPonto(Long id) {
        serviceRegistroPonto.deleteRegistroPonto(id);
    }

    @Override
    public List<RegistroPonto> getAllRegistrosPonto() {
        return serviceRegistroPonto.getAllRegistrosPonto();
    }

    @Override
    public RegistroPonto findRegistroPontoById(Long id) {
        return serviceRegistroPonto.findById(id);
    }
    
    @Override
    public List<RegistroPonto> findRegistrosByFuncionarioId(Long id) {
        return serviceRegistroPonto.findRegistrosByFuncionarioId(id);
    }
    
    //========================Pagamentos========================//
    @Autowired
    private IServicePagamentos servicePagamentos;
    
    @Override
    public Pagamentos savePagamento(Pagamentos pagamento) {
        return servicePagamentos.savePagamento(pagamento);
    }

    @Override
    public Pagamentos updatePagamento(Pagamentos pagamento) {
        return servicePagamentos.updatePagamento(pagamento);
    }

    @Override
    public void deletePagamento(Pagamentos pagamento) {
        servicePagamentos.deletePagamento(pagamento);
    }

    @Override
    public List<Pagamentos> getAllPagamentos() {
        return servicePagamentos.getAllPagamentos();
    }

    @Override
    public Pagamentos findPagamentoById(Long id) {
        return servicePagamentos.findById(id);
    }
    
        //========================Avaliação de Performance========================//
    
    @Autowired
    private IServiceAvaliacaoPerformance serviceAvaliacaoPerformance;
    
    @Override
    public AvaliacaoPerformance saveAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        return serviceAvaliacaoPerformance.saveAvaliacaoPerformance(avaliacaoPerformance);
    }

    @Override
    public AvaliacaoPerformance updateAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        return serviceAvaliacaoPerformance.updateAvaliacaoPerformance(avaliacaoPerformance);
    }

    @Override
    public void deleteAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance) {
        serviceAvaliacaoPerformance.deleteAvaliacaoPerformance(avaliacaoPerformance);
    }

    @Override
    public List<AvaliacaoPerformance> getAllAvaliacaoPerformance() {
        return serviceAvaliacaoPerformance.getAllAvaliacaoPerformance();    
    }
    
    @Override
    public AvaliacaoPerformance findByAvaliacaoPerformanceId(Long id) {
        return serviceAvaliacaoPerformance.findById(id);
    }
    
    //========================Experiencia Profissional========================//
    
    @Autowired
    private IServiceExperienciaProfissional serviceExperienciaProfissional;

    @Override
    public ExperienciaProfissional saveExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
       return serviceExperienciaProfissional.saveExperienciaProfissional(experienciaprofissional);
    }

    @Override
    public ExperienciaProfissional updateExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
        return serviceExperienciaProfissional.updateExperienciaProfissional(experienciaprofissional);
    }

    @Override
    public void deleteExperienciaProfissional(ExperienciaProfissional experienciaprofissional) {
         serviceExperienciaProfissional.deleteExperienciaProfissional(experienciaprofissional);
    }

    @Override
    public List<ExperienciaProfissional> getAllExperienciaProfissional() {
        return serviceExperienciaProfissional.getAllExperienciaProfissional(); 
    }

    @Override
    public ExperienciaProfissional findExperienciaProfissionalById(Long id) {
        return serviceExperienciaProfissional.findExperienciaProfissionalById(id);
    }
    
    
}