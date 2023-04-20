/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.modulorh.funcionario.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.infrastructure.service.Facade;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */
@Component
public class TelaDeListarFuncionarios extends javax.swing.JFrame {
    
    @Autowired
    private IFacade facade;
    @Autowired
    private TelaCadastroFuncionario telaCadastroFuncionario;
    @Autowired
    private TelaEditarFuncionario telaEditarFuncionario;
    
    public TelaDeListarFuncionarios() {
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
        pnlLogin = new javax.swing.JPanel();
        pnlTextFields = new javax.swing.JPanel();
        lblFuncionáriosExistentes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 600));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlLateral.setMaximumSize(new java.awt.Dimension(300, 600));
        pnlLateral.setPreferredSize(new java.awt.Dimension(300, 600));

        lblModuloRH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblModuloRH.setForeground(new java.awt.Color(255, 255, 255));
        lblModuloRH.setText("Módulo RH");

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblModuloRH)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblModuloRH)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        pnlContainer.add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlLogin.setPreferredSize(new java.awt.Dimension(388, 340));

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFuncionáriosExistentes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFuncionáriosExistentes.setText("Funcionários Existentes");
        pnlTextFields.add(lblFuncionáriosExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Salário"
            }
        ));
        jScrollPane2.setViewportView(tblFuncionarios);

        pnlTextFields.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(71, 19, 35));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusPainted(false);
        btnExcluir.setFocusable(false);
        btnExcluir.setMaximumSize(new java.awt.Dimension(266, 40));
        btnExcluir.setMinimumSize(new java.awt.Dimension(266, 40));
        btnExcluir.setPreferredSize(new java.awt.Dimension(266, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnEditar1.setBackground(new java.awt.Color(71, 19, 35));
        btnEditar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setText("Editar");
        btnEditar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setFocusPainted(false);
        btnEditar1.setFocusable(false);
        btnEditar1.setMaximumSize(new java.awt.Dimension(266, 40));
        btnEditar1.setMinimumSize(new java.awt.Dimension(266, 40));
        btnEditar1.setPreferredSize(new java.awt.Dimension(266, 40));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlContainer.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, 540, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        telaCadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            Funcionario funcionario = new Funcionario();
            int linha = tblFuncionarios.getSelectedRow();
            Long id = (Long) tblFuncionarios.getValueAt(linha, 0);
            funcionario.setId(id);
            facade.deleteFuncionario(funcionario);
            this.exibirDados();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir no banco: " + e.getMessage(), 
                    "Erro ao Excluir no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        int linha = tblFuncionarios.getSelectedRow();
        Long id = (Long) tblFuncionarios.getValueAt(linha, 0);
        Funcionario funcionario = facade.findFuncionarioById(id);
        telaEditarFuncionario.passandoDados(funcionario);
        telaEditarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnEditar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeListarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFuncionáriosExistentes;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTable tblFuncionarios;
    // End of variables declaration//GEN-END:variables
    
    @PostConstruct
    public void exibirDados(){
        setLocationRelativeTo(null);
        List<Funcionario> lista = facade.getAllFuncionario();
        DefaultTableModel modelo = (DefaultTableModel) tblFuncionarios.getModel();
        modelo.setNumRows(0);
        for(Funcionario lis: lista){
            modelo.addRow(new Object [] {lis.getId(), lis.getNome(), lis.getCpf(), lis.getSalario()});
        }
    }
}
