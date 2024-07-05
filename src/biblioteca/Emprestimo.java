package biblioteca;
public class Emprestimo {
    private String dataRetirada;
    private String dataDevolucao;
    private String status;
    
    public Emprestimo() {
    }
    
    public Emprestimo(String dataRetirada, String dataDevolucao, String status) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }
    

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
