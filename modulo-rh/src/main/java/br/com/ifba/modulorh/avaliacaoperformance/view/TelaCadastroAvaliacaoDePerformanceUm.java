/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.avaliacaoperformance.view;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */

@Component
public class TelaCadastroAvaliacaoDePerformanceUm extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    private AvaliacaoPerformance avaliacao;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    @Autowired @Lazy
    private TelaCadastroAvaliacaoDePerformanceDois telaCadastroAvaliacaoDePerformanceDois;
    @Autowired @Lazy
    private TelaListarAvaliacaoDePerformance telaListarAvaliacaoDePerformance;
    
    public TelaCadastroAvaliacaoDePerformanceUm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void finalizarCadastro(float nota) {
        try{
            avaliacao.setNotaGeral(nota);
            facade.saveAvaliacaoPerformance(avaliacao);
            telaListarAvaliacaoDePerformance.exibirDados();
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
        btnInicio = new javax.swing.JButton();
        pnlCadastroDeAvaliacaoDePerformance = new javax.swing.JPanel();
        lblCadastroDeAvaliacaoDePerformance = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        txtDataDaAvaliacao = new javax.swing.JTextField();
        lblDataDeAvaliacao = new javax.swing.JLabel();
        lblCpfDoFuncionario = new javax.swing.JLabel();
        txtCpfDoFuncionario = new javax.swing.JTextField();
        lvlNomeDoFuncionario = new javax.swing.JLabel();
        txtNomeDoFuncionario = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));

        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("MÓDULO RH");

        btnInicio.setBackground(new java.awt.Color(26, 81, 107));
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
                        .addGap(81, 81, 81)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pnlCadastroDeAvaliacaoDePerformance.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroDeAvaliacaoDePerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroDeAvaliacaoDePerformance.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroDeAvaliacaoDePerformance.setPreferredSize(new java.awt.Dimension(388, 340));

        lblCadastroDeAvaliacaoDePerformance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCadastroDeAvaliacaoDePerformance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroDeAvaliacaoDePerformance.setText("Cadastro de Avaliação de Performance");

        btnProximo.setBackground(new java.awt.Color(71, 19, 35));
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText("Próximo");
        btnProximo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProximo.setFocusPainted(false);
        btnProximo.setFocusable(false);
        btnProximo.setMaximumSize(new java.awt.Dimension(266, 40));
        btnProximo.setMinimumSize(new java.awt.Dimension(266, 40));
        btnProximo.setPreferredSize(new java.awt.Dimension(266, 40));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDataDaAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataDaAvaliacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataDaAvaliacao.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataDaAvaliacao.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataDaAvaliacao.setPreferredSize(new java.awt.Dimension(320, 50));
        pnlTextFields.add(txtDataDaAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        lblDataDeAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataDeAvaliacao.setText("Data da Avaliação");
        pnlTextFields.add(lblDataDeAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblCpfDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpfDoFuncionario.setText("CPF do Funcionário");
        pnlTextFields.add(lblCpfDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtCpfDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCpfDoFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCpfDoFuncionario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtCpfDoFuncionario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtCpfDoFuncionario.setPreferredSize(new java.awt.Dimension(320, 50));
        pnlTextFields.add(txtCpfDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        lvlNomeDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlNomeDoFuncionario.setText("Nome do Funcionário");
        pnlTextFields.add(lvlNomeDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtNomeDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeDoFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNomeDoFuncionario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtNomeDoFuncionario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtNomeDoFuncionario.setPreferredSize(new java.awt.Dimension(320, 50));
        pnlTextFields.add(txtNomeDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        lblObservacoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblObservacoes.setText("Observações");
        pnlTextFields.add(lblObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        txtObservacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(txtObservacoes);

        pnlTextFields.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 130));

        javax.swing.GroupLayout pnlCadastroDeAvaliacaoDePerformanceLayout = new javax.swing.GroupLayout(pnlCadastroDeAvaliacaoDePerformance);
        pnlCadastroDeAvaliacaoDePerformance.setLayout(pnlCadastroDeAvaliacaoDePerformanceLayout);
        pnlCadastroDeAvaliacaoDePerformanceLayout.setHorizontalGroup(
            pnlCadastroDeAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createSequentialGroup()
                .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createSequentialGroup()
                        .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCadastroDeAvaliacaoDePerformanceLayout.setVerticalGroup(
            pnlCadastroDeAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroDeAvaliacaoDePerformanceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(pnlCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private boolean validarCampos() {
        if (txtDataDaAvaliacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a data da avaliacao e tente novamente!", 
                    "Data da avaliacao está vazia!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if (txtCpfDoFuncionario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o CPF e tente novamente!", 
                    "CPF do Funcionario está vazio!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtNomeDoFuncionario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Nome e tente novamente!", 
                    "Nome do Funcionario está vazio!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        
        Funcionario funcionario = facade.findFuncionarioByCpf(txtCpfDoFuncionario.getText());
        if(funcionario == null){
            JOptionPane.showMessageDialog(null, "O funcionário não foi encontrado!", 
                    "O funcionário não foi encontrado!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        avaliacao = new AvaliacaoPerformance(txtNomeDoFuncionario.getText(),txtDataDaAvaliacao.getText(), txtCpfDoFuncionario.getText(), 
                                             txtObservacoes.getText());
        avaliacao.setFuncionario(funcionario);
        
        if (validarCampos()) {
            try {
                telaCadastroAvaliacaoDePerformanceDois.setCadastroAvaliacaoPerformance(true);
                telaCadastroAvaliacaoDePerformanceDois.setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnProximoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAvaliacaoDePerformanceUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProximo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastroDeAvaliacaoDePerformance;
    private javax.swing.JLabel lblCpfDoFuncionario;
    private javax.swing.JLabel lblDataDeAvaliacao;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lvlNomeDoFuncionario;
    private javax.swing.JPanel pnlCadastroDeAvaliacaoDePerformance;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtCpfDoFuncionario;
    private javax.swing.JTextField txtDataDaAvaliacao;
    private javax.swing.JTextField txtNomeDoFuncionario;
    private javax.swing.JTextArea txtObservacoes;
    // End of variables declaration//GEN-END:variables
}
