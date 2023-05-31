package br.com.ifba.modulorh.homescreen;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.login.TelaLogin;
import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import br.com.ifba.modulorh.registroponto.view.TelaDeListarRegistroDePonto;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.view.TelaAlterarSenha;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lucas Nogueira
 */
@Component
public class TelaHomescreenFuncionario extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaDeListarRegistroDePonto telaListarRegistroPonto;
    @Autowired @Lazy
    private TelaLogin telaLogin;
    @Autowired @Lazy
    private TelaAlterarSenha telaAlterarSenha;
    private Funcionario funcionario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
   
    public TelaHomescreenFuncionario() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        this.setLocationRelativeTo(null);
        this.toFront();
    }
    
    public void definirFuncionario(Usuario usuario) {
        this.funcionario = facade.findFuncionarioByUsuarioId(usuario.getId());
        lblInfoFuncionario.setText("Usuário: " + funcionario.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblInfoFuncionario = new javax.swing.JLabel();
        btnAlterarSenha = new javax.swing.JButton();
        pnlCampo = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnRegistrarPonto = new javax.swing.JButton();
        lblDivisoria = new javax.swing.JLabel();
        lblDivisoria1 = new javax.swing.JLabel();
        btnListarPontos = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial do Funcionário");
        setIconImage(icone.getImage());
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setMinimumSize(new java.awt.Dimension(1100, 670));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(fonteMaior);
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("MÓDULO RH");

        lblBemVindo.setFont(fonteNormal);
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Seja bem-vindo, funcionário!");

        btnSair.setBackground(new java.awt.Color(26, 81, 107));
        btnSair.setFont(fonteNormal);
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-16x16.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblInfoFuncionario.setFont(fonteNormal);
        lblInfoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoFuncionario.setText("Usuário: ---");

        btnAlterarSenha.setBackground(new java.awt.Color(26, 81, 107));
        btnAlterarSenha.setFont(fonteNormal);
        btnAlterarSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha-16x16.png"))); // NOI18N
        btnAlterarSenha.setText("ALTERAR SENHA");
        btnAlterarSenha.setBorder(null);
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoFuncionario)
                    .addComponent(lblBemVindo)
                    .addComponent(lblLateral)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarSenha)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addGap(73, 73, 73)
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfoFuncionario)
                .addGap(18, 18, 18)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pnlCampo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCampo.setMinimumSize(new java.awt.Dimension(528, 557));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 4, true));
        pnlMenu.setMinimumSize(new java.awt.Dimension(516, 426));

        lblMenu.setFont(fonteMaior);
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Tela inicial");

        btnRegistrarPonto.setBackground(new java.awt.Color(71, 19, 35));
        btnRegistrarPonto.setFont(fonteNormal);
        btnRegistrarPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/registrar-ponto-32x32.png"))); // NOI18N
        btnRegistrarPonto.setText("REGISTRAR PONTO");
        btnRegistrarPonto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnRegistrarPonto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPontoActionPerformed(evt);
            }
        });

        lblDivisoria.setBackground(new java.awt.Color(255, 255, 255));

        lblDivisoria1.setBackground(new java.awt.Color(255, 255, 255));

        btnListarPontos.setBackground(new java.awt.Color(71, 19, 35));
        btnListarPontos.setFont(fonteNormal);
        btnListarPontos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-pontos-32x32.png"))); // NOI18N
        btnListarPontos.setText("LISTAR PONTOS");
        btnListarPontos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarPontos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPontosActionPerformed(evt);
            }
        });

        lblData.setFont(fonteNormal);
        lblData.setText("00/00/00000 00:00:00");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblDivisoria1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistrarPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListarPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addComponent(lblDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblMenu)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDivisoria1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addComponent(lblDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnRegistrarPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
    public void atualizarData() {
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        new Thread() {
            @Override
            public void run() {
                while(true) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        lblData.setText(formatarData.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                         JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), 
                        "Erro ao atualizar data!",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }.start();  
    }
    
    private void btnRegistrarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPontoActionPerformed
       try {
             RegistroPonto registro = new RegistroPonto(funcionario);
             facade.saveRegistroPonto(registro);
             JOptionPane.showMessageDialog(null, "Ponto realizado com sucesso.", 
                     "Ponto realizado!", JOptionPane.INFORMATION_MESSAGE);
        } catch(HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPontoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaLogin.setVisible(true);
        telaLogin.limparCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        telaAlterarSenha.setVisible(true);
        telaAlterarSenha.setUsuario(this.funcionario.getUsuario());
        this.setVisible(false);
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnListarPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPontosActionPerformed
        telaListarRegistroPonto.setVisible(true);
        telaListarRegistroPonto.toFront();
        telaListarRegistroPonto.setFuncionario(funcionario);
        telaListarRegistroPonto.exibirDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnListarPontosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaHomescreenFuncionario().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaHomescreenFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnListarPontos;
    private javax.swing.JButton btnRegistrarPonto;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDivisoria;
    private javax.swing.JLabel lblDivisoria1;
    private javax.swing.JLabel lblInfoFuncionario;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
