package Lista_Matrizes;

import java.util.Scanner;

public class Ex_2_Roberta {
    final static Scanner sc = new Scanner(System.in);

    public static int calcularSomaDiagonalPrincipal(int[][] matriz, int soma){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[6][6];
        int soma = 0;
        metodos.receberValores(matriz);
        soma = calcularSomaDiagonalPrincipal(matriz, soma);
        System.out.println(soma);
    }
}
