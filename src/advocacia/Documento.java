package advocacia;
public class Documento {
    private String tituloDcumento;
    private String tipoDocumento;
    private String dataCriacao;
    private String descricao;
    
    public Documento(String tituloDcumento, String tipoDocumento, String dataCriacao, String descricao) {
        this.tituloDcumento = tituloDcumento;
        this.tipoDocumento = tipoDocumento;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public String getTituloDcumento() {
        return tituloDcumento;
    }

    public void setTituloDcumento(String tituloDcumento) {
        this.tituloDcumento = tituloDcumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
