package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
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
    
     //========================Registo de Ponto========================//
    RegistroDePonto saveRegistroDePonto(RegistroDePonto registroDePonto);
    RegistroDePonto updateRegistroDePonto(RegistroDePonto registroDePonto);
    void deleteRegistroDePonto(RegistroDePonto registroDePonto);
    List<RegistroDePonto> getAllRegistroDePonto();
    RegistroDePonto findPontoById(Long id);
    List<RegistroDePonto> getAllRegistroDePontoByCpf(String cpf);
    
}