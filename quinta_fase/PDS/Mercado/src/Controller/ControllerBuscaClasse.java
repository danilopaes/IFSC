
package Controller;

import View.FormBuscaClasse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaClasse implements ActionListener{
    FormBuscaClasse formBuscaClasse;

    public ControllerBuscaClasse(FormBuscaClasse formBuscaClasse) {
        this.formBuscaClasse = formBuscaClasse;
        
        this.formBuscaClasse.getCarregar().addActionListener(this);
        this.formBuscaClasse.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaClasse.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaClasse.getSair()){
           this.formBuscaClasse.dispose();
        }
    }
}
