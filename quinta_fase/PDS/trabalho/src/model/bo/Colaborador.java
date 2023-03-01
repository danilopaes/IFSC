package model.bo;

import java.util.Date;

public class Colaborador extends Pessoa {
    
    private String login;
    private String senha;

    public Colaborador() {
    }


    public Colaborador(String login, String senha, int id, String nome, String fone1, String fone2, String email, Date dtCadastro, String complementoEndereco, String observacao, char status, Endereco endereco) {
        super(id, nome, fone1, fone2, email, dtCadastro, complementoEndereco, observacao, status, endereco);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString()+ ";" + this.getLogin() + ";" + this.getSenha();
    }
    
     public String sqlConection() {
        return super.sqlConection() + "login, senha";    
    }
    
}
