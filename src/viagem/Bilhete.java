package viagem;

public class Bilhete {
    private int assento; 
    private int numeroBilhete;
    private String detalhes;
    
    public Bilhete() {
    }
    
    public Bilhete(int assento, int numeroBilhete, String detalhes) {
        this.assento = assento;
        this.numeroBilhete = numeroBilhete;
        this.detalhes = detalhes;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public int getNumeroBilhete() {
        return numeroBilhete;
    }

    public void setNumeroBilhete(int numeroBilhete) {
        this.numeroBilhete = numeroBilhete;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

}
