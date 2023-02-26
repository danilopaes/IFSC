package Controller;

import ModelBO.Colaborador;
import View.FormBuscaColaborador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.ViewCadastroColaborador;
import javax.swing.JOptionPane;

public class ControllerCadColaborador implements ActionListener {
    
    ViewCadastroColaborador telaColaborador;
    
    public ControllerCadColaborador(ViewCadastroColaborador telaColaborador) {
        this.telaColaborador = telaColaborador;
        
        telaColaborador.getNovo().addActionListener(this);
        telaColaborador.getCancelar().addActionListener(this);
        telaColaborador.getGravar().addActionListener(this);
        telaColaborador.getBuscar().addActionListener(this);
        telaColaborador.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaColaborador.getNovo()) {
            telaColaborador.ativa(false);
            telaColaborador.ligaDesliga(false);
            telaColaborador.getjTextFieldNome().setText("");
            telaColaborador.getjTextFieldEmail().setText("");
            telaColaborador.getjTextFieldTelefone().setText("");
            telaColaborador.getjTextFieldCelular().setText("");
            telaColaborador.getjTextFieldLogin().setText("");
            telaColaborador.getjTextFieldSenha().setText("");
            telaColaborador.getjTextFieldVerificaSenha().setText("");
            telaColaborador.getjTextFieldEndereco().setText("");
            telaColaborador.getjTextFieldComplemento().setText("");
            telaColaborador.getjTextFieldObservacao().setText("");
            telaColaborador.getjTextFieldDataCadastro().setText("");
            telaColaborador.getjComboBoxStatus().setSelectedIndex(0);

            
        } else if (acao.getSource() == telaColaborador.getCancelar()) {
            telaColaborador.ativa(true);
            telaColaborador.ligaDesliga(false);
            
        } else if (acao.getSource() == telaColaborador.getBuscar()) {
            
            FormBuscaColaborador telaBuscaColaborador = new FormBuscaColaborador();
            ControllerBuscaColaborador controllerBuscaColaborador = new ControllerBuscaColaborador(telaBuscaColaborador);
            telaBuscaColaborador.setVisible(true);
            
        } else if (acao.getSource() == telaColaborador.getGravar()) {
            if (telaColaborador.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Nome é Obrigatório");
            } else if (telaColaborador.getjTextFieldEmail().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo E-mail é Obrigatório");
            } else if (telaColaborador.getjTextFieldEmail().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo E-mail é Obrigatório");
            } else if (telaColaborador.getjTextFieldLogin().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Login é Obrigatório");
            } else if (telaColaborador.getjTextFieldSenha().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Senha é Obrigatório");
            } else if (telaColaborador.getjTextFieldVerificaSenha().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Verifica Senha é Obrigatório");
            } else {
                Colaborador colaborador = new Colaborador();
                colaborador.setNome(telaColaborador.getjTextFieldNome().getText());
                colaborador.setEmail(telaColaborador.getjTextFieldEmail().getText());
                colaborador.setFone1(telaColaborador.getjTextFieldTelefone().getText());
                colaborador.setFone2(telaColaborador.getjTextFieldCelular().getText());
                colaborador.setLogin(telaColaborador.getjTextFieldLogin().getText());
                colaborador.setSenha(telaColaborador.getjTextFieldSenha().getText());
                colaborador.setComplementoEndereco(telaColaborador.getjTextFieldComplemento().getText());
                colaborador.setObservacao(telaColaborador.getjTextFieldObservacao().getText());
                
                if(telaColaborador.getjComboBoxStatus().getSelectedIndex() == 0){
                    colaborador.setStatus('1');
                }else{                   

                    colaborador.setStatus('0');
                }
             
                
                telaColaborador.ativa(true);
                telaColaborador.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, colaborador.toString());
                
            }
        } else if(acao.getSource() == telaColaborador.getSair()) {
            telaColaborador.dispose();        
        }
    }
    
}
