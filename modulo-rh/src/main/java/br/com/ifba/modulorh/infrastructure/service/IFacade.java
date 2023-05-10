package br.com.ifba.modulorh.infrastructure.service;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.curriculo.model.Curriculo;
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
    public Adicional saveAdicional(Adicional adicional);
    public Adicional updateAdicional(Adicional adicional);
    public void deleteAdicional(Adicional adicional);
    public List<Adicional> getAllAdicional();
    public Adicional findById(Long id);
    
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
    
}