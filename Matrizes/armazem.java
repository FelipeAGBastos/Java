import java.util.Scanner;

public class armazem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] relatorioArmazem = new int[5][3];
        int totalCadaArmazem = 0, maior=0, posicao=0, menorArmazem=0, posicao2=0;
        int[] totalCadaArmazemVetor = new int[4];
        int [] totalProdutos = new int[3];
        int[] custoTotalArmazem = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("Armazem "+(i+1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe a quantidade em estoque do produto " + (j+1));
                relatorioArmazem[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o custo: ");
            relatorioArmazem[4][i] = entrada.nextInt();
        }

        //qtd itens
        for (int i = 0; i < 4; i++) {
            totalCadaArmazem=0;
            for (int j = 0; j < 3; j++) {
                totalCadaArmazem += relatorioArmazem[i][j];
            }
            totalCadaArmazemVetor[i] = totalCadaArmazem;
            System.out.println("Total do armazem " + (i+1) + " " + totalCadaArmazem );
        }


        System.out.println("");
        maior = relatorioArmazem[0][1];
        for (int i = 0; i < 4; i++) {
            if (relatorioArmazem[i][1] > maior){
                maior = relatorioArmazem[i][1];
                posicao = i;
            }
        }
        System.out.println("O armazém possui maior estoque do produto 2 é o armazem: " + (posicao+1) + " com: " + maior + " estoque");

        System.out.println("");
        menorArmazem = relatorioArmazem[0][1];
        for (int i = 0; i < 4; i++) {
            if (relatorioArmazem[i][1]<menorArmazem){
                menorArmazem = relatorioArmazem[i][1];
                posicao2 = i;
            }
        }
        System.out.println("O menor estoque esta no armazem " + (posicao2+1) + " com " + menorArmazem);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totalProdutos[i] += relatorioArmazem[j][i];
            }
            System.out.println("O Qual o custo total de cada produto é: "+totalProdutos[i]*relatorioArmazem[4][i]);
        }


        // e) Custo total de cada armazém
        System.out.println("\n=== Custo total de cada armazém ===");
        for (int i = 0; i < 4; i++) {
            int custo = 0;
            for (int j = 0; j < 3; j++) {
                custo += relatorioArmazem[i][j] * relatorioArmazem[4][j];
            }
            custoTotalArmazem[i] = custo;
            System.out.println("Armazém " + (i + 1) + ": R$ " + custoTotalArmazem[i]);
        }













    }
}
