package br.com.ifba.modulorh.homescreen;

import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.login.TelaLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lucas Nogueira
 */
@Component
public class TelaHomescreenGestor extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired
    private TelaCadastroFuncionario telaCadastroFuncionario;
    @Autowired
    private TelaCadastroUsuario telaCadastroUsuario;
    @Autowired @Lazy
    private TelaLogin telaLogin;
    private Usuario usuario;

    public TelaHomescreenGestor() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void definirGestor(Usuario usuario) {
        this.usuario = usuario;
        lblInfoGestor.setText("Usuário: " + usuario.getLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblInfoGestor = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnAvaliarPerformance = new javax.swing.JButton();
        btnImprimirRelatorioFuncionario = new javax.swing.JButton();
        btnImprimirRelatorioAvaliacaoProdutividade = new javax.swing.JButton();
        btnImprimirRelatorioPonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1028, 599));

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("Módulo RH");

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Seja bem-vindo, gestor!");

        btnSair.setBackground(new java.awt.Color(26, 81, 107));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-16x16.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblInfoGestor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInfoGestor.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoGestor.setText("Usuário: ---");

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoGestor)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBemVindo)
                    .addComponent(lblLateral))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addGap(73, 73, 73)
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfoGestor)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 4, true));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenu.setText("Tela inicial");

        btnCadastrarUsuario.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar-usuario-32x32.png"))); // NOI18N
        btnCadastrarUsuario.setText("CADASTRAR USUÁRIO");
        btnCadastrarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar-funcionario-32x32.png"))); // NOI18N
        btnCadastrarFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        btnCadastrarFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnAvaliarPerformance.setBackground(new java.awt.Color(71, 19, 35));
        btnAvaliarPerformance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAvaliarPerformance.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarPerformance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliar-performance-32x32.png"))); // NOI18N
        btnAvaliarPerformance.setText("AVALIAR PERFORMANCE");
        btnAvaliarPerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAvaliarPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarPerformanceActionPerformed(evt);
            }
        });

        btnImprimirRelatorioFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImprimirRelatorioFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-funcionario-32x32.png"))); // NOI18N
        btnImprimirRelatorioFuncionario.setText("<html>IMPRIMIR RELATÓRIO DE<br>FUNCIONÁRIO</html>");
        btnImprimirRelatorioFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioFuncionarioActionPerformed(evt);
            }
        });

        btnImprimirRelatorioAvaliacaoProdutividade.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioAvaliacaoProdutividade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImprimirRelatorioAvaliacaoProdutividade.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioAvaliacaoProdutividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-avaliacao-produtividade-32x32.png"))); // NOI18N
        btnImprimirRelatorioAvaliacaoProdutividade.setText("<html>IMPRIMIR RELATÓRIO DE<br>AVALIAÇÃO DE<br>PRODUTIVIDADE</html>");
        btnImprimirRelatorioAvaliacaoProdutividade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioAvaliacaoProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed(evt);
            }
        });

        btnImprimirRelatorioPonto.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioPonto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImprimirRelatorioPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-ponto-32x32.png"))); // NOI18N
        btnImprimirRelatorioPonto.setText("<html>IMPRIMIR RELATÓRIO DE<br>PONTO</html>");
        btnImprimirRelatorioPonto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblMenu)
                        .addGap(193, 193, 193))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblMenu)
                .addGap(52, 52, 52)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        telaCadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnAvaliarPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvaliarPerformanceActionPerformed

    private void btnImprimirRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioFuncionarioActionPerformed

    private void btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed

    private void btnImprimirRelatorioPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioPontoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHomescreenGestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliarPerformance;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnImprimirRelatorioAvaliacaoProdutividade;
    private javax.swing.JButton btnImprimirRelatorioFuncionario;
    private javax.swing.JButton btnImprimirRelatorioPonto;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblInfoGestor;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
