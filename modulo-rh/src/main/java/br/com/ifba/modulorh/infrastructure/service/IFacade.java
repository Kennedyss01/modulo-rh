package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import br.com.ifba.modulorh.registrodeponto.model.RegistroPonto;
import java.util.List;

/**
 *
 * @author Jonas Dias
 */
public interface IFacade {
    
    //========================Usuario========================//
    Usuario validarLoginUsuario(Usuario usuairo);
    Usuario saveUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(Usuario usuario);
    Usuario findUsuarioById(Long id);
    Long countUsuarioByTipo(String tipo);
    
     //========================Funcionario========================//
    Funcionario saveFuncionario(Funcionario funcionario);
    Funcionario updateFuncionario(Funcionario funcionario);
    void deleteFuncionario(Funcionario funcionario);
    List<Funcionario> getAllFuncionario();
    Funcionario findFuncionarioById(Long id);
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    Funcionario findFuncionarioByUsuarioId(Long id);
    Funcionario findFuncionarioByCpf(String cpf);
    
    //========================Adicional========================//
    Adicional saveAdicional(Adicional adicional);
    Adicional updateAdicional(Adicional adicional);
    void deleteAdicional(Adicional adicional);
    List<Adicional> getAllAdicional();
    Adicional findById(Long id);
    
    //========================Desconto========================//
    Desconto saveDesconto(Desconto desconto);
    void updateDesconto(Desconto desconto);
    void deleteDesconto(Desconto desconto);
    Desconto findDescontoById(Long id);
    List<Desconto> getAllDescontos();
    
    //========================Curriculo========================//
    Curriculo saveCurriculo(Curriculo curriculo);
    Curriculo updateCurriculo (Curriculo curriculo);
    void deleteCurriculo (Curriculo curriculo);
    List<Curriculo> getAllCurriculo();
    Curriculo findByNome(String nome);
    Curriculo findCurriculoById (Long id);
    
     //========================Registo de Ponto========================//
    RegistroPonto saveRegistroDePonto(RegistroPonto registroDePonto);
    RegistroPonto updateRegistroDePonto(RegistroPonto registroDePonto);
    void deleteRegistroDePonto(RegistroPonto registroDePonto);
    List<RegistroPonto> getAllRegistroDePonto();
    RegistroPonto findRegistroDePontoById(Long id);
    List<RegistroPonto> findRegistrosByFuncionarioId(Long id);
    
    //========================Pagamentos========================//
    Pagamentos savePagamento(Pagamentos pagamento);
    Pagamentos updatePagamento(Pagamentos pagamento);
    void deletePagamento(Pagamentos pagamento);
    List<Pagamentos> getAllPagamentos();
    Pagamentos findPagamentoById(Long id);
    
}