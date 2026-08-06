package vendasingressoscinema;

//Filme variaveis -> (nome,sinopse,duracaoFilme,genero,diretor,elenco,trailer,cenaPosCreditos,avaliacaoPopular,avaliacaoTomatoes)
public class Filme {
    private String nome;
    private String sinopse;
    private String duracaoFilme;
    private String genero;
    private String diretor;
    private String[] elenco;
    private String trailer;
    private String cenaPosCreditos;
    private String avaliacaoPopular;
    private String avaliacaoTomatoes;

    public Filme() {
    }

    public Filme(String nome, String sinopse, String duracaoFilme, String genero, String diretor, String[] elenco,
            String trailer, String cenaPosCreditos, String avaliacaoPopular, String avaliacaoTomatoes) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.duracaoFilme = duracaoFilme;
        this.genero = genero;
        this.diretor = diretor;
        this.elenco = elenco;
        this.trailer = trailer;
        this.cenaPosCreditos = cenaPosCreditos;
        this.avaliacaoPopular = avaliacaoPopular;
        this.avaliacaoTomatoes = avaliacaoTomatoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(String duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getCenaPosCreditos() {
        return cenaPosCreditos;
    }

    public void setCenaPosCreditos(String cenaPosCreditos) {
        this.cenaPosCreditos = cenaPosCreditos;
    }

    public String getAvaliacaoPopular() {
        return avaliacaoPopular;
    }

    public void setAvaliacaoPopular(String avaliacaoPopular) {
        this.avaliacaoPopular = avaliacaoPopular;
    }

    public String getAvaliacaoTomatoes() {
        return avaliacaoTomatoes;
    }

    public void setAvaliacaoTomatoes(String avaliacaoTomatoes) {
        this.avaliacaoTomatoes = avaliacaoTomatoes;
    }
}
