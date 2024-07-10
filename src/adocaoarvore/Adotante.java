package adocaoarvore;
import java.util.ArrayList;
import java.util.List;

public class Adotante {
    private String nome;
    private String informacoesContato;
    private String contribuicoes;
    private List<Arvore> arvoresAdotadas;


    public Adotante(String nome, String informacoesContato, String contribuicoes) {
        this.nome = nome;
        this.informacoesContato = informacoesContato;
        this.contribuicoes = contribuicoes;
        this.arvoresAdotadas = new ArrayList<>();

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContribuicoes() {
        return contribuicoes;
    }
    public void setContribuicoes(String contribuicoes) {
        this.contribuicoes = contribuicoes;
    }

    public String getInformacoesContato() {
        return informacoesContato;
    }

    public void setInformacoesContato(String informacoesContato) {
        this.informacoesContato = informacoesContato;
    }

    public List<Arvore> getArvoresAdotadas() {
        return arvoresAdotadas;
    }

    public void setArvoresAdotadas(List<Arvore> arvoresAdotadas) {
        this.arvoresAdotadas = arvoresAdotadas;
    }

    public void adotarArvore(Arvore arvore) {
        arvoresAdotadas.add(arvore);
    }

    public void registrarCuidadoArvore(Arvore arvore, Cuidado cuidado) {
        if (arvoresAdotadas.contains(arvore)) {
            arvore.registrarCuidado(cuidado);
        }
    }
}
