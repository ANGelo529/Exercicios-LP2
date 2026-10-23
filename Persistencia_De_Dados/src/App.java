import csv.ArquivoProdutoCSV;
import java.util.ArrayList;
import java.util.Scanner;
import model.Produto;

public class App {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArquivoProdutoCSV arquivo = new ArquivoProdutoCSV();
        int opcao;
        do {
            System.out.println("Escolha a Opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = LER.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProd(arquivo);
                    break;

                case 2:
                    listarProd(arquivo);
                    break;

                case 3:
                    alterarProd(arquivo);
                    break;

                case 4:
                    deletarProd(arquivo);
                    break;

                default:
                    break;
            }
        } while (opcao != 5);

    }

    private static void deletarProd(ArquivoProdutoCSV arquivo) {
        LER.nextLine();
        System.out.println("====================");
        System.out.println("Deletar Produtos");
        System.out.println("====================");
        System.out.println("Informe o id do produto que deseja deletar");
        int idProd = LER.nextInt();
        if (arquivo.deletar(idProd)) {
            System.out.println("Produto deletado com sucesso");
        } else {
            System.out.println("Produto não encontrado ou erro ao salvar");
        }
    }

    private static void alterarProd(ArquivoProdutoCSV arquivo) {
        LER.nextLine();
        System.out.println("====================");
        System.out.println("Alterar Produtos");
        System.out.println("====================");
        System.out.println("Informe o id do produto que deseja Alterar");
        int idProd = LER.nextInt();
        Produto produto = new Produto();
        System.out.print("Id: ");
        produto.setId(LER.nextInt());
        LER.nextLine();
        System.out.println("Nome: ");
        produto.setNome(LER.nextLine());
        System.out.println("preço: ");
        produto.setPreco(LER.nextDouble());
        if (arquivo.alterar(idProd, produto)) {
            System.out.println("Produto alterado com sucesso");
        } else {
            System.out.println("Produto não encontrado ou erro ao salvar");
        }
    }

    private static void listarProd(ArquivoProdutoCSV arquivo) {
        LER.nextLine();
        ArrayList<Produto> prod = arquivo.listar();
        System.out.println("====================");
        System.out.println("Listagem de Produtos");
        System.out.println("====================");
        for (Produto iProduto : prod) {
            System.out.printf("%d   %s  R$ %f\n", iProduto.getId(), iProduto.getNome(), iProduto.getPreco());
            System.out.println("---------------------");

        }
    }

    private static void cadastrarProd(ArquivoProdutoCSV arquivo) {
        Produto produto = new Produto();
        System.out.println("Cadastrar Produto");
        System.out.print("Id: ");
        produto.setId(LER.nextInt());
        LER.nextLine();
        System.out.println("Nome: ");
        produto.setNome(LER.nextLine());
        System.out.println("preço: ");
        produto.setPreco(LER.nextDouble());
        arquivo.inserir(produto);
    }
}
