package ModelBO;
import java.util.UUID;
import java.util.Date;
public class HistoricoMovimentacao {
    private UUID id;
    
    private Date data;
    
    private String hora;
    
    private float qnt;
    
    private char tipo;
    private char status;

    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(UUID id, Date data, String hora, float qnt, char tipo, char status) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.qnt = qnt;
        this.tipo = tipo;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getQnt() {
        return qnt;
    }

    public void setQnt(float qnt) {
        this.qnt = qnt;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id:" + this.getId() + ";\n data:" + this.getData() 
                + "; \n hora:" + this.getHora() + ";\n qnt:" 
                + this.getQnt() + ";\n tipo:" + this.getTipo() + ";\n status:" + this.getStatus();
    }
    
    
    
}
