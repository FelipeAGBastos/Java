import java.util.Scanner;

public class matriz08pt2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //linha coluna
        int[][] matriz = new int[5][3];
        int totalArmazemMaiorLinha=0, menor=0,controle=0, precoProdutos=0;
        int[] totalArmazemMaiorLinhaVetor = new int[4];


        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("Estoque do armazem " + (i+1));
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe a quantidade em estoque do Produto " + (j+1)+ " :");
                matriz[i][j] = entrada.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o custo total de cada produto: ");
            matriz[4][i]  = entrada.nextInt();
        }

        //qtd em cada armazem. Percorrer linha
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            totalArmazemMaiorLinha=0;
            for (int j = 0; j < 3; j++) {
                totalArmazemMaiorLinha += matriz[i][j];
            }
            System.out.println("Quantidade de itens no armazem "+(i+1)+" "+totalArmazemMaiorLinha);
            totalArmazemMaiorLinhaVetor[i] = totalArmazemMaiorLinha;
        }

        System.out.println("");
        menor = totalArmazemMaiorLinhaVetor[0];
        for (int i = 0; i < 4; i++) {
            if (totalArmazemMaiorLinhaVetor[i]<menor){
                menor = totalArmazemMaiorLinhaVetor[i];
                controle = i;
            }
        }
        System.out.println("O armazem com menor estoque é o armazem " + (controle+1) );


        System.out.println("");
        for (int i = 0; i < 3; i++) {
            precoProdutos=0;
            for (int j = 0; j < 4; j++) {
             precoProdutos += matriz[i][j] * matriz[4][i];

            }
            System.out.println("O custo total de cada produto é: " + precoProdutos);

        }








    }
}
