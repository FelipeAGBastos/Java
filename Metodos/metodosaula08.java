import java.util.Scanner;

public class metodosaula08 {

    static Scanner entrada = new Scanner(System.in);
    static int [] arrayQuant= new int[5];


    public static void main(String[] args) {
        String[]arrayCarro=new String[]{"Classic","Cobalt","Onix","Prisma","Cruze"};
        double[]arrayPreco=new double[]{33600,44900,37790,43150,55400};
        int[] qtdCarrosVendidosTotal = new int[5];
        int [][] qtdCarrosVendidos = entradaDeDados(arrayCarro);
        double[] valorTotal = valorTotal(qtdCarrosVendidos, arrayPreco);
        relatorioGerencial(arrayCarro, arrayPreco, valorTotal);
    }







    public static int[][] entradaDeDados(String[] arrayCarro){

        int[][] qtdCarrosVendidos = new int[4][5];

        for (int i = 0; i < 4; i++) {
            System.out.println("Vendas no " + (i+1) + " trimestre");
            for (int j = 0; j < 5; j++) {
                System.out.println(arrayCarro[j] + " : ");
                qtdCarrosVendidos[i][j] = entrada.nextInt();
            }
        }

        return qtdCarrosVendidos;
    }








    public static double[] valorTotal(int[][]qtdCarrosVendidos, double[] arrayPreco){
        double[] vendasTotal = new double[4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                arrayQuant[i] += qtdCarrosVendidos[i][j];
            }
            vendasTotal[i] = arrayQuant[i]* arrayPreco[i];
        }
        return vendasTotal;
    }







    public static void relatorioGerencial(String[]arrayCarro, double[]arrayPreco, double[]vendasTotal){
        for (int i = 0; i < 5; i++) {
                System.out.println(arrayCarro[i] + " " + arrayPreco[i]+ " " + arrayQuant[i] +" "+ vendasTotal[i]);

        }


    }





}
