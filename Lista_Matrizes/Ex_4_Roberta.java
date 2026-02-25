package Lista_Matrizes;

public class Ex_4_Roberta {

    public static int calcularColunasDesejadas(int[][] matriz, int soma) {
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][2] + matriz[i][4];
        }
        return soma;
    }

    public static void main(String[] args) {
        MetodosBase metodos = new MetodosBase();
        int[][] matriz = new int[7][6];
        int soma = 0;

        metodos.receberValores(matriz);
        soma = calcularColunasDesejadas(matriz, soma);
        System.out.println(soma);
    }
}
