package br.com.ifba.modulorh.usuario.view;

import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.usuario.model.Usuario;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaAlterarSenha extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    private Usuario usuario;
    
    public TelaAlterarSenha() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    private boolean validarCampos() {
        if (!(String.valueOf(txtSenhaAtual.getPassword()).trim().equals(usuario.getSenha()))) {
            JOptionPane.showMessageDialog(null, "A sua senha está incorreta, tente novamente!", 
                    "Senha atual incorreta!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       if (String.valueOf(txtNovaSenha.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a nova senha e tente novamente!", 
                    "Senha está vazia!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
       if (!(String.valueOf(txtConfirmarSenha.getPassword()).equals(String.valueOf(txtNovaSenha.getPassword())))) {
            JOptionPane.showMessageDialog(null, "As senhas informadas não correspondem, tente novamente!", 
                    "Senhas não correspondem!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }
    
    private void limparCampos() {
        txtSenhaAtual.setText("");
        txtNovaSenha.setText("");
        txtConfirmarSenha.setText("");
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        pnlAlterarSenha = new javax.swing.JPanel();
        lblAlterarSenha = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        lblSenhaAtual = new javax.swing.JLabel();
        lblNovaSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtSenhaAtual = new javax.swing.JPasswordField();
        txtNovaSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");
        setAutoRequestFocus(false);
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

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblModuloRH)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblModuloRH)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        pnlContainer.add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlAlterarSenha.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlterarSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlAlterarSenha.setMaximumSize(new java.awt.Dimension(388, 360));
        pnlAlterarSenha.setPreferredSize(new java.awt.Dimension(388, 360));
        pnlAlterarSenha.setRequestFocusEnabled(false);

        lblAlterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAlterarSenha.setText("Alterar Senha");

        btnAtualizar.setBackground(new java.awt.Color(71, 19, 35));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtualizar.setFocusPainted(false);
        btnAtualizar.setFocusable(false);
        btnAtualizar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnAtualizar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnAtualizar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenhaAtual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenhaAtual.setText("Senha atual");
        pnlTextFields.add(lblSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 30));

        lblNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNovaSenha.setText("Nova senha");
        pnlTextFields.add(lblNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        lblConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmarSenha.setText("Confirmar a senha");
        pnlTextFields.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        txtSenhaAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenhaAtual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSenhaAtual.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSenhaAtual.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSenhaAtual.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSenhaAtual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaAtualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaAtualFocusLost(evt);
            }
        });
        pnlTextFields.add(txtSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNovaSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNovaSenha.setMaximumSize(new java.awt.Dimension(320, 50));
        txtNovaSenha.setMinimumSize(new java.awt.Dimension(320, 50));
        txtNovaSenha.setPreferredSize(new java.awt.Dimension(320, 50));
        txtNovaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNovaSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNovaSenhaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtConfirmarSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtConfirmarSenha.setPreferredSize(new java.awt.Dimension(350, 50));
        txtConfirmarSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmarSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarSenhaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, -1));

        javax.swing.GroupLayout pnlAlterarSenhaLayout = new javax.swing.GroupLayout(pnlAlterarSenha);
        pnlAlterarSenha.setLayout(pnlAlterarSenhaLayout);
        pnlAlterarSenhaLayout.setHorizontalGroup(
            pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblAlterarSenha))
                    .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlAlterarSenhaLayout.setVerticalGroup(
            pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAlterarSenha)
                .addGap(26, 26, 26)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pnlContainer.add(pnlAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (validarCampos()) {
            this.usuario.setSenha(String.valueOf(txtNovaSenha.getPassword()).trim());
            try {
                facade.updateUsuario(this.usuario);
                this.setVisible(false);
                limparCampos();
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco: " + e.getMessage(), 
                    "Erro ao atualizar no banco de dados!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtSenhaAtualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaAtualFocusGained
        lblSenhaAtual.setVisible(false);
    }//GEN-LAST:event_txtSenhaAtualFocusGained

    private void txtSenhaAtualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaAtualFocusLost
        if (String.valueOf(txtSenhaAtual.getPassword()).trim().isEmpty()) {
            lblSenhaAtual.setVisible(true);
        }
    }//GEN-LAST:event_txtSenhaAtualFocusLost

    private void txtNovaSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovaSenhaFocusGained
       lblNovaSenha.setVisible(false);
    }//GEN-LAST:event_txtNovaSenhaFocusGained

    private void txtNovaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovaSenhaFocusLost
        if (String.valueOf(txtNovaSenha.getPassword()).trim().isEmpty()) {
            lblNovaSenha.setVisible(true);
        } 
    }//GEN-LAST:event_txtNovaSenhaFocusLost

    private void txtConfirmarSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusGained
        lblConfirmarSenha.setVisible(false);
    }//GEN-LAST:event_txtConfirmarSenhaFocusGained

    private void txtConfirmarSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusLost
        if (String.valueOf(txtConfirmarSenha.getPassword()).trim().isEmpty()) {
            lblConfirmarSenha.setVisible(true);
        } 
    }//GEN-LAST:event_txtConfirmarSenhaFocusLost

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
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel lblAlterarSenha;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblNovaSenha;
    private javax.swing.JLabel lblSenhaAtual;
    private javax.swing.JPanel pnlAlterarSenha;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
