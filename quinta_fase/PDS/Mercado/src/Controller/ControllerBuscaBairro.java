package Controller;

import View.FormBuscaBairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaBairro implements ActionListener{
    
    FormBuscaBairro formBuscaBairro;

    public ControllerBuscaBairro(FormBuscaBairro formBuscaBairro) {
        this.formBuscaBairro = formBuscaBairro;
        
        this.formBuscaBairro.getCarregar().addActionListener(this);
        this.formBuscaBairro.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaBairro.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaBairro.getSair()){
           
        }
    }
}
