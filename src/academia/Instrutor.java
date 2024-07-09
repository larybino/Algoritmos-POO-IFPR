package academia;
import java.util.List;
import java.util.ArrayList;

public class Instrutor {
    private String nome;
    private String horarioTrabalho;
    private List <Treinamento> treinamento;
    
    public Instrutor(String nome, String horarioTrabalho) {
        this.nome = nome;
        this.horarioTrabalho = horarioTrabalho;
        this.treinamento= new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public List<Treinamento> getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(List<Treinamento> treinamento) {
        this.treinamento = treinamento;
    }

   public void adicionarTreinamento(Treinamento treinamento){
        this.treinamento.add(treinamento);
   }

}
