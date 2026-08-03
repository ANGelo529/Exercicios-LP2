package reservashotel;

//Quarto váriaveis -> (numeroQuarto,tipo,mobilia,qtdMobilia,Hospede)
public class Quarto {
    private int numeroQuarto;
    private String tipo;
    private String[] mobilia;
    private int[] qtdMobilia;
    private Hospede hospede;

    public Quarto() {
    }

    public Quarto(int numeroQuarto, String tipo, String[] mobilia, int[] qtdMobilia, Hospede hospede) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
        this.mobilia = mobilia;
        this.qtdMobilia = qtdMobilia;
        this.hospede = hospede;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getMobilia() {
        return mobilia;
    }

    public void setMobilia(String[] mobilia) {
        this.mobilia = mobilia;
    }

    public int[] getQtdMobilia() {
        return qtdMobilia;
    }

    public void setQtdMobilia(int[] qtdMobilia) {
        this.qtdMobilia = qtdMobilia;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

}
