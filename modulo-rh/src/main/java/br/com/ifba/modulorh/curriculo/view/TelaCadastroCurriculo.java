/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.curriculo.view;

import br.com.ifba.modulorh.curriculo.model.Curriculo;
import br.com.ifba.modulorh.experienciaprofissional.view.TelaCadastroExperienciaProfissional;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
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
 * @author Gislaine
 */
@Component
public class TelaCadastroCurriculo extends javax.swing.JFrame {
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    @Autowired @Lazy
    private TelaCadastroExperienciaProfissional telaCadastroExperienciaProfissional;
    private Curriculo curriculo;
    @Autowired
    private IFacade facade;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    /**
     * Creates new form TelaCadastroCurriculo
     */
    public TelaCadastroCurriculo() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pnlCadastroCurriculo = new javax.swing.JPanel();
        lblCadastroCurriculo = new javax.swing.JLabel();
        pnlTextFields = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtVaga = new javax.swing.JTextField();
        txtFormacaoAcademica = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar1 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Currículo");
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(912, 600));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 600));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setPreferredSize(new java.awt.Dimension(293, 595));

        lblModuloRH.setFont(fonteMaior);
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("MÓDULO RH");

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
                        .addGap(43, 43, 43)
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pnlCadastroCurriculo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroCurriculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroCurriculo.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroCurriculo.setPreferredSize(new java.awt.Dimension(388, 340));

        lblCadastroCurriculo.setFont(fonteMaior);
        lblCadastroCurriculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCurriculo.setText("Cadastro de Currículo");

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setText("Nome");
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNome.setMaximumSize(new java.awt.Dimension(320, 50));
        txtNome.setMinimumSize(new java.awt.Dimension(320, 50));
        txtNome.setPreferredSize(new java.awt.Dimension(320, 50));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        pnlTextFields.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEndereco.setText("Endereço");
        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEndereco.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });
        pnlTextFields.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefone.setText("Telefone");
        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtTelefone.setMaximumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setMinimumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setPreferredSize(new java.awt.Dimension(320, 50));
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        pnlTextFields.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        txtVaga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtVaga.setText("Vaga");
        txtVaga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtVaga.setMaximumSize(new java.awt.Dimension(320, 50));
        txtVaga.setMinimumSize(new java.awt.Dimension(320, 50));
        txtVaga.setPreferredSize(new java.awt.Dimension(320, 50));
        txtVaga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVagaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVagaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtVaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        txtFormacaoAcademica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFormacaoAcademica.setText("Formação Acadêmica");
        txtFormacaoAcademica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFormacaoAcademica.setMaximumSize(new java.awt.Dimension(320, 50));
        txtFormacaoAcademica.setMinimumSize(new java.awt.Dimension(320, 50));
        txtFormacaoAcademica.setPreferredSize(new java.awt.Dimension(320, 50));
        txtFormacaoAcademica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFormacaoAcademicaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFormacaoAcademicaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtFormacaoAcademica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setText("Email");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEmail.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEmail.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEmail.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        pnlTextFields.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        btnCadastrar1.setFont(fonteNormal);
        btnCadastrar1.setText("Inserir Experiência Profissional");
        btnCadastrar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar1.setFocusPainted(false);
        btnCadastrar1.setFocusable(false);
        btnCadastrar1.setMaximumSize(new java.awt.Dimension(266, 40));
        btnCadastrar1.setMinimumSize(new java.awt.Dimension(266, 40));
        btnCadastrar1.setPreferredSize(new java.awt.Dimension(266, 40));
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });
        pnlTextFields.add(btnCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 40));

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
        pnlTextFields.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 40));

        javax.swing.GroupLayout pnlCadastroCurriculoLayout = new javax.swing.GroupLayout(pnlCadastroCurriculo);
        pnlCadastroCurriculo.setLayout(pnlCadastroCurriculoLayout);
        pnlCadastroCurriculoLayout.setHorizontalGroup(
            pnlCadastroCurriculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroCurriculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroCurriculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroCurriculoLayout.createSequentialGroup()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCadastroCurriculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCadastroCurriculoLayout.setVerticalGroup(
            pnlCadastroCurriculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroCurriculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroCurriculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(pnlCadastroCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pnlCadastroCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if(txtNome.getText().equals("Nome"))
            txtNome.setText("");  
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(txtNome.getText().trim().isEmpty())
            txtNome.setText("Nome");
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        if(txtEndereco.getText().equals("Endereço"))
            txtEndereco.setText("");
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        if(txtEndereco.getText().trim().isEmpty())
            txtEndereco.setText("Endereço");
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        if(txtTelefone.getText().equals("Telefone"))
            txtTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if(txtTelefone.getText().trim().isEmpty())
            txtTelefone.setText("Telefone");
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if(txtEmail.getText().equals("Email"))
            txtEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().trim().isEmpty())
            txtEmail.setText("Email");
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtVagaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVagaFocusGained
         if(txtVaga.getText().equals("Vaga"))
            txtVaga.setText("");
    }//GEN-LAST:event_txtVagaFocusGained

    private void txtVagaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVagaFocusLost
        if(txtVaga.getText().trim().isEmpty())
            txtVaga.setText("Vaga");
    }//GEN-LAST:event_txtVagaFocusLost

    private void txtFormacaoAcademicaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFormacaoAcademicaFocusGained
        if(txtFormacaoAcademica.getText().equals("Formação Acadêmica"))
            txtFormacaoAcademica.setText("");
    }//GEN-LAST:event_txtFormacaoAcademicaFocusGained

    private void txtFormacaoAcademicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFormacaoAcademicaFocusLost
        if(txtFormacaoAcademica.getText().trim().isEmpty())
            txtFormacaoAcademica.setText("Formação Acadêmica");
    }//GEN-LAST:event_txtFormacaoAcademicaFocusLost

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        curriculo = new Curriculo(txtNome.getText(), txtEndereco.getText(), txtTelefone.getText(), txtEmail.getText(), 
                txtVaga.getText(), txtFormacaoAcademica.getText());
        
        
        try{
            facade.saveCurriculo(curriculo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        this.telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        this.setVisible(false);
        telaCadastroExperienciaProfissional.setVisible(true);
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroCurriculo().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroCurriculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel lblCadastroCurriculo;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlCadastroCurriculo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacaoAcademica;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtVaga;
    // End of variables declaration//GEN-END:variables
}
