package redesocial;
public class Seguidor {
    private String seguidor;
    private String dataInicioSeguimento;
    private String statusSeguimento;
    private String dataTerminoSeguimento;
    
    public Seguidor() {
    }
    
    public Seguidor(String seguidor, String dataInicioSeguimento, String statusSeguimento,
            String dataTerminoSeguimento) {
        this.seguidor = seguidor;
        this.dataInicioSeguimento = dataInicioSeguimento;
        this.statusSeguimento = statusSeguimento;
        this.dataTerminoSeguimento = dataTerminoSeguimento;
    }

    public String getSeguidor() {
        return seguidor;
    }

    public void setSeguidor(String seguidor) {
        this.seguidor = seguidor;
    }

    public String getDataInicioSeguimento() {
        return dataInicioSeguimento;
    }

    public void setDataInicioSeguimento(String dataInicioSeguimento) {
        this.dataInicioSeguimento = dataInicioSeguimento;
    }

    public String getStatusSeguimento() {
        return statusSeguimento;
    }

    public void setStatusSeguimento(String statusSeguimento) {
        this.statusSeguimento = statusSeguimento;
    }

    public String getDataTerminoSeguimento() {
        return dataTerminoSeguimento;
    }

    public void setDataTerminoSeguimento(String dataTerminoSeguimento) {
        this.dataTerminoSeguimento = dataTerminoSeguimento;
    }

}
