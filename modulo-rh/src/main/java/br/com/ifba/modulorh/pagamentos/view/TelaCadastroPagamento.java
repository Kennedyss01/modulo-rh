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
import java.util.ArrayList;
import java.util.List;
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
public class TelaCadastroPagamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroRegistroDePonto
     */
    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaDeListarPagamentos telaListarPagamentos;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    
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
    
    private boolean validarCampos() {
        if (txtDataLancamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a data de lançamento e tente novamente!",
                    "Data de lançamento está vazia!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txtDataPagamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a data de pagamento e tente novamente!",
                    "Data de pagamento está vazia!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o CPF do funcionário e tente novamente!",
                    "CPF está vazio!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txtSalarioBase.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o salário base e tente novamente!",
                    "Salário base está vazio!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txtAdicionais.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira os adicionais e tente novamente!",
                    "Adicionais está vazio!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txtDescontos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira os descontos e tente novamente!",
                    "Descontos está vazio!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private void limparCampos() {
        txtDataLancamento.setText("");
        txtDataPagamento.setText("");
        txtCpf.setText("");
        txtSalarioBase.setText("");
        txtAdicionais.setText("");
        txtDescontos.setText("");
    }
    
    private boolean verificaIds(String ids) {
        ids = ids.replaceAll(",", "c");
        if(ids.matches("[c0-9]*")) {
            return true;
        }
        return false;
    }
    
    private List<Adicional> transformaLista(String ids) {
        char[] chars = ids.toCharArray();
        String id = new String();
        Adicional adc;
        Long idAdc;
        List<Adicional> lista = new ArrayList<Adicional>();
        for (char ch : chars) {
            id = id + ch;
            if (ch == 'c') {
                idAdc = Long.parseLong(id);
                adc = facade.findById(idAdc);
                lista.add(adc);
            }
        }
        return lista;
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
        txtDataLancamento = new javax.swing.JTextField();
        txtDataPagamento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        txtAdicionais = new javax.swing.JTextField();
        txtDescontos = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(838, 600));
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
        lblMenu.setText("Cadastrar Pagamento");

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDataLancamento.setFont(fonteNormal);
        txtDataLancamento.setText("Data do lançamento");
        txtDataLancamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataLancamento.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataLancamento.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataLancamento.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataLancamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataLancamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataLancamentoFocusLost(evt);
            }
        });
        txtDataLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataLancamentoActionPerformed(evt);
            }
        });
        pnlTextFields.add(txtDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, -1));

        txtDataPagamento.setFont(fonteNormal);
        txtDataPagamento.setText("Data do pagamento");
        txtDataPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataPagamento.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataPagamento.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataPagamento.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataPagamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataPagamentoFocusLost(evt);
            }
        });
        txtDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPagamentoActionPerformed(evt);
            }
        });
        pnlTextFields.add(txtDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, -1));

        txtCpf.setFont(fonteNormal);
        txtCpf.setText("CPF do funcionário");
        txtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCpf.setMaximumSize(new java.awt.Dimension(320, 50));
        txtCpf.setMinimumSize(new java.awt.Dimension(320, 50));
        txtCpf.setPreferredSize(new java.awt.Dimension(320, 50));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        pnlTextFields.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 320, -1));

        txtSalarioBase.setFont(fonteNormal);
        txtSalarioBase.setText("Salário base");
        txtSalarioBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSalarioBase.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSalarioBase.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSalarioBase.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSalarioBase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSalarioBaseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalarioBaseFocusLost(evt);
            }
        });
        pnlTextFields.add(txtSalarioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, -1));

        txtAdicionais.setFont(fonteNormal);
        txtAdicionais.setText("IDs dos adicionais");
        txtAdicionais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtAdicionais.setMaximumSize(new java.awt.Dimension(320, 50));
        txtAdicionais.setMinimumSize(new java.awt.Dimension(320, 50));
        txtAdicionais.setPreferredSize(new java.awt.Dimension(320, 50));
        txtAdicionais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdicionaisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdicionaisFocusLost(evt);
            }
        });
        pnlTextFields.add(txtAdicionais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, -1));

        txtDescontos.setFont(fonteNormal);
        txtDescontos.setText("IDs dos descontos");
        txtDescontos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDescontos.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDescontos.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDescontos.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDescontos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescontosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontosFocusLost(evt);
            }
        });
        pnlTextFields.add(txtDescontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, -1));

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
        pnlTextFields.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

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
                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCampoLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCampoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void txtSalarioBaseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioBaseFocusGained
        if (txtSalarioBase.getText().equals("Salário base")) {
            txtSalarioBase.setText("");
        }
    }//GEN-LAST:event_txtSalarioBaseFocusGained

    private void txtSalarioBaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioBaseFocusLost
        if (txtSalarioBase.getText().trim().isEmpty()) {
            txtSalarioBase.setText("Salário base");
        }
    }//GEN-LAST:event_txtSalarioBaseFocusLost

    private void txtDataLancamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataLancamentoFocusGained
        if(txtDataLancamento.getText().equals("Data do lançamento"))
            txtDataLancamento.setText("");
    }//GEN-LAST:event_txtDataLancamentoFocusGained

    private void txtDataLancamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataLancamentoFocusLost
        if(txtDataLancamento.getText().trim().isEmpty())
            txtDataLancamento.setText("Data do lançamento");
    }//GEN-LAST:event_txtDataLancamentoFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if(txtCpf.getText().equals("CPF do funcionário"))
            txtCpf.setText("");
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if(txtCpf.getText().trim().isEmpty())
            txtCpf.setText("CPF do funcionário");
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (validarCampos()) {
            String dataLancamento = txtDataLancamento.getText();
            String dataPagamento = txtDataPagamento.getText();
            String cpf = txtCpf.getText();
            float salarioBase = Float.parseFloat(txtSalarioBase.getText());
            String adicionais = txtAdicionais.getText();
            String descontos = txtDescontos.getText();
            Funcionario funcionario = facade.findFuncionarioByCpf(cpf);
            
            if (verificaIds(adicionais)) {
                transformaLista(adicionais);
            }
            
            Pagamentos pagamento = new Pagamentos(
                    dataLancamento, dataPagamento, salarioBase, funcionario);
            try {
                pagamento = facade.savePagamento(pagamento);
                this.setVisible(false);
                telaListarPagamentos.setVisible(true);
                telaListarPagamentos.exibirDados();
                limparCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar no banco: " + e.getMessage(),
                        "Erro ao salvar no banco de dados!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void txtDataLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataLancamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataLancamentoActionPerformed

    private void txtDataPagamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataPagamentoFocusGained
        if(txtDataPagamento.getText().equals("Data do pagamento"))
            txtDataPagamento.setText("");
    }//GEN-LAST:event_txtDataPagamentoFocusGained

    private void txtDataPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataPagamentoFocusLost
        if(txtDataPagamento.getText().trim().isEmpty())
            txtDataPagamento.setText("Data do pagamento");
    }//GEN-LAST:event_txtDataPagamentoFocusLost

    private void txtDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPagamentoActionPerformed

    private void txtAdicionaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdicionaisFocusGained
        if(txtAdicionais.getText().equals("IDs dos adicionais"))
            txtAdicionais.setText("");        
    }//GEN-LAST:event_txtAdicionaisFocusGained

    private void txtAdicionaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdicionaisFocusLost
        if(txtAdicionais.getText().trim().isEmpty())
            txtAdicionais.setText("IDs dos adicionais");
    }//GEN-LAST:event_txtAdicionaisFocusLost

    private void txtDescontosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontosFocusGained
        if(txtDescontos.getText().equals("IDs dos descontos"))
            txtDescontos.setText(""); 
    }//GEN-LAST:event_txtDescontosFocusGained

    private void txtDescontosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontosFocusLost
        if(txtDescontos.getText().trim().isEmpty())
            txtDescontos.setText("IDs dos descontos");
    }//GEN-LAST:event_txtDescontosFocusLost

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
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtAdicionais;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtDataPagamento;
    private javax.swing.JTextField txtDescontos;
    private javax.swing.JTextField txtSalarioBase;
    // End of variables declaration//GEN-END:variables
}
