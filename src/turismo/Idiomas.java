package turismo;
import java.util.ArrayList;

public class Idiomas {
    private ArrayList<String> idiomasSuportados;
    private String traducaoAutomatica;
    private ArrayList<String> dicionariosVocabulario;
    private String traducoesAnteriores;
    private String atualizacoesIdiomas;

    public Idiomas() {
    }

    public Idiomas(ArrayList<String> idiomasSuportados, String traducaoAutomatica, ArrayList<String> dicionariosVocabulario, String traducoesAnteriores, String atualizacoesIdiomas) {
        this.idiomasSuportados = idiomasSuportados;
        this.traducaoAutomatica = traducaoAutomatica;
        this.dicionariosVocabulario = dicionariosVocabulario;
        this.traducoesAnteriores = traducoesAnteriores;
        this.atualizacoesIdiomas = atualizacoesIdiomas;
    }

    public ArrayList<String> getIdiomasSuportados() {
        return idiomasSuportados;
    }

    public void setIdiomasSuportados(ArrayList<String> idiomasSuportados) {
        this.idiomasSuportados = idiomasSuportados;
    }

    public String getTraducaoAutomatica() {
        return traducaoAutomatica;
    }

    public void setTraducaoAutomatica(String traducaoAutomatica) {
        this.traducaoAutomatica = traducaoAutomatica;
    }

    public ArrayList<String> getDicionariosVocabulario() {
        return dicionariosVocabulario;
    }

    public void setDicionariosVocabulario(ArrayList<String> dicionariosVocabulario) {
        this.dicionariosVocabulario = dicionariosVocabulario;
    }

    public String getTraducoesAnteriores() {
        return traducoesAnteriores;
    }

    public void setTraducoesAnteriores(String traducoesAnteriores) {
        this.traducoesAnteriores = traducoesAnteriores;
    }

    public String getAtualizacoesIdiomas() {
        return atualizacoesIdiomas;
    }

    public void setAtualizacoesIdiomas(String atualizacoesIdiomas) {
        this.atualizacoesIdiomas = atualizacoesIdiomas;
    }
}
