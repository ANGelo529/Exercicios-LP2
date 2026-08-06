package gerenciamentodeinventario;

//Fornecedor variaveis -> (nome,endereco,produtosOferecidos,descricao,confiaca)

public class Fornecedor {
    private String nome;
    private String endereco;
    private String produtosOferecidos;
    private String descricao;
    private String confianca;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String endereco, String produtosOferecidos, String descricao, String confianca) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtosOferecidos = produtosOferecidos;
        this.descricao = descricao;
        this.confianca = confianca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getprodutosOferecidos() {
        return produtosOferecidos;
    }

    public void setprodutosOferecidos(String produtosOferecidos) {
        this.produtosOferecidos = produtosOferecidos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConfianca() {
        return confianca;
    }

    public void setConfianca(String confianca) {
        this.confianca = confianca;
    }

}
