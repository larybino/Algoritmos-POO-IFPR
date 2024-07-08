package advocacia;
import java.util.List;

public class Processo {
    private int numeroProcesso;
    private String descricaoCaso;
    private String dataAbertura;
    private String status;
    private List<Documento> documentosAssociados;
    
    public Processo(int numeroProcesso, String descricaoCaso, String dataAbertura, String status,
    List<Documento> documentosAssociados) {
        this.numeroProcesso = numeroProcesso;
        this.descricaoCaso = descricaoCaso;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.documentosAssociados = documentosAssociados;
    }

    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getDescricaoCaso() {
        return descricaoCaso;
    }

    public void setDescricaoCaso(String descricaoCaso) {
        this.descricaoCaso = descricaoCaso;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Documento> getDocumentosAssociados() {
        return documentosAssociados;
    }

    public void setDocumentosAssociados(List<Documento> documentosAssociados) {
        this.documentosAssociados = documentosAssociados;
    }

}
