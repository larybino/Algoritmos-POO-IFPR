package turismo;
public class Seguranca {
    private String equipeSeguranca;
    private String protocoloSeguranca;
    private String medidasEmergencia;
    private String informacoesAreasSeguras;
    private String comunicacaoEmergencias;

    public Seguranca(String equipeSeguranca, String protocoloSeguranca, String medidasEmergencia, String informacoesAreasSeguras, String comunicacaoEmergencias) {
        this.equipeSeguranca = equipeSeguranca;
        this.protocoloSeguranca = protocoloSeguranca;
        this.medidasEmergencia = medidasEmergencia;
        this.informacoesAreasSeguras = informacoesAreasSeguras;
        this.comunicacaoEmergencias = comunicacaoEmergencias;
    }

    public String getEquipeSeguranca() {
        return equipeSeguranca;
    }

    public void setEquipeSeguranca(String equipeSeguranca) {
        this.equipeSeguranca = equipeSeguranca;
    }

    public String getProtocoloSeguranca() {
        return protocoloSeguranca;
    }

    public void setProtocoloSeguranca(String protocoloSeguranca) {
        this.protocoloSeguranca = protocoloSeguranca;
    }

    public String getMedidasEmergencia() {
        return medidasEmergencia;
    }

    public void setMedidasEmergencia(String medidasEmergencia) {
        this.medidasEmergencia = medidasEmergencia;
    }

    public String getInformacoesAreasSeguras() {
        return informacoesAreasSeguras;
    }

    public void setInformacoesAreasSeguras(String informacoesAreasSeguras) {
        this.informacoesAreasSeguras = informacoesAreasSeguras;
    }

    public String getComunicacaoEmergencias() {
        return comunicacaoEmergencias;
    }

    public void setComunicacaoEmergencias(String comunicacaoEmergencias) {
        this.comunicacaoEmergencias = comunicacaoEmergencias;
    }
}
