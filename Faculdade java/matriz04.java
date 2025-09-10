import java.util.Scanner;

public class matriz04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][5];
        int bonus=0;


        for (int j = 0; j < matriz.length; j++) {
            System.out.println("Qual o codigo do cliente?");
            matriz[j][0] = entrada.nextInt();
            System.out.println("Digite a quantidade de milhares");
            matriz[j][1] = entrada.nextInt();
            System.out.println("Digite a categoria:");
            matriz[j][2] = entrada.nextInt();

            if (matriz[j][2] == 1){
                bonus = 10000;
            } else if (matriz[j][2]==2) {
                bonus = 5000;
            } else {
                bonus = 0;
            }

            matriz[j][3] = bonus;
            System.out.println("Bonus"+matriz[j][3]);
            matriz[j][4] = matriz[j][1] + matriz[j][3];
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\t Codigo: "+matriz[i][0] + "\t qtd de milhas: " + matriz[i][1] + "\t Categoria: " + matriz[i][2] + "\t Bonus: "+ matriz[i][3] + "\t milhagem atual: " +matriz[i][4]);
        }





    }
}
