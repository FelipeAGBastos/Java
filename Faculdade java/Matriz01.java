import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaLinha=0,totalGeral=0;

        for (int i = 0; i < 4; i++) {
            somaLinha=0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe o elemento da linha ["+ i +","+ j + "]"+":");
                matriz[i][j] = entrada.nextInt();
                somaLinha += matriz[i][j];
                totalGeral+=somaLinha;
            }
            System.out.println("A soma da linha é de: "+somaLinha);
        }


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();

        }


        System.out.println(totalGeral);

    }
}
