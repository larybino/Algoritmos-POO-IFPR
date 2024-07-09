package vendas;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private int total;
    private int quantidadeItens;
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>(); // Inicializa a lista no construtor padrão
    }

    public Carrinho(int total, int quantidadeItens) {
        this.total = total;
        this.quantidadeItens = quantidadeItens;
        this.produtos = new ArrayList<>(); // Inicializa a lista no outro construtor
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
