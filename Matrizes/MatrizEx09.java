import java.util.Scanner;

public class MatrizEx09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] lojas = new String[]{"Loja1", "Loja2","Loja3"};
        String[] produtos = new String[]{"Prod1", "Prod2", "Prod3"};
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizResultado = new int[3][4];
        int[] totalDeVendasCadaLojaVetor = new int[3];
        int[] totalDeProdutosVetor = new int[3];
        //linha Coluna

        int totalDeVendasCadaLoja=0,totalGeralDeVendas=0, maior=0, totalDeProdutos=0, controle=0, menor=0, controle2=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o preço das vendas no 1 semestre: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o preço das vendas no 2 semestre: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o numero das metas:");
            matrizResultado[i][3] = entrada.nextInt();
        }


        System.out.println("");
        for (int i = 0; i < 3; i++) {
            totalDeVendasCadaLoja=0;
            for (int j = 0; j < 3; j++) {
                totalDeVendasCadaLoja += matrizResultado[i][j];
                totalDeVendasCadaLojaVetor[j] = totalDeVendasCadaLoja;
                System.out.println("Na loja " + lojas[j]+ "vamos ter " + matrizResultado[j][i] + " do produto" + (produtos[j]));
            }
            System.out.println("As total da loja no bimestre é: " + totalDeVendasCadaLojaVetor[i]);
        }



        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalGeralDeVendas += matrizResultado[i][j];
            }
            System.out.println("A porcentagem vendida por loja no bimestre " + (totalDeVendasCadaLoja/(double)totalGeralDeVendas)*100);
        }


        for (int i = 0; i < 3; i++) {
            totalDeProdutos=0;
            for (int j = 0; j < 3; j++) {
                totalDeProdutos += matrizResultado[j][i];
                totalDeProdutosVetor[j] = totalDeProdutos;
            }
            System.out.println("O total de produtos " + produtos[i] + "É de: " + totalDeProdutos);
        }


        System.out.println("");
        maior = totalDeProdutosVetor[0];
        for (int i = 0; i < totalDeVendasCadaLojaVetor.length; i++) {
            if (totalDeProdutosVetor[i]>maior){
                maior = totalDeProdutosVetor[i];
                controle = i;
            }
        }
        System.out.println("O produto com melhor saida é o: " + produtos[controle]);


        menor = totalDeVendasCadaLojaVetor[0];
        for (int i = 0; i < 3; i++) {
            if (totalDeVendasCadaLojaVetor[i]<menor){
               menor = totalDeVendasCadaLojaVetor[i];
               controle2 = i;
            }
        }
        System.out.println("A loja com menor venda no bimestre é: " + lojas[controle2]);


        for (int i = 0; i < 3; i++) {
            if ( totalDeProdutosVetor[i]>= matrizResultado[i][3]){
                System.out.println("O produto " + produtos[i] + " atingiu a meta!!!");
            }
        }


    }
}
