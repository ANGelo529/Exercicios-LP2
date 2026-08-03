package reservashotel;

import java.util.ArrayList;
import java.util.List;

//------------Linha lógica das classe------------
//Cidade -> Hotel
//Hotel -> Quarto,Hospede,Reserva

//------------Variaveis das classe------------
//Cidade váriaveis -> (nome,regiao,estado,pontosTuristicos,qtdCidadaos,Hotel)
//Hotel váriaveis -> (nome,qtdFuncionarios,qtdQuartos,Quarto,Hospede,Reserva)
//Quarto váriaveis -> (numeroQuarto,tipo,mobilia,qtdMobilia,Hospede)
//Hospede váriaveis -> (nome,sobrenome,cpf,telefone,checkIn,checkOut,pessoaPQuarto,qtdQuartos)
//Reserva váriaveis -> (codigo,dataCheckIn,dataCheckOut,numeroQuartoReservado)

public class Cidade {
    private String nome;
    private String regiao;
    private String estado;
    private String pontosTuristicos;
    private int qtdCidadaos;
    private List<Hotel> hotel = new ArrayList<Hotel>();

    public Cidade(){
    }
    
    public Cidade(String nome, String regiao, String estado, String pontosTuristicos, int qtdCidadaos,
            List<Hotel> hotel) {
        this.nome = nome;
        this.regiao = regiao;
        this.estado = estado;
        this.pontosTuristicos = pontosTuristicos;
        this.qtdCidadaos = qtdCidadaos;
        this.hotel = hotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPontosTuristicos() {
        return pontosTuristicos;
    }

    public void setPontosTuristicos(String pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    public int getQtdCidadaos() {
        return qtdCidadaos;
    }

    public void setQtdCidadaos(int qtdCidadaos) {
        this.qtdCidadaos = qtdCidadaos;
    }

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }


}
