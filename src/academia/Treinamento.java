package academia;
public class Treinamento {
    private String nomePlano;
    private String descricao;
    private int duracaoPlano;
    private int frequenciaRecomendadatreinamento;
    private Instrutor instrutor;
    private Membro membro;

    public Treinamento() {
    }

    public Treinamento(String nomePlano, String descricao, int duracaoPlano,
            int frequenciaRecomendadatreinamento, Instrutor instrutor, Membro membro) {
        this.nomePlano = nomePlano;
        this.descricao = descricao;
        this.duracaoPlano = duracaoPlano;
        this.frequenciaRecomendadatreinamento = frequenciaRecomendadatreinamento;
        this.instrutor = instrutor;
        this.membro = membro;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoPlano() {
        return duracaoPlano;
    }

    public void setDuracaoPlano(int duracaoPlano) {
        this.duracaoPlano = duracaoPlano;
    }

    public int getFrequenciaRecomendadatreinamento() {
        return frequenciaRecomendadatreinamento;
    }

    public void setFrequenciaRecomendadatreinamento(int frequenciaRecomendadatreinamento) {
        this.frequenciaRecomendadatreinamento = frequenciaRecomendadatreinamento;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
}
