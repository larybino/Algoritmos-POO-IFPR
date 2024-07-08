package redesocial;
public class Postagem {
    private String conteudo; 
    private String dataPostagem;
    private String horaPostagem;
    private int curtidas;
    private int comentarios;
    
    public Postagem() {
    }
    
    public Postagem(String conteudo, String dataPostagem, String horaPostagem, int curtidas, int comentarios) {
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
        this.horaPostagem = horaPostagem;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public String getHoraPostagem() {
        return horaPostagem;
    }

    public void setHoraPostagem(String horaPostagem) {
        this.horaPostagem = horaPostagem;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }

    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    }

}
