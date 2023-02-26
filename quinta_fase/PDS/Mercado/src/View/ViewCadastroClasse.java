
package View;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewCadastroClasse extends javax.swing.JFrame {

    public ViewCadastroClasse() {
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
        Component[] componentes = panelComp.getComponents();
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

    public JTextField getTextoDescricao() {
        return TextoDescricao;
    }

    public void setTextoDescricao(JTextField textoDescricao) {
        this.TextoDescricao = textoDescricao;
    }

    public JTextField getTextoId() {
        return TextoId;
    }

    public void setTextoId(JTextField textoId) {
        this.TextoId = textoId;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelComp = new javax.swing.JPanel();
        TextoId = new javax.swing.JTextField();
        TextoDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Novo = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel3.setText("Cadastro de Classe");
        jPanel3.add(jLabel3);

        panelComp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextoId.setBackground(new java.awt.Color(204, 204, 204));
        TextoId.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        TextoId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoId.setPreferredSize(new java.awt.Dimension(64, 35));
        TextoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoIdActionPerformed(evt);
            }
        });

        TextoDescricao.setBackground(new java.awt.Color(204, 204, 204));
        TextoDescricao.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        TextoDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        javax.swing.GroupLayout panelCompLayout = new javax.swing.GroupLayout(panelComp);
        panelComp.setLayout(panelCompLayout);
        panelCompLayout.setHorizontalGroup(
            panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCompLayout.setVerticalGroup(
            panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jPanel6.add(Novo);

        Gravar.setBackground(new java.awt.Color(153, 153, 153));
        Gravar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OK.png"))); // NOI18N
        Gravar.setText("Gravar");
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });
        jPanel6.add(Gravar);

        Cancelar.setBackground(new java.awt.Color(153, 153, 153));
        Cancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel6.add(Cancelar);

        Buscar.setBackground(new java.awt.Color(153, 153, 153));
        Buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Find.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel6.add(Buscar);

        Sair.setBackground(new java.awt.Color(153, 153, 153));
        Sair.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel6.add(Sair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(panelComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(panelComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoIdActionPerformed

    private void TextoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroClasse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField TextoDescricao;
    private javax.swing.JTextField TextoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panelComp;
    // End of variables declaration//GEN-END:variables

}
