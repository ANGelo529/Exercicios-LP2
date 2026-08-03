package reservashotel;

//Reserva váriaveis -> (codigo,dataCheckIn,dataCheckOut,numeroQuartoReservado)
public class Reserva {
    private int codigo;
    private int dataCheckIn;
    private int dataCheckOut;
    private int numeroQuartoReservado;

    public Reserva(){
    }

    public Reserva(int codigo, int dataCheckIn, int dataCheckOut, int numeroQuartoReservado) {
        this.codigo = codigo;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuartoReservado = numeroQuartoReservado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(int dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public int getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(int dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public int getNumeroQuartoReservado() {
        return numeroQuartoReservado;
    }

    public void setNumeroQuartoReservado(int numeroQuartoReservado) {
        this.numeroQuartoReservado = numeroQuartoReservado;
    }

}
