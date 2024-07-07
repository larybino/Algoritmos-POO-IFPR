package hospital;
public class Leito {
    private int numeroLeito;
    private boolean ocupado;
    private String localizacao;

    public Leito() {
    }

    public Leito(int numeroLeito, boolean ocupado, String localizacao) {
        this.numeroLeito = numeroLeito;
        this.localizacao = localizacao;
        this.ocupado = false; // Por padrão, um leito começa desocupado
    }

    public int getNumeroLeito() {
        return numeroLeito;
    }

    public void setNumeroLeito(int numeroLeito) {
        this.numeroLeito = numeroLeito;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }



    // Método para atribuir um paciente ao leito
    public void atribuirPaciente(Paciente paciente) {
        if (!ocupado) {
            ocupado = true;
            System.out.println("Leito atribuído com sucesso a " + paciente.getNome());
        } else {
            System.out.println("Este leito já está ocupado.");
        }
    }

    // Método para liberar o leito
    public void liberarLeito() {
        if (ocupado) {
            ocupado = false;
            System.out.println("Leito liberado com sucesso.");
        } else {
            System.out.println("Este leito já está disponível.");
        }
    }
}
