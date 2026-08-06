package gerenciamentodeinventario;

import java.util.ArrayList;
import java.util.List;

//------------Linha lógica das classe------------
//Loja -> Clientes;Funcionario;Produtos
//Produtos -> Fornecedor

//------------Variaveis das classe------------
//Loja variaveis -> (nome,endereco,qtdFuncionarios,Produto,Cliente,Funcionario)
//Clientes variaveis -> (nome,telefone,cpf,dinheiro,precoTotalProd,Produto)
//Funcionario variaveis -> (nome,sobrenome,cpf,telefone,cargo,salario)
//Produto variaveis -> (nome,codigoDBarras,validade,tabelaNutricional,preco,tempromo,Fornecedor)
//Fornecedor variaveis -> (nome,endereco,produtosOferecidos,descricao,confiaca)

public class Loja {
    private String nome;
    private String endereco;
    private int qtdFuncionarios;
    private List<Produto> produto = new ArrayList<Produto>();
    private List<Cliente> cliente = new ArrayList<Cliente>();
    private List<Funcionario> funcionario = new ArrayList<Funcionario>();

    public Loja() {
    }

    public Loja(String nome, String endereco, int qtdFuncionarios, List<Produto> produto, List<Cliente> cliente,
            List<Funcionario> funcionario) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdFuncionarios = qtdFuncionarios;
        this.produto = produto;
        this.cliente = cliente;
        this.funcionario = funcionario;
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

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
