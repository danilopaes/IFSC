package ModelBO;
public class CondicaoPgto {
    
   private int id;
   private int numeroParcelas;
   private int diasPrimeiraParcela;
   private int diaEntreParcela;
   
   private char status;
   
   private String descricaoCondicao;

    public CondicaoPgto() {
    }

    public CondicaoPgto(int id, int numeroParcelas, int diasPrimeiraParcela, int diaEntreParcela, char status, String descricaoCondicao) {
        this.id = id;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diaEntreParcela = diaEntreParcela;
        this.status = status;
        this.descricaoCondicao = descricaoCondicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getDiasPrimeiraParcela() {
        return diasPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
        this.diasPrimeiraParcela = diasPrimeiraParcela;
    }

    public int getDiaEntreParcela() {
        return diaEntreParcela;
    }

    public void setDiaEntreParcela(int diaEntreParcela) {
        this.diaEntreParcela = diaEntreParcela;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getDescricaoCondicao() {
        return descricaoCondicao;
    }

    public void setDescricaoCondicao(String descricaoCondicao) {
        this.descricaoCondicao = descricaoCondicao;
    }

    @Override
    public String toString() {
        return this.getId() + ";\n" + 
                this.getNumeroParcelas() + ";\n" + 
                this.getDiasPrimeiraParcela() + "; \n" + 
                this.getDiaEntreParcela() + "; \n" + 
                this.getStatus() + "; \n" + 
                this.getDescricaoCondicao();
    }
   
   
}