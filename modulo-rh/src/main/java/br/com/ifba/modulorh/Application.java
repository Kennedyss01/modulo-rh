package br.com.ifba.modulorh;

import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.login.TelaLogin;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Application.class).headless(false).run(args);
         //TelaLogin telaLogin = context.getBean(TelaLogin.class);
         //telaLogin.setVisible(true);    
         TelaCadastroUsuario telaCadastroUsuario = context.getBean(TelaCadastroUsuario.class);
         telaCadastroUsuario.setVisible(true);
         TelaCadastroFuncionario TelaCadastroFuncionario = context.getBean(TelaCadastroFuncionario.class);
         TelaCadastroFuncionario.setVisible(true);
     }
}