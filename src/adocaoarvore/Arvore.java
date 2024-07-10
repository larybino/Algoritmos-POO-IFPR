package adocaoarvore;
import java.util.ArrayList;
import java.util.List;

public class Arvore {
    private String especie;
    private String localizacao;
    private String saude;
    private int idade;
    private List<Cuidado> historicoCuidados;
    
    public Arvore(String especie, String localizacao, String saude, int idade) {
        this.especie = especie;
        this.localizacao = localizacao;
        this.saude = saude;
        this.idade = idade;
        this.historicoCuidados = new ArrayList<>();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Cuidado> getHistoricoCuidados() {
        return historicoCuidados;
    }

    public void setHistoricoCuidados(List<Cuidado> historicoCuidados) {
        this.historicoCuidados = historicoCuidados;
    }

    public void registrarCuidado(Cuidado cuidado) {
        historicoCuidados.add(cuidado);
    }

}
