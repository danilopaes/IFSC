package ModelBO;
import java.util.UUID;
public class ItensCompra {
    private UUID id;
    private float qntProduto;
    private float valorUnitarioProduto;
    private char status;

    public ItensCompra() {
    }

    public ItensCompra(UUID id, float qntProduto, float valorUnitarioProduto, char status) {
        this.id = id;
        this.qntProduto = qntProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(float qntProduto) {
        this.qntProduto = qntProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "ItensCupomFiscal:" + this.getId() + 
                "; \n qntProduto:" + this.getQntProduto() + 
                ";\n valorUnitarioProduto:" + this.getValorUnitarioProduto() +";";
    }
}
