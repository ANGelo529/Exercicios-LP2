package vendasingressoscinema;

//Guloseima variaveis -> (nome,descricao,avaliacaoClientes,preco,qtdDisponiveis)
public class Guloseima {
    private String nome;
    private String descricao;
    private String avaliacaoClientes;
    private float preco;
    private int qtdDisponiveis;

    public Guloseima() {
    }

    public Guloseima(String nome, String descricao, String avaliacaoClientes, float preco, int qtdDisponiveis) {
        this.nome = nome;
        this.descricao = descricao;
        this.avaliacaoClientes = avaliacaoClientes;
        this.preco = preco;
        this.qtdDisponiveis = qtdDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAvaliacaoClientes() {
        return avaliacaoClientes;
    }

    public void setAvaliacaoClientes(String avaliacaoClientes) {
        this.avaliacaoClientes = avaliacaoClientes;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdDisponiveis() {
        return qtdDisponiveis;
    }

    public void setQtdDisponiveis(int qtdDisponiveis) {
        this.qtdDisponiveis = qtdDisponiveis;
    }
}
