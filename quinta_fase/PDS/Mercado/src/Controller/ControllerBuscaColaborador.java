package Controller;

import View.FormBuscaColaborador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerBuscaColaborador implements ActionListener{
    FormBuscaColaborador formBuscarColaborador;

    public ControllerBuscaColaborador(FormBuscaColaborador formBuscarColaborador) {
        this.formBuscarColaborador = formBuscarColaborador;
        
        this.formBuscarColaborador.getCarregar().addActionListener(this);
        this.formBuscarColaborador.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscarColaborador.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscarColaborador.getSair()){
           this.formBuscarColaborador.dispose();
        }
    }
}
