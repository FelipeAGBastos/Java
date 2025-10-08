import java.util.Scanner;

public class MatrizEX8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][3];
        int totItens=0, maior=0, menor=0, maiorArmazem2=0, menorArmazem2=0, controle=0,totProdutos=0, totProdutosCusto=0, custoTotal=0;

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("Estoque do armazem " + "(" + (i+1) + ")");
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe a quantidade em estoque do produto "+ "(" + (j+1) + ")");
                matriz[i][j] = entrada.nextInt();
            }
        }

        //Custo Total de cada produto:

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o custo do produto " + (i+1));
            matriz[4][i] = entrada.nextInt();
        }


        //Quantidade de itens em cada armazem:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                totItens += matriz[i][j];
            }
            System.out.println("Estoque no armazem " + (i+1)+ " " + totItens);
            totItens=0;
        }

        //Qual armazém possui maior estoque do produto 2
        maior = matriz[0][1];
        for (int i = 0; i < 4; i++) {

            if (matriz[i][1] > maior){
                maior = matriz[i][1];
                maiorArmazem2 = i+1;
            }
        }
        System.out.println("");
        System.out.println("O maior estoque é o armazem: "+ "( " + maiorArmazem2 + " )" + " com o valor de: " + maior);

        //Qual armazém possui menor estoque do produto 2
        menor = matriz[0][1];
        for (int i = 0; i < 4; i++) {
            if (matriz[i][1] < menor){
                menor = matriz[i][1];
                menorArmazem2 = i+1;
            }
        }
        System.out.println("");
        System.out.println("O menor estoque é o armazem: "+ "( " + menorArmazem2+ " )" + " com o valor de: " + menor);





        //Qual o custo total de cada produto.
        for (int i = 0; i < 3; i++) {
            totProdutos=0;
            for (int j = 0; j < 4; j++) {
                totProdutos+= matriz[j][i] ;
            }
            totProdutosCusto = totProdutos * matriz[4][i];
        System.out.println("Custo total do produto " + (i+1) + " " +totProdutosCusto);
        }



        System.out.println("---------- CUSTO TOTAL DE CADA ARMAZÉM ----------");
        for (int i = 0; i < 4; i++) { // Itera sobre os ARMAZÉNS (linhas)
            double custoTotalArmazem = 0;
            for (int j = 0; j < 3; j++) { // Itera sobre os PRODUTOS (colunas)
                // Acumula o valor de (quantidade * custo) para cada produto no armazém
                custoTotalArmazem += matriz[i][j] * matriz[4][j];
            }
            System.out.println("Custo total no armazém ( " + (i + 1) + " ): " + (custoTotalArmazem));
        }







    }
}
