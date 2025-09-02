import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] A = new int[]{1,1,1,1,1,1,1,1,1,1};
        int[] B = new int[]{2,2,2,2,2,2,2,2,2,2};
        int[] resultante = new int[20];
        int j = 0;

        for (int i = 0; i < 10; i++) {

            resultante[j] = A[i];
            j++;

            resultante[j] = B[i];
            j++;

        }// fim for i

        for (int i = 0; i < 20; i++) {
            System.out.println(resultante[i]);
        }

    }
}
