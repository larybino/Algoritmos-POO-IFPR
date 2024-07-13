package biblioteca;
public class Reserva {
    private String dataReserva;
    private String dataRetiradaDesejada;
    private String status;
    
    public Reserva() {
    }

    public Reserva(String dataReserva, String dataRetiradaDesejada, String status) {
        this.dataReserva = dataReserva;
        this.dataRetiradaDesejada = dataRetiradaDesejada;
        this.status = status;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataRetiradaDesejada() {
        return dataRetiradaDesejada;
    }

    public void setDataRetiradaDesejada(String dataRetiradaDesejada) {
        this.dataRetiradaDesejada = dataRetiradaDesejada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
