/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JP
 */
public class ViewCadastroCliente2 extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastroCliente
     */
    public ViewCadastroCliente2() {
        initComponents();
    }

    public void ativa(boolean estadoComponente){
        Novo.setEnabled(estadoComponente);
        Cancelar.setEnabled(!estadoComponente);
        Gravar.setEnabled(!estadoComponente);
        Buscar.setEnabled(estadoComponente);
        Sair.setEnabled(estadoComponente);  
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
        return Buscar;
    }

    public void setBuscar(JButton Buscar) {
        this.Buscar = Buscar;
    }

    public JButton getCancelar() {
        return Cancelar;
    }

    public void setCancelar(JButton Cancelar) {
        this.Cancelar = Cancelar;
    }

    public JButton getGravar() {
        return Gravar;
    }

    public void setGravar(JButton Gravar) {
        this.Gravar = Gravar;
    }

    public JButton getNovo() {
        return Novo;
    }

    public void setNovo(JButton Novo) {
        this.Novo = Novo;
    }

    public JButton getSair() {
        return Sair;
    }

    public void setSair(JButton Sair) {
        this.Sair = Sair;
    }

    public JComboBox<String> getComboStatus() {
        return comboStatus;
    }

    public void setComboStatus(JComboBox<String> comboStatus) {
        this.comboStatus = comboStatus;
    }

    public JTextField getTextoCPF() {
        return textoCPF;
    }

    public void setTextoCPF(JTextField textoCPF) {
        this.textoCPF = textoCPF;
    }

    public JFormattedTextField getTextoDataCadastro() {
        return textoDataCadastro;
    }

    public void setTextoDataCadastro(JFormattedTextField textoDataCadastro) {
        this.textoDataCadastro = textoDataCadastro;
    }

    public JFormattedTextField getTextoDataNasc() {
        return textoDataNasc;
    }

    public void setTextoDataNasc(JFormattedTextField textoDataNasc) {
        this.textoDataNasc = textoDataNasc;
    }

    public JTextField getTextoEmail() {
        return textoEmail;
    }

    public void setTextoEmail(JTextField textoEmail) {
        this.textoEmail = textoEmail;
    }

    public JTextField getTextoNome() {
        return textoNome;
    }

    public void setTextoNome(JTextField textoNome) {
        this.textoNome = textoNome;
    }

    public JTextArea getTextoObservacao() {
        return textoObservacao;
    }

    public void setTextoObservacao(JTextArea textoObservacao) {
        this.textoObservacao = textoObservacao;
    }

    public JTextField getTextoRG() {
        return textoRG;
    }

    public void setTextoRG(JTextField textoRG) {
        this.textoRG = textoRG;
    }

    public JTextField getTextoTelefone1() {
        return textoTelefone1;
    }

    public void setTextoTelefone1(JTextField textoTelefone1) {
        this.textoTelefone1 = textoTelefone1;
    }

    public JTextField getTextoTelefone2() {
        return textoTelefone2;
    }

    public void setTextoTelefone2(JTextField textoTelefone2) {
        this.textoTelefone2 = textoTelefone2;
    }

    public JComboBox<String> getComboSexo() {
        return comboSexo;
    }

    public void setComboSexo(JComboBox<String> comboSexo) {
        this.comboSexo = comboSexo;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Novo = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textoCPF = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoDataCadastro = new javax.swing.JFormattedTextField();
        textoRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoTelefone2 = new javax.swing.JTextField();
        textoTelefone1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        textoDataNasc = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoObservacao = new javax.swing.JTextArea();
        comboSexo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setLabelFor(jLabel1);
        jLabel2.setText("Cadastro de Clientes");
        jLabel2.setPreferredSize(new java.awt.Dimension(114, 15));
        jLabel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Novo.setBackground(new java.awt.Color(153, 153, 153));
        Novo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Create.png"))); // NOI18N
        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        jPanel5.add(Novo);

        Gravar.setBackground(new java.awt.Color(153, 153, 153));
        Gravar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OK.png"))); // NOI18N
        Gravar.setText("Gravar");
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });
        jPanel5.add(Gravar);

        Cancelar.setBackground(new java.awt.Color(153, 153, 153));
        Cancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel5.add(Cancelar);

        Buscar.setBackground(new java.awt.Color(153, 153, 153));
        Buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Find.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel5.add(Buscar);

        Sair.setBackground(new java.awt.Color(153, 153, 153));
        Sair.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel5.add(Sair);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoCPF.setBackground(new java.awt.Color(204, 204, 204));
        textoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCPFActionPerformed(evt);
            }
        });

        textoNome.setBackground(new java.awt.Color(204, 204, 204));
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("RG:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data Cadastro:");

        textoDataCadastro.setBackground(new java.awt.Color(204, 204, 204));
        textoDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textoDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDataCadastroActionPerformed(evt);
            }
        });

        textoRG.setBackground(new java.awt.Color(204, 204, 204));
        textoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRGActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome");

        textoTelefone2.setBackground(new java.awt.Color(204, 204, 204));
        textoTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefone2ActionPerformed(evt);
            }
        });

        textoTelefone1.setBackground(new java.awt.Color(204, 204, 204));
        textoTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefone1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone 2:");

        jLabel7.setText("Telefone 1:");

        textoEmail.setBackground(new java.awt.Color(204, 204, 204));
        textoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        comboStatus.setBackground(new java.awt.Color(204, 204, 204));
        comboStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel12.setText("Status:");
        jLabel12.setToolTipText("");

        textoDataNasc.setBackground(new java.awt.Color(204, 204, 204));
        textoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textoDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDataNascActionPerformed(evt);
            }
        });

        jLabel9.setText("Data Nasc:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Observação:");
        jLabel10.setToolTipText("");

        textoObservacao.setBackground(new java.awt.Color(203, 204, 204));
        textoObservacao.setColumns(20);
        textoObservacao.setRows(5);
        jScrollPane1.setViewportView(textoObservacao);

        comboSexo.setBackground(new java.awt.Color(204, 204, 204));
        comboSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel13.setText("Sexo:");
        jLabel13.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoEmail)
                                    .addComponent(textoRG)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoTelefone1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(comboStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GravarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void textoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCPFActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void textoDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDataCadastroActionPerformed

    private void textoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRGActionPerformed

    private void textoTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefone2ActionPerformed

    private void textoTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefone1ActionPerformed

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void textoDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDataNascActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroCliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroCliente2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoCPF;
    private javax.swing.JFormattedTextField textoDataCadastro;
    private javax.swing.JFormattedTextField textoDataNasc;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextArea textoObservacao;
    private javax.swing.JTextField textoRG;
    private javax.swing.JTextField textoTelefone1;
    private javax.swing.JTextField textoTelefone2;
    // End of variables declaration//GEN-END:variables
}
