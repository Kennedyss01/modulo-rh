/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */
@Component
public class TelaEditarFuncionario extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaCadastroUsuario cadastroUsuario;
    @Autowired @Lazy
    private TelaDeListarFuncionarios telaDeListarFuncionarios; 
    private Funcionario funcionario;
    
    public TelaEditarFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void passandoDados(Funcionario funcionario){
        txtNome.setText(funcionario.getNome());
        txtDataDeNascimento.setText(funcionario.getDataDeNascimento());
        txtCpf.setText(funcionario.getCpf());
        txtEndereco.setText(funcionario.getEndereco());
        txtTelefone.setText(funcionario.getTelefone());
        txtEmail.setText(funcionario.getEmail());
        txtSalario.setText(funcionario.getSalario());
        txtStatus.setText(funcionario.getStatus());
        txtDataDeEntrada.setText(funcionario.getDataDeEntrada());
        this.funcionario = funcionario;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer4 = new javax.swing.JPanel();
        pnlLateral4 = new javax.swing.JPanel();
        lblModuloRH4 = new javax.swing.JLabel();
        pnlLogin2 = new javax.swing.JPanel();
        lblEditarFuncionario = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer4.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlContainer4.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer4.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer4.setName(""); // NOI18N
        pnlContainer4.setPreferredSize(new java.awt.Dimension(900, 600));
        pnlContainer4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLateral4.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlLateral4.setMaximumSize(new java.awt.Dimension(300, 600));
        pnlLateral4.setPreferredSize(new java.awt.Dimension(300, 600));

        lblModuloRH4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblModuloRH4.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH4.setText("Módulo RH");

        javax.swing.GroupLayout pnlLateral4Layout = new javax.swing.GroupLayout(pnlLateral4);
        pnlLateral4.setLayout(pnlLateral4Layout);
        pnlLateral4Layout.setHorizontalGroup(
            pnlLateral4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateral4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblModuloRH4)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlLateral4Layout.setVerticalGroup(
            pnlLateral4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateral4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblModuloRH4)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        pnlContainer4.add(pnlLateral4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLogin2.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin2.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlLogin2.setPreferredSize(new java.awt.Dimension(388, 340));

        lblEditarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEditarFuncionario.setText("Editar Funcionário");

        btnEditar.setBackground(new java.awt.Color(71, 19, 35));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setFocusable(false);
        btnEditar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnEditar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnEditar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Nome");
        pnlTextFields.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 20));

        lblDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDataDeNascimento.setText("Data de Nascimento");
        pnlTextFields.add(lblDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 20));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setText("CPF");
        pnlTextFields.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco.setText("Endereço");
        pnlTextFields.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 20));

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefone.setText("Telefone");
        pnlTextFields.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setText("Email");
        pnlTextFields.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 20));

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setText("Salário");
        pnlTextFields.add(lblSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, 20));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setText("Status");
        pnlTextFields.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, 20));

        lblDataDeEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        pnlTextFields.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

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
        pnlTextFields.add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

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
        pnlTextFields.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

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
        pnlTextFields.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

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
        pnlTextFields.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

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
        pnlTextFields.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

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
        pnlTextFields.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

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
        pnlTextFields.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 40));

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
        pnlTextFields.add(txtDataDeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 40));

        javax.swing.GroupLayout pnlLogin2Layout = new javax.swing.GroupLayout(pnlLogin2);
        pnlLogin2.setLayout(pnlLogin2Layout);
        pnlLogin2Layout.setHorizontalGroup(
            pnlLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogin2Layout.createSequentialGroup()
                .addGroup(pnlLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogin2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLogin2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLogin2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblEditarFuncionario)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlLogin2Layout.setVerticalGroup(
            pnlLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogin2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnlContainer4.add(pnlLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContainer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlContainer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            Funcionario funcionarioEditado = new Funcionario(txtNome.getText(), txtDataDeNascimento.getText(), txtCpf.getText(), txtEndereco.getText(),
            txtTelefone.getText(), txtEmail.getText(), txtSalario.getText(), txtStatus.getText(), txtDataDeEntrada.getText());
            funcionarioEditado.setId(funcionario.getId());
            facade.updateFuncionario(funcionarioEditado);
            telaDeListarFuncionarios.exibirDados();
            this.setVisible(false);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Editar no banco: " + e.getMessage(), 
                    "Erro ao Editar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(txtNome.getText().trim().isEmpty()){
            lblNome.setVisible(true);
        }else{
            lblNome.setVisible(false);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtDataDeNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoKeyPressed
        if(txtDataDeNascimento.getText().trim().isEmpty()){
            lblDataDeNascimento.setVisible(true);
        }else{
            lblDataDeNascimento.setVisible(false);
        }
    }//GEN-LAST:event_txtDataDeNascimentoKeyPressed

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        if(txtCpf.getText().trim().isEmpty()){
            lblCpf.setVisible(true);
        }else{
            lblCpf.setVisible(false);
        }
    }//GEN-LAST:event_txtCpfKeyPressed

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

    private void txtDataDeEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeEntradaKeyPressed
        if(txtDataDeEntrada.getText().trim().isEmpty()){
            lblDataDeEntrada.setVisible(true);
        }else{
            lblDataDeEntrada.setVisible(false);
        }
    }//GEN-LAST:event_txtDataDeEntradaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataDeEntrada;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEditarFuncionario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblModuloRH4;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlContainer4;
    private javax.swing.JPanel pnlLateral4;
    private javax.swing.JPanel pnlLogin2;
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
