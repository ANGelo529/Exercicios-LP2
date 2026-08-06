package vendasingressoscinema;

//Assento variaveis -> (posicaoNaSala,tipoCadeira,linhaSala,colunaSala)
public class Assento {
    private String posicaoNaSala;
    private String tipoCadeira;
    private int linhaSala;
    private int colunaSala;

    public Assento() {
    }

    public Assento(String posicaoNaSala, String tipoCadeira, int linhaSala, int colunaSala) {
        this.posicaoNaSala = posicaoNaSala;
        this.tipoCadeira = tipoCadeira;
        this.linhaSala = linhaSala;
        this.colunaSala = colunaSala;
    }

    public String getPosicaoNaSala() {
        return posicaoNaSala;
    }

    public void setPosicaoNaSala(String posicaoNaSala) {
        this.posicaoNaSala = posicaoNaSala;
    }

    public String getTipoCadeira() {
        return tipoCadeira;
    }

    public void setTipoCadeira(String tipoCadeira) {
        this.tipoCadeira = tipoCadeira;
    }

    public int getLinhaSala() {
        return linhaSala;
    }

    public void setLinhaSala(int linhaSala) {
        this.linhaSala = linhaSala;
    }

    public int getColunaSala() {
        return colunaSala;
    }

    public void setColunaSala(int colunaSala) {
        this.colunaSala = colunaSala;
    }

}
