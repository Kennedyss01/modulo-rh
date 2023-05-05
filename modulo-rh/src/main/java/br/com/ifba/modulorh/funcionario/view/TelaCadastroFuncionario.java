package br.com.ifba.modulorh.funcionario.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
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
 * @author Kaio
 */
@Component
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaCadastroUsuario telaCadastroUsuario;
    private Funcionario funcionario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    public TelaCadastroFuncionario() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void finalizarCadastro(Usuario usuario) {
        try{
            funcionario.setUsuario(usuario);
            facade.saveFuncionario(funcionario);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblFazerLogin = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDataDeNascimento = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDataDeEntrada = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtDataDeEntrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setIconImage(icone.getImage());
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 600));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));
        pnlLateral.setPreferredSize(new java.awt.Dimension(293, 595));

        lblModuloRH.setFont(fonteMaior);
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("Módulo RH");

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblModuloRH)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlLogin.setPreferredSize(new java.awt.Dimension(388, 340));

        lblFazerLogin.setFont(fonteMaior);
        lblFazerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFazerLogin.setText("Cadastro de Funcionário");

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(fonteNormal);
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

        lblNome.setFont(fonteNormal);
        lblNome.setText("Nome");
        pnlTextFields.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 20));

        lblDataDeNascimento.setFont(fonteNormal);
        lblDataDeNascimento.setText("Data de Nascimento");
        pnlTextFields.add(lblDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, 20));

        lblCpf.setFont(fonteNormal);
        lblCpf.setText("CPF");
        pnlTextFields.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 20));

        lblEndereco.setFont(fonteNormal);
        lblEndereco.setText("Endereço");
        pnlTextFields.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, 20));

        lblTelefone.setFont(fonteNormal);
        lblTelefone.setText("Telefone");
        pnlTextFields.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 290, 20));

        lblEmail.setFont(fonteNormal);
        lblEmail.setText("Email");
        pnlTextFields.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, 20));

        lblSalario.setFont(fonteNormal);
        lblSalario.setText("Salário");
        pnlTextFields.add(lblSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, 20));

        lblStatus.setFont(fonteNormal);
        lblStatus.setText("Status");
        pnlTextFields.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 290, 20));

        lblDataDeEntrada.setFont(fonteNormal);
        lblDataDeEntrada.setText("Data de entrada na empresa");
        pnlTextFields.add(lblDataDeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 290, 20));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNome.setMaximumSize(new java.awt.Dimension(320, 50));
        txtNome.setMinimumSize(new java.awt.Dimension(320, 50));
        txtNome.setPreferredSize(new java.awt.Dimension(320, 50));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        txtDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataDeNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataDeNascimento.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataDeNascimentoKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 40));

        txtCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCpf.setMaximumSize(new java.awt.Dimension(320, 50));
        txtCpf.setMinimumSize(new java.awt.Dimension(320, 50));
        txtCpf.setPreferredSize(new java.awt.Dimension(320, 50));
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 40));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEndereco.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 40));

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtTelefone.setMaximumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setMinimumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setPreferredSize(new java.awt.Dimension(320, 50));
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEmail.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEmail.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEmail.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 40));

        txtSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSalario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSalario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSalario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSalario.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 40));

        txtStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtStatus.setMaximumSize(new java.awt.Dimension(320, 50));
        txtStatus.setMinimumSize(new java.awt.Dimension(320, 50));
        txtStatus.setPreferredSize(new java.awt.Dimension(320, 50));
        txtStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStatusKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 310, 40));

        txtDataDeEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataDeEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataDeEntrada.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataDeEntradaKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtDataDeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 40));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFazerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblFazerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        funcionario = new Funcionario(txtNome.getText(), txtDataDeNascimento.getText(), txtCpf.getText(), txtEndereco.getText(), 
                txtTelefone.getText(), txtEmail.getText(), txtSalario.getText(), txtStatus.getText(), txtDataDeEntrada.getText());
        
        telaCadastroUsuario.setVisible(true);
        telaCadastroUsuario.setUsuario(txtCpf.getText());  
        telaCadastroUsuario.setCadastroFuncionario(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtDataDeNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoKeyPressed
        if(txtDataDeNascimento.getText().trim().isEmpty()){
            lblDataDeNascimento.setVisible(true);
        }else{
            lblDataDeNascimento.setVisible(false);
        }
    }//GEN-LAST:event_txtDataDeNascimentoKeyPressed

    private void txtDataDeEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeEntradaKeyPressed
        if(txtDataDeEntrada.getText().trim().isEmpty()){
            lblDataDeEntrada.setVisible(true);
        }else{
            lblDataDeEntrada.setVisible(false);
        }
    }//GEN-LAST:event_txtDataDeEntradaKeyPressed

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        if(txtEndereco.getText().trim().isEmpty()){
            lblEndereco.setVisible(true);
        }else{
            lblEndereco.setVisible(false);
        }
    }//GEN-LAST:event_txtEnderecoKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if(txtTelefone.getText().trim().isEmpty()){
            lblTelefone.setVisible(true);
        }else{
            lblTelefone.setVisible(false);
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(txtEmail.getText().trim().isEmpty()){
            lblEmail.setVisible(true);
        }else{
            lblEmail.setVisible(false);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        if(txtSalario.getText().trim().isEmpty()){
            lblSalario.setVisible(true);
        }else{
            lblSalario.setVisible(false);
        }
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void txtStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStatusKeyPressed
        if(txtStatus.getText().trim().isEmpty()){
            lblStatus.setVisible(true);
        }else{
            lblStatus.setVisible(false);
        }
    }//GEN-LAST:event_txtStatusKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(txtNome.getText().trim().isEmpty()){
            lblNome.setVisible(true);
        }else{
            lblNome.setVisible(false);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        if(txtCpf.getText().trim().isEmpty()){
            lblCpf.setVisible(true);
        }else{
            lblCpf.setVisible(false);
        }
    }//GEN-LAST:event_txtCpfKeyPressed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroFuncionario().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataDeEntrada;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFazerLogin;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataDeEntrada;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
