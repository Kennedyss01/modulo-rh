package br.com.ifba.modulorh.desconto.view;

import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaCadastroDesconto extends javax.swing.JFrame {

    Font fonteMaior;
    Font fonteNormal;
    
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaDeListarDescontos telaDeListarDescontos;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    
    public TelaCadastroDesconto() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void limparCampos() {
        txtNome.setText("Nome");
        txtValorFixoOuPercentual.setText("Valor Fixo ou Percentual");
        chkPercentual.setSelected(false);
        chkValorFixo.setSelected(false);
    }
    
     private Desconto getDesconto() {
        float valor = Float.parseFloat(txtValorFixoOuPercentual.getText());
        String nome = txtNome.getText();
        if (chkPercentual.isSelected()) {
            return new Desconto(nome, valor, "Percentual");
        }
        return new Desconto(nome, valor, "Fixo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pnlCadastroDesconto = new javax.swing.JPanel();
        lblCadastroDesconto = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtValorFixoOuPercentual = new javax.swing.JTextField();
        chkPercentual = new javax.swing.JCheckBox();
        chkValorFixo = new javax.swing.JCheckBox();
        lblEscolhaTipoDesconto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Desconto");
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setMinimumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setName(""); // NOI18N

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));

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
                        .addGap(42, 42, 42)
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pnlCadastroDesconto.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroDesconto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroDesconto.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroDesconto.setPreferredSize(new java.awt.Dimension(388, 340));
        pnlCadastroDesconto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastroDesconto.setFont(fonteMaior);
        lblCadastroDesconto.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroDesconto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroDesconto.setText("Cadastro de Desconto");
        pnlCadastroDesconto.add(lblCadastroDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 32));

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
        pnlCadastroDesconto.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 274, -1, -1));

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
        pnlTextFields.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        txtValorFixoOuPercentual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValorFixoOuPercentual.setText("Valor Fixo ou Percentual");
        txtValorFixoOuPercentual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtValorFixoOuPercentual.setMaximumSize(new java.awt.Dimension(320, 50));
        txtValorFixoOuPercentual.setMinimumSize(new java.awt.Dimension(320, 50));
        txtValorFixoOuPercentual.setPreferredSize(new java.awt.Dimension(320, 50));
        txtValorFixoOuPercentual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFixoOuPercentualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFixoOuPercentualFocusLost(evt);
            }
        });
        pnlTextFields.add(txtValorFixoOuPercentual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 40));

        chkPercentual.setForeground(new java.awt.Color(0, 0, 0));
        chkPercentual.setText("Percentual");
        chkPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPercentualActionPerformed(evt);
            }
        });
        pnlTextFields.add(chkPercentual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        chkValorFixo.setForeground(new java.awt.Color(0, 0, 0));
        chkValorFixo.setText("Valor Fixo");
        chkValorFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkValorFixoActionPerformed(evt);
            }
        });
        pnlTextFields.add(chkValorFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        lblEscolhaTipoDesconto.setForeground(new java.awt.Color(0, 0, 0));
        lblEscolhaTipoDesconto.setText("Escolha o tipo de desconto:");
        pnlTextFields.add(lblEscolhaTipoDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        pnlCadastroDesconto.add(pnlTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 200));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(pnlCadastroDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(pnlCadastroDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
         try {
            Desconto desconto = getDesconto();
            facade.saveDesconto(desconto);
            telaDeListarDescontos.exibirDados();
            this.setVisible(false);
            telaDeListarDescontos.setVisible(true);
            telaDeListarDescontos.toFront();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
         limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void chkPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPercentualActionPerformed
        if (chkPercentual.isSelected()) {
            chkValorFixo.setEnabled(false);
        } else {
            chkValorFixo.setEnabled(true);
        }
    }//GEN-LAST:event_chkPercentualActionPerformed

    private void chkValorFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkValorFixoActionPerformed
        if (chkValorFixo.isSelected()) {
            chkPercentual.setEnabled(false);
        } else {
            chkPercentual.setEnabled(true);
        }
    }//GEN-LAST:event_chkValorFixoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
        telaHomescreenGestor.toFront();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if (txtNome.getText().equals("Nome"))
            txtNome.setText("");
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtValorFixoOuPercentualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFixoOuPercentualFocusGained
        if (txtValorFixoOuPercentual.getText().equals("Valor Fixo ou Percentual"))
            txtValorFixoOuPercentual.setText("");
    }//GEN-LAST:event_txtValorFixoOuPercentualFocusGained

    private void txtValorFixoOuPercentualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFixoOuPercentualFocusLost
        if (txtValorFixoOuPercentual.getText().trim().isEmpty())
            txtValorFixoOuPercentual.setText("Valor Fixo ou Percentual");
    }//GEN-LAST:event_txtValorFixoOuPercentualFocusLost

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if (txtNome.getText().trim().isEmpty())
            txtNome.setText("Nome");
    }//GEN-LAST:event_txtNomeFocusLost

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
            java.util.logging.Logger.getLogger(TelaCadastroDesconto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDesconto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDesconto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDesconto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroDesconto().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroDesconto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroDesconto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JCheckBox chkPercentual;
    private javax.swing.JCheckBox chkValorFixo;
    private javax.swing.JLabel lblCadastroDesconto;
    private javax.swing.JLabel lblEscolhaTipoDesconto;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlCadastroDesconto;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorFixoOuPercentual;
    // End of variables declaration//GEN-END:variables
}
