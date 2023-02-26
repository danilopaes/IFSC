package Controller;

import ModelBO.Bairro;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.ViewCadastroBairro;
import View.FormBuscaBairro;
import javax.swing.JOptionPane;

public class ControllerCadBairro implements ActionListener{
    ViewCadastroBairro telaBairro;  
    
    public ControllerCadBairro(ViewCadastroBairro telaBairro){
        
        this.telaBairro = telaBairro;
        
        telaBairro.getNovo().addActionListener(this);
        telaBairro.getCancelar().addActionListener(this);
        telaBairro.getGravar().addActionListener(this);
        telaBairro.getBuscar().addActionListener(this);
        telaBairro.getSair().addActionListener(this);
        
    }

    /**
     *
     * @param acao
     */
    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaBairro.getNovo()) {
            telaBairro.ativa(false);
            telaBairro.ligaDesliga(false);
            telaBairro.getTextoId().setEnabled(false);
            telaBairro.getTextoDescricao().requestFocus();
            
        } else if (acao.getSource() == telaBairro.getCancelar()) {
            telaBairro.ativa(true);
            telaBairro.ligaDesliga(false);
            
        } else if (acao.getSource() == telaBairro.getBuscar()) {
            FormBuscaBairro telaBuscaBairro = new FormBuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro);
            telaBuscaBairro.setVisible(true);
        
        } else if (acao.getSource() == telaBairro.getGravar()) {
            if (telaBairro.getTextoDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Bairro bairro = new Bairro();
                bairro.setDescricao(telaBairro.getTextoDescricao().getText());
                
                telaBairro.ativa(true);
                telaBairro.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, bairro.toString());
            }
        } else if(acao.getSource() == telaBairro.getSair()) {
            telaBairro.dispose();        
        }
    }
}
