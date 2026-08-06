package vendasingressoscinema;

import java.util.HashMap;

//Sessao variaveis -> (numSala,horarios,Filmes,regras,idioma,status,regrasPraPagarMeia,precoIngresso,CataogoFilmes)
public class Sessao {
    private String numSala;
    private String horariosFilmes;
    private String regras;
    private String idioma;
    private String status;
    private String regrasPraPagarMeia;
    private float precoIngresso;
    private HashMap<String, Filme> catalogoFilmes = new HashMap<String, Filme>();

    public Sessao() {
    }

    public Sessao(String numSala, String horariosFilmes, String regras, String idioma, String status,
            String regrasPraPagarMeia, float precoIngresso, HashMap<String, Filme> catalogoFilmes) {
        this.numSala = numSala;
        this.horariosFilmes = horariosFilmes;
        this.regras = regras;
        this.idioma = idioma;
        this.status = status;
        this.regrasPraPagarMeia = regrasPraPagarMeia;
        this.precoIngresso = precoIngresso;
        this.catalogoFilmes = catalogoFilmes;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public String getHorariosFilmes() {
        return horariosFilmes;
    }

    public void setHorariosFilmes(String horariosFilmes) {
        this.horariosFilmes = horariosFilmes;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegrasPraPagarMeia() {
        return regrasPraPagarMeia;
    }

    public void setRegrasPraPagarMeia(String regrasPraPagarMeia) {
        this.regrasPraPagarMeia = regrasPraPagarMeia;
    }

    public float getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(float precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public HashMap<String, Filme> getCatalogoFilmes() {
        return catalogoFilmes;
    }

    public void setCatalogoFilmes(HashMap<String, Filme> catalogoFilmes) {
        this.catalogoFilmes = catalogoFilmes;
    }
}
