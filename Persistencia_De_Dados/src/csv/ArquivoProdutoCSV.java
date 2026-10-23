package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos.csv";

    public void inserir(Produto prod) {
        try (FileWriter escritorTexto = new FileWriter(nomeArquivo, true);) {
            PrintWriter leitorTexto = new PrintWriter(escritorTexto);
            leitorTexto.println(prod.getId() + "," + prod.getNome() + "," + prod.getPreco());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo " + e.getMessage());
        }
    }

    public ArrayList<Produto> listar() {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            return listaProdutos;
        }
        try (BufferedReader LER = new BufferedReader(new FileReader(arquivo))) {
            String linhaLida = LER.readLine();
            while (linhaLida != null) {
                String[] dados = linhaLida.split(",");
                Produto auxProd = new Produto();
                auxProd.setId(Integer.parseInt(dados[0]));
                auxProd.setNome(dados[1]);
                auxProd.setPreco(Double.parseDouble(dados[2]));
                listaProdutos.add(auxProd);
                linhaLida = LER.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo " + e.getMessage());
        }

        return listaProdutos;
    }

    public boolean deletar(int id) {
        ArrayList<Produto> produtos = listar();
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                produtos.remove(prod);
                break;
            }
        }

        return salvar(produtos);
    }

    public boolean salvar(ArrayList<Produto> produtos) {
        try (FileWriter escritorTexto = new FileWriter(nomeArquivo);) {
            PrintWriter leitorTexto = new PrintWriter(escritorTexto);
            for (Produto prod : produtos) {
                leitorTexto.println(prod.getId() + "," + prod.getNome() + "," + prod.getPreco());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo " + e.getMessage());
            return false;
        }

        return true;
    }

    public boolean alterar(int idAntigo, Produto produto) {
        ArrayList<Produto> produtos = listar();
        for (Produto prod : produtos) {
            if (prod.getId() == idAntigo) {
                prod.setId(produto.getId());
                prod.setNome(produto.getNome());
                prod.setPreco(produto.getPreco());
                break;
            }
        }
        
        return salvar(produtos);
    }
}
