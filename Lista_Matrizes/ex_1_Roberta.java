package Lista_Matrizes;

public class ex_1_Roberta {

    public static int calcularSomaTotal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[5][5];
        int soma;
        metodos.receberValores(matriz);
        soma = calcularSomaTotal(matriz);
        System.out.println(soma);
    }
}
