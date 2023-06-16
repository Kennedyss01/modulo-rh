/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.avaliacaoperformance.view;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */
@Component
public class TelaCadastroAvaliacaoDePerformanceDois extends javax.swing.JFrame {

    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    @Autowired @Lazy
    private TelaCadastroAvaliacaoDePerformanceUm telaCadastroAvaliacaoDePerformanceUm;
    @Autowired @Lazy
    private TelaListarAvaliacaoDePerformance telaListarAvaliacaoDePerformance;
    AvaliacaoPerformance avaliacaoPerformance;
    private boolean cadastroAvaliacaoPerformance;
    private float notageral;
    private String valor;
    
    public TelaCadastroAvaliacaoDePerformanceDois() {
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
        pnlCadastroDeAvaliacaoDePerformance = new javax.swing.JPanel();
        lblCadastroDeAvaliacaoDePerformance = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        lblAssiduidade = new javax.swing.JLabel();
        cbbValoresAssiduidade = new javax.swing.JComboBox<>();
        lblCompromisso = new javax.swing.JLabel();
        cbbValoresCompromisso = new javax.swing.JComboBox<>();
        lblColaboracaoEmGrupo = new javax.swing.JLabel();
        cbbValoresColaboracaoEmGrupo = new javax.swing.JComboBox<>();
        lblDesempenho = new javax.swing.JLabel();
        cbbValoresDesempenho = new javax.swing.JComboBox<>();

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
                        .addGap(29, 29, 29)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pnlCadastroDeAvaliacaoDePerformance.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroDeAvaliacaoDePerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlCadastroDeAvaliacaoDePerformance.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlCadastroDeAvaliacaoDePerformance.setPreferredSize(new java.awt.Dimension(388, 340));

        lblCadastroDeAvaliacaoDePerformance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCadastroDeAvaliacaoDePerformance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroDeAvaliacaoDePerformance.setText("Cadastro de Avaliação de Performance");

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
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

        lblAssiduidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAssiduidade.setText("Assiduidade");
        pnlTextFields.add(lblAssiduidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cbbValoresAssiduidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Péssimo", "Ruim", "Regular", "Bom", "Otimo" }));
        pnlTextFields.add(cbbValoresAssiduidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 320, 30));

        lblCompromisso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCompromisso.setText("Compromisso");
        pnlTextFields.add(lblCompromisso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cbbValoresCompromisso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Péssimo", "Ruim", "Regular", "Bom", "Otimo" }));
        pnlTextFields.add(cbbValoresCompromisso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 30));

        lblColaboracaoEmGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblColaboracaoEmGrupo.setText("Colaboração em Grupo");
        pnlTextFields.add(lblColaboracaoEmGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cbbValoresColaboracaoEmGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Péssimo", "Ruim", "Regular", "Bom", "Otimo" }));
        pnlTextFields.add(cbbValoresColaboracaoEmGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 320, 30));

        lblDesempenho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDesempenho.setText("Desempenho");
        pnlTextFields.add(lblDesempenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        cbbValoresDesempenho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Péssimo", "Ruim", "Regular", "Bom", "Otimo" }));
        pnlTextFields.add(cbbValoresDesempenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 30));

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
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
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
                .addComponent(pnlCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pnlCadastroDeAvaliacaoDePerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    public void setCadastroAvaliacaoPerformance(boolean cadastroAvaliacaoPerformance) {
        this.cadastroAvaliacaoPerformance = cadastroAvaliacaoPerformance;
    } 
    
    public float verificaNota(String valor){
        float nota = 0;
        
        if(valor.equals("Péssimo")){
            nota = 2;
        }
        if(valor.equals("Ruim")){
            nota = 4;
        }
        if(valor.equals("Regular")){
            nota = 6;
        }
        if(valor.equals("Bom")){
            nota = 8;
        }
        if(valor.equals("Otimo")){
            nota = 10;
        }
        
        return nota;
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try{
            notageral = 0;
            if(cadastroAvaliacaoPerformance == true){
                valor = cbbValoresAssiduidade.getSelectedItem().toString();
                notageral += verificaNota(valor);
                valor = cbbValoresCompromisso.getSelectedItem().toString();
                notageral += verificaNota(valor);
                valor = cbbValoresColaboracaoEmGrupo.getSelectedItem().toString();
                notageral += verificaNota(valor);
                valor = cbbValoresDesempenho.getSelectedItem().toString();
                notageral += verificaNota(valor);
                notageral = (notageral/4);

                telaCadastroAvaliacaoDePerformanceUm.finalizarCadastro(notageral);

                this.setVisible(false);
                telaListarAvaliacaoDePerformance.setVisible(true);
                telaListarAvaliacaoDePerformance.exibirDados();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        telaCadastroAvaliacaoDePerformanceUm.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAvaliacaoDePerformanceDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAvaliacaoDePerformanceDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbbValoresAssiduidade;
    private javax.swing.JComboBox<String> cbbValoresColaboracaoEmGrupo;
    private javax.swing.JComboBox<String> cbbValoresCompromisso;
    private javax.swing.JComboBox<String> cbbValoresDesempenho;
    private javax.swing.JLabel lblAssiduidade;
    private javax.swing.JLabel lblCadastroDeAvaliacaoDePerformance;
    private javax.swing.JLabel lblColaboracaoEmGrupo;
    private javax.swing.JLabel lblCompromisso;
    private javax.swing.JLabel lblDesempenho;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlCadastroDeAvaliacaoDePerformance;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    // End of variables declaration//GEN-END:variables
}
