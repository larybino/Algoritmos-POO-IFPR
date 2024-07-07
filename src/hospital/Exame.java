package hospital;
public class Exame {
    private String tipoExame;
    private String resultados;
    private String data;
    private String hora;
    private Paciente paciente;
    
    public Exame() {
    }
    
    public Exame(String tipoExame, String resultados, String data, String hora, Paciente paciente) {
        this.tipoExame = tipoExame;
        this.resultados = resultados;
        this.data = data;
        this.hora = hora;
        this.paciente=paciente;
    }
    
    public String getTipoExame() {
        return tipoExame;
    }
    
    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }
    
    public String getResultados() {
        return resultados;
    }
    
    public void setResultados(String resultados) {
        this.resultados = resultados;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
