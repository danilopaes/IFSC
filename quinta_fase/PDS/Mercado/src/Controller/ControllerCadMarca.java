package Controller;

import ModelBO.Marca;
import View.FormBuscaMarca;
import View.ViewCadastroMarca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControllerCadMarca implements ActionListener{
    ViewCadastroMarca telaMarca;  
    
    public ControllerCadMarca(ViewCadastroMarca telaMarca){
        
        this.telaMarca = telaMarca;
        
        telaMarca.getNovo().addActionListener(this);
        telaMarca.getCancelar().addActionListener(this);
        telaMarca.getGravar().addActionListener(this);
        telaMarca.getBuscar().addActionListener(this);
        telaMarca.getSair().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaMarca.getNovo()){
            telaMarca.ativa(false);
            telaMarca.ligaDesliga(false);
            telaMarca.getTextoId().setEnabled(false);
            telaMarca.getTextoDescricao().requestFocus();
            
        }else if(acao.getSource() == telaMarca.getCancelar()){
            telaMarca.ativa(true);
            telaMarca.ligaDesliga(false);
            
        
        }else if(acao.getSource() == telaMarca.getBuscar()){
            
            FormBuscaMarca telaBuscaMarca = new FormBuscaMarca();
            ControllerBuscaMarca controllerBuscaMarca = new ControllerBuscaMarca(telaBuscaMarca);
            telaBuscaMarca.setVisible(true);
            
        }else if(acao.getSource() == telaMarca.getGravar()){
            if(telaMarca.getTextoDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            }else{
                
                Marca marca = new Marca();
                marca.setDescricao(telaMarca.getTextoDescricao().getText());
                
                telaMarca.ativa(true);
                telaMarca.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, marca.toString());
            }
        
        }else if(acao.getSource() == telaMarca.getSair()){
            telaMarca.dispose();
                    
        }
    
    }
}
