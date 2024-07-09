package academia;

public class Pagamento {
    private Membro membro;
    private double mensalidade;
    private String dataPagamento;

    public Pagamento(Membro membro, double mensalidade, String dataPagamento) {
        this.membro = membro;
        this.mensalidade = mensalidade;
        this.dataPagamento = dataPagamento;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public double getValor() {
        return mensalidade;
    }

    public void setValor(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
