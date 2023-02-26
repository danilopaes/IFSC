package Controller;

import View.FormBuscaProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaProduto implements ActionListener{
    
    FormBuscaProduto formBuscaProduto;

    public ControllerBuscaProduto(FormBuscaProduto formBuscaProduto) {
        this.formBuscaProduto = formBuscaProduto;
        
        this.formBuscaProduto.getCarregar().addActionListener(this);
        this.formBuscaProduto.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaProduto.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaProduto.getSair()){
            this.formBuscaProduto.dispose();
        }
    }
}

