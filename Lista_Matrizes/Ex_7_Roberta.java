package Lista_Matrizes;

public class Ex_7_Roberta {

    public static int[][] calcularProduto(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        int colunas = 0;
        int colunaA = matrizA[0].length;
        int colunaB = matrizB[0].length;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizC[i][colunas] += matrizA[i][j] * matrizB[j][colunas];

                if (j == colunaA - 1 && colunas < colunaB - 1) {
                    j = -1;
                    colunas++;
                }
            }
            colunas = 0;
        }

        return matrizC;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matrizA = new int[4][6];
        int[][] matrizB = new int[6][4];
        int[][] matrizC = new int[matrizA.length][matrizB[0].length];
        metodos.receberValores(matrizA);
        metodos.receberValores(matrizB);

        matrizC = calcularProduto(matrizA, matrizB, matrizC);
        System.out.println();
        metodos.imprimirMatriz(matrizC);

    }
}
