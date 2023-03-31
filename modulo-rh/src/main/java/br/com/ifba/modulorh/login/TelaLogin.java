package br.com.ifba.modulorh.login;

import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.service.IServiceUsuario;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaLogin extends javax.swing.JFrame {
    
    @Autowired
    private IServiceUsuario serviceUsuario;
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        txaBemVindo = new javax.swing.JTextArea();
        btnCriarConta = new javax.swing.JButton();
        pnlLogin = new javax.swing.JPanel();
        lblFazerLogin = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblEsqueceuASenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 600));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlLateral.setMaximumSize(new java.awt.Dimension(300, 600));
        pnlLateral.setPreferredSize(new java.awt.Dimension(300, 600));

        lblModuloRH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("Módulo RH");

        txaBemVindo.setBackground(new java.awt.Color(26, 81, 107));
        txaBemVindo.setColumns(20);
        txaBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txaBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        txaBemVindo.setRows(5);
        txaBemVindo.setText("Bem-vindo(a), \nnão tem uma conta?");
        txaBemVindo.setAutoscrolls(false);
        txaBemVindo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txaBemVindo.setEnabled(false);

        btnCriarConta.setBackground(new java.awt.Color(26, 81, 107));
        btnCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setText("Criar conta");
        btnCriarConta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnCriarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCriarConta.setFocusPainted(false);
        btnCriarConta.setFocusable(false);

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txaBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModuloRH)
                    .addComponent(btnCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );

        pnlContainer.add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin.setMaximumSize(new java.awt.Dimension(380, 320));

        lblFazerLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFazerLogin.setText("Fazer Login");

        txtUsuario.setText("  Usuário");
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtSenha.setText("  Senha");
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblEsqueceuASenha.setText("Esqueceu a senha?");

        btnEntrar.setBackground(new java.awt.Color(71, 19, 35));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblEsqueceuASenha))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblFazerLogin)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblFazerLogin)
                .addGap(40, 40, 40)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEsqueceuASenha)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlContainer.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 380, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1048, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario usuario = new Usuario(txtUsuario.getText(), txtSenha.getText());
        if(serviceUsuario.validarLogin(usuario)){
            JOptionPane.showMessageDialog(null, "Dados Válidos", "Validando Login", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Dados inválidos", "Validando Login", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblEsqueceuASenha;
    private javax.swing.JLabel lblFazerLogin;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextArea txaBemVindo;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
