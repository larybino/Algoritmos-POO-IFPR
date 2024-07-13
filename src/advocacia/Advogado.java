package advocacia;
import java.util.List;

public class Advogado {
    private String nome;
    private String areaEspecializacao;
    private List<Processo> processosAtribuidos;
    private int horasTrabalhadas;
    
    public Advogado() {
    }

    public Advogado(String nome, String areaEspecializacao, List<Processo> processosAtribuidos, int horasTrabalhadas) {
        this.nome = nome;
        this.areaEspecializacao = areaEspecializacao;
        this.processosAtribuidos = processosAtribuidos;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public List<Processo> getProcessosAtribuidos() {
        return processosAtribuidos;
    }

    public void setProcessosAtribuidos(List<Processo> processosAtribuidos) {
        this.processosAtribuidos = processosAtribuidos;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
