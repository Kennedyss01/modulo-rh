/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.experienciaprofissional.view;

import br.com.ifba.modulorh.curriculo.view.*;
import br.com.ifba.modulorh.experienciaprofissional.model.ExperienciaProfissional;
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
public class TelaEditarExperienciaProfissional extends javax.swing.JFrame {
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    @Autowired @Lazy
    private TelaCadastroCurriculo telaCadastroCurriculo;
    @Autowired @Lazy
    private TelaEditarCurriculo telaEditarCurriculo;
    private ExperienciaProfissional experienciaProfissional;
    @Autowired
    private IFacade facade;
    private int tipoTela;
    private int linhaEditar;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    /**
     * Creates new form TelaCadastroCurriculo
     */
    public TelaEditarExperienciaProfissional() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 20);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void preencherDados(ExperienciaProfissional expPro, int linha, int tipo) {
        this.tipoTela = tipo;
        this.linhaEditar = linha;
        this.experienciaProfissional = expPro;
        txtCargo.setText(expPro.getCargo());
        txtEmpresa.setText(expPro.getEmpresa());
        txtPeriodo.setText(expPro.getPeriodo());
    }
    
    public void limparDados() {
        txtCargo.setText("");
        txtEmpresa.setText("");
        txtPeriodo.setText("");
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
        btnVoltar1 = new javax.swing.JButton();
        pnlCadastroCurriculo = new javax.swing.JPanel();
        lblEditarExperienciaProfissional = new javax.swing.JLabel();
        pnlTextFields = new javax.swing.JPanel();
        txtCargo = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

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

        btnVoltar1.setBackground(new java.awt.Color(26, 81, 107));
        btnVoltar1.setFont(fonteNormal);
        btnVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar1.setText("Voltar");
        btnVoltar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltar1.setFocusPainted(false);
        btnVoltar1.setFocusable(false);
        btnVoltar1.setMaximumSize(new java.awt.Dimension(266, 40));
        btnVoltar1.setMinimumSize(new java.awt.Dimension(266, 40));
        btnVoltar1.setPreferredSize(new java.awt.Dimension(266, 40));
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
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
                        .addGap(31, 31, 31)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pnlCadastroCurriculo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroCurriculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroCurriculo.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroCurriculo.setPreferredSize(new java.awt.Dimension(388, 340));

        lblEditarExperienciaProfissional.setFont(fonteMaior);
        lblEditarExperienciaProfissional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarExperienciaProfissional.setText("Editar Experiência Profissional");

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCargo.setText("Cargo");
        txtCargo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCargo.setMaximumSize(new java.awt.Dimension(320, 50));
        txtCargo.setMinimumSize(new java.awt.Dimension(320, 50));
        txtCargo.setPreferredSize(new java.awt.Dimension(320, 50));
        txtCargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCargoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCargoFocusLost(evt);
            }
        });
        pnlTextFields.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        txtEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpresa.setText("Empresa");
        txtEmpresa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEmpresa.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEmpresa.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEmpresa.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmpresaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpresaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        txtPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPeriodo.setText("Período");
        txtPeriodo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPeriodo.setMaximumSize(new java.awt.Dimension(320, 50));
        txtPeriodo.setMinimumSize(new java.awt.Dimension(320, 50));
        txtPeriodo.setPreferredSize(new java.awt.Dimension(320, 50));
        txtPeriodo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPeriodoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPeriodoFocusLost(evt);
            }
        });
        pnlTextFields.add(txtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        btnEditar.setBackground(new java.awt.Color(71, 19, 35));
        btnEditar.setFont(fonteNormal);
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        pnlTextFields.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 40));

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
                    .addComponent(lblEditarExperienciaProfissional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCadastroCurriculoLayout.setVerticalGroup(
            pnlCadastroCurriculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroCurriculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarExperienciaProfissional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(pnlCadastroCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(pnlCadastroCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
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

    private void txtCargoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargoFocusGained
        if(txtCargo.getText().equals("Cargo"))
            txtCargo.setText("");  
    }//GEN-LAST:event_txtCargoFocusGained

    private void txtCargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargoFocusLost
        if(txtCargo.getText().trim().isEmpty())
            txtCargo.setText("Cargo");
    }//GEN-LAST:event_txtCargoFocusLost

    private void txtEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpresaFocusGained
        if(txtEmpresa.getText().equals("Empresa"))
            txtEmpresa.setText("");
    }//GEN-LAST:event_txtEmpresaFocusGained

    private void txtEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpresaFocusLost
        if(txtEmpresa.getText().trim().isEmpty())
            txtEmpresa.setText("Empresa");
    }//GEN-LAST:event_txtEmpresaFocusLost

    private void txtPeriodoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPeriodoFocusGained
        if(txtPeriodo.getText().equals("Período"))
            txtPeriodo.setText("");
    }//GEN-LAST:event_txtPeriodoFocusGained

    private void txtPeriodoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPeriodoFocusLost
        if(txtPeriodo.getText().trim().isEmpty())
            txtPeriodo.setText("Período");
    }//GEN-LAST:event_txtPeriodoFocusLost

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.experienciaProfissional.setCargo(txtCargo.getText());
        this.experienciaProfissional.setEmpresa(txtEmpresa.getText());
        this.experienciaProfissional.setPeriodo(txtPeriodo.getText());
        try {
            facade.updateExperienciaProfissional(experienciaProfissional);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(),
                    "Erro ao salvar no banco de dados!", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        if (tipoTela == 1) {
            this.telaCadastroCurriculo.editarExperiencia(experienciaProfissional, linhaEditar);
            this.telaCadastroCurriculo.setVisible(true);
        }
        if (tipoTela == 2) {
            this.telaEditarCurriculo.editarExperiencia(experienciaProfissional, linhaEditar);
            this.telaEditarCurriculo.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        this.setVisible(false);
        if (tipoTela == 1) {
            this.telaCadastroCurriculo.setVisible(true);
        }
        if (tipoTela == 2) {
            this.telaEditarCurriculo.setVisible(true);
        }
    }//GEN-LAST:event_btnVoltar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaEditarExperienciaProfissional().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaEditarExperienciaProfissional.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel lblEditarExperienciaProfissional;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlCadastroCurriculo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
