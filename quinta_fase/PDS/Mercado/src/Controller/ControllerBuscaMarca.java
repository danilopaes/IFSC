
package Controller;

import View.FormBuscaMarca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaMarca implements ActionListener{
    FormBuscaMarca formBuscaMarca;

    public ControllerBuscaMarca(FormBuscaMarca formBuscaMarca) {
        this.formBuscaMarca = formBuscaMarca;
        
        this.formBuscaMarca.getCarregar().addActionListener(this);
        this.formBuscaMarca.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaMarca.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaMarca.getSair()){
           this.formBuscaMarca.dispose();
        }
    }
}