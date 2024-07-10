package adocaoarvore;
public class Adocao {
    private String adotante;
    private String arvore;
    private String data;
    private String status;
    
    public Adocao(String adotante, String arvore, String data, String status) {
        this.adotante = adotante;
        this.arvore = arvore;
        this.data = data;
        this.status = status;
    }

    public String getAdotante() {
        return adotante;
    }

    public void setAdotante(String adotante) {
        this.adotante = adotante;
    }

    public String getArvore() {
        return arvore;
    }

    public void setArvore(String arvore) {
        this.arvore = arvore;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
