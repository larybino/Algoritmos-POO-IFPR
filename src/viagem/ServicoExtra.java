package viagem;

public class ServicoExtra {
    private String tipo;
    private double preco;

    // Construtor
    public ServicoExtra(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
