package vendasingressoscinema;

//------------Linha lógica das classe------------
//Cinema -> Sala;Cliente
//Cliente -> Assento;Guloseima
//Sala -> Sessao
//Sessao -> Filme

//------------Variaveis das classe------------
//Cinema variaveis -> (nome,qtdSalas,qtdSalasLivres,endereco,telefone,catalogoFilmeDisponiveis,Sala)
//Sala variaveis -> (numSala,qtdAssentos,tipoDeSala,mapaAssentoDisponivel,Sessao)
//Cliente variaveis -> (nome,telefone,tipoSala,codigoSala,dinheiroGasto,Assento,Guloseima)
//Assento variaveis -> (posicaoNaSala,tipoCadeira,linhaSala,colunaSala)
//Guloseima variaveis -> (nome,descricao,avaliacaoClientes,preco,qtdDisponiveis)
//Sessao variaveis -> (numSala,horarios,Filmes,regras,idioma,status,regrasPraPagarMeia,precoIngresso,CataogoFilmes)
//Filme variaveis -> (nome,sinopse,duracaoFilme,genero,diretor,elenco,trailer,cenaPosCreditos,avaliacaoPopular,avaliacaoTomatoes)

public class Cinema {
    private String nome;
    private int qtdSalas;
    private int qtdSalasLivres;
    private String endereco;
    private String telefone;
    private String catalogoFilmeDisponiveis;
    private Sala[] sala = new Sala[qtdSalas];

    public Cinema() {
    }

    public Cinema(String nome, int qtdSalas, int qtdSalasLivres, String endereco, String telefone,
            String catalogoFilmeDisponiveis, Sala[] sala) {
        this.nome = nome;
        this.qtdSalas = qtdSalas;
        this.qtdSalasLivres = qtdSalasLivres;
        this.endereco = endereco;
        this.telefone = telefone;
        this.catalogoFilmeDisponiveis = catalogoFilmeDisponiveis;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdSalas() {
        return qtdSalas;
    }

    public void setQtdSalas(int qtdSalas) {
        this.qtdSalas = qtdSalas;
    }

    public int getQtdSalasLivres() {
        return qtdSalasLivres;
    }

    public void setQtdSalasLivres(int qtdSalasLivres) {
        this.qtdSalasLivres = qtdSalasLivres;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCatalogoFilmeDisponiveis() {
        return catalogoFilmeDisponiveis;
    }

    public void setCatalogoFilmeDisponiveis(String catalogoFilmeDisponiveis) {
        this.catalogoFilmeDisponiveis = catalogoFilmeDisponiveis;
    }

    public Sala[] getSala() {
        return sala;
    }

    public void setSala(Sala[] sala) {
        this.sala = sala;
    }
}
