package Lista_Matrizes;

public class Ex_10_Roberta {

    public static int calcularSomaPar(int[][] matriz, int soma) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i % 2 == 0) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[9][9];
        int soma = 0;

        metodos.matrizRandom(matriz);
        metodos.imprimirMatriz(matriz);

        soma = calcularSomaPar(matriz, soma);
        System.out.println("\n" + soma);
    }
}
