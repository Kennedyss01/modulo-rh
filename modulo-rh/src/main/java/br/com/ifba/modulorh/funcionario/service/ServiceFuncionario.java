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
     private IRepositoryFuncionario repositoryFuncionario;
    
    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(repositoryFuncionario.existsById(funcionario.getId()) == true){
            throw new BusinessException(FUNCIONARIO_EXISTE);
        } 
        if(repositoryFuncionario.existsByCpf(funcionario.getCpf()) == true){
            throw new BusinessException(CPF_EXISTE);
        }
        if(repositoryFuncionario.existsByEmail(funcionario.getEmail()) == true){
            throw new BusinessException(EMAIL_EXISTE);
        } 
            return repositoryFuncionario.save(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(repositoryFuncionario.existsById(funcionario.getId()) == false){
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);
        }
            return repositoryFuncionario.save(funcionario);
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(this.repositoryFuncionario.existsById(funcionario.getId()) == false) {
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);   
        }
        repositoryFuncionario.delete(repositoryFuncionario.getReferenceById(funcionario.getId()));
}

    @Override
    public List<Funcionario> getAllFuncionario() {
        return this.repositoryFuncionario.findAll();    
    }
    
    @Override
    public Funcionario findById(Long id) {
        return repositoryFuncionario.getReferenceById(id);
    }  

    @Override
    public boolean existsByCpf(String cpf) {
        if(cpf == null) {
            throw new BusinessException("Dados do CPF nao preenchidos");
        } else if(cpf.isEmpty()) {
            throw new BusinessException("O Campo CPF esta vazio");
        } else {
            return repositoryFuncionario.existsByCpf(cpf);
        }
    }    
    
    @Override
    public boolean existsByEmail(String email) {
        if(email == null) {
            throw new BusinessException("Dados do Email nao preenchidos");
        } else if(email.isEmpty()) {
            throw new BusinessException("O Campo Email esta vazio");
        } else {
            return repositoryFuncionario.existsByCpf(email);
        }
    }

    @Override
    public Funcionario findByUsuarioId(Long id) {
        return repositoryFuncionario.findByUsuarioId(id).get(0);
    }
    
}