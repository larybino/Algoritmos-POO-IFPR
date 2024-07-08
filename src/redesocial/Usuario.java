package redesocial;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private String nomeReal;
    private String informacoesPessoais;
    private List<Seguidor> amigosSeguidores;
    private List<Postagem> postagens;
    private List<Mensagem> mensagens;

    
    public Usuario() {
        this.amigosSeguidores = new ArrayList<>();
        this.postagens = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }
    
      public Usuario(String nomeUsuario, String nomeReal, String informacoesPessoais, List<Seguidor> amigosSeguidores) {
        this.nomeUsuario = nomeUsuario;
        this.nomeReal = nomeReal;
        this.informacoesPessoais = informacoesPessoais;
        this.amigosSeguidores = amigosSeguidores != null ? amigosSeguidores : new ArrayList<>();
        this.postagens = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeReal() {
        return nomeReal;
    }

    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }

    public String getInformacoesPessoais() {
        return informacoesPessoais;
    }

    public void setInformacoesPessoais(String informacoesPessoais) {
        this.informacoesPessoais = informacoesPessoais;
    }

    public List<Seguidor> getAmigosSeguidores() {
        return amigosSeguidores;
    }

    public void setAmigosSeguidores(List<Seguidor> amigosSeguidores) {
        this.amigosSeguidores = amigosSeguidores;
    }

    public void adicionarAmigoSeguidor(Seguidor seguidor) {
        amigosSeguidores.add(seguidor);
    }

    public void removerAmigoSeguidor(Seguidor seguidor) {
        amigosSeguidores.remove(seguidor);
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    public void adicionarPostagem(Postagem postagem) {
        this.postagens.add(postagem);
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    // Método para adicionar mensagem
    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }
}
