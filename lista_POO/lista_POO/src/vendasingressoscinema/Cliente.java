package vendasingressoscinema;

import java.util.ArrayList;
import java.util.List;

//Cliente variaveis -> (nome,telefone,tipoSala,codigoSala,dinheiroGasto,Assento,Guloseima)
public class Cliente {
    private String nome;
    private String telefone;
    private String tipoSala;
    private String codigoSala;
    private float dinheiroGasto;
    private Assento assento = new Assento();
    private List<Guloseima> guloseima = new ArrayList<Guloseima>();

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String tipoSala, String codigoSala, float dinheiroGasto,
            Assento assento, List<Guloseima> guloseima) {
        this.nome = nome;
        this.telefone = telefone;
        this.tipoSala = tipoSala;
        this.codigoSala = codigoSala;
        this.dinheiroGasto = dinheiroGasto;
        this.assento = assento;
        this.guloseima = guloseima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public float getDinheiroGasto() {
        return dinheiroGasto;
    }

    public void setDinheiroGasto(float dinheiroGasto) {
        this.dinheiroGasto = dinheiroGasto;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public List<Guloseima> getGuloseima() {
        return guloseima;
    }

    public void setGuloseima(List<Guloseima> guloseima) {
        this.guloseima = guloseima;
    }
}
