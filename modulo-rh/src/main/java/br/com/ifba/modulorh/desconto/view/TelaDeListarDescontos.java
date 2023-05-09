package br.com.ifba.modulorh.desconto.view;

import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonas Dias
 */
@Component
public class TelaDeListarDescontos extends javax.swing.JFrame {

    Font fonteMaior;
    Font fonteNormal;
    
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaCadastroDesconto telaCadastroDesconto;
    @Autowired @Lazy
    private TelaEditarDesconto telaEditarDesconto;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    
    public TelaDeListarDescontos() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
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
        pnlLogin = new javax.swing.JPanel();
        lblAdicionaisExistentes = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDescontos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtCPFDoFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Descontos");

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
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
                .addGap(41, 41, 41))
        );

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlLogin.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlLogin.setPreferredSize(new java.awt.Dimension(388, 340));

        lblAdicionaisExistentes.setFont(fonteMaior);
        lblAdicionaisExistentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdicionaisExistentes.setText("Descontos Existentes");

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

        btnExcluir.setBackground(new java.awt.Color(71, 19, 35));
        btnExcluir.setFont(fonteNormal);
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDescontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tblDescontos);

        pnlTextFields.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 510, 350));

        btnBuscar.setBackground(new java.awt.Color(71, 19, 35));
        btnBuscar.setFont(fonteNormal);
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(266, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(266, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(266, 40));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlTextFields.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 110, -1));

        txtCPFDoFuncionario.setText("CPF do funcionário");
        txtCPFDoFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPFDoFuncionarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFDoFuncionarioFocusLost(evt);
            }
        });
        pnlTextFields.add(txtCPFDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 40));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdicionaisExistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAdicionaisExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
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

    @PostConstruct
    public void exibirDados() {
        List<Desconto> descontos = facade.getAllDescontos();
        DefaultTableModel modelo = (DefaultTableModel) tblDescontos.getModel();
        modelo.setNumRows(0);
      
        for (Desconto desconto: descontos) {
            modelo.addRow(new Object [] {desconto.getId(), desconto.getNome(), 
                desconto.getDesconto(), desconto.getTipoDesconto()});
        }
        
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        telaCadastroDesconto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int linha = tblDescontos.getSelectedRow();
            Long id = (Long) tblDescontos.getValueAt(linha, 0);
            facade.deleteDesconto(facade.findDescontoById(id));
            exibirDados();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir no banco: " + e.getMessage(), 
                    "Erro ao Excluir no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         try {
            int linha = tblDescontos.getSelectedRow();
            Long id = (Long) tblDescontos.getValueAt(linha, 0);
            telaEditarDesconto.setDesconto(facade.findDescontoById(id));
            telaEditarDesconto.setVisible(true);
            this.setVisible(false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir no banco: " + e.getMessage(), 
                    "Erro ao Excluir no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtCPFDoFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFDoFuncionarioFocusGained
        if(txtCPFDoFuncionario.getText().equals("CPF do funcionário"))
            txtCPFDoFuncionario.setText("");
    }//GEN-LAST:event_txtCPFDoFuncionarioFocusGained

    private void txtCPFDoFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFDoFuncionarioFocusLost
        if(txtCPFDoFuncionario.getText().trim().isEmpty())
            txtCPFDoFuncionario.setText("CPF do funcionário");
    }//GEN-LAST:event_txtCPFDoFuncionarioFocusLost

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
            java.util.logging.Logger.getLogger(TelaDeListarDescontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarDescontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarDescontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarDescontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaDeListarDescontos().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaDeListarDescontos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaDeListarDescontos.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdicionaisExistentes;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTable tblDescontos;
    private javax.swing.JTextField txtCPFDoFuncionario;
    // End of variables declaration//GEN-END:variables

}