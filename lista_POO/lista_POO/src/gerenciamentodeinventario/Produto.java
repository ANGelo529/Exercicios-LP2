package gerenciamentodeinventario;

import java.util.ArrayList;
import java.util.List;

//Produto variaveis -> (nome,codigoDBarras,validade,tabelaNutricional,preco,tempromo,Fornecedor)
public class Produto {
    private String nome;
    private String codigoDBarras;
    private String validade;
    private String tabelaNutricional;
    private float preco;
    private boolean temPromo;
    private List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();

    public Produto() {
    }

    public Produto(String nome, String codigoDBarras, String validade, String tabelaNutricional, float preco,
            boolean temPromo, List<Fornecedor> fornecedor) {
        this.nome = nome;
        this.codigoDBarras = codigoDBarras;
        this.validade = validade;
        this.tabelaNutricional = tabelaNutricional;
        this.preco = preco;
        this.temPromo = temPromo;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDBarras() {
        return codigoDBarras;
    }

    public void setCodigoDBarras(String codigoDBarras) {
        this.codigoDBarras = codigoDBarras;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getTabelaNutricional() {
        return tabelaNutricional;
    }

    public void setTabelaNutricional(String tabelaNutricional) {
        this.tabelaNutricional = tabelaNutricional;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isTemPromo() {
        return temPromo;
    }

    public void setTemPromo(boolean temPromo) {
        this.temPromo = temPromo;
    }

    public List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }
}
