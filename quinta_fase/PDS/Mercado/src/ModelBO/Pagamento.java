package ModelBO;
import java.util.Date;
public class Pagamento {
    
   private int id;
   
   private Date dataPagamento;
   
   private String horaPagamento;
   
   private float valorDesconto;
   private float valorAcrescimo;
   private float valorPago;
   
   private char status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(String horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
   
   

    @Override
    public String toString() {
        return this.getId() + "; \n" +
                this.getDataPagamento() +"; \n"+
                this.getHoraPagamento() +"; \n"+
                this.getValorDesconto() +"; \n"+
                this.getValorAcrescimo() +"; \n"+
                this.getValorPago() +"; \n"+
                this.getStatus();
    }
   
}
