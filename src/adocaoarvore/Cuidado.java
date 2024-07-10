package adocaoarvore;
public class Cuidado {
    private String tipoCuidado;
    private String data;
    private String descricao;
    
    public Cuidado(String tipoCuidado, String data, String descricao) {
        this.tipoCuidado = tipoCuidado;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
