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
import javax.swing.ImageIcon;
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
    Font fonteMenor;
    
    private List<Desconto> descontos;
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaCadastroDesconto telaCadastroDesconto;
    @Autowired @Lazy
    private TelaEditarDesconto telaEditarDesconto;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    
    public TelaDeListarDescontos() throws FontFormatException, IOException {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pnlListaDescontos = new javax.swing.JPanel();
        lblDescontosExistentes = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlTextFields = new javax.swing.JPanel();
        scrScrollDescontos = new javax.swing.JScrollPane();
        tblDescontos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtNomeDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Descontos");
        setIconImage(icone.getImage());
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
                        .addGap(42, 42, 42)
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pnlListaDescontos.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaDescontos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlListaDescontos.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlListaDescontos.setPreferredSize(new java.awt.Dimension(388, 340));
        pnlListaDescontos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescontosExistentes.setFont(fonteMaior);
        lblDescontosExistentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescontosExistentes.setText("Descontos Existentes");
        pnlListaDescontos.add(lblDescontosExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 32));

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
        pnlListaDescontos.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 150, -1));

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
        pnlListaDescontos.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 150, -1));

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
        pnlListaDescontos.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 150, -1));

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDescontos.setFont(fonteMenor);
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
        scrScrollDescontos.setViewportView(tblDescontos);

        pnlTextFields.add(scrScrollDescontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 510, 350));

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
        pnlTextFields.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, -1));

        txtNomeDesconto.setText("Buscar Desconto");
        txtNomeDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeDescontoFocusLost(evt);
            }
        });
        txtNomeDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeDescontoKeyPressed(evt);
            }
        });
        pnlTextFields.add(txtNomeDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 40));

        pnlListaDescontos.add(pnlTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 560, 450));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(pnlListaDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlListaDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
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
        descontos = facade.getAllDescontos();
        
        DefaultTableModel modelo = (DefaultTableModel) tblDescontos.getModel();
        modelo.setNumRows(0);
        for (Desconto desconto: descontos) {
            modelo.addRow(new Object [] {desconto.getId(), desconto.getNome(), 
                desconto.getDesconto(), desconto.getTipoDesconto()});
        }
        
    }
    
    private void buscarDescontos(String busca) {
        try {
            if (descontos.isEmpty()) {
                descontos = facade.getAllDescontos();
            }
            DefaultTableModel modelo = (DefaultTableModel) tblDescontos.getModel();
            modelo.setNumRows(0);
            
            for (Desconto desconto: descontos) {
                if (desconto.getNome().toLowerCase().contains(busca)) {
                    modelo.addRow(new Object [] {desconto.getId(), desconto.getNome(), 
                        desconto.getDesconto(), desconto.getTipoDesconto()});
                }
            }
        } catch(Exception e) {
               JOptionPane.showMessageDialog(null, "Erro ao buscar dados: " + e.getMessage(), 
                    "Erro ao consultar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        telaCadastroDesconto.setVisible(true);
        telaCadastroDesconto.toFront();
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
            telaEditarDesconto.toFront();
            this.setVisible(false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir no banco: " + e.getMessage(), 
                    "Erro ao Excluir no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String busca = txtNomeDesconto.getText().trim().toLowerCase();
        buscarDescontos(busca);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
        telaHomescreenGestor.toFront();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtNomeDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDescontoFocusGained
        if (txtNomeDesconto.getText().equals("Buscar Desconto"))
            txtNomeDesconto.setText("");
    }//GEN-LAST:event_txtNomeDescontoFocusGained

    private void txtNomeDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDescontoFocusLost
        if (txtNomeDesconto.getText().trim().isEmpty())
            txtNomeDesconto.setText("Buscar Desconto");
    }//GEN-LAST:event_txtNomeDescontoFocusLost

    private void txtNomeDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDescontoKeyPressed
        String busca = txtNomeDesconto.getText().trim().toLowerCase();;
        buscarDescontos(busca);
    }//GEN-LAST:event_txtNomeDescontoKeyPressed

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
    private javax.swing.JLabel lblDescontosExistentes;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlListaDescontos;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JScrollPane scrScrollDescontos;
    private javax.swing.JTable tblDescontos;
    private javax.swing.JTextField txtNomeDesconto;
    // End of variables declaration//GEN-END:variables

}