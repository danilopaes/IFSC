package View;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewCadastroProduto extends javax.swing.JFrame {

    public ViewCadastroProduto() {
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

    public JTextField getTextoEstoqueMin() {
        return TextoEstoqueMin;
    }

    public void setTextoEstoqueMin(JTextField TextoEstoqueMin) {
        this.TextoEstoqueMin = TextoEstoqueMin;
    }

    public JComboBox<String> getComboStatus() {
        return comboStatus;
    }

    public void setComboStatus(JComboBox<String> comboStatus) {
        this.comboStatus = comboStatus;
    }

    public JTextField getTextoBarraEntrada() {
        return textoBarraEntrada;
    }

    public void setTextoBarraEntrada(JTextField textoBarraEntrada) {
        this.textoBarraEntrada = textoBarraEntrada;
    }

    public JTextField getTextoBarraSaida() {
        return textoBarraSaida;
    }

    public void setTextoBarraSaida(JTextField textoBarraSaida) {
        this.textoBarraSaida = textoBarraSaida;
    }

    public JTextField getTextoData() {
        return textoData;
    }

    public void setTextoData(JTextField textoData) {
        this.textoData = textoData;
    }

    public JTextArea getTextoDescricao() {
        return textoDescricao;
    }

    public void setTextoDescricao(JTextArea textoDescricao) {
        this.textoDescricao = textoDescricao;
    }

    public JTextField getTextoEstoqueMax() {
        return textoEstoqueMax;
    }

    public void setTextoEstoqueMax(JTextField textoEstoqueMax) {
        this.textoEstoqueMax = textoEstoqueMax;
    }

    public JTextField getTextoFator() {
        return textoFator;
    }

    public void setTextoFator(JTextField textoFator) {
        this.textoFator = textoFator;
    }

    public JTextField getTextoUnidadeCompra() {
        return textoUnidadeCompra;
    }

    public void setTextoUnidadeCompra(JTextField textoUnidadeCompra) {
        this.textoUnidadeCompra = textoUnidadeCompra;
    }

    public JTextField getTextoUnidadeVenda() {
        return textoUnidadeVenda;
    }

    public void setTextoUnidadeVenda(JTextField textoUnidadeVenda) {
        this.textoUnidadeVenda = textoUnidadeVenda;
    }

    public JTextField getTextoValorCompra() {
        return textoValorCompra;
    }

    public void setTextoValorCompra(JTextField textoValorCompra) {
        this.textoValorCompra = textoValorCompra;
    }

    public JTextField getTextoValorVenda() {
        return textoValorVenda;
    }

    public void setTextoValorVenda(JTextField textoValorVenda) {
        this.textoValorVenda = textoValorVenda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Novo = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textoBarraEntrada = new javax.swing.JTextField();
        textoBarraSaida = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox<>();
        textoData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDescricao = new javax.swing.JTextArea();
        textoUnidadeVenda = new javax.swing.JTextField();
        textoValorVenda = new javax.swing.JTextField();
        textoValorCompra = new javax.swing.JTextField();
        textoUnidadeCompra = new javax.swing.JTextField();
        TextoEstoqueMin = new javax.swing.JTextField();
        textoEstoqueMax = new javax.swing.JTextField();
        textoFator = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel2.setText("Cadastro de Produto");
        jPanel2.add(jLabel2);

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoBarraEntrada.setBackground(new java.awt.Color(204, 204, 204));
        textoBarraEntrada.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoBarraEntrada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoBarraEntrada.setPreferredSize(new java.awt.Dimension(64, 35));
        textoBarraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBarraEntradaActionPerformed(evt);
            }
        });

        textoBarraSaida.setBackground(new java.awt.Color(204, 204, 204));
        textoBarraSaida.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoBarraSaida.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoBarraSaida.setPreferredSize(new java.awt.Dimension(64, 35));
        textoBarraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBarraSaidaActionPerformed(evt);
            }
        });

        comboStatus.setBackground(new java.awt.Color(204, 204, 204));
        comboStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });

        textoData.setBackground(new java.awt.Color(204, 204, 204));
        textoData.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoData.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoData.setName(""); // NOI18N
        textoData.setPreferredSize(new java.awt.Dimension(64, 35));
        textoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDataActionPerformed(evt);
            }
        });

        textoDescricao.setBackground(new java.awt.Color(204, 204, 204));
        textoDescricao.setColumns(20);
        textoDescricao.setLineWrap(true);
        textoDescricao.setRows(5);
        jScrollPane1.setViewportView(textoDescricao);

        textoUnidadeVenda.setBackground(new java.awt.Color(204, 204, 204));
        textoUnidadeVenda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoUnidadeVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoUnidadeVenda.setPreferredSize(new java.awt.Dimension(64, 35));
        textoUnidadeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUnidadeVendaActionPerformed(evt);
            }
        });

        textoValorVenda.setBackground(new java.awt.Color(204, 204, 204));
        textoValorVenda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoValorVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoValorVenda.setPreferredSize(new java.awt.Dimension(64, 35));
        textoValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoValorVendaActionPerformed(evt);
            }
        });

        textoValorCompra.setBackground(new java.awt.Color(204, 204, 204));
        textoValorCompra.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoValorCompra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoValorCompra.setPreferredSize(new java.awt.Dimension(64, 35));
        textoValorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoValorCompraActionPerformed(evt);
            }
        });

        textoUnidadeCompra.setBackground(new java.awt.Color(204, 204, 204));
        textoUnidadeCompra.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoUnidadeCompra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoUnidadeCompra.setPreferredSize(new java.awt.Dimension(64, 35));
        textoUnidadeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUnidadeCompraActionPerformed(evt);
            }
        });

        TextoEstoqueMin.setBackground(new java.awt.Color(204, 204, 204));
        TextoEstoqueMin.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        TextoEstoqueMin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoEstoqueMin.setPreferredSize(new java.awt.Dimension(64, 35));
        TextoEstoqueMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEstoqueMinActionPerformed(evt);
            }
        });

        textoEstoqueMax.setBackground(new java.awt.Color(204, 204, 204));
        textoEstoqueMax.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoEstoqueMax.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoEstoqueMax.setPreferredSize(new java.awt.Dimension(64, 35));
        textoEstoqueMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEstoqueMaxActionPerformed(evt);
            }
        });

        textoFator.setBackground(new java.awt.Color(204, 204, 204));
        textoFator.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoFator.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoFator.setToolTipText("");
        textoFator.setPreferredSize(new java.awt.Dimension(64, 35));
        textoFator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFatorActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição:");

        jLabel3.setText("Valor Venda:");

        jLabel4.setText("Valor Compra:");

        jLabel8.setText("Und Venda:");

        jLabel9.setText("Und Compra:");

        jLabel10.setText("Barra Saida:");

        jLabel11.setText("Barra Entrada:");

        jLabel12.setText("Estoque Max:");

        jLabel13.setText("Status:");

        jLabel14.setText("Data Cadastro:");

        jLabel15.setText("Fator Conversão:");

        jLabel16.setText("Estoque Min:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(textoValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFator, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoBarraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoUnidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel10))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoBarraSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textoEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoUnidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textoBarraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TextoEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(textoBarraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textoEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void textoBarraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBarraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBarraEntradaActionPerformed

    private void textoBarraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBarraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBarraSaidaActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void textoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDataActionPerformed

    private void textoUnidadeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUnidadeVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUnidadeVendaActionPerformed

    private void textoValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoValorVendaActionPerformed

    private void textoValorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoValorCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoValorCompraActionPerformed

    private void textoUnidadeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUnidadeCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUnidadeCompraActionPerformed

    private void TextoEstoqueMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEstoqueMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEstoqueMinActionPerformed

    private void textoEstoqueMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEstoqueMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEstoqueMaxActionPerformed

    private void textoFatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFatorActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField TextoEstoqueMin;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoBarraEntrada;
    private javax.swing.JTextField textoBarraSaida;
    private javax.swing.JTextField textoData;
    private javax.swing.JTextArea textoDescricao;
    private javax.swing.JTextField textoEstoqueMax;
    private javax.swing.JTextField textoFator;
    private javax.swing.JTextField textoUnidadeCompra;
    private javax.swing.JTextField textoUnidadeVenda;
    private javax.swing.JTextField textoValorCompra;
    private javax.swing.JTextField textoValorVenda;
    // End of variables declaration//GEN-END:variables
}
