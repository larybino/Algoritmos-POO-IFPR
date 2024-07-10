package turismo;
public class Passeio {
    private String nome;
    private String descricao;
    private int duracao;
    private String localizacao;
    private double preco;
    private String disponibilidade;
    
    public Passeio() {
    }
    
    public Passeio(String nome, String descricao, int duracao, String localizacao, double preco,
            String disponibilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.localizacao = localizacao;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
