package Lista_Matrizes;

public class Ex_9_Roberta {

    public static void alterarLinhaDois(int[][] matriz) {
        int aux;

        for (int i = 0; i < matriz[0].length; i++) {
            aux = matriz[7][i];
            matriz[7][i] = matriz[1][i];
            matriz[1][i] = aux;
        }

    }

    public static void alterarColunaQuatro(int[][] matriz) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][3];
            matriz[i][3] = matriz[i][9];
            matriz[i][9] = aux;

        }

    }

    public static void alterarDiagonalPrincipal(int[][] matriz) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                aux = matriz[i][matriz[0].length - i - 1];
                if (i == j) {
                    matriz[i][matriz[0].length - i - 1] = matriz[i][j];
                    matriz[i][j] = aux;
                }
            }
        }

    }

    public static void alterarLinhaColuna(int[][] matriz) {
        int aux;

        for (int i = 0; i < matriz[0].length; i++) {
            aux = matriz[4][i];
            matriz[4][i] = matriz[i][9];
            matriz[i][9] = aux;
        }

    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[10][10];

        metodos.matrizRandom(matriz);
        metodos.imprimirMatriz(matriz);
        System.out.println();

        alterarLinhaDois(matriz);
        alterarColunaQuatro(matriz);
        alterarDiagonalPrincipal(matriz);
        alterarLinhaColuna(matriz);

        System.out.println();
        metodos.imprimirMatriz(matriz);
    }
}
