package Controller;

import ModelBO.Produto;
import View.FormBuscaProduto;
import View.ViewCadastroProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.logging.Logger;


public class ControllerCadProduto implements ActionListener{
    ViewCadastroProduto telaProd = new ViewCadastroProduto();

    public ControllerCadProduto(ViewCadastroProduto telaProd) {
        this.telaProd = telaProd;
        
        telaProd.getNovo().addActionListener(this);
        telaProd.getCancelar().addActionListener(this);
        telaProd.getGravar().addActionListener(this);
        telaProd.getBuscar().addActionListener(this);
        telaProd.getSair().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaProd.getNovo()){
            telaProd.ativa(false);
            telaProd.ligaDesliga(false);
            
            telaProd.getTextoDescricao().requestFocus();
            telaProd.getTextoDescricao().setText("");
            telaProd.getTextoEstoqueMin().setText("");
            telaProd.getTextoEstoqueMax().setText("");
            telaProd.getTextoBarraEntrada().setText("");
            telaProd.getTextoBarraSaida().setText("");
            telaProd.getTextoFator().setText("");
            telaProd.getTextoData().setText("");
            telaProd.getTextoUnidadeCompra().setText("");
            telaProd.getTextoUnidadeVenda().setText("");
            telaProd.getTextoValorCompra().setText("");
            telaProd.getTextoValorVenda().setText("");
            telaProd.getComboStatus().setSelectedIndex(0);
            
        }else if(acao.getSource() == telaProd.getCancelar()){
            telaProd.ativa(true);
            telaProd.ligaDesliga(false);
            
        
        }else if(acao.getSource() == telaProd.getBuscar()){
        
            FormBuscaProduto telaBuscaProduto = new FormBuscaProduto();
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaProduto);
            telaBuscaProduto.setVisible(true);
            
        }else if(acao.getSource() == telaProd.getGravar()){
            
            if(telaProd.getTextoDescricao().getText().trim().equalsIgnoreCase("") || 
               telaProd.getTextoValorCompra().getText().trim().equalsIgnoreCase("") || 
               telaProd.getTextoValorVenda().getText().trim().equalsIgnoreCase("") ||
               telaProd.getTextoFator().getText().trim().equalsIgnoreCase("") ||
               telaProd.getTextoUnidadeCompra().getText().trim().equalsIgnoreCase("") ||
               telaProd.getTextoUnidadeVenda().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Há campos obrigatórios não preenchidos");
            }else{
                
                Produto produto = new Produto();
                produto.setDescricao(telaProd.getTextoDescricao().getText());
                produto.setUndCompra(telaProd.getTextoUnidadeCompra().getText());
                produto.setUndVenda(telaProd.getTextoUnidadeVenda().getText());
                produto.setBarraEntrada(telaProd.getTextoBarraEntrada().getText());
                produto.setBarraSaida(telaProd.getTextoBarraSaida().getText());
                
                if(telaProd.getComboStatus().getSelectedIndex() == 0){
                    produto.setStatus('1');
                }else{                   

                    produto.setStatus('0');
                }
                
                
                try {
                   float valorCompra = Float.parseFloat(telaProd.getTextoValorCompra().getText());
                   produto.setValorCompra(valorCompra);
                   
                   float valorVenda = Float.parseFloat(telaProd.getTextoValorVenda().getText());
                   produto.setValorVenda(valorVenda);
                   
                   float estoqueMin = Float.parseFloat(telaProd.getTextoEstoqueMin().getText());
                   produto.setEstoqueMinimo(estoqueMin);
                   
                   float estoqueMax = Float.parseFloat(telaProd.getTextoEstoqueMax().getText());
                   produto.setEstoqueMaximo(estoqueMax);
                   
                   int fator = Integer.parseInt(telaProd.getTextoFator().getText());
                   produto.setFatorConversao(fator);
                   
                } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Valores de fator conversão, compra, venda e estoque devem ser numeros");
                }
              

                Date data = new Date();
                produto.setDataCadastro(data);

                
                telaProd.ativa(true);
                telaProd.ligaDesliga(true);
                
               
                JOptionPane.showMessageDialog(null, produto.toString());
            }
        
        }else if(acao.getSource() == telaProd.getSair()){
            telaProd.dispose();
                    
        }
        
    
    }
    
}
