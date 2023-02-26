package Controller;
import ModelBO.Fornecedor;
import View.ViewCadastroFornecedor;
import View.FormBuscaFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Date;

public class ControllerCadFornecedor implements ActionListener {
    ViewCadastroFornecedor telaFornecedor;  
    
    public ControllerCadFornecedor(ViewCadastroFornecedor telaFornecedor){
        
        this.telaFornecedor = telaFornecedor;
        
        telaFornecedor.getNovo().addActionListener(this);
        telaFornecedor.getCancelar().addActionListener(this);
        telaFornecedor.getGravar().addActionListener(this);
        telaFornecedor.getBuscar().addActionListener(this);
        telaFornecedor.getSair().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaFornecedor.getNovo()){
            
            telaFornecedor.ativa(false);
            telaFornecedor.ligaDesliga(false);
            
            telaFornecedor.getTextoNome().requestFocus();
            
            telaFornecedor.getTextoRg().setText("");
            telaFornecedor.getTextoNome().setText("");
            telaFornecedor.getTextoContato().setText("");
            telaFornecedor.getTextoInsc().setText("");
            telaFornecedor.getTextoCpf().setText("");
            telaFornecedor.getTextoRazao().setText("");
            telaFornecedor.getTextoCnpj().setText("");
            telaFornecedor.getTextoEmail().setText("");
            telaFornecedor.getComboBoxStatus().setSelectedIndex(0);

        }else if(acao.getSource() == telaFornecedor.getCancelar()){
            telaFornecedor.ativa(true);
            telaFornecedor.ligaDesliga(false);
            
        
        }else if(acao.getSource() == telaFornecedor.getBuscar()){
            
            FormBuscaFornecedor telaBuscaFornecedor = new FormBuscaFornecedor();
            ControllerBuscaFornecedor controllerBuscaFornecedor= new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);
            
        }else if(acao.getSource() == telaFornecedor.getGravar()){
            if(telaFornecedor.getTextoRg().getText().trim().equalsIgnoreCase("") || 
               telaFornecedor.getTextoCpf().getText().trim().equalsIgnoreCase("") || 
               telaFornecedor.getTextoNome().getText().trim().equalsIgnoreCase("") ||
               telaFornecedor.getTextoCnpj().getText().trim().equalsIgnoreCase("") ||
               telaFornecedor.getTextoInsc().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Há campos obrigatórios não preenchidos");
            }else{
                
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setNome(telaFornecedor.getTextoNome().getText());
                fornecedor.setContato(telaFornecedor.getTextoContato().getText());
                fornecedor.setInscEstadual(telaFornecedor.getTextoInsc().getText());
                fornecedor.setCpf(telaFornecedor.getTextoCpf().getText());
                fornecedor.setEmail(telaFornecedor.getTextoEmail().getText());
                fornecedor.setRazaoSocial(telaFornecedor.getTextoEmail().getText());
                fornecedor.setCnpj(telaFornecedor.getTextoEmail().getText());
                fornecedor.setCpf(telaFornecedor.getTextoCpf().getText());
                fornecedor.setRg(telaFornecedor.getTextoRg().getText());     
                
                if(telaFornecedor.getComboBoxStatus().getSelectedIndex() == 0){
                    fornecedor.setStatus('1');
                }else{                   

                    fornecedor.setStatus('0');
                }
               
                Date data = new Date();
                fornecedor.setDtCadastro(data);
                
                telaFornecedor.ativa(true);
                telaFornecedor.ligaDesliga(true);
                
               
                JOptionPane.showMessageDialog(null, fornecedor.toString());
            }
        
        }else if(acao.getSource() == telaFornecedor.getSair()){
            telaFornecedor.dispose();
                    
        }
        
    
    }
}
