package br.com.ifba.modulorh.homescreen;

import br.com.ifba.modulorh.adicionais.view.TelaDeListarAdicionais;
import br.com.ifba.modulorh.avaliacaoperformance.view.TelaListarAvaliacaoDePerformance;
import br.com.ifba.modulorh.curriculo.view.TelaDeListarCurriculo;
import br.com.ifba.modulorh.desconto.view.TelaDeListarDescontos;
import br.com.ifba.modulorh.usuario.model.Usuario;
import br.com.ifba.modulorh.funcionario.view.TelaCadastroFuncionario;
import br.com.ifba.modulorh.funcionario.view.TelaDeListarFuncionarios;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.login.TelaLogin;
import br.com.ifba.modulorh.pagamentos.view.TelaDeListarPagamentos;
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
    private TelaDeListarDescontos telaDeListarDescontos;
    @Autowired
    private TelaDeListarFuncionarios telaDeListarFuncionarios;
    @Autowired
    private TelaDeListarAdicionais telaDeListarAdicionais;
    @Autowired
    private TelaDeListarCurriculo telaDeListarCurriculos;
    @Autowired
    private TelaDeListarPagamentos telaDeListarPagamentos;
    @Autowired @Lazy
    private TelaLogin telaLogin;
    @Autowired @Lazy
    private TelaListarAvaliacaoDePerformance telaListarAvaliacaoDePerformance;
    private Usuario usuario;
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    Font fonteMenor;

    public TelaHomescreenGestor() throws FontFormatException, IOException {
        this.fonteMaior = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Bold.ttf"))
                .deriveFont(Font.PLAIN, 28);
        this.fonteNormal = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-Regular.ttf"))
                .deriveFont(Font.PLAIN, 16);
        this.fonteMenor = Font.createFont(Font.TRUETYPE_FONT,
                new File("./src/main/resources/fontes/Poppins/Poppins-SemiBold.ttf"))
                .deriveFont(Font.PLAIN, 12);
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
        btnListarDescontos = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnAvaliarPerformance = new javax.swing.JButton();
        btnImprimirRelatorioFuncionario = new javax.swing.JButton();
        btnImprimirRelatorioAvaliacaoProdutividade = new javax.swing.JButton();
        btnImprimirRelatorioPonto = new javax.swing.JButton();
        btnListarAdicionais = new javax.swing.JButton();
        btnListarFuncionarios = new javax.swing.JButton();
        pnlDivisoria1 = new javax.swing.JPanel();
        pnlDivisoria2 = new javax.swing.JPanel();
        btnListarAvaliacaoPerformance = new javax.swing.JButton();
        btnListarPagamentos = new javax.swing.JButton();
        btnListarCurriculos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial do Gestor");
        setIconImage(icone.getImage());
        setMinimumSize(new java.awt.Dimension(1028, 645));

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlLateral.setBackground(new java.awt.Color(26, 81, 107));

        lblLateral.setFont(fonteMaior);
        lblLateral.setForeground(new java.awt.Color(255, 255, 255));
        lblLateral.setText("MÓDULO RH");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnListarDescontos.setBackground(new java.awt.Color(71, 19, 35));
        btnListarDescontos.setFont(fonteMenor);
        btnListarDescontos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarDescontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-descontos-32x32.png"))); // NOI18N
        btnListarDescontos.setText("LISTAR DESCONTOS");
        btnListarDescontos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarDescontos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarDescontos.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarDescontos.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarDescontos.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarDescontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDescontosActionPerformed(evt);
            }
        });

        btnCadastrarFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnCadastrarFuncionario.setFont(fonteMenor);
        btnCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar-funcionario-32x32.png"))); // NOI18N
        btnCadastrarFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        btnCadastrarFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrarFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCadastrarFuncionario.setMaximumSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.setMinimumSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.setPreferredSize(new java.awt.Dimension(245, 64));
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnAvaliarPerformance.setBackground(new java.awt.Color(71, 19, 35));
        btnAvaliarPerformance.setFont(fonteMenor);
        btnAvaliarPerformance.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarPerformance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliar-performance-32x32.png"))); // NOI18N
        btnAvaliarPerformance.setText("AVALIAR PERFORMANCE");
        btnAvaliarPerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAvaliarPerformance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAvaliarPerformance.setMaximumSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.setMinimumSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.setPreferredSize(new java.awt.Dimension(245, 64));
        btnAvaliarPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarPerformanceActionPerformed(evt);
            }
        });

        btnImprimirRelatorioFuncionario.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioFuncionario.setFont(fonteMenor);
        btnImprimirRelatorioFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-funcionario-32x32.png"))); // NOI18N
        btnImprimirRelatorioFuncionario.setText("RELATÓRIO DE FUNCIONÁRIO");
        btnImprimirRelatorioFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioFuncionario.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioFuncionarioActionPerformed(evt);
            }
        });

        btnImprimirRelatorioAvaliacaoProdutividade.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioAvaliacaoProdutividade.setFont(fonteMenor);
        btnImprimirRelatorioAvaliacaoProdutividade.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioAvaliacaoProdutividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-avaliacao-produtividade-32x32.png"))); // NOI18N
        btnImprimirRelatorioAvaliacaoProdutividade.setText("REL. DE AVAL. DE PRODUTIVIDADE");
        btnImprimirRelatorioAvaliacaoProdutividade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioAvaliacaoProdutividade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioAvaliacaoProdutividade.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioAvaliacaoProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioAvaliacaoProdutividadeActionPerformed(evt);
            }
        });

        btnImprimirRelatorioPonto.setBackground(new java.awt.Color(71, 19, 35));
        btnImprimirRelatorioPonto.setFont(fonteMenor);
        btnImprimirRelatorioPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirRelatorioPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir-relatorio-ponto-32x32.png"))); // NOI18N
        btnImprimirRelatorioPonto.setText("RELATÓRIO DE PONTO");
        btnImprimirRelatorioPonto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnImprimirRelatorioPonto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioPonto.setMaximumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.setMinimumSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.setPreferredSize(new java.awt.Dimension(245, 64));
        btnImprimirRelatorioPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioPontoActionPerformed(evt);
            }
        });

        btnListarAdicionais.setBackground(new java.awt.Color(71, 19, 35));
        btnListarAdicionais.setFont(fonteMenor);
        btnListarAdicionais.setForeground(new java.awt.Color(255, 255, 255));
        btnListarAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-adicionais-32x32.png"))); // NOI18N
        btnListarAdicionais.setText("LISTAR ADICIONAIS");
        btnListarAdicionais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarAdicionais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarAdicionais.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAdicionaisActionPerformed(evt);
            }
        });

        btnListarFuncionarios.setBackground(new java.awt.Color(71, 19, 35));
        btnListarFuncionarios.setFont(fonteMenor);
        btnListarFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-funcionarios-32x32.png"))); // NOI18N
        btnListarFuncionarios.setText("LISTAR FUNCIONÁRIOS");
        btnListarFuncionarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarFuncionarios.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFuncionariosActionPerformed(evt);
            }
        });

        pnlDivisoria1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDivisoria1Layout = new javax.swing.GroupLayout(pnlDivisoria1);
        pnlDivisoria1.setLayout(pnlDivisoria1Layout);
        pnlDivisoria1Layout.setHorizontalGroup(
            pnlDivisoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        pnlDivisoria1Layout.setVerticalGroup(
            pnlDivisoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        pnlDivisoria2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDivisoria2Layout = new javax.swing.GroupLayout(pnlDivisoria2);
        pnlDivisoria2.setLayout(pnlDivisoria2Layout);
        pnlDivisoria2Layout.setHorizontalGroup(
            pnlDivisoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlDivisoria2Layout.setVerticalGroup(
            pnlDivisoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        btnListarAvaliacaoPerformance.setBackground(new java.awt.Color(71, 19, 35));
        btnListarAvaliacaoPerformance.setFont(fonteMenor);
        btnListarAvaliacaoPerformance.setForeground(new java.awt.Color(255, 255, 255));
        btnListarAvaliacaoPerformance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-curriculos-32x32.png"))); // NOI18N
        btnListarAvaliacaoPerformance.setText("LISTAR AVALIAÇÕES DE PERFORMANCE");
        btnListarAvaliacaoPerformance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarAvaliacaoPerformance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarAvaliacaoPerformance.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarAvaliacaoPerformance.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarAvaliacaoPerformance.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarAvaliacaoPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAvaliacaoPerformanceActionPerformed(evt);
            }
        });

        btnListarPagamentos.setBackground(new java.awt.Color(71, 19, 35));
        btnListarPagamentos.setFont(fonteMenor);
        btnListarPagamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-pagamentos-32x32.png"))); // NOI18N
        btnListarPagamentos.setText("LISTAR PAGAMENTOS");
        btnListarPagamentos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarPagamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarPagamentos.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarPagamentos.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarPagamentos.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPagamentosActionPerformed(evt);
            }
        });

        btnListarCurriculos.setBackground(new java.awt.Color(71, 19, 35));
        btnListarCurriculos.setFont(fonteMenor);
        btnListarCurriculos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarCurriculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar-curriculos-32x32.png"))); // NOI18N
        btnListarCurriculos.setText("LISTAR CURRÍCULOS");
        btnListarCurriculos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarCurriculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarCurriculos.setMaximumSize(new java.awt.Dimension(245, 64));
        btnListarCurriculos.setMinimumSize(new java.awt.Dimension(245, 64));
        btnListarCurriculos.setPreferredSize(new java.awt.Dimension(245, 64));
        btnListarCurriculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCurriculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnListarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlDivisoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarCurriculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarDescontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarPagamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnListarAvaliacaoPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(pnlDivisoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDivisoria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnAvaliarPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimirRelatorioAvaliacaoProdutividade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarCurriculos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarAvaliacaoPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnImprimirRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimirRelatorioPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pnlDivisoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.setVisible(false);
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

    private void btnListarDescontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDescontosActionPerformed
        telaDeListarDescontos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarDescontosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaLogin.setVisible(true);
        telaLogin.limparCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListarAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAdicionaisActionPerformed
        telaDeListarAdicionais.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarAdicionaisActionPerformed

    private void btnListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFuncionariosActionPerformed
        telaDeListarFuncionarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarFuncionariosActionPerformed

    private void btnListarAvaliacaoPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAvaliacaoPerformanceActionPerformed
        telaListarAvaliacaoDePerformance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarAvaliacaoPerformanceActionPerformed

    private void btnListarPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPagamentosActionPerformed
        telaDeListarPagamentos.setVisible(true);
        telaDeListarPagamentos.exibirDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnListarPagamentosActionPerformed

    private void btnListarCurriculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCurriculosActionPerformed
        telaDeListarCurriculos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarCurriculosActionPerformed

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
    private javax.swing.JButton btnImprimirRelatorioAvaliacaoProdutividade;
    private javax.swing.JButton btnImprimirRelatorioFuncionario;
    private javax.swing.JButton btnImprimirRelatorioPonto;
    private javax.swing.JButton btnListarAdicionais;
    private javax.swing.JButton btnListarAvaliacaoPerformance;
    private javax.swing.JButton btnListarCurriculos;
    private javax.swing.JButton btnListarDescontos;
    private javax.swing.JButton btnListarFuncionarios;
    private javax.swing.JButton btnListarPagamentos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblInfoGestor;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlDivisoria1;
    private javax.swing.JPanel pnlDivisoria2;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
