package Lista_Matrizes;

public class Ex_11_Roberta {

    public static void multiplicarLinhaDiagonal(int[][] matriz) {
        int multiDiagonal;
        for (int i = 0; i < matriz.length; i++) {
            multiDiagonal = matriz[i][i];

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matriz[i][j] * multiDiagonal;
            }
        }
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[6][6];

        metodos.matrizRandom(matriz);
        metodos.imprimirMatriz(matriz);

        multiplicarLinhaDiagonal(matriz);
        metodos.imprimirMatriz(matriz);
    }
}
