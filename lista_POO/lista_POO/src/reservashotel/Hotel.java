package reservashotel;

import java.util.ArrayList;
import java.util.List;

//Hotel -> Quarto,Hospede,Reserva
//Hotel váriaveis -> (nome,qtdFuncionarios,qtdQuartos,Quarto,Hospede,Reserva)

public class Hotel {
    private String nome;
    private int qtdFuncionarios;
    private int qtdQuartos;
    private Quarto[] quarto = new Quarto[qtdQuartos];
    private List<Hospede> hospede = new ArrayList<Hospede>();
    private List<Reserva> reserva = new ArrayList<Reserva>();
    
    public Hotel(){

    }
    
    public Hotel(String nome, int qtdFuncionarios, int qtdQuartos, Quarto[] quarto, List<Hospede> hospede,
            List<Reserva> reserva) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.qtdQuartos = qtdQuartos;
        this.quarto = quarto;
        this.hospede = hospede;
        this.reserva = reserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncioarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncioarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public Quarto[] getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto[] quarto) {
        this.quarto = quarto;
    }

    public List<Hospede> getHospede() {
        return hospede;
    }

    public void setHospede(List<Hospede> hospede) {
        this.hospede = hospede;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }


}
