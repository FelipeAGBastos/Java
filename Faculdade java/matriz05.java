import java.util.Scanner;

public class matriz05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] M = new int[2][2];
        int[][] R = new int[2][2];
        int maiorElemento = 0;

        System.out.println("Digite os elementos da matriz M (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                M[i][j] = entrada.nextInt();

                if (M[i][j] > maiorElemento) {
                    maiorElemento = M[i][j];
                }
            }
        }

        System.out.println("\nO maior elemento da matriz M é: " + maiorElemento);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                R[i][j] = M[i][j] * maiorElemento;
            }
        }

        System.out.println("\nMatriz R (resultado da multiplicação):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(R[i][j] + "\t");
            }
            System.out.println();
        }
    }
}