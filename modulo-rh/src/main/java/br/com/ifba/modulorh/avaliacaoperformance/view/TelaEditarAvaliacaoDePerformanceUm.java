/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.avaliacaoperformance.view;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
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
public class TelaEditarAvaliacaoDePerformanceUm extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor; 
    @Autowired @Lazy
    private TelaEditarAvaliacaoDePerformanceDois telaEditarAvaliacaoDePerformanceDois;
    @Autowired @Lazy
    private TelaListarAvaliacaoDePerformance telaListarAvaliacaoDePerformance;
    private AvaliacaoPerformance avaliacaoPerformance;
    
    
    public TelaEditarAvaliacaoDePerformanceUm() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlEditarAvaliacaoDePerformance = new javax.swing.JPanel();
        lbEditarAvaliacaoDePerformance = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        txtEditarDataDaAvaliacao = new javax.swing.JTextField();
        lblDataDeAvaliacao = new javax.swing.JLabel();
        lvlNomeDoFuncionario = new javax.swing.JLabel();
        txtEditarNomeDoFuncionario = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditarObservacoes = new javax.swing.JTextArea();

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

        btnVoltar.setBackground(new java.awt.Color(26, 81, 107));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.setFocusable(false);
        btnVoltar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnVoltar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnVoltar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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
                        .addGap(33, 33, 33)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pnlEditarAvaliacaoDePerformance.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarAvaliacaoDePerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlEditarAvaliacaoDePerformance.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlEditarAvaliacaoDePerformance.setPreferredSize(new java.awt.Dimension(388, 340));

        lbEditarAvaliacaoDePerformance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEditarAvaliacaoDePerformance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditarAvaliacaoDePerformance.setText("Editar Avaliação de Performance");

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

        txtEditarDataDaAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEditarDataDaAvaliacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEditarDataDaAvaliacao.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEditarDataDaAvaliacao.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEditarDataDaAvaliacao.setPreferredSize(new java.awt.Dimension(320, 50));
        pnlTextFields.add(txtEditarDataDaAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        lblDataDeAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataDeAvaliacao.setText("Data da Avaliação");
        pnlTextFields.add(lblDataDeAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lvlNomeDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlNomeDoFuncionario.setText("Nome do Funcionário");
        pnlTextFields.add(lvlNomeDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtEditarNomeDoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEditarNomeDoFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEditarNomeDoFuncionario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEditarNomeDoFuncionario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEditarNomeDoFuncionario.setPreferredSize(new java.awt.Dimension(320, 50));
        pnlTextFields.add(txtEditarNomeDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 40));

        lblObservacoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblObservacoes.setText("Observações");
        pnlTextFields.add(lblObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtEditarObservacoes.setColumns(20);
        txtEditarObservacoes.setRows(5);
        txtEditarObservacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(txtEditarObservacoes);

        pnlTextFields.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, 210));

        javax.swing.GroupLayout pnlEditarAvaliacaoDePerformanceLayout = new javax.swing.GroupLayout(pnlEditarAvaliacaoDePerformance);
        pnlEditarAvaliacaoDePerformance.setLayout(pnlEditarAvaliacaoDePerformanceLayout);
        pnlEditarAvaliacaoDePerformanceLayout.setHorizontalGroup(
            pnlEditarAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createSequentialGroup()
                .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createSequentialGroup()
                        .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbEditarAvaliacaoDePerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEditarAvaliacaoDePerformanceLayout.setVerticalGroup(
            pnlEditarAvaliacaoDePerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarAvaliacaoDePerformanceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbEditarAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnlEditarAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlEditarAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void passandoDados(AvaliacaoPerformance avaliacaoPerformance){
        txtEditarDataDaAvaliacao.setText(avaliacaoPerformance.getDataDaAvaliacao());
        txtEditarNomeDoFuncionario.setText(avaliacaoPerformance.getNomeFuncionario());
        txtEditarObservacoes.setText(avaliacaoPerformance.getObservacoes());
        this.avaliacaoPerformance = avaliacaoPerformance;
    }
    
        private boolean validarCampos() {
        if (txtEditarDataDaAvaliacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a data da avaliacao e tente novamente!", 
                    "Data da avaliacao está vazia!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEditarNomeDoFuncionario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Nome e tente novamente!", 
                    "Nome do Funcionario está vazio!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }
    
    public void finalizarEditar(float nota) {
        try{
            avaliacaoPerformance.setNotaGeral(nota);
            facade.updateAvaliacaoPerformance(avaliacaoPerformance);
            telaListarAvaliacaoDePerformance.exibirDados();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }    
        
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if (validarCampos()) {
            try {
                avaliacaoPerformance.setDataDaAvaliacao(txtEditarDataDaAvaliacao.getText());
                avaliacaoPerformance.setNomeFuncionario(txtEditarNomeDoFuncionario.getText());
                avaliacaoPerformance.setObservacoes(txtEditarObservacoes.getText());
                telaEditarAvaliacaoDePerformanceDois.setEditarAvaliacaoPerformance(true);
                telaEditarAvaliacaoDePerformanceDois.setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        telaListarAvaliacaoDePerformance.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAvaliacaoDePerformanceUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarAvaliacaoDePerformanceUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEditarAvaliacaoDePerformance;
    private javax.swing.JLabel lblDataDeAvaliacao;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lvlNomeDoFuncionario;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlEditarAvaliacaoDePerformance;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtEditarDataDaAvaliacao;
    private javax.swing.JTextField txtEditarNomeDoFuncionario;
    private javax.swing.JTextArea txtEditarObservacoes;
    // End of variables declaration//GEN-END:variables
}
