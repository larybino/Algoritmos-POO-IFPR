package turismo;
public class Acomodacao {
    private String tipoAcomodacao;
    private String localizacao;
    private String disponibilidade;
    private int capacidadeOcupacao;
    private double preco;
    
    public Acomodacao() {
    }
    
    public Acomodacao(String tipoAcomodacao, String localizacao, String disponibilidade, int capacidadeOcupacao,
            double preco) {
        this.tipoAcomodacao = tipoAcomodacao;
        this.localizacao = localizacao;
        this.disponibilidade = disponibilidade;
        this.capacidadeOcupacao = capacidadeOcupacao;
        this.preco = preco;
    }

    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        this.tipoAcomodacao = tipoAcomodacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getCapacidadeOcupacao() {
        return capacidadeOcupacao;
    }

    public void setCapacidadeOcupacao(int capacidadeOcupacao) {
        this.capacidadeOcupacao = capacidadeOcupacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
