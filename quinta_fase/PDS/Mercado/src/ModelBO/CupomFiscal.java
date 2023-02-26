package ModelBO;

import java.util.UUID;
import java.util.Date;

public class CupomFiscal {
    private UUID id;

    private String horaVenda;

    private Date dataVenda;

    private float valorDesconto;
    private float valorAcrescimo;
    private float totalCupom;

    private char status;

    public CupomFiscal() {
    }
        

    public CupomFiscal(UUID id, String horaVenda, Date dataVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status) {
        this.id = id;
        this.horaVenda = horaVenda;
        this.dataVenda = dataVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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

    public float getTotalCupom() {
        return totalCupom;
    }

    public void setTotalCupom(float totalCupom) {
        this.totalCupom = totalCupom;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "hora Venda:" + this.getHoraVenda() + ";\n data Venda" + this.getDataVenda() + "; \n valor Desconto:" + this.getValorDesconto() + "; \n valor Desconto:" + this.getValorDesconto() + ';';
    }
    
	
	
}
