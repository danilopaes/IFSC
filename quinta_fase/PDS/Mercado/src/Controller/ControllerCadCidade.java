package Controller;

import ModelBO.Cidade;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.ViewCadastroCidade;
import View.FormBuscaCidade;
import javax.swing.JOptionPane;

public class ControllerCadCidade implements ActionListener{
    ViewCadastroCidade telaCidade;  
    
    /**
     *
     * @param telaCidade
     */
    public ControllerCadCidade(ViewCadastroCidade telaCidade){
        
        this.telaCidade = telaCidade;
        
        telaCidade.getNovo().addActionListener(this);
        telaCidade.getCancelar().addActionListener(this);
        telaCidade.getGravar().addActionListener(this);
        telaCidade.getBuscar().addActionListener(this);
        telaCidade.getSair().addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCidade.getNovo()) {
            telaCidade.ativa(false);
            telaCidade.ligaDesliga(false);
            telaCidade.getTextoId().setEnabled(false);
            telaCidade.getTextoDescricao().setText("");
            
        } else if (acao.getSource() == telaCidade.getCancelar()) {
            telaCidade.ativa(true);
            telaCidade.ligaDesliga(false);
            
        } else if (acao.getSource() == telaCidade.getBuscar()) {
            FormBuscaCidade telaBuscaCidade = new FormBuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscaCidade);
            telaBuscaCidade.setVisible(true);
        
        } else if (acao.getSource() == telaCidade.getGravar()) {
            if (telaCidade.getTextoDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Cidade cidade = new Cidade();
                cidade.setDescricao(telaCidade.getTextoDescricao().getText());
                
                telaCidade.ativa(true);
                telaCidade.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, cidade.toString());
                
            }
        } else if(acao.getSource() == telaCidade.getSair()) {
            telaCidade.dispose();        
        }
    }
}
