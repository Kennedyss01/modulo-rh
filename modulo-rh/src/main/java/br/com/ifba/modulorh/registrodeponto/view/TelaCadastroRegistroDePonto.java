package br.com.ifba.modulorh.registrodeponto.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenFuncionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.registrodeponto.model.RegistroDePonto;
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
 * @author Lucas Nogueira
 */
@Component
public class TelaCadastroRegistroDePonto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroRegistroDePonto
     */
    @Autowired
    private IFacade facade;
    private Long idUsuario;
    @Autowired @Lazy
    private TelaDeListarRegistroDePonto telaListarRegistroDePonto;
    @Autowired @Lazy
    private TelaHomescreenFuncionario telaHomescreenFuncionario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    Font fonteMenor;
    
    public TelaCadastroRegistroDePonto() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        this.fonteMenor = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-SemiBold.ttf"))
                .deriveFont(Font.PLAIN, 14);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void passandoDados(Long id){
        this.idUsuario = id;
    }
    
    private boolean validarCampos() {
        if (txtData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a data e tente novamente!",
                    "Data está vazia!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!chkSim.isSelected() && !chkNao.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione se o funcionário está presente ou não!",
                    "Presença não selecionada!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (chkSim.isSelected()) {
            if (txtHoraEntrada.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira a hora de entrada e tente novamente!",
                    "Hora de entrada está vazia!", JOptionPane.ERROR_MESSAGE);
            }
            if (txtHoraSaida.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira a hora de saída e tente novamente!",
                    "Hora de saída está vazia!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return true;
    }
    
    private void limparCampos() {
        chkSim.setSelected(false);
        chkNao.setSelected(false);
        chkSim.setEnabled(true);
        chkNao.setEnabled(true);
        txtData.setText("");
        txtHoraEntrada.setText("");
        txtHoraSaida.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        btnInicio1 = new javax.swing.JButton();
        pnlCampo = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        pnlTextFields = new javax.swing.JPanel();
        txtData = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSaida = new javax.swing.JTextField();
        lblPresente = new javax.swing.JLabel();
        chkSim = new javax.swing.JCheckBox();
        chkNao = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(838, 600));
        setPreferredSize(new java.awt.Dimension(838, 600));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(fonteMaior);
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("Módulo RH");

        btnInicio1.setBackground(new java.awt.Color(26, 81, 107));
        btnInicio1.setFont(fonteNormal);
        btnInicio1.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio1.setText("Inicio");
        btnInicio1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio1.setFocusPainted(false);
        btnInicio1.setFocusable(false);
        btnInicio1.setMaximumSize(new java.awt.Dimension(266, 40));
        btnInicio1.setMinimumSize(new java.awt.Dimension(266, 40));
        btnInicio1.setPreferredSize(new java.awt.Dimension(266, 40));
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblLateral))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pnlCampo.setBackground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 4, true));
        pnlMenu.setMinimumSize(new java.awt.Dimension(516, 426));

        lblMenu.setFont(fonteMaior);
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Registrar Ponto");

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtData.setText("Data");
        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtData.setMaximumSize(new java.awt.Dimension(320, 50));
        txtData.setMinimumSize(new java.awt.Dimension(320, 50));
        txtData.setPreferredSize(new java.awt.Dimension(320, 50));
        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFocusLost(evt);
            }
        });
        pnlTextFields.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, -1));

        txtHoraEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHoraEntrada.setText("Hora de entrada");
        txtHoraEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtHoraEntrada.setMaximumSize(new java.awt.Dimension(320, 50));
        txtHoraEntrada.setMinimumSize(new java.awt.Dimension(320, 50));
        txtHoraEntrada.setPreferredSize(new java.awt.Dimension(320, 50));
        txtHoraEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraEntradaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraEntradaFocusLost(evt);
            }
        });
        txtHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEntradaActionPerformed(evt);
            }
        });
        pnlTextFields.add(txtHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, -1));

        txtHoraSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHoraSaida.setText("Hora de saída");
        txtHoraSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtHoraSaida.setMaximumSize(new java.awt.Dimension(320, 50));
        txtHoraSaida.setMinimumSize(new java.awt.Dimension(320, 50));
        txtHoraSaida.setPreferredSize(new java.awt.Dimension(320, 50));
        txtHoraSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraSaidaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraSaidaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtHoraSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, -1));

        lblPresente.setFont(fonteNormal);
        lblPresente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresente.setText("Funcionário presente?");
        pnlTextFields.add(lblPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 70, 310, 20));

        chkSim.setBackground(new java.awt.Color(255, 255, 255));
        chkSim.setFont(fonteNormal);
        chkSim.setText("Sim");
        chkSim.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSimActionPerformed(evt);
            }
        });
        pnlTextFields.add(chkSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        chkNao.setBackground(new java.awt.Color(255, 255, 255));
        chkNao.setFont(fonteNormal);
        chkNao.setText("Não");
        chkNao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNaoActionPerformed(evt);
            }
        });
        pnlTextFields.add(chkNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(71, 19, 35));
        btnRegistrar.setFont(fonteNormal);
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setFocusable(false);
        btnRegistrar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlTextFields.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblMenu)
                .addGap(18, 18, 18)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraSaidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraSaidaFocusGained
        if (txtHoraSaida.getText().equals("Hora de saída")) {
            txtHoraSaida.setText("");
        }
    }//GEN-LAST:event_txtHoraSaidaFocusGained

    private void txtHoraSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraSaidaFocusLost
        if (txtHoraSaida.getText().trim().isEmpty()) {
            txtHoraSaida.setText("Hora de saída");
        }
    }//GEN-LAST:event_txtHoraSaidaFocusLost

    private void txtDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusGained
        // TODO add your handling code here:
        if(txtData.getText().equals("Data"))
            txtData.setText("");
    }//GEN-LAST:event_txtDataFocusGained

    private void txtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusLost
        // TODO add your handling code here:
        if(txtData.getText().trim().isEmpty())
            txtData.setText("Data");
    }//GEN-LAST:event_txtDataFocusLost

    private void txtHoraEntradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraEntradaFocusGained
        // TODO add your handling code here:
        if(txtHoraEntrada.getText().equals("Hora de entrada"))
            txtHoraEntrada.setText("");
    }//GEN-LAST:event_txtHoraEntradaFocusGained

    private void txtHoraEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraEntradaFocusLost
        // TODO add your handling code here:
        if(txtHoraEntrada.getText().trim().isEmpty())
            txtHoraEntrada.setText("Hora de entrada");
    }//GEN-LAST:event_txtHoraEntradaFocusLost

    private void txtHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEntradaActionPerformed

    private void chkSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSimActionPerformed
        if (chkSim.isSelected()) {
            chkNao.setEnabled(false);
            txtHoraEntrada.setEnabled(true);
            txtHoraSaida.setEnabled(true);
        } else {
            chkNao.setEnabled(true);
            txtHoraEntrada.setEnabled(false);
            txtHoraSaida.setEnabled(false);
        }
    }//GEN-LAST:event_chkSimActionPerformed

    private void chkNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNaoActionPerformed
        if (chkNao.isSelected()) {
            chkSim.setEnabled(false);
            txtHoraEntrada.setEnabled(false);
            txtHoraSaida.setEnabled(false);
        } else {
            chkSim.setEnabled(true);
            txtHoraEntrada.setEnabled(true);
            txtHoraSaida.setEnabled(true);
        }
    }//GEN-LAST:event_chkNaoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarCampos()) {
            String data = txtData.getText();
            String presente = "";
            String horaEntrada = null;
            String horaSaida = null;
            if (chkSim.isSelected()) {
                presente = "Presente";
                horaEntrada = txtHoraEntrada.getText();
                horaSaida = txtHoraSaida.getText();
            }
            if (chkNao.isSelected()) {
                presente = "Ausente";
                horaEntrada = "---";
                horaSaida = "---";
            }
            RegistroDePonto registroDePonto = new RegistroDePonto(
                    data, presente, horaEntrada, horaSaida, this.idUsuario);
            try {
                registroDePonto = facade.saveRegistroDePonto(registroDePonto);
                this.setVisible(false);
                telaListarRegistroDePonto.setVisible(true);
                telaListarRegistroDePonto.exibirDados();
                limparCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(),
                        "Erro ao salvar no banco de dados!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        this.setVisible(false);
        telaHomescreenFuncionario.setVisible(true);
    }//GEN-LAST:event_btnInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroRegistroDePonto().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkNao;
    private javax.swing.JCheckBox chkSim;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPresente;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSaida;
    // End of variables declaration//GEN-END:variables
}
