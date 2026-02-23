package Lista_Matrizes;

import java.util.Scanner;

public class Ex_6_Roberta {
    final static Scanner sc = new Scanner(System.in);

    public static double[][] calcularMaior(int[][] matriz) {
        int maiorValor = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] > maiorValor) {
                maiorValor = matriz[i][i];
            }
        }
        return dividirMatriz(matriz, maiorValor);
    }

    public static double[][] dividirMatriz(int[][] matriz, int maiorValor) {
        double[][] matrizDividida = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizDividida[i][j] = matriz[i][j] / maiorValor;
            }
        }
        
        return matrizDividida;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[8][8];

        metodos.receberValores(matriz);
        metodos.imprimirMatriz(calcularMaior(matriz));
    }
}
