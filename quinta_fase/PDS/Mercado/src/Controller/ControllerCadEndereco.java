package Controller;

import ModelBO.Endereco;
import View.FormBuscaEndereco;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.ViewCadastroEndereco;
import javax.swing.JOptionPane;

public class ControllerCadEndereco implements ActionListener {
    ViewCadastroEndereco telaEndereco;
    
    public ControllerCadEndereco(ViewCadastroEndereco telaEndereco) {
        this.telaEndereco = telaEndereco;
        
        telaEndereco.getNovo().addActionListener(this);
        telaEndereco.getCancelar().addActionListener(this);
        telaEndereco.getGravar().addActionListener(this);
        telaEndereco.getBuscar().addActionListener(this);
        telaEndereco.getSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaEndereco.getNovo()) {
            telaEndereco.ativa(false);
            telaEndereco.ligaDesliga(false);
            telaEndereco.getjTextFieldLogradouro().setText("");
            telaEndereco.getjTextFieldCEP().setText("");
            
        } else if (acao.getSource() == telaEndereco.getCancelar()) {
            telaEndereco.ativa(true);
            telaEndereco.ligaDesliga(false);
            
        } else if (acao.getSource() == telaEndereco.getBuscar()) {
        
            FormBuscaEndereco telaBuscaEndereco = new FormBuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);
            telaBuscaEndereco.setVisible(true);
            
        } else if (acao.getSource() == telaEndereco.getGravar()) {
            if (telaEndereco.getjTextFieldLogradouro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Logradouro é Obrigatório");
            } else if (telaEndereco.getjTextFieldCEP().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo CEP é Obrigatório");
            } else {
                Endereco endereco = new Endereco();
                endereco.setLogradouro(telaEndereco.getjTextFieldLogradouro().getText());
                endereco.setCep(telaEndereco.getjTextFieldCEP().getText());
                telaEndereco.ativa(true);
                telaEndereco.ligaDesliga(true);
            }
        } else if(acao.getSource() == telaEndereco.getSair()) {
            telaEndereco.dispose();        
        }
    }
}
