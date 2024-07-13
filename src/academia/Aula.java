package academia;
public class Aula {
    private String tipoAula;
    private String horario;
    private int duracao;
    private int capacidadeMaximaParticipantes;
    private Instrutor instrutor;
    
    public Aula() {
    }

    public Aula(String tipoAula, String horario, int duracao, int capacidadeMaximaParticipantes, Instrutor instrutor) {
        this.tipoAula = tipoAula;
        this.horario = horario;
        this.duracao = duracao;
        this.capacidadeMaximaParticipantes = capacidadeMaximaParticipantes;
        this.instrutor=instrutor;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getCapacidadeMaximaParticipantes() {
        return capacidadeMaximaParticipantes;
    }

    public void setCapacidadeMaximaParticipantes(int capacidadeMaximaParticipantes) {
        this.capacidadeMaximaParticipantes = capacidadeMaximaParticipantes;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

}
