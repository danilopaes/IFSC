package View;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewCadastroFornecedor extends javax.swing.JFrame {

    public ViewCadastroFornecedor() {
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

    public JComboBox<String> getComboBoxStatus() {
        return ComboBoxStatus;
    }

    public void setComboBoxStatus(JComboBox<String> ComboBoxStatus) {
        this.ComboBoxStatus = ComboBoxStatus;
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

    public JTextField getTextoCnpj() {
        return textoCnpj;
    }

    public void setTextoCnpj(JTextField textoCnpj) {
        this.textoCnpj = textoCnpj;
    }

    public JTextField getTextoContato() {
        return textoContato;
    }

    public void setTextoContato(JTextField textoContato) {
        this.textoContato = textoContato;
    }

    public JTextField getTextoCpf() {
        return textoCpf;
    }

    public void setTextoCpf(JTextField textoCpf) {
        this.textoCpf = textoCpf;
    }

    public JTextField getTextoEmail() {
        return textoEmail;
    }

    public void setTextoEmail(JTextField textoEmail) {
        this.textoEmail = textoEmail;
    }

    public JTextField getTextoInsc() {
        return textoInsc;
    }

    public void setTextoInsc(JTextField textoInsc) {
        this.textoInsc = textoInsc;
    }

    public JTextField getTextoNome() {
        return textoNome;
    }

    public void setTextoNome(JTextField textoNome) {
        this.textoNome = textoNome;
    }

    public JTextField getTextoRazao() {
        return textoRazao;
    }

    public void setTextoRazao(JTextField textoRazao) {
        this.textoRazao = textoRazao;
    }

    public JTextField getTextoRg() {
        return textoRg;
    }

    public void setTextoRg(JTextField textoRg) {
        this.textoRg = textoRg;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textoRazao = new javax.swing.JTextField();
        textoCnpj = new javax.swing.JTextField();
        textoRg = new javax.swing.JTextField();
        textoContato = new javax.swing.JTextField();
        textoInsc = new javax.swing.JTextField();
        textoCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxStatus = new javax.swing.JComboBox<>();
        textoNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Novo = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        checkbox1.setLabel("checkbox1");

        jLabel9.setText("Email:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel2.setText("Cadastro de Fornecedor");
        jPanel2.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoRazao.setBackground(new java.awt.Color(204, 204, 204));
        textoRazao.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRazaoActionPerformed(evt);
            }
        });

        textoCnpj.setBackground(new java.awt.Color(204, 204, 204));
        textoCnpj.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCnpjActionPerformed(evt);
            }
        });

        textoRg.setBackground(new java.awt.Color(204, 204, 204));
        textoRg.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRgActionPerformed(evt);
            }
        });

        textoContato.setBackground(new java.awt.Color(204, 204, 204));
        textoContato.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoContatoActionPerformed(evt);
            }
        });

        textoInsc.setBackground(new java.awt.Color(204, 204, 204));
        textoInsc.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoInscActionPerformed(evt);
            }
        });

        textoCpf.setBackground(new java.awt.Color(204, 204, 204));
        textoCpf.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCpfActionPerformed(evt);
            }
        });

        jLabel1.setText("INSC Estadual:");

        jLabel3.setText("CNPJ:");

        jLabel4.setText("CPF:");

        jLabel5.setText("RG:");

        jLabel6.setText("Razão Social:");

        jLabel7.setText("Contato:");

        textoEmail.setBackground(new java.awt.Color(204, 204, 204));
        textoEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        jLabel10.setText("Status:");

        ComboBoxStatus.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        ComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxStatusActionPerformed(evt);
            }
        });

        textoNome.setBackground(new java.awt.Color(204, 204, 204));
        textoNome.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        jLabel11.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(textoRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(textoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(textoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(textoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Novo.setBackground(new java.awt.Color(153, 153, 153));
        Novo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Create.png"))); // NOI18N
        Novo.setText("Novo");
        Novo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        jPanel5.add(Novo);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCnpjActionPerformed

    private void textoRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRgActionPerformed

    private void textoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoContatoActionPerformed

    private void textoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoInscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInscActionPerformed

    private void textoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCpfActionPerformed

    private void textoRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRazaoActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GravarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailActionPerformed

    private void ComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxStatusActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> ComboBoxStatus;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField textoCnpj;
    private javax.swing.JTextField textoContato;
    private javax.swing.JTextField textoCpf;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoInsc;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoRazao;
    private javax.swing.JTextField textoRg;
    // End of variables declaration//GEN-END:variables
}
