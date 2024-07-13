package hotel;
class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private String dataCheckIn;
    private String dataCheckOut;

    public Reserva() {
    }

    public Reserva(Hospede hospede, Quarto quarto, String dataCheckIn, String dataCheckOut) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }
}