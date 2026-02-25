package Lista_Matrizes;

public class Ex_12_Roberta {

    public static double calcularMediaAbaixoDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        int incremento = 0;
        double media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    soma += matriz[i][j];
                    incremento++;
                }

            }
        }

        media = soma / incremento;

        return media;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[12][12];
        double media;

        metodos.matrizRandom(matriz);
        metodos.imprimirMatriz(matriz);

        media = calcularMediaAbaixoDiagonalPrincipal(matriz);
        System.out.printf("\n%.4f\n", media);
    }
}
