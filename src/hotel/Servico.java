package hotel;
public class Servico {
    private String tipoServico;
    private String descricao;
    private double preco;
    private String disponibilidade;
    
    public Servico() {
    }

    public Servico(String tipoServico, String descricao, double preco, String disponibilidade) {
        this.tipoServico = tipoServico;
        this.descricao = descricao;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
