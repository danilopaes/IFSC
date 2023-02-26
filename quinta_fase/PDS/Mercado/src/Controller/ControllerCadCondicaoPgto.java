package Controller;

import ModelBO.CondicaoPgto;
import View.FormBuscaCondicaoPgto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.ViewCadastroCondicaoPgto;
import javax.swing.JOptionPane;

public class ControllerCadCondicaoPgto implements ActionListener {

    ViewCadastroCondicaoPgto telaCondicaoPgto;
    
    public ControllerCadCondicaoPgto(ViewCadastroCondicaoPgto telaCondicaoPgto) {
        this.telaCondicaoPgto = telaCondicaoPgto;
        
        telaCondicaoPgto.getNovo().addActionListener(this);
        telaCondicaoPgto.getCancelar().addActionListener(this);
        telaCondicaoPgto.getGravar().addActionListener(this);
        telaCondicaoPgto.getBuscar().addActionListener(this);
        telaCondicaoPgto.getSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCondicaoPgto.getNovo()) {
            telaCondicaoPgto.ativa(false);
            telaCondicaoPgto.ligaDesliga(false);
            telaCondicaoPgto.getjTextFieldDescricao().setText("");
            telaCondicaoPgto.getjSpinnerQuantidadeParcelas().setValue(0);
            telaCondicaoPgto.getjSpinnerDiasPrimeiraPercela().setValue(0);
            telaCondicaoPgto.getjSpinnerDiasEntreParcelas().setValue(0);
            telaCondicaoPgto.getjComboBoxStatus().setSelectedIndex(0);
            
        } else if (acao.getSource() == telaCondicaoPgto.getCancelar()) {
            telaCondicaoPgto.ativa(true);
            telaCondicaoPgto.ligaDesliga(false);
            
        } else if (acao.getSource() == telaCondicaoPgto.getBuscar()) {
            
            FormBuscaCondicaoPgto telaBuscaPgto = new FormBuscaCondicaoPgto();
            ControllerBuscaCondicaoPgto controllerBuscaPgto = new ControllerBuscaCondicaoPgto(telaBuscaPgto);
            telaBuscaPgto.setVisible(true);
        
        } else if (acao.getSource() == telaCondicaoPgto.getGravar()) {
             
            if (telaCondicaoPgto.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else if (telaCondicaoPgto.getjSpinnerQuantidadeParcelas().getValue().equals(null)) {
                JOptionPane.showMessageDialog(null, "Atributo Quantidade de Parcelas é Obrigatório");
            } else if (telaCondicaoPgto.getjSpinnerDiasPrimeiraPercela().getValue().equals(null)) {
                JOptionPane.showMessageDialog(null, "Atributo Dias (Primeiras parcela) é Obrigatório");
            } else if (telaCondicaoPgto.getjSpinnerDiasEntreParcelas().getValue().equals(null)) {
                JOptionPane.showMessageDialog(null, "Atributo Dias (Entre parcelas) é Obrigatório");
            } else {
                CondicaoPgto condicaoPgto = new CondicaoPgto();
                condicaoPgto.setDescricaoCondicao(telaCondicaoPgto.getjTextFieldDescricao().getText());
                try{
                    condicaoPgto.setNumeroParcelas((int) telaCondicaoPgto.getjSpinnerQuantidadeParcelas().getValue());
                    condicaoPgto.setDiasPrimeiraParcela((int) telaCondicaoPgto.getjSpinnerDiasPrimeiraPercela().getValue());
                    condicaoPgto.setDiaEntreParcela((int) telaCondicaoPgto.getjSpinnerDiasEntreParcelas().getValue());
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Houive um erro nas parcelas");
                }
                
                if(telaCondicaoPgto.getjComboBoxStatus().getSelectedIndex() == 0){
                    condicaoPgto.setStatus('1');
                }else{                   

                    condicaoPgto.setStatus('0');
                }
                
                
                condicaoPgto.setDescricaoCondicao(telaCondicaoPgto.getjTextFieldDescricao().getText());
                
                telaCondicaoPgto.ativa(true);
                telaCondicaoPgto.ligaDesliga(true);
                
                JOptionPane.showMessageDialog(null, condicaoPgto.toString());
                
            }
        } else if(acao.getSource() == telaCondicaoPgto.getSair()) {
            telaCondicaoPgto.dispose();        
        }
    }
    
}
