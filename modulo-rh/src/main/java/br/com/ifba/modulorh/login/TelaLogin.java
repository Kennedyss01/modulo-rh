package br.com.ifba.modulorh.login;

import br.com.ifba.modulorh.homescreen.TelaHomescreenFuncionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.swing.ImageIcon;
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
    private IFacade facade;
    @Autowired
    private TelaHomescreenFuncionario homescreenFuncionario;
    @Autowired
    private TelaHomescreenGestor homescreenGestor;
    @Autowired
    private TelaCadastroUsuario telaCadastroUsuario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    public TelaLogin() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @PostConstruct
    private void verficarExistenciaDeGestores() {
        try {
            Long contagem = facade.countUsuarioByTipo("Gestor");
      
            if (contagem == 0) {
                telaCadastroUsuario.setCadastroFuncionario(false);
                telaCadastroUsuario.selecionarGestor();
                telaCadastroUsuario.setVisible(true);
            } 
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, 
                   err.getMessage(), "Erro ao realizar contagem de usuários", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void limparCampos() {
        txtUsuario.setText("Usuário");
        txtSenha.setText("");
        lblSenha.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblFazerLogin = new javax.swing.JLabel();
        lblEsqueceuASenha = new javax.swing.JLabel();
        pnlTextFields = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
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
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));
        pnlLateral.setPreferredSize(new java.awt.Dimension(293, 595));

        lblModuloRH.setFont(fonteMaior);
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("MÓDULO RH");

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblModuloRH)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblModuloRH)
                .addContainerGap(629, Short.MAX_VALUE))
        );

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlLogin.setPreferredSize(new java.awt.Dimension(388, 340));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFazerLogin.setFont(fonteMaior);
        lblFazerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFazerLogin.setText("Fazer Login");
        pnlLogin.add(lblFazerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 26, 380, -1));

        lblEsqueceuASenha.setFont(fonteNormal);
        lblEsqueceuASenha.setForeground(new java.awt.Color(26, 81, 107));
        lblEsqueceuASenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsqueceuASenha.setText("Esqueceu a senha?");
        lblEsqueceuASenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqueceuASenhaMouseClicked(evt);
            }
        });
        pnlLogin.add(lblEsqueceuASenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 368, -1));

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenha.setFont(fonteNormal);
        lblSenha.setText("Senha");
        pnlTextFields.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 30));

        txtUsuario.setFont(fonteNormal);
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
        pnlTextFields.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, -1));

        pnlLogin.add(pnlTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 368, -1));

        btnEntrar.setBackground(new java.awt.Color(71, 19, 35));
        btnEntrar.setFont(fonteNormal);
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnEntrar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnEntrar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 243, -1, -1));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario usuario = new Usuario(txtUsuario.getText(), String.valueOf(txtSenha.getPassword()));
        try {
            usuario = facade.validarLoginUsuario(usuario);
            
            if (usuario.getTipo().equals("Funcionário")) {
                homescreenFuncionario.setVisible(true);
                homescreenFuncionario.definirFuncionario(usuario);
                homescreenFuncionario.atualizarData();
                homescreenFuncionario.toFront();
            } else {
                homescreenGestor.setVisible(true);
                homescreenGestor.definirGestor(usuario);
                homescreenGestor.toFront();
            }
            this.setVisible(false);
            limparCampos();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, 
                   err.getMessage(), "Erro ao realizar login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblEsqueceuASenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuASenhaMouseClicked
    
    }//GEN-LAST:event_lblEsqueceuASenhaMouseClicked

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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaLogin().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblEsqueceuASenha;
    private javax.swing.JLabel lblFazerLogin;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
