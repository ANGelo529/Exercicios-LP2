package gerenciamentodeinventario;

import java.util.List;

//Clientes variaveis -> (nome,telefone,cpf,dinheiro,precoTotalProd,produto)
public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private float dinheiro;
    private float precoTotalProd;
    private List<Produto> produto;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String cpf, float dinheiro, float precoTotalProd,
            List<Produto> produto) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dinheiro = dinheiro;
        this.precoTotalProd = precoTotalProd;
        this.produto = produto;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getPrecoTotalProd() {
        return precoTotalProd;
    }

    public void setPrecoTotalProd(float precoTotalProd) {
        this.precoTotalProd = precoTotalProd;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
