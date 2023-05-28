
package br.com.ifba.modulorh.registroponto.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenFuncionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */
@Component
public class TelaDeListarRegistroDePonto extends javax.swing.JFrame {
    
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaEditarRegistroDePonto telaEditarRegistroDePonto;
    @Autowired @Lazy
    private TelaHomescreenFuncionario telaHomescreenFuncionario;
    private final DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private Funcionario funcionario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    Font fonteMenor;
    
    public TelaDeListarRegistroDePonto() throws FontFormatException, IOException {
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
       
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    private void definirLarguraColunas() {
        TableColumnModel columnModel = tblPontos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(0).setMaxWidth(80);
        columnModel.getColumn(1).setPreferredWidth(138);
        columnModel.getColumn(1).setMaxWidth(138);
        columnModel.getColumn(2).setPreferredWidth(240);
        columnModel.getColumn(2).setMaxWidth(240);
        columnModel.getColumn(3).setPreferredWidth(240);
        columnModel.getColumn(3).setMaxWidth(240);
    }
    
    public void exibirDados() {
        definirLarguraColunas();
        List<RegistroPonto> pontos = facade.findRegistrosByFuncionarioId(funcionario.getId());
        
        DefaultTableModel modelo = (DefaultTableModel) tblPontos.getModel();
        
        modelo.setNumRows(0);
        for(RegistroPonto ponto : pontos) {
            String dataEntrada = formatarData.format(ponto.getEntrada());
            String dataSaida =  formatarData.format(ponto.getSaida());
            String presente = "Ausente";
            
            if (dataSaida.equals("01/01/0001 00:00:00")) {
                dataSaida = "";
            }
            
            if (ponto.isPresente()) {
                presente = "Presente";
            }
            
            modelo.addRow(new Object [] {
                ponto.getId(), presente, dataEntrada, dataSaida
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pnlCampo = new javax.swing.JPanel();
        pnlRegistros = new javax.swing.JPanel();
        srcScroll = new javax.swing.JScrollPane();
        tblPontos = new javax.swing.JTable();
        lblRegistrosExistentes = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Registros de Ponto");
        setIconImage(icone.getImage());
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setMinimumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(1100, 670));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));
        pnlLateral.setMinimumSize(new java.awt.Dimension(293, 595));
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
                        .addGap(45, 45, 45)
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pnlCampo.setBackground(new java.awt.Color(255, 255, 255));

        pnlRegistros.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlRegistros.setMinimumSize(new java.awt.Dimension(388, 340));
        pnlRegistros.setPreferredSize(new java.awt.Dimension(388, 340));

        srcScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        srcScroll.setMinimumSize(new java.awt.Dimension(549, 427));
        srcScroll.setPreferredSize(new java.awt.Dimension(549, 427));

        tblPontos.setFont(fonteMenor);
        tblPontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Presença", "Entrada", "Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPontos.setMaximumSize(new java.awt.Dimension(698, 380));
        tblPontos.setMinimumSize(new java.awt.Dimension(698, 380));
        tblPontos.setPreferredSize(new java.awt.Dimension(698, 380));
        srcScroll.setViewportView(tblPontos);

        lblRegistrosExistentes.setFont(fonteMaior);
        lblRegistrosExistentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrosExistentes.setText("Registros de Ponto Existentes");

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(fonteNormal);
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
        btnEditar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
        btnExcluir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrosLayout = new javax.swing.GroupLayout(pnlRegistros);
        pnlRegistros.setLayout(pnlRegistrosLayout);
        pnlRegistrosLayout.setHorizontalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrosExistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRegistrosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(srcScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        pnlRegistrosLayout.setVerticalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRegistrosExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(srcScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
             RegistroPonto registro = new RegistroPonto(funcionario);
             facade.saveRegistroPonto(registro);
             JOptionPane.showMessageDialog(null, "Ponto realizado com sucesso.", 
                     "Ponto realizado!", JOptionPane.INFORMATION_MESSAGE);
             exibirDados();
        } catch(HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(), 
                    "Erro ao salvar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
             int linha = tblPontos.getSelectedRow();
             Long id = (Long) tblPontos.getValueAt(linha, 0);
             facade.deleteRegistroPonto(id);
             exibirDados();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir no banco: " + e.getMessage(), 
                    "Erro ao Excluir no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            int linha = tblPontos.getSelectedRow();
            Long id = (Long) tblPontos.getValueAt(linha, 0);
            telaEditarRegistroDePonto.setRegistroPonto(facade.findRegistroPontoById(id));
            this.setVisible(false);
            telaEditarRegistroDePonto.setVisible(true);   
            telaEditarRegistroDePonto.toFront();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar no banco: " + e.getMessage(), 
                    "Erro ao buscar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenFuncionario.setVisible(true);
        telaHomescreenFuncionario.toFront();
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaDeListarRegistroDePonto().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaDeListarRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JLabel lblRegistrosExistentes;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JScrollPane srcScroll;
    private javax.swing.JTable tblPontos;
    // End of variables declaration//GEN-END:variables
    
}

