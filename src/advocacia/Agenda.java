package advocacia;
public class Agenda {
    private String data;
    private String hora;
    private String descricaoCompromisso;
    private Advogado advogado;
    
    public Agenda(String data, String hora, String descricaoCompromisso, Advogado advogado) {
        this.data = data;
        this.hora = hora;
        this.descricaoCompromisso = descricaoCompromisso;
        this.advogado = advogado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricaoCompromisso() {
        return descricaoCompromisso;
    }

    public void setDescricaoCompromisso(String descricaoCompromisso) {
        this.descricaoCompromisso = descricaoCompromisso;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    } 

}
