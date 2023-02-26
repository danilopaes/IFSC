
package Controller;

import View.FormBuscaCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaCidade implements ActionListener{
    FormBuscaCidade formBuscaCidade;

    public ControllerBuscaCidade(FormBuscaCidade formBuscaCidade) {
        this.formBuscaCidade = formBuscaCidade;
        
        this.formBuscaCidade.getCarregar().addActionListener(this);
        this.formBuscaCidade.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaCidade.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaCidade.getSair()){
           this.formBuscaCidade.dispose();
        }
    }
}
