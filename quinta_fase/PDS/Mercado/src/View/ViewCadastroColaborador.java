/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author grego
 */
public class ViewCadastroColaborador extends javax.swing.JFrame {

    /**
     * Creates new form NewViewColaborador
     */
    public ViewCadastroColaborador() {
        initComponents();
    }
    
    public void ativa(boolean estadoComponente){
        JButtonNovo.setEnabled(estadoComponente);
        JButtonCancelar.setEnabled(!estadoComponente);
        JButtonGravar.setEnabled(!estadoComponente);
        JButtonBuscar.setEnabled(estadoComponente);
        JButtonSair.setEnabled(estadoComponente);  
    }
    
    public  void ligaDesliga(boolean estadoComponente){
        Component[] componentes = jPanel1.getComponents();
        for (Component componente : componentes){
            if(componente instanceof JTextField){
                ((JTextField)componente).setText("");
            } else if(componente instanceof JFormattedTextField){
                ((JFormattedTextField)componente).setText("");
            } else if(componente instanceof JTextArea){
                ((JTextArea)componente).setText("");
            } else if(componente instanceof JComboBox){
                ((JComboBox)componente).setSelectedIndex(0);
            } else if(componente instanceof JScrollPane){
                ((JScrollPane)componente).getClass();
            }
        componente.setEnabled(estadoComponente);
        }
    }
    
    public JButton getBuscar() {
        return JButtonBuscar;
    }

    public void setBuscar(JButton Buscar) {
        this.JButtonBuscar = Buscar;
    }

    public JButton getCancelar() {
        return JButtonCancelar;
    }

    public void setCancelar(JButton Cancelar) {
        this.JButtonCancelar = Cancelar;
    }

    public JButton getGravar() {
        return JButtonGravar;
    }

    public void setGravar(JButton Gravar) {
        this.JButtonGravar = Gravar;
    }

    public JButton getNovo() {
        return JButtonNovo;
    }

    public void setNovo(JButton Novo) {
        this.JButtonNovo = Novo;
    }

    public JButton getSair() {
        return JButtonSair;
    }

    public void setSair(JButton Sair) {
        this.JButtonSair = Sair;
    }

    public JButton getjButtonBuscarEndereco() {
        return jButtonBuscarEndereco;
    }

    public void setjButtonBuscarEndereco(JButton jButtonBuscarEndereco) {
        this.jButtonBuscarEndereco = jButtonBuscarEndereco;
    }

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public void setjComboBoxStatus(JComboBox<String> jComboBoxStatus) {
        this.jComboBoxStatus = jComboBoxStatus;
    }

    public JTextField getjTextFieldCelular() {
        return jTextFieldCelular;
    }

    public void setjTextFieldCelular(JTextField jTextFieldCelular) {
        this.jTextFieldCelular = jTextFieldCelular;
    }

    public JTextField getjTextFieldComplemento() {
        return jTextFieldComplemento;
    }

    public void setjTextFieldComplemento(JTextField jTextFieldComplemento) {
        this.jTextFieldComplemento = jTextFieldComplemento;
    }

    public JTextField getjTextFieldDataCadastro() {
        return jTextFieldDataCadastro;
    }

    public void setjTextFieldDataCadastro(JTextField jTextFieldDataCadastro) {
        this.jTextFieldDataCadastro = jTextFieldDataCadastro;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldEndereco() {
        return jTextFieldEndereco;
    }

    public void setjTextFieldEndereco(JTextField jTextFieldEndereco) {
        this.jTextFieldEndereco = jTextFieldEndereco;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldVerificaSenha() {
        return jTextFieldVerificaSenha;
    }

    public void setjTextFieldVerificaSenha(JTextField jTextFieldVerificaSenha) {
        this.jTextFieldVerificaSenha = jTextFieldVerificaSenha;
    }

    public JTextField getjTextFieldObservacao() {
        return jTextFieldObservacao;
    }

    public void setjTextFieldObservacao(JTextField jTextFieldObservacao) {
        this.jTextFieldObservacao = jTextFieldObservacao;
    }

    public JTextField getjTextFieldSenha() {
        return jTextFieldSenha;
    }

    public void setjTextFieldSenha(JTextField jTextFieldSenha) {
        this.jTextFieldSenha = jTextFieldSenha;
    }

    public JTextField getjTextFieldTelefone() {
        return jTextFieldTelefone;
    }

    public void setjTextFieldTelefone(JTextField jTextFieldTelefone) {
        this.jTextFieldTelefone = jTextFieldTelefone;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JButtonNovo = new javax.swing.JButton();
        JButtonGravar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        JButtonBuscar = new javax.swing.JButton();
        JButtonSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldVerificaSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonBuscarEndereco = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldObservacao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDataCadastro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel2.setText("Cadastro de colaborador");
        jPanel2.add(jLabel2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel3.setText("Cadastro de colaborador");
        jPanel3.add(jLabel3);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JButtonNovo.setBackground(new java.awt.Color(153, 153, 153));
        JButtonNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Create.png"))); // NOI18N
        JButtonNovo.setText("Novo");
        JButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNovoActionPerformed(evt);
            }
        });
        jPanel5.add(JButtonNovo);

        JButtonGravar.setBackground(new java.awt.Color(153, 153, 153));
        JButtonGravar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OK.png"))); // NOI18N
        JButtonGravar.setText("Gravar");
        JButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGravarActionPerformed(evt);
            }
        });
        jPanel5.add(JButtonGravar);

        JButtonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        JButtonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(JButtonCancelar);

        JButtonBuscar.setBackground(new java.awt.Color(153, 153, 153));
        JButtonBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Find.png"))); // NOI18N
        JButtonBuscar.setText("Buscar");
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(JButtonBuscar);

        JButtonSair.setBackground(new java.awt.Color(153, 153, 153));
        JButtonSair.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        JButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        JButtonSair.setText("Sair");
        JButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSairActionPerformed(evt);
            }
        });
        jPanel5.add(JButtonSair);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jTextFieldNome.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Login:");

        jTextFieldLogin.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Verifica senha:");

        jTextFieldSenha.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldVerificaSenha.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Telefone:");

        jTextFieldTelefone.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldCelular.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Celular:");

        jTextFieldEndereco.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Endereço:");

        jButtonBuscarEndereco.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBuscarEndereco.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBuscarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Find.png"))); // NOI18N
        jButtonBuscarEndereco.setText("Buscar");
        jButtonBuscarEndereco.setPreferredSize(new java.awt.Dimension(80, 24));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Complemento:");

        jTextFieldComplemento.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel12.setText("Observação:");

        jTextFieldObservacao.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel13.setText("Data cadastro:");

        jTextFieldDataCadastro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel14.setText("Status:");

        jComboBoxStatus.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addGap(7, 7, 7)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(15, 15, 15)
                            .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldVerificaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSenha)
                                    .addComponent(jTextFieldLogin))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldVerificaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButtonBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonNovoActionPerformed

    private void JButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonGravarActionPerformed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelarActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonGravar;
    private javax.swing.JButton JButtonNovo;
    private javax.swing.JButton JButtonSair;
    private javax.swing.JButton jButtonBuscarEndereco;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataCadastro;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldObservacao;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldVerificaSenha;
    // End of variables declaration//GEN-END:variables
}
