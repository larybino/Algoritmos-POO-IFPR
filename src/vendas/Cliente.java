package vendas;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String email;
    private List <Carrinho> carrinhos;
    
    public Cliente() {
        this.carrinhos = new ArrayList<>();
        this.carrinhos.add(new Carrinho()); // Adiciona um carrinho inicial
    }
    
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.carrinhos = new ArrayList<>();
        this.carrinhos.add(new Carrinho()); // Adiciona um carrinho inicial

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List <Carrinho> getCarrinho() {
        return carrinhos;
    }

    public void adicionarCarrinho(Carrinho carrinho) {
        this.carrinhos.add(carrinho);
    }
    public Carrinho getCarrinhoAtual() {
        return carrinhos.get(0); // Retorna o primeiro carrinho para simplificação
    }

}
