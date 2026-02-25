package Lista_Matrizes;

public class Ex_13_Roberta {

    public static int calcularSomaAcimaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[10][10];
        int soma;

        metodos.matrizRandom(matriz);
        metodos.imprimirMatriz(matriz);

        soma = calcularSomaAcimaDiagonalPrincipal(matriz);
        System.out.println(soma);
    }
}
