package ModelBO;
import java.util.Date;
public class Compra {
    private int id;
    
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalNF;
    
    private Date dataCompra;
    
    private String hora; 
    private String numeroNF;
    private String tipoNF;
    
    private char status;

    public Compra() {
    }

    public Compra(int id, float valorDesconto, float valorAcrescimo, float totalNF, Date dataCompra, String hora, String numeroNF, String tipoNF, char status) {
        this.id = id;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.dataCompra = dataCompra;
        this.hora = hora;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float vlorDesconto) {
        this.valorDesconto = vlorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() +";\n"+
                this.getDataCompra() +";\n"+
                this.getNumeroNF() +";\n"+
                this.getTipoNF() +";\n"+
                this.getTotalNF() +";\n"+
                this.getValorAcrescimo() +";\n"+
                this.getValorDesconto() +";\n"+
                this.getHora() +";\n"+
                this.getStatus();
    }

    
 
}
