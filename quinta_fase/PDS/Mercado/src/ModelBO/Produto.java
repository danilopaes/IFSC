package ModelBO;
import java.util.Date;
public class Produto {
    private int id;
    private int fatorConversao;
    
    private float valorCompra;
    private float valorVenda;
    private float estoqueMinimo;
    private float estoqueMaximo;
    
    private String undCompra;
    private String undVenda;
    private String barraEntrada;
    private String barraSaida;
    private String descricao;
    
    private Date dataCadastro;
    
    private char status;
    
    private Classe classe;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    private Marca marca;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getUndCompra() {
        return undCompra;
    }

    public void setUndCompra(String undCompra) {
        this.undCompra = undCompra;
    }

    public String getUndVenda() {
        return undVenda;
    }

    public void setUndVenda(String undVenda) {
        this.undVenda = undVenda;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id:" + this.getId() 
                + "; \n descrição: " + this.getDescricao() 
                + "; \n fatorConversao: " + this.getFatorConversao() 
                + ";\n valorCompra: " + this.getValorCompra() 
                + ";\n valorVenda: " + this.getValorVenda() 
                + ";\n estoqueMinimo: " + this.getEstoqueMinimo() 
                + ";\n estoqueMaximo: " + this.getEstoqueMaximo() 
                + ";\n undCompra: " + this.getUndCompra() 
                + ";\n undVenda: " + this.getUndVenda() 
                + ";\n barraEntrada: " + this.getBarraEntrada() 
                + ";\n barraSaida: " + this.getBarraSaida() 
                + ";\n dataCadastro: " + this.getDataCadastro() 
                + ";\n status: " + this.getStatus() ;
    }
    
}
