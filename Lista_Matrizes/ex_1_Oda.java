package Lista_Matrizes;
import java.util.Scanner;
public class ex_1_Oda {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (2 * i + Math.pow(j, 2));
            }
        }
        
    }
}
