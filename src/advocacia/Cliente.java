package advocacia;
import java.util.List;

public class Cliente {
    private String nome;
    private String informacoesContato;
    private String endereco;
    private String CPF;
    private List<Processo> processosAssociados;
    
    public Cliente(String nome, String informacoesContato, String endereco, String cPF, List<Processo> processosAssociados) {
        this.nome = nome;
        this.informacoesContato = informacoesContato;
        this.endereco = endereco;
        CPF = cPF;
        this.processosAssociados = processosAssociados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformacoesContato() {
        return informacoesContato;
    }

    public void setInformacoesContato(String informacoesContato) {
        this.informacoesContato = informacoesContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public List<Processo> getProcessosAssociados() {
        return processosAssociados;
    }

    public void setProcessosAssociados(List<Processo> processosAssociados) {
        this.processosAssociados = processosAssociados;
    }

    
}
