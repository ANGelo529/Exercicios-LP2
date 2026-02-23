package Lista_Matrizes;
import java.util.Scanner;

public class ex_1_Oda {
    final static Scanner sc = new Scanner(System.in);

    public static void calcularMatriz(int[][] matrizDesejada) {
        for (int i = 0; i < matrizDesejada.length; i++) {
            for (int j = 0; j < matrizDesejada[0].length; j++) {
                matrizDesejada[i][j] = (int) (2 * i + Math.pow(j, 2));
            }
        }
    }

    public static void main(String[] args) {
        MetodosBase metodosBase = new MetodosBase();
        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];
        calcularMatriz(matriz);

        metodosBase.imprimirMatriz(matriz);
    }
}
