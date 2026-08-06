package vendasingressoscinema;

import java.util.ArrayList;
import java.util.List;

//Sala variaveis -> (numSala,qtdAssentos,tipoDeSala,mapaAssentoDisponivel,Sessao)
public class Sala {
    private String numSala;
    private int qtdAssentos;
    private String tipoDeSala; // vip ou padrão
    private int[][] mapaAssentoDisponivel;
    private List<Sessao> sessao = new ArrayList<Sessao>();

    public Sala() {
    }

    public Sala(String numSala, int qtdAssentos, String tipoDeSala, int[][] mapaAssentoDisponivel,
            List<Sessao> sessao) {
        this.numSala = numSala;
        this.qtdAssentos = qtdAssentos;
        this.tipoDeSala = tipoDeSala;
        this.mapaAssentoDisponivel = mapaAssentoDisponivel;
        this.sessao = sessao;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public String getTipoDeSala() {
        return tipoDeSala;
    }

    public void setTipoDeSala(String tipoDeSala) {
        this.tipoDeSala = tipoDeSala;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    public int[][] getMapaAssentoDisponivel() {
        return mapaAssentoDisponivel;
    }

    public void setMapaAssentoDisponivel(int[][] mapaAssentoDisponivel) {
        this.mapaAssentoDisponivel = mapaAssentoDisponivel;
    }
}
