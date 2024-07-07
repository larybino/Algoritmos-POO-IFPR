package hospital;
public class Consulta {
    private String data;
    private String hora;
    private String tipoConsulta;
    private String prescricoesMedicas;
    private Paciente paciente;
    private Medico medico;
    
    public Consulta() {
    }
    
    public Consulta(String data, String hora, String tipoConsulta, String prescricoesMedicas, Paciente paciente, Medico medico) {
        this.data = data;
        this.hora = hora;
        this.tipoConsulta = tipoConsulta;
        this.prescricoesMedicas = prescricoesMedicas;
        this.paciente=paciente;
        this.medico=medico;
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

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getPrescricoesMedicas() {
        return prescricoesMedicas;
    }

    public void setPrescricoesMedicas(String prescricoesMedicas) {
        this.prescricoesMedicas = prescricoesMedicas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
}
