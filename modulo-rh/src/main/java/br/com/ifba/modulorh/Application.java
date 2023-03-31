package br.com.ifba.modulorh;

import br.com.ifba.modulorh.login.TelaLogin;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Application.class).headless(false).run(args);
         TelaLogin telaLogin = context.getBean(TelaLogin.class);
         telaLogin.setVisible(true);    
     }
}