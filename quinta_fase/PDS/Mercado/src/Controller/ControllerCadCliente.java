package Controller;

import ModelBO.Cliente;
import View.FormBuscaCliente;
import View.ViewCadastroCliente2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class ControllerCadCliente implements ActionListener{
     ViewCadastroCliente2 telaCliente;  
    
    public ControllerCadCliente(ViewCadastroCliente2 telaCliente){
        
        this.telaCliente = telaCliente;
        
        telaCliente.getNovo().addActionListener(this);
        telaCliente.getCancelar().addActionListener(this);
        telaCliente.getGravar().addActionListener(this);
        telaCliente.getBuscar().addActionListener(this);
        telaCliente.getSair().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCliente.getNovo()){
            telaCliente.ativa(false);
            telaCliente.ligaDesliga(false);
            telaCliente.getTextoNome().requestFocus();
            telaCliente.getTextoRG().setText("");
            telaCliente.getTextoNome().setText("");
            telaCliente.getTextoTelefone1().setText("");
            telaCliente.getTextoTelefone2().setText("");
            telaCliente.getTextoCPF().setText("");
            telaCliente.getTextoDataNasc().setText("");
            telaCliente.getTextoDataCadastro().setText("");
            telaCliente.getTextoObservacao().setText("");
            telaCliente.getTextoEmail().setText("");
            telaCliente.getComboStatus().setSelectedIndex(0);

        }else if(acao.getSource() == telaCliente.getCancelar()){
            telaCliente.ativa(true);
            telaCliente.ligaDesliga(false);
            
        
        }else if(acao.getSource() == telaCliente.getBuscar()){
            
            FormBuscaCliente telaBuscaCliente= new FormBuscaCliente();
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente);
            telaBuscaCliente.setVisible(true);
        
        }else if(acao.getSource() == telaCliente.getGravar()){
            if(telaCliente.getTextoRG().getText().trim().equalsIgnoreCase("") || 
               telaCliente.getTextoCPF().getText().trim().equalsIgnoreCase("") || 
               telaCliente.getTextoDataNasc().getText().trim().equalsIgnoreCase("") ||
               telaCliente.getTextoTelefone1().getText().trim().equalsIgnoreCase("") ||
               telaCliente.getTextoNome().getText().trim().equalsIgnoreCase("") ||
               telaCliente.getTextoEmail().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Há campos obrigatórios não preenchidos");
            }else{
                
                Cliente cliente = new Cliente();
                cliente.setNome(telaCliente.getTextoNome().getText());
                cliente.setFone1(telaCliente.getTextoTelefone1().getText());
                cliente.setFone2(telaCliente.getTextoTelefone2().getText());
                cliente.setCpf(telaCliente.getTextoCPF().getText());
                cliente.setEmail(telaCliente.getTextoEmail().getText());
                cliente.setObservacao(telaCliente.getTextoObservacao().getText());
                if(telaCliente.getComboStatus().getSelectedIndex() == 0){
                    cliente.setStatus('1');
                }else{                   

                    cliente.setStatus('0');
                }
                
                if(telaCliente.getComboStatus().getSelectedIndex() == 0){
                    cliente.setSexo('M');
                }else{                   
                    cliente.setSexo('F');
                }
                
                cliente.setRg(telaCliente.getTextoRG().getText());     
                
                Date data = new Date();
                cliente.setDtCadastro(data);

                try {
                   Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(telaCliente.getTextoDataNasc().getText());
                   cliente.setDtNascimento(dataNasc);
                } catch (ParseException e) {
                   e.printStackTrace();
                }
                
                telaCliente.ativa(true);
                telaCliente.ligaDesliga(true);
                
               
                JOptionPane.showMessageDialog(null, cliente.toString());
            }
        
        }else if(acao.getSource() == telaCliente.getSair()){
            telaCliente.dispose();
                    
        }
        
    
    }
    
    
}
