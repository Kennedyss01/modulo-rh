package br.com.ifba.modulorh.homescreen;

import br.com.ifba.modulorh.adicionais.view.TelaDeListarAdicionais;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.usuario.view.TelaCadastroUsuario;
import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.funcionario.view.TelaDeListarFuncionarios;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.login.TelaLogin;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lucas Nogueira
 */
@Component
public class TelaHomescreenGestor extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    @Autowired
    private TelaCadastroFuncionario telaCadastroFuncionario;
    @Autowired
    private TelaCadastroUsuario telaCadastroUsuario;
    @Autowired
    private TelaDeListarFuncionarios telaDeListarFuncionarios;
    @Autowired
    private TelaDeListarAdicionais telaDeListarAdicionais;
    @Autowired @Lazy
    private TelaLogin telaLogin;
    private Usuario usuario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;

    public TelaHomescreenGestor() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void definirGestor(Usuario usuario) {
        this.usuario = usuario;
        lblInfoGestor.setText("Usuário: " + usuario.getLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblInfoGestor = new javax.swing.JLabel();
        pnlCampo = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnAvaliarPerformance = new javax.swing.JButton();
        btnImprimirRelatorioFuncionario = new javax.swing.JButton();
        btnImprimirRelatorioAvaliacaoProdutividade = new javax.swing.JButton();
        btnImprimirRelatorioPonto = new javax.swing.JButton();
        btnListarAdicionais = new javax.swing.JButton();
        pnlDivisoria = new javax.swing.JPanel();
        btnListarFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial do Gestor");
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(1028, 599));

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(fonteMaior);
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("Módulo RH");

        lblBemVindo.setFont(fonteNormal);
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Seja bem-vindo, gestor!");

        btnSair.setBackground(new java.awt.Color(26, 81, 107));
        btnSair.setFont(fonteNormal);
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-16x16.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblInfoGestor.setFont(fonteNormal);
        lblInfoGestor.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoGestor.setText("Usuário: ---");

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoGestor)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBemVindo)
                    .addComponent(lblLateral))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addGap(73, 73, 73)
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(lblInfoGestor)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pnlCampo.setBackground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 4, true));

        lblMenu.setFont(fonteMaior);
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Tela inicial");

        btnCadastrarUsuario.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrarUsuario.setFont(fonteNormal);
        btnCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar-usuario-32x32.png"))); // NOI18N
        btnCadastrarUsuario.setText("CADASTRAR USUÁRIO");
        btnCadastrarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrarUsuario.setMaximumSize(new java.awt.Dimension(245, 64));
        btnCadastrarUsuario.setMinimumSize(new java.awt.Dimension(245, 64));
        btnCadastrarUsuario.setPreferredSize(new java.awt.Dimension(245, 64));
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrarFuncionario.setFont(fonteNormal);
        btnCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar-funcionario-32x32.png"))); // NOI18N
        btnCadastrarFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        btnCadastrarFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrarFuncionario.setMaximumSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.setMinimumSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.setPreferredSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnAvaliarPerformance.setBackground(new java.awt.Color(71, 19, 35));
        btnAvaliarPerformance.setFont(fonteNormal);
        btnAvaliarPerformance.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarPerformance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliar-performance-32x32.png"))); // NOI18N
        btnAvaliarPerformance.setText("AVALIAR PERFORMANCE");
        btnAvaliarPerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAvaliarPerformance.setMaximumSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.setMinimumSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.setPreferredSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarPerformanceActionPerformed(evt);
            }
        });

        btnImprimirRelatorioFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioFuncionario.setFont(fonteNormal);
        btnImprimirRelatorioFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-funcionario-32x32.png"))); // NOI18N
        btnImprimirRelatorioFuncionario.setText("RELATÓRIO DE FUNCIONÁRIO");
        btnImprimirRelatorioFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioFuncionario.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioFuncionarioActionPerformed(evt);
            }
        });

        btnImprimirRelatorioAvaliacaoProdutividade.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioAvaliacaoProdutividade.setFont(fonteNormal);
        btnImprimirRelatorioAvaliacaoProdutividade.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioAvaliacaoProdutividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-avaliacao-produtividade-32x32.png"))); // NOI18N
        btnImprimirRelatorioAvaliacaoProdutividade.setText("REL. DE AVAL. DE PRODUTIVIDADE");
        btnImprimirRelatorioAvaliacaoProdutividade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioAvaliacaoProdutividade.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed(evt);
            }
        });

        btnImprimirRelatorioPonto.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioPonto.setFont(fonteNormal);
        btnImprimirRelatorioPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-ponto-32x32.png"))); // NOI18N
        btnImprimirRelatorioPonto.setText("RELATÓRIO DE PONTO");
        btnImprimirRelatorioPonto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioPonto.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioPontoActionPerformed(evt);
            }
        });

        btnListarAdicionais.setBackground(new java.awt.Color(71, 19, 35));
        btnListarAdicionais.setFont(fonteNormal);
        btnListarAdicionais.setForeground(new java.awt.Color(255, 255, 255));
        btnListarAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-funcionarios-32x32.png"))); // NOI18N
        btnListarAdicionais.setText("LISTAR ADICIONAIS");
        btnListarAdicionais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarAdicionais.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAdicionaisActionPerformed(evt);
            }
        });

        pnlDivisoria.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDivisoriaLayout = new javax.swing.GroupLayout(pnlDivisoria);
        pnlDivisoria.setLayout(pnlDivisoriaLayout);
        pnlDivisoriaLayout.setHorizontalGroup(
            pnlDivisoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlDivisoriaLayout.setVerticalGroup(
            pnlDivisoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnListarFuncionarios.setBackground(new java.awt.Color(71, 19, 35));
        btnListarFuncionarios.setFont(fonteNormal);
        btnListarFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-funcionarios-32x32.png"))); // NOI18N
        btnListarFuncionarios.setText("LISTAR FUNCIONÁRIOS");
        btnListarFuncionarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarFuncionarios.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(btnListarFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
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
            .addComponent(pnlContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        telaCadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnAvaliarPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvaliarPerformanceActionPerformed

    private void btnImprimirRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioFuncionarioActionPerformed

    private void btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed

    private void btnImprimirRelatorioPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirRelatorioPontoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListarAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAdicionaisActionPerformed
        telaDeListarAdicionais.setVisible(true);
    }//GEN-LAST:event_btnListarAdicionaisActionPerformed

    private void btnListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFuncionariosActionPerformed
        telaDeListarFuncionarios.setVisible(true);
    }//GEN-LAST:event_btnListarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHomescreenGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaHomescreenGestor().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaHomescreenGestor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaHomescreenGestor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliarPerformance;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnImprimirRelatorioAvaliacaoProdutividade;
    private javax.swing.JButton btnImprimirRelatorioFuncionario;
    private javax.swing.JButton btnImprimirRelatorioPonto;
    private javax.swing.JButton btnListarAdicionais;
    private javax.swing.JButton btnListarFuncionarios;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblInfoGestor;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlDivisoria;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
