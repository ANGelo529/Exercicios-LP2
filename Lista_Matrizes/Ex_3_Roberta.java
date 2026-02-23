package Lista_Matrizes;

import java.util.Scanner;

public class Ex_3_Roberta {
    final static Scanner sc = new Scanner(System.in);

    public static int calcularSomaDiagonalSecundaria(int[][] matriz, int soma) {
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz[0].length - i - 1];

        }
        return soma;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[6][6];
        int soma = 0;

        metodos.receberValores(matriz);
        soma = calcularSomaDiagonalSecundaria(matriz, soma);
        System.out.println(soma);
    }
}
