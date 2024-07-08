package redesocial;
public class Mensagem {
    private String destinatario;
    private String conteudoMensagem;
    private String dataEnvio;
    private String horaEnvio;
    private String status;
    
    public Mensagem() {
    }
    
    public Mensagem(String destinatario, String conteudoMensagem, String dataEnvio, String horaEnvio, String status) {
        this.destinatario = destinatario;
        this.conteudoMensagem = conteudoMensagem;
        this.dataEnvio = dataEnvio;
        this.horaEnvio = horaEnvio;
        this.status = status;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudoMensagem() {
        return conteudoMensagem;
    }

    public void setConteudoMensagem(String conteudoMensagem) {
        this.conteudoMensagem = conteudoMensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
