import java.util.Scanner;

public class ex05 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorA = carregar();
        ordenar(vetorA);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
    }

    public static int[] carregar() {
        int[] vetorA = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vetorA[i] = entrada.nextInt();
        }
        return vetorA;
    }

    public static void ordenar(int[] vetorA) {
        int temp;
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = i + 1; j < vetorA.length; j++) {
                if (vetorA[i] > vetorA[j]) {
                    temp = vetorA[i];
                    vetorA[i] = vetorA[j];
                    vetorA[j] = temp;
                }
            }
        }
    }
}
