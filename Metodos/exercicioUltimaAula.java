import java.util.Scanner;

public class exercicioUltimaAula {
    static Scanner entrada = new Scanner(System.in);
    static String[] [] arrayHDados = new String[5][2];
    static int [] [] arrayHNumero=new int [5][2];

    public static void main(String[] args) {

        String[] arrayNomeProduto = new String[]
        {"Refrigerante Lata","Água sem gás","Água com gás","Suco de Laranja","Barra de Chocolate"};

        double[] arrayPrecoProduto = new double[] {2.80, 1.90, 2.10,2.30,4.90};

        String[] arrayNomeServico = new String[]
        {"Lavanderia","Sauna","Almoço","Café da Manhã","Jantar"};

        double[] arrayPrecoServico = new double[] {10.50,60.80,42.90,35.60,60.40};


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            arrayHDados[i][0] = entrada.next();
            System.out.println("Digite o tipo de hospedagem (s-single), (d-double), (sl-suite luxo), sr(suite presidencial): ");
            arrayHDados[i][1] = entrada.next();
            System.out.println("Numero do quarto");
            arrayHNumero[i][0] = i + 1;
            System.out.println(arrayHNumero[i][0]);
            System.out.println("Digite a quantidade de diarias: ");
            arrayHNumero[i][1] = entrada.nextInt();
            System.out.println("-------------------------------------------");
        }

        int[][] consumoDeProdutos = consumoDeProdutos(arrayNomeProduto);
        int[][] matrizServico = consumoDeServiço(arrayNomeServico);
        double[] valorDiariaTotal = valorHospedagem(arrayHDados, arrayHNumero);
        gerarRelatorioGerencial(consumoDeProdutos,matrizServico,arrayPrecoProduto, arrayPrecoServico, valorDiariaTotal);
    }//fim do main


    public static int[][] consumoDeProdutos(String[] arrayNomeProduto){
        int[][] matrizConsumo = new  int[5][5];

        System.out.println("");
        System.out.println("==========================================================================================");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hospedagem " + (i+1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe a quantidade consumida do produto ( "+ arrayNomeProduto[j]+" )");
                matrizConsumo[i][j] = entrada.nextInt();

            }
        }

        return matrizConsumo;
    }


    public static int[][] consumoDeServiço(String[] arrayNomeServico){
        int[][] matrizServico = new int[5][5];

        System.out.println("");
        System.out.println("==========================================================================================");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hospedagem " + (i+1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe a quantidade consumida do serviço ( "+ arrayNomeServico[j]+" )");
                matrizServico[i][j] = entrada.nextInt();
            }
        }

        return matrizServico;
    }




    public static double[] valorHospedagem(String[][]arrayHDados, int[][] arrayHNumero){
        double[] valorDiariaTotal = new double[5];

        for (int i = 0; i < 5; i++) {

            if (arrayHDados[i][1].equalsIgnoreCase("s")){
                valorDiariaTotal[i] = 245.00*arrayHNumero[i][1];
            } else if (arrayHDados[i][1].equalsIgnoreCase("d")) {
                valorDiariaTotal[i] = 280.00*arrayHNumero[i][1];
            } else if (arrayHDados[i][1].equalsIgnoreCase("sl")) {
                valorDiariaTotal[i] = 310.00*arrayHNumero[i][1];
            }else{
                valorDiariaTotal[i] = 400.00*arrayHNumero[i][1];
            }
        }
        return valorDiariaTotal;
    }

    public static void gerarRelatorioGerencial(int[][]matrizConsumo, int[][]matrizServico, double[]arrayPrecoProduto, double[]arrayPrecoServico, double[] valorDiariaTotal){
        int totalGeralConsumo=0;
        int totalGeralServico=0;
        int[]totalGeralConsumoVetor = new int[5];
        int[] totalGeralServicoVetor = new int[5];


        for (int i = 0; i < 5; i++) {
            totalGeralConsumo=0;
            for (int j = 0; j < 5; j++) {
                totalGeralServico += matrizServico[i][j];
                totalGeralConsumo += matrizConsumo[i][j];
            }
            totalGeralServicoVetor[i] = totalGeralServico;
            totalGeralConsumoVetor[i] = totalGeralConsumo;
        }


        double totalGastoPorHospedagem=0;
        double[] totalGastoPorHospedagemVetor = new double[5];
        double totalGeralGastoPorProduto =0;
        double [] totalGeralGastoPorProdutoVetor = new double[5];

        for (int i = 0; i < 5; i++) {
            totalGastoPorHospedagem=0;
            totalGeralGastoPorProduto=0;
            for (int j = 0; j < 5; j++) {
               totalGastoPorHospedagem += matrizServico[i][j]* arrayPrecoServico[j];
                totalGeralGastoPorProduto += matrizConsumo[i][j] * arrayPrecoProduto[j];
            }
            totalGeralGastoPorProdutoVetor[i] = totalGeralGastoPorProduto;
            totalGastoPorHospedagemVetor[i] = totalGastoPorHospedagem;
        }



        double[] totalGeral = new double[5];
        for (int i = 0; i < 5; i++) {
          totalGeral[i] = valorDiariaTotal[i]+totalGastoPorHospedagemVetor[i]+totalGeralGastoPorProdutoVetor[i];
        }


        for (int i = 0; i < 5; i++) {
            System.out.println(arrayHNumero[i][0]);
            System.out.println(arrayHDados[i][0]);
            System.out.println(arrayHNumero[i][1]);
            System.out.println(totalGastoPorHospedagemVetor[i]);
            System.out.println(totalGeralGastoPorProdutoVetor[i]);
            System.out.println(totalGeral[i]);

        }

    }










}
