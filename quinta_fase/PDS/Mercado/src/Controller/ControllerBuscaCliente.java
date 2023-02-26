package Controller;

import View.FormBuscaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaCliente implements ActionListener{
    
    FormBuscaCliente formBuscaCliente;

    public ControllerBuscaCliente(FormBuscaCliente formBuscaCliente) {
        this.formBuscaCliente = formBuscaCliente;
        
        this.formBuscaCliente.getCarregar().addActionListener(this);
        this.formBuscaCliente.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaCliente.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaCliente.getSair()){
           this.formBuscaCliente.dispose();
        }
    }
}
