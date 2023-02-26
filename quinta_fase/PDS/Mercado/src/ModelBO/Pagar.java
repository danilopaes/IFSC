package ModelBO;
import java.util.Date;
public class Pagar {
  
    private int id;
    
    private String horaEmissao;
    
    private Date dataEmissao;
    private Date dataVencimento;
    
    private float valorPagar;
    
    private char status;

    public Pagar() {
    }

    public Pagar(int id, String horaEmissao, Date dataEmissao, Date dataVencimento, float valorPagar, char status) {
        this.id = id;
        this.horaEmissao = horaEmissao;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPagar = valorPagar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(String horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() +"; \n"+
                this.getHoraEmissao() +"; \n"+
                this.getDataEmissao() +"; \n"+ 
                this.getDataVencimento() +"; \n"+
                this.getValorPagar() +"; \n"+
                this.getStatus();
    }
    
    
}
