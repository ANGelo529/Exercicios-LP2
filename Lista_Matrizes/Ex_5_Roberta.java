package Lista_Matrizes;

import java.util.Scanner;

public class Ex_5_Roberta {
    final static Scanner sc = new Scanner(System.in);

    public static int descobrirMenorValor(int[][] matriz){
        int menorValor =0;
        int[] valoresDiagonalSecundaria = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            valoresDiagonalSecundaria[i] = matriz[i][matriz[0].length - i - 1];
        }

        menorValor = valoresDiagonalSecundaria[0];
        for (int i = 0; i < valoresDiagonalSecundaria.length - 1; i++) {
            if(valoresDiagonalSecundaria[i] > valoresDiagonalSecundaria[i + 1]){
                menorValor = valoresDiagonalSecundaria[i + 1];
            }
        }

        return menorValor;
    }
    
    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[6][6];

        metodos.receberValores(matriz);
        System.out.println(descobrirMenorValor(matriz));
    } 
}
