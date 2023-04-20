package br.com.ifba.modulorh.usuario.view;

import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.funcionario.view.TelaDeListarFuncionarios;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.usuario.model.Usuario;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaCadastroUsuario extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaCadastroFuncionario telaCadastroFuncionario;
    @Autowired
    private TelaDeListarFuncionarios telaDeListarFuncionarios; 
    
    public TelaCadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setUsuario(String usuario) {
        txtUsuario.setText(usuario);
        lblUsuario.setVisible(false);
    }
    
    private boolean validarCampos() {
        if (txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o usuário e tente novamente!", 
                    "Nome de usuário está vazio!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       if (String.valueOf(txtSenha.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a senha e tente novamente!", 
                    "Senha está vazia!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
       if (!(String.valueOf(txtConfirmarSenha.getPassword()).equals(String.valueOf(txtSenha.getPassword())))) {
            JOptionPane.showMessageDialog(null, "As senhas informadas não correspondem, tente novamente!", 
                    "Senhas não correspondem!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
        if (!chkGestor.isSelected() && !chkFuncionario.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de usuário!", 
                    "Nenhum tipo selecionado!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }
    
    private Usuario getUsuario() {
        String nomeUsuario = txtUsuario.getText().trim();
        String senha = String.valueOf(txtSenha.getPassword()).trim();
        if (chkGestor.isSelected()) {
            return new Usuario(nomeUsuario, senha, "Gestor");
        }        
        return new Usuario(nomeUsuario, senha, "Funcionário");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        pnlCadastroUsuario = new javax.swing.JPanel();
        lblCadastroDeUsuario = new javax.swing.JLabel();
        lblEscolhaCadastro = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        chkGestor = new javax.swing.JCheckBox();
        chkFuncionario = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

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

        pnlCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroUsuario.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroUsuario.setPreferredSize(new java.awt.Dimension(388, 340));

        lblCadastroDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCadastroDeUsuario.setText("Cadastro de Usuário");

        lblEscolhaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscolhaCadastro.setText("Escolha o tipo de usuário:");

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");
        pnlTextFields.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 30));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        pnlTextFields.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        lblConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmarSenha.setText("Confirmar a senha");
        pnlTextFields.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUsuario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtUsuario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtUsuario.setPreferredSize(new java.awt.Dimension(320, 50));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSenha.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSenha.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSenha.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtConfirmarSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtConfirmarSenha.setPreferredSize(new java.awt.Dimension(350, 50));
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, -1));

        chkGestor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkGestor.setText("Gestor");
        chkGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGestorActionPerformed(evt);
            }
        });

        chkFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkFuncionario.setText("Funcionário");
        chkFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroUsuarioLayout = new javax.swing.GroupLayout(pnlCadastroUsuario);
        pnlCadastroUsuario.setLayout(pnlCadastroUsuarioLayout);
        pnlCadastroUsuarioLayout.setHorizontalGroup(
            pnlCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                .addGroup(pnlCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblCadastroDeUsuario))
                    .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblEscolhaCadastro))
                    .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(chkGestor)
                        .addGap(52, 52, 52)
                        .addComponent(chkFuncionario)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlCadastroUsuarioLayout.setVerticalGroup(
            pnlCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCadastroDeUsuario)
                .addGap(18, 18, 18)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEscolhaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkGestor)
                    .addComponent(chkFuncionario))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pnlContainer.add(pnlCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 430));

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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (validarCampos()) {
            Usuario usuario = getUsuario();
            try {
                usuario = facade.saveUsuario(usuario);
                this.setVisible(false);
                telaCadastroFuncionario.finalizarCadastro(usuario);
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
            }
        }
        telaDeListarFuncionarios.exibirDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (txtUsuario.getText().trim().isEmpty()) {
            lblUsuario.setVisible(true);
        } else {
            lblUsuario.setVisible(false);
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (String.valueOf(txtSenha.getPassword()).trim().isEmpty()) {
            lblSenha.setVisible(true);
        } else {
            lblSenha.setVisible(false);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void chkGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGestorActionPerformed
        if (chkGestor.isSelected()) {
            chkFuncionario.setEnabled(false);
        } else {
            chkFuncionario.setEnabled(true);
        }
    }//GEN-LAST:event_chkGestorActionPerformed

    private void chkFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFuncionarioActionPerformed
        if (chkFuncionario.isSelected()) {
            chkGestor.setEnabled(false);
        } else {
            chkGestor.setEnabled(true);
        }
    }//GEN-LAST:event_chkFuncionarioActionPerformed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if (String.valueOf(txtConfirmarSenha.getPassword()).trim().isEmpty()) {
            lblConfirmarSenha.setVisible(true);
        } else {
            lblConfirmarSenha.setVisible(false);
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chkFuncionario;
    private javax.swing.JCheckBox chkGestor;
    private javax.swing.JLabel lblCadastroDeUsuario;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEscolhaCadastro;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCadastroUsuario;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
