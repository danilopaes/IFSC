package Controller;

import View.FormBuscaFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBuscaFornecedor implements ActionListener{
    FormBuscaFornecedor formBuscaFornecedor;

    public ControllerBuscaFornecedor(FormBuscaFornecedor formBuscaFornecedor) {
        this.formBuscaFornecedor = formBuscaFornecedor;
        
        this.formBuscaFornecedor.getCarregar().addActionListener(this);
        this.formBuscaFornecedor.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao){
        if(acao.getSource() == this.formBuscaFornecedor.getCarregar()){
           
        }else if(acao.getSource() == this.formBuscaFornecedor.getSair()){
           this.formBuscaFornecedor.dispose();
        }
    }
}
