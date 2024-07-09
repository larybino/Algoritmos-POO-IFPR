package vendas;
public class Produto {
    private String nomeProduto;
    private String escricaoProduto;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;
   
    public Produto() {
    }
  
    public Produto(String nomeProduto, String escricaoProduto, double preco, int quantidadeEstoque, String categoria) {
        this.nomeProduto = nomeProduto;
        this.escricaoProduto = escricaoProduto;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getEscricaoProduto() {
        return escricaoProduto;
    }

    public void setEscricaoProduto(String escricaoProduto) {
        this.escricaoProduto = escricaoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void diminuirEstoque(int quantidade){
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        }
    }

    public void aumentarEstoque(int quantidade){
        quantidadeEstoque+=quantidade;
    }
    
}
