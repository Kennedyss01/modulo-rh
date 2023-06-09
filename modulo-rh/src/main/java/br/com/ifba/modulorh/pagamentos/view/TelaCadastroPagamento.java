package br.com.ifba.modulorh.pagamentos.view;

import br.com.ifba.modulorh.adicionais.model.Adicional;
import br.com.ifba.modulorh.desconto.model.Desconto;
import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.pagamentos.model.Pagamentos;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lucas Nogueira
 */
@Component
public class TelaCadastroPagamento extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaDeListarPagamentos telaListarPagamentos;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    private List<Funcionario> funcionarios;
    private final List<Adicional> adicionaisSelecionados = new ArrayList<>();
    private final List<Desconto> descontosSelecionados = new ArrayList<>();
    private final SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    Font fonteMenor;
    
    public TelaCadastroPagamento() throws FontFormatException, IOException {
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
    
    public void preencherDados() {
        DefaultComboBoxModel modelFuncionarios = (DefaultComboBoxModel) cbxFuncionario.getModel();
        DefaultTableModel modelAdiconais = (DefaultTableModel) tblAdicionais.getModel();
        DefaultTableModel modelDescontos = (DefaultTableModel) tblDescontos.getModel();
        
         try {
                funcionarios = facade.getAllFuncionario();
                List<Adicional> adicionais = facade.getAllAdicional();
                List<Desconto> descontos = facade.getAllDescontos();
                
                modelFuncionarios.removeAllElements();
                modelAdiconais.setNumRows(0);
                modelDescontos.setNumRows(0);
                
                for (Funcionario funcionario : funcionarios) {
                    modelFuncionarios.addElement(funcionario.getNome());
                }
                
                for (Adicional adicional : adicionais) {
                    modelAdiconais.addRow(new Object[]{adicional.getId(), 
                        adicional.getNome(), adicional.getValorPercentual()});
                }
                
                for (Desconto desconto : descontos) {
                    modelDescontos.addRow(new Object[]{desconto.getId(), 
                        desconto.getNome(), desconto.getDesconto()});
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar no banco: " + e.getMessage(),
                        "Erro ao buscar no banco de dados!", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    private void getAdicionaisDescontos() {
        adicionaisSelecionados.clear();
        descontosSelecionados.clear();
        
        int[] linhasAdicionais = tblAdicionais.getSelectedRows();
        int[] linhasDescontos = tblDescontos.getSelectedRows();
        
       for (int linha : linhasAdicionais) {
            Long id = (long) tblAdicionais.getValueAt(linha, 0);
            adicionaisSelecionados.add(facade.findById(id));
        }
        
        for (int linha : linhasDescontos) {
            Long id = (long) tblDescontos.getValueAt(linha, 0);
            descontosSelecionados.add(facade.findDescontoById(id));
        }
        
    }
    
    private boolean validarCampos() {
        DefaultComboBoxModel modelFuncionarios = (DefaultComboBoxModel) cbxFuncionario.getModel();
        if (modelFuncionarios.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o funcionário.",
                        "Funcionário não selecionado!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (dtDataLancamento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data de lançamento.",
                        "Informe a data de lançamento!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (dtDataPagamento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data de pagamento.",
                        "Informe a data de pagamento!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlPagamentos = new javax.swing.JTabbedPane();
        pnlContainerPagamentos = new javax.swing.JPanel();
        pnlTextFields = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        cbxFuncionario = new javax.swing.JComboBox<>();
        dtDataLancamento = new com.toedter.calendar.JDateChooser();
        dtDataPagamento = new com.toedter.calendar.JDateChooser();
        lblFuncionario = new javax.swing.JLabel();
        lblDataLancamento = new javax.swing.JLabel();
        lblDataPagamento = new javax.swing.JLabel();
        btnAddDdd = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        pnlContainerAddDdd = new javax.swing.JPanel();
        lblAdicionais = new javax.swing.JLabel();
        lblDescontos = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDescontos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAdicionais = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pagamento");
        setIconImage(icone.getImage());
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setMinimumSize(new java.awt.Dimension(1100, 670));
        pnlContainer.setPreferredSize(new java.awt.Dimension(1100, 670));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(fonteMaior);
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("MÓDULO RH");

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

        btnVoltar.setBackground(new java.awt.Color(26, 81, 107));
        btnVoltar.setFont(fonteNormal);
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
                        .addComponent(lblLateral))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pnlContainerPagamentos.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainerPagamentos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlContainerPagamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrar.setFont(fonteNormal);
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
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
        pnlTextFields.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        pnlTextFields.add(cbxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 40));
        pnlTextFields.add(dtDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 40));
        pnlTextFields.add(dtDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 40));

        lblFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFuncionario.setText("Funcionário:");
        pnlTextFields.add(lblFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblDataLancamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataLancamento.setText("Data de Lançamento:");
        pnlTextFields.add(lblDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblDataPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataPagamento.setText("Data do Pagamento:");
        pnlTextFields.add(lblDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnAddDdd.setBackground(new java.awt.Color(71, 19, 35));
        btnAddDdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddDdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDdd.setText("ADICIONAIS/DESCONTOS");
        btnAddDdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDddActionPerformed(evt);
            }
        });
        pnlTextFields.add(btnAddDdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, 40));

        lblMenu.setFont(fonteMenor);
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Cadastrar Pagamento");
        pnlTextFields.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        pnlContainerPagamentos.add(pnlTextFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 408));

        pnlPagamentos.addTab("Pagamento", pnlContainerPagamentos);

        pnlContainerAddDdd.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainerAddDdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdicionais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAdicionais.setText("ADICIONAIS");
        pnlContainerAddDdd.add(lblAdicionais, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblDescontos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescontos.setText("DESCONTOS");
        pnlContainerAddDdd.add(lblDescontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        btnFinalizar.setBackground(new java.awt.Color(71, 19, 35));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        pnlContainerAddDdd.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("SELECIONE OS ADICIONAIS E DESCONTOS DO PAGAMENTO");
        pnlContainerAddDdd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        tblDescontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Desconto", "Valor/Percentual"
            }
        ));
        jScrollPane3.setViewportView(tblDescontos);

        pnlContainerAddDdd.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 300, 280));

        tblAdicionais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Adicional", "Valor/Percentual"
            }
        ));
        jScrollPane4.setViewportView(tblAdicionais);

        pnlContainerAddDdd.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 280));

        pnlPagamentos.addTab("Adicionais/Descontos", pnlContainerAddDdd);

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(pnlPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(pnlPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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
        if (validarCampos()) {
            
            String nomeSelecionado =  String.valueOf(cbxFuncionario.getSelectedItem());
            Optional<Funcionario> funcionarioEncontrado = funcionarios.stream().filter(funcionario -> {
                return funcionario.getNome().equalsIgnoreCase(nomeSelecionado);
            }).findFirst();
            
            if (funcionarioEncontrado.isPresent() == false) {
                 JOptionPane.showMessageDialog(null, "Selecione o funcionário.",
                        "Funcionário não selecionado!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            getAdicionaisDescontos();
            
            try {
                String dataLancamento = formatarData.format(dtDataLancamento.getDate());
                String dataPagamento = formatarData.format(dtDataPagamento.getDate());
                
                Pagamentos pagamento = new Pagamentos(dataLancamento, dataPagamento, 
                        funcionarioEncontrado.get().getSalario(), funcionarioEncontrado.get());
                
                pagamento.calcularAdicionais(adicionaisSelecionados);
                pagamento.calcularDescontos(descontosSelecionados);
                
                facade.savePagamento(pagamento);
                this.setVisible(false);
                telaListarPagamentos.setVisible(true);
                telaListarPagamentos.exibirDados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(),
                        "Erro ao salvar no banco de dados!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAddDddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDddActionPerformed
        pnlPagamentos.setSelectedIndex(1);
    }//GEN-LAST:event_btnAddDddActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        pnlPagamentos.setSelectedIndex(0);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        telaListarPagamentos.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroPagamento().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaCadastroPagamento.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastroPagamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDdd;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxFuncionario;
    private com.toedter.calendar.JDateChooser dtDataLancamento;
    private com.toedter.calendar.JDateChooser dtDataPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAdicionais;
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblDataPagamento;
    private javax.swing.JLabel lblDescontos;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlContainerAddDdd;
    private javax.swing.JPanel pnlContainerPagamentos;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JTabbedPane pnlPagamentos;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTable tblAdicionais;
    private javax.swing.JTable tblDescontos;
    // End of variables declaration//GEN-END:variables
}
