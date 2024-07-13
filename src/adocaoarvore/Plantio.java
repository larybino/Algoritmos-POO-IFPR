package adocaoarvore;
public class Plantio {
    private String localizacao;
    private String especie;
    private String dataPlantio;
    private String responsavelPlantio;
    private String condicoesSolo;
    private String condicoesClimaticas;
    
    public Plantio() {
    }

    public Plantio(String localizacao, String especie, String dataPlantio, String responsavelPlantio,
            String condicoesSolo, String condicoesClimaticas) {
        this.localizacao = localizacao;
        this.especie = especie;
        this.dataPlantio = dataPlantio;
        this.responsavelPlantio = responsavelPlantio;
        this.condicoesSolo = condicoesSolo;
        this.condicoesClimaticas = condicoesClimaticas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(String dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public String getResponsavelPlantio() {
        return responsavelPlantio;
    }

    public void setResponsavelPlantio(String responsavelPlantio) {
        this.responsavelPlantio = responsavelPlantio;
    }

    public String getCondicoesSolo() {
        return condicoesSolo;
    }

    public void setCondicoesSolo(String condicoesSolo) {
        this.condicoesSolo = condicoesSolo;
    }

    public String getCondicoesClimaticas() {
        return condicoesClimaticas;
    }

    public void setCondicoesClimaticas(String condicoesClimaticas) {
        this.condicoesClimaticas = condicoesClimaticas;
    }

}
