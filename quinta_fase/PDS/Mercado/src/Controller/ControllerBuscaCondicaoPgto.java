package Controller;

import View.FormBuscaCondicaoPgto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaCondicaoPgto implements ActionListener{
    FormBuscaCondicaoPgto formBuscaPgto;

    public ControllerBuscaCondicaoPgto(FormBuscaCondicaoPgto formBuscaPgto) {
        this.formBuscaPgto = formBuscaPgto;
        
        this.formBuscaPgto.getCarregar().addActionListener(this);
        this.formBuscaPgto.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaPgto.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaPgto.getSair()){
           this.formBuscaPgto.dispose();
        }
    }
}
