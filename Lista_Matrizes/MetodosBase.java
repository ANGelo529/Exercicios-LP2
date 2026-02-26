package Lista_Matrizes;

import java.util.Scanner;

public class MetodosBase {
    final static Scanner sc = new Scanner(System.in);

    public void receberValores(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrizRandom(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void criarColunaFixa(int[][] matriz) {
        int soma = 0;
        int encontreiUm = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0][i] == 1) {
                encontreiUm = 1;
            }

            if (matriz[0][i] == 0 && encontreiUm != 1) {
                soma++;

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (int) matriz.length / 8; j++) {
                matriz[i][soma + j] = 1;
                matriz[i][matriz[0].length - soma - j] = 1;
            }

        }
    }

    public void criarLinha(int[][] matriz) {
        for (int i = 0; i < matriz.length / 3; i++) {
            for (int j = 0; j < matriz[0].length / 4; j++) {
                matriz[j][(int) (matriz[0].length / 2 + i)] = 1;
                matriz[j][(int) (matriz[0].length / 2 - i - 1)] = 1;
            }
        }
    }
}
