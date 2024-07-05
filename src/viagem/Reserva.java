package viagem;

import java.util.ArrayList;

public class Reserva {
    private Cliente cliente;
    private Voo voo;
    private ArrayList<ServicoExtra> servicosExtras;
    private String codigoReserva;
    private int quantidadeAssentos;

    public Reserva(Cliente cliente, Voo voo, ArrayList<ServicoExtra> servicosExtras, String codigoReserva, int quantidadeAssentos) {
        this.cliente = cliente;
        this.voo = voo;
        this.servicosExtras = servicosExtras;
        this.codigoReserva = codigoReserva;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    // Getters e Setters para os demais atributos
    public Cliente getCliente() {
        return cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    public ArrayList<ServicoExtra> getServicosExtras() {
        return servicosExtras;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }
}
