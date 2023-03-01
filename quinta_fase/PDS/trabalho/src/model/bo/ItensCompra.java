package model.bo;
public class ItensCompra {
    
    private int id;
    private float qtdProduto;
    private float valorUnitarioProduto;
    private char status;
    private HistoricoMovimentacao historicoMovimentacao;
    private Compra compra;

    public ItensCompra() {
    }

    public ItensCompra(int id, float qtdProduto, float valorUnitarioProduto, char status, HistoricoMovimentacao historicoMovimentacao, Compra compra) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.historicoMovimentacao = historicoMovimentacao;
        this.compra = compra;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
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
        return "ItensCompra{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitarioProduto=" + valorUnitarioProduto + ", status=" + status + '}';
    }
    
    
    public String sqlConection (){
        return "qtdProduto, valorUnitarioProduto, status, historicoMovimentacao, compra";
    
    }
   
    
}
