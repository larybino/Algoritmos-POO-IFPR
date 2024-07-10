package turismo;
import java.util.ArrayList;
import java.util.List;

public class Turista {
    private String nome;
    private String origem;
    private String especie;
    private String dataChegada;
    private int periodoEstadia;
    private List<Passeio> passeios;
    private List<Acomodacao> acomodacoes;
    private List<Idiomas> idiomas;

    public Turista(String nome, String origem, String especie, String dataChegada, int periodoEstadia) {
        this.nome = nome;
        this.origem = origem;
        this.especie = especie;
        this.dataChegada = dataChegada;
        this.periodoEstadia = periodoEstadia;
        this.passeios = new ArrayList<>();
        this.acomodacoes = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getOrigem() {
        return origem;
    }

    public String getEspecie() {
        return especie;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public int getPeriodoEstadia() {
        return periodoEstadia;
    }

    public List<Passeio> getPasseios() {
        return passeios;
    }

    public void agendarPasseio(Passeio passeio) {
        passeios.add(passeio);
    }

    public List<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public void reservarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }

    public List<Idiomas> getIdiomas() {
        return idiomas;
    }

    public void adicionarIdioma(Idiomas idioma) {
        idiomas.add(idioma);
    }
}
