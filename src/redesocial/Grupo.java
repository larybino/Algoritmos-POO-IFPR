package redesocial;
public class Grupo {
    private String nomeGrupo;
    private String descricaoGrupo;
    private int membrosGrupo;
    private int publicacoesGrupo;
    
    public Grupo() {
    }
    
    public Grupo(String nomeGrupo, String descricaoGrupo, int membrosGrupo, int publicacoesGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.descricaoGrupo = descricaoGrupo;
        this.membrosGrupo = membrosGrupo;
        this.publicacoesGrupo = publicacoesGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    public void setDescricaoGrupo(String descricaoGrupo) {
        this.descricaoGrupo = descricaoGrupo;
    }

    public int getMembrosGrupo() {
        return membrosGrupo;
    }

    public void setMembrosGrupo(int membrosGrupo) {
        this.membrosGrupo = membrosGrupo;
    }

    public int getPublicacoesGrupo() {
        return publicacoesGrupo;
    }

    public void setPublicacoesGrupo(int publicacoesGrupo) {
        this.publicacoesGrupo = publicacoesGrupo;
    }

    

}
