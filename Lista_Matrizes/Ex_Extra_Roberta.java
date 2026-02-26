package Lista_Matrizes;

import java.util.Scanner;

public class Ex_Extra_Roberta {
    final static Scanner SC = new Scanner(System.in);
    static MetodosBase metodos = new MetodosBase();

    public static void imprimirA(int[][] matriz) {
        metodos.criarLinha(matriz);
        metodos.criarColunaFixa(matriz);

        metodos.imprimirMatriz(matriz);
    }

    public static void main(String[] args) {
        int tamanho = SC.nextInt();
        int[][] imagemMatriz = new int[tamanho][tamanho];
        char letraEscolhida = ' ';

        switch (letraEscolhida) {
            case 'a':
            case 'A':
                imprimirA(imagemMatriz);
                break;
            case 'b':
            case 'B':
            default:
                break;
        }
        imprimirA(imagemMatriz);
    }
}
