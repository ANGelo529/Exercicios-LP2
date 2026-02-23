package Lista_Matrizes;

import java.util.Scanner;

public class ex_2_Oda {
    final static Scanner sc = new Scanner(System.in);

    public static void calcularMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = (int) -Math.pow(i, 2);
                } else {
                    matriz[i][j] = (int) 2 * i * j;
                }
            }
        }
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];
        calcularMatriz(matriz);
        metodos.imprimirMatriz(matriz);
    }
}
