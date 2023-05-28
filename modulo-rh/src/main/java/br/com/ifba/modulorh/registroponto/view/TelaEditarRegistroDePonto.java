package br.com.ifba.modulorh.registroponto.view;

import br.com.ifba.modulorh.homescreen.TelaHomescreenFuncionario;
import br.com.ifba.modulorh.infrastructure.service.IFacade;
import br.com.ifba.modulorh.registroponto.model.RegistroPonto;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
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
public class TelaEditarRegistroDePonto extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    private RegistroPonto registroEditado;
    @Autowired @Lazy
    private TelaDeListarRegistroDePonto telaDeListarRegistroDePonto;
    @Autowired @Lazy
    private TelaHomescreenFuncionario telaHomescreenFuncionario;
    private final DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    ImageIcon icone = new ImageIcon("./src/main/resources/imagens/rh.png");
    Font fonteMaior;
    Font fonteNormal;
    Font fonteMenor;
    
    public TelaEditarRegistroDePonto() throws FontFormatException, IOException {
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
    
    public void setRegistroPonto(RegistroPonto registroPonto) {
        this.registroEditado = registroPonto;
        txtDataEntrada.setText(formatarData.format(registroPonto.getEntrada()));
        txtDataSaida.setText(formatarData.format(registroPonto.getSaida()));
    }
 
    private boolean validarCampos() {
        // REGEX para validar o padrão da data: dd/mm/aaaa hh:mm:ss ->
        Pattern padrao = Pattern.compile("^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4} (?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$", 
                Pattern.CASE_INSENSITIVE);

        if (padrao.matcher(txtDataEntrada.getText()).find() == false) {
            JOptionPane.showMessageDialog(null, "A data deve seguir o padrão: \"dd/mm/aaaa hh:mm:ss\"", 
                         "A data de entrada incorreta!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if (padrao.matcher(txtDataSaida.getText()).find() == false) {
             JOptionPane.showMessageDialog(null, "A data deve seguir o padrão: \"dd/mm/aaaa hh:mm:ss\"", 
                         "A data de saída incorreta!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private void limparCampos() {
        txtDataEntrada.setText("");
        txtDataSaida.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        lblLateral = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pnlCampo = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtDataEntrada = new javax.swing.JTextField();
        lblDataEntrada = new javax.swing.JLabel();
        lblDataSaida = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Registro de Ponto");
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
                        .addGap(84, 84, 84)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLateral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pnlCampo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCampo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        pnlCampo.setPreferredSize(new java.awt.Dimension(528, 556));
        pnlCampo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setFont(fonteMaior);
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Editar Registro de Ponto");
        pnlCampo.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, -1));

        btnEditar.setBackground(new java.awt.Color(71, 19, 35));
        btnEditar.setFont(fonteNormal);
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
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
        pnlCampo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txtDataEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txtDataEntrada.setFont(fonteNormal);
        txtDataEntrada.setForeground(new java.awt.Color(0, 0, 0));
        txtDataEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCampo.add(txtDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));

        lblDataEntrada.setFont(fonteNormal);
        lblDataEntrada.setForeground(new java.awt.Color(0, 0, 0));
        lblDataEntrada.setText("Data Entrada:");
        pnlCampo.add(lblDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblDataSaida.setFont(fonteNormal);
        lblDataSaida.setForeground(new java.awt.Color(0, 0, 0));
        lblDataSaida.setText("Data Saída:");
        pnlCampo.add(lblDataSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtDataSaida.setBackground(new java.awt.Color(255, 255, 255));
        txtDataSaida.setFont(fonteNormal);
        txtDataSaida.setForeground(new java.awt.Color(0, 0, 0));
        txtDataSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCampo.add(txtDataSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 30));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (validarCampos()) {    
            try {
                    registroEditado.setEntrada(LocalDateTime.parse(txtDataEntrada.getText(), formatarData));
                    registroEditado.setSaida(LocalDateTime.parse(txtDataSaida.getText(), formatarData));

                    facade.updateRegistroPonto(registroEditado);
                    limparCampos();

                    JOptionPane.showMessageDialog(null, "Ponto editado com sucesso.", 
                         "Ponto editado!", JOptionPane.INFORMATION_MESSAGE);

                    this.setVisible(false);
                    telaDeListarRegistroDePonto.setVisible(true);
                    telaDeListarRegistroDePonto.exibirDados();
                    telaDeListarRegistroDePonto.toFront();
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao editar no banco: " + e.getMessage(),
                            "Erro ao Editar no banco de dados!", JOptionPane.ERROR_MESSAGE);
                }
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
            java.util.logging.Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaEditarRegistroDePonto().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaEditarRegistroDePonto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblDataSaida;
    private javax.swing.JLabel lblLateral;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataSaida;
    // End of variables declaration//GEN-END:variables
}
