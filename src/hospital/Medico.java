package hospital;
public class Medico {
    private String nome;
    private String especialidade;
    private int registroProfissional;
    private String horario;
    
    public Medico() {
    }
    
    public Medico(String nome, String especialidade, int registroProfissional, String horario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    } 

    
}
