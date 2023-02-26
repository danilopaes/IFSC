package Controller;

import View.FormBuscaEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaEndereco implements ActionListener{
    FormBuscaEndereco formBuscaEndereco;

    public ControllerBuscaEndereco(FormBuscaEndereco formBuscaEndereco) {
        this.formBuscaEndereco = formBuscaEndereco;
        
        this.formBuscaEndereco.getCarregar().addActionListener(this);
        this.formBuscaEndereco.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaEndereco.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaEndereco.getSair()){
           this.formBuscaEndereco.dispose();
        }
    }
}
