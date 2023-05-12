package br.com.ifba.modulorh.usuario.view;

import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.funcionario.view.TelaDeListarFuncionarios;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.login.TelaLogin;
import br.com.ifba.modulorh.usuario.model.Usuario;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
    private TelaLogin telaDeLogin;
    @Autowired @Lazy
    private TelaCadastroFuncionario telaCadastroFuncionario;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    @Autowired
    private TelaDeListarFuncionarios telaDeListarFuncionarios; 
    private boolean cadastroFuncionario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    public TelaCadastroUsuario() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setUsuario(String usuario) {
        txtUsuario.setText(usuario);
    }
    
    public void selecionarGestor() {
        chkGestor.setSelected(true);
        chkFuncionario.setEnabled(false);
    }
    
    public void setCadastroFuncionario(boolean cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
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
    
    private void limparCampos() {
        chkGestor.setSelected(false);
        chkFuncionario.setSelected(false);
        chkFuncionario.setEnabled(true);
        chkGestor.setEnabled(true);
        txtUsuario.setText("");
        txtSenha.setText("");
        txtConfirmarSenha.setText("");
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
        btnInicio = new javax.swing.JButton();
        pnlCadastroUsuario = new javax.swing.JPanel();
        lblCadastroDeUsuario = new javax.swing.JLabel();
        lblEscolhaCadastro = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        chkGestor = new javax.swing.JCheckBox();
        chkFuncionario = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setAutoRequestFocus(false);
        setIconImage(icone.getImage());
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setMinimumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(1100, 670));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setMaximumSize(new java.awt.Dimension(300, 600));
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));
        pnlLateral.setPreferredSize(new java.awt.Dimension(293, 595));

        lblModuloRH.setFont(fonteMaior);
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("Módulo RH");

        btnInicio.setBackground(new java.awt.Color(26, 81, 107));
        btnInicio.setFont(fonteNormal);
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.setMaximumSize(new java.awt.Dimension(266, 40));
        btnInicio.setMinimumSize(new java.awt.Dimension(266, 40));
        btnInicio.setPreferredSize(new java.awt.Dimension(266, 40));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        pnlCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroUsuario.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroUsuario.setPreferredSize(new java.awt.Dimension(388, 340));
        pnlCadastroUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastroDeUsuario.setFont(fonteMaior);
        lblCadastroDeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroDeUsuario.setText("Cadastro de Usuário");
        pnlCadastroUsuario.add(lblCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 23, 380, -1));

        lblEscolhaCadastro.setFont(fonteNormal);
        lblEscolhaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEscolhaCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscolhaCadastro.setText("Escolha o tipo de usuário:");
        pnlCadastroUsuario.add(lblEscolhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 291, 368, -1));

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(fonteNormal);
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
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
        pnlCadastroUsuario.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 351, -1, -1));

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenha.setFont(fonteNormal);
        lblSenha.setText("Senha");
        pnlTextFields.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        lblConfirmarSenha.setFont(fonteNormal);
        lblConfirmarSenha.setText("Confirmar a senha");
        pnlTextFields.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setText("Usuário");
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUsuario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtUsuario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtUsuario.setPreferredSize(new java.awt.Dimension(320, 50));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        pnlTextFields.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSenha.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSenha.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSenha.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

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

        pnlCadastroUsuario.add(pnlTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 368, 228));

        chkGestor.setBackground(new java.awt.Color(255, 255, 255));
        chkGestor.setFont(fonteNormal);
        chkGestor.setForeground(new java.awt.Color(0, 0, 0));
        chkGestor.setText("Gestor");
        chkGestor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGestorActionPerformed(evt);
            }
        });
        pnlCadastroUsuario.add(chkGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 130, -1));

        chkFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        chkFuncionario.setFont(fonteNormal);
        chkFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        chkFuncionario.setText("Funcionário");
        chkFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFuncionarioActionPerformed(evt);
            }
        });
        pnlCadastroUsuario.add(chkFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 313, 158, -1));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(pnlCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(pnlCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                
                if (cadastroFuncionario == true) {
                    telaCadastroFuncionario.finalizarCadastro(usuario);
                    telaDeListarFuncionarios.setVisible(true);
                    telaDeListarFuncionarios.toFront();
                    telaDeListarFuncionarios.exibirDados();
                } else {
                    telaDeLogin.setVisible(true);
                    telaDeLogin.toFront();
                }
                limparCampos();
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
       if (txtUsuario.getText().equals("Usuário")) {
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().trim().isEmpty()) {
           txtUsuario.setText("Usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        lblSenha.setVisible(false);
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (String.valueOf(txtSenha.getPassword()).trim().isEmpty()) {
            lblSenha.setVisible(true);
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtConfirmarSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusGained
        lblConfirmarSenha.setVisible(false);
    }//GEN-LAST:event_txtConfirmarSenhaFocusGained

    private void txtConfirmarSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusLost
        if (String.valueOf(txtConfirmarSenha.getPassword()).trim().isEmpty()) {
            lblConfirmarSenha.setVisible(true);
        }
    }//GEN-LAST:event_txtConfirmarSenhaFocusLost

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (cadastroFuncionario == true) {
            this.setVisible(false);
            telaHomescreenGestor.setVisible(true);
            telaHomescreenGestor.toFront();
        }
    }//GEN-LAST:event_btnInicioActionPerformed

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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroUsuario().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JCheckBox chkFuncionario;
    private javax.swing.JCheckBox chkGestor;
    private javax.swing.JLabel lblCadastroDeUsuario;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEscolhaCadastro;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlCadastroUsuario;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
