
package Controller;

import ModelBO.Classe;
import View.ViewCadastroClasse;
import View.FormBuscaClasse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControllerCadClasse implements ActionListener{ 
    ViewCadastroClasse telaClasse;
    
    public ControllerCadClasse(ViewCadastroClasse telaClasse){
        
        this.telaClasse = telaClasse;
       
        telaClasse.getNovo().addActionListener(this);
        telaClasse.getCancelar().addActionListener(this);
        telaClasse.getGravar().addActionListener(this);
        telaClasse.getBuscar().addActionListener(this);
        telaClasse.getSair().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaClasse.getNovo()){
            telaClasse.ativa(false);
            telaClasse.ligaDesliga(false);
            telaClasse.getTextoId().setEnabled(false);
            telaClasse.getTextoDescricao().requestFocus();
            
        }else if(acao.getSource() == telaClasse.getCancelar()){
            telaClasse.ativa(true);
            telaClasse.ligaDesliga(false);
            
        
        }else if(acao.getSource() == telaClasse.getBuscar()){
            FormBuscaClasse telaBuscaClasse= new FormBuscaClasse();
            ControllerBuscaClasse controllerBuscaClasse = new ControllerBuscaClasse(telaBuscaClasse);
            telaBuscaClasse.setVisible(true);
        
        }else if(acao.getSource() == telaClasse.getGravar()){
            if(telaClasse.getTextoDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            }else{
                
                Classe classe = new Classe();
                classe.setDescricao(telaClasse.getTextoDescricao().getText());
                
                telaClasse.ativa(true);
                telaClasse.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, classe.toString());
            }
        
        }else if(acao.getSource() == telaClasse.getSair()){
            telaClasse.dispose();
                    
        }
        
    
    }
}
