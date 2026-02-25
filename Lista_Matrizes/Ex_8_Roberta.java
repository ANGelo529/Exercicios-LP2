package Lista_Matrizes;

import java.util.Scanner;

public class Ex_8_Roberta {
    final static Scanner sc = new Scanner(System.in);

    public static int[] multiMatriz(int[][] matriz, int[] vetor, int multi) {
        int incremento = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                vetor[incremento] = matriz[i][j] * multi;
                incremento++;
            }
        }

        return vetor;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int multiplicando = sc.nextInt();
        int[][] matriz = new int[6][6];
        int[] vetor = new int[matriz.length * matriz[0].length];

        metodos.receberValores(matriz);
        vetor = multiMatriz(matriz, vetor, multiplicando);
        metodos.imprimirVetor(vetor);
    }
}
