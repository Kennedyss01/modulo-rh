package br.com.ifba.modulorh.funcionario.view;

import br.com.ifba.modulorh.funcionario.model.Funcionario;
import br.com.ifba.modulorh.homescreen.TelaHomescreenGestor;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kaio
 */
@Component
public class TelaEditarFuncionario extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired @Lazy
    private TelaDeListarFuncionarios telaDeListarFuncionarios; 
    private Funcionario funcionario;
    @Autowired @Lazy
    private TelaHomescreenGestor telaHomescreenGestor;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    
    public TelaEditarFuncionario() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void passandoDados(Funcionario funcionario){
        txtNome.setText(funcionario.getNome());
        txtDataDeNascimento.setText(funcionario.getDataDeNascimento());
        txtCpf.setText(funcionario.getCpf());
        txtEndereco.setText(funcionario.getEndereco());
        txtTelefone.setText(funcionario.getTelefone());
        txtEmail.setText(funcionario.getEmail());
        txtSalario.setText(Float.toString(funcionario.getSalario()));
        txtStatus.setText(funcionario.getStatus());
        txtDataDeEntrada.setText(funcionario.getDataDeEntrada());
        this.funcionario = funcionario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblModuloRH = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlEditarFuncionario = new javax.swing.JPanel();
        lblEditarFuncionario = new javax.swing.JLabel();
        pnlTextFields = new javax.swing.JPanel();
        txtDataDeEntrada = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Funcionário");
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(912, 612));
        setResizable(false);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlContainer.setMaximumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setMinimumSize(new java.awt.Dimension(900, 600));
        pnlContainer.setName(""); // NOI18N
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 600));

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
                        .addComponent(lblModuloRH))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblModuloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pnlEditarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        pnlEditarFuncionario.setMaximumSize(new java.awt.Dimension(388, 340));
        pnlEditarFuncionario.setPreferredSize(new java.awt.Dimension(388, 340));

        lblEditarFuncionario.setFont(fonteMaior);
        lblEditarFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarFuncionario.setText("Editar Funcionário");

        pnlTextFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlTextFields.setMaximumSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setPreferredSize(new java.awt.Dimension(360, 130));
        pnlTextFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDataDeEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataDeEntrada.setText("Data de entrada na empresa");
        txtDataDeEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataDeEntrada.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataDeEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataDeEntradaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataDeEntradaFocusLost(evt);
            }
        });
        pnlTextFields.add(txtDataDeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 40));

        txtStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStatus.setText("Status");
        txtStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtStatus.setMaximumSize(new java.awt.Dimension(320, 50));
        txtStatus.setMinimumSize(new java.awt.Dimension(320, 50));
        txtStatus.setPreferredSize(new java.awt.Dimension(320, 50));
        txtStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStatusFocusLost(evt);
            }
        });
        pnlTextFields.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 40));

        txtSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSalario.setText("Salário");
        txtSalario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSalario.setMaximumSize(new java.awt.Dimension(320, 50));
        txtSalario.setMinimumSize(new java.awt.Dimension(320, 50));
        txtSalario.setPreferredSize(new java.awt.Dimension(320, 50));
        txtSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSalarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalarioFocusLost(evt);
            }
        });
        pnlTextFields.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setText("Email");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEmail.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEmail.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEmail.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        pnlTextFields.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 40));

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefone.setText("Telefone");
        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtTelefone.setMaximumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setMinimumSize(new java.awt.Dimension(320, 50));
        txtTelefone.setPreferredSize(new java.awt.Dimension(320, 50));
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        pnlTextFields.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 40));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEndereco.setText("Endereço");
        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEndereco.setMaximumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setMinimumSize(new java.awt.Dimension(320, 50));
        txtEndereco.setPreferredSize(new java.awt.Dimension(320, 50));
        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });
        pnlTextFields.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        txtCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCpf.setText("CPF");
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
        pnlTextFields.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 40));

        txtDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDataDeNascimento.setText("Data de Nascimento");
        txtDataDeNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDataDeNascimento.setMaximumSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.setMinimumSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.setPreferredSize(new java.awt.Dimension(320, 50));
        txtDataDeNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataDeNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataDeNascimentoFocusLost(evt);
            }
        });
        pnlTextFields.add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

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
        pnlTextFields.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

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

        javax.swing.GroupLayout pnlEditarFuncionarioLayout = new javax.swing.GroupLayout(pnlEditarFuncionario);
        pnlEditarFuncionario.setLayout(pnlEditarFuncionarioLayout);
        pnlEditarFuncionarioLayout.setHorizontalGroup(
            pnlEditarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEditarFuncionarioLayout.createSequentialGroup()
                        .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlEditarFuncionarioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEditarFuncionarioLayout.setVerticalGroup(
            pnlEditarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(pnlEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            Funcionario funcionarioEditado = new Funcionario(txtNome.getText(), txtDataDeNascimento.getText(), txtCpf.getText(), txtEndereco.getText(), 
                txtTelefone.getText(), txtEmail.getText(), Float.parseFloat(txtSalario.getText()), txtStatus.getText(), txtDataDeEntrada.getText());
            
            funcionarioEditado.setId(funcionario.getId());
            funcionarioEditado.setUsuario(facade.findUsuarioById(funcionario.getUsuario().getId()));
            
            facade.updateFuncionario(funcionarioEditado);
            telaDeListarFuncionarios.exibirDados();
            telaDeListarFuncionarios.setVisible(true);
            this.setVisible(false);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Editar no banco: " + e.getMessage(), 
                    "Erro ao Editar no banco de dados!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        telaHomescreenGestor.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(txtNome.getText().trim().isEmpty())
            txtNome.setText("Nome");
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if(txtNome.getText().equals("Nome"))
            txtNome.setText("");
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtDataDeNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoFocusLost
        if(txtDataDeNascimento.getText().trim().isEmpty())
            txtDataDeNascimento.setText("Data de Nascimento");
    }//GEN-LAST:event_txtDataDeNascimentoFocusLost

    private void txtDataDeNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoFocusGained
        if(txtDataDeNascimento.getText().equals("Data de Nascimento"))
            txtDataDeNascimento.setText("");
    }//GEN-LAST:event_txtDataDeNascimentoFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if(txtCpf.getText().trim().isEmpty())
            txtCpf.setText("CPF");
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if(txtCpf.getText().equals("CPF"))
            txtCpf.setText("");
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        if(txtEndereco.getText().trim().isEmpty())
            txtEndereco.setText("Endereço");
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        if(txtEndereco.getText().equals("Endereço"))
            txtEndereco.setText("");
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if(txtTelefone.getText().trim().isEmpty())
            txtTelefone.setText("Telefone");
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        if(txtTelefone.getText().equals("Telefone"))
            txtTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().trim().isEmpty())
            txtEmail.setText("Email");
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if(txtEmail.getText().equals("Email"))
            txtEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFocusLost
        if(txtSalario.getText().trim().isEmpty())
            txtSalario.setText("Salário");
    }//GEN-LAST:event_txtSalarioFocusLost

    private void txtSalarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFocusGained
        if(txtSalario.getText().equals("Salário"))
            txtSalario.setText("");
    }//GEN-LAST:event_txtSalarioFocusGained

    private void txtStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusFocusLost
        if(txtStatus.getText().trim().isEmpty())
            txtStatus.setText("Status");
    }//GEN-LAST:event_txtStatusFocusLost

    private void txtStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusFocusGained
        if(txtStatus.getText().equals("Status"))
            txtStatus.setText("");
    }//GEN-LAST:event_txtStatusFocusGained

    private void txtDataDeEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataDeEntradaFocusLost
        if(txtDataDeEntrada.getText().trim().isEmpty())
            txtDataDeEntrada.setText("Data de entrada na empresa");
    }//GEN-LAST:event_txtDataDeEntradaFocusLost

    private void txtDataDeEntradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataDeEntradaFocusGained
        if(txtDataDeEntrada.getText().equals("Data de entrada na empresa"))
            txtDataDeEntrada.setText("");
    }//GEN-LAST:event_txtDataDeEntradaFocusGained

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        telaDeListarFuncionarios.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaEditarFuncionario().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaEditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaEditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblEditarFuncionario;
    private javax.swing.JLabel lblModuloRH;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlEditarFuncionario;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlTextFields;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataDeEntrada;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
