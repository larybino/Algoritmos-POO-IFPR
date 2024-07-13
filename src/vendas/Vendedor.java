package vendas;
import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nomeEmpresa;
    private String informacoesContato;
    private String estatisticasVendas;
    private String gestaoEstoque;
    private List <Produto> produtos;
    
    public Vendedor() {
    }
    
    public Vendedor(String nomeEmpresa, String informacoesContato, String estatisticasVendas, String gestaoEstoque) {
        this.nomeEmpresa = nomeEmpresa;
        this.informacoesContato = informacoesContato;
        this.estatisticasVendas = estatisticasVendas;
        this.gestaoEstoque = gestaoEstoque;
        this.produtos = new ArrayList<>(); 

    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getInformacoesContato() {
        return informacoesContato;
    }

    public void setInformacoesContato(String informacoesContato) {
        this.informacoesContato = informacoesContato;
    }

    public String getEstatisticasVendas() {
        return estatisticasVendas;
    }

    public void setEstatisticasVendas(String estatisticasVendas) {
        this.estatisticasVendas = estatisticasVendas;
    }

    public String getGestaoEstoque() {
        return gestaoEstoque;
    }

    public void setGestaoEstoque(String gestaoEstoque) {
        this.gestaoEstoque = gestaoEstoque;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
