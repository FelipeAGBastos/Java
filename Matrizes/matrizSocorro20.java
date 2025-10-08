import java.util.Scanner;

public class matrizSocorro20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] carrosModelos = new String[]{"Fit", "Corolla","Civic", "hb20"};
        String[]  lojas = new String[]{"LA", "LB","LC"};
        int[][] relatorioVendas = new int[4][3];
        int[] metas = new int[4];
        int[] totCarros = new int[4];
        int totalMatriz=0;
        int[] totLoja = new int[3];


        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("carro " + carrosModelos[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite quantos carros desse modelo foram vendidos na loja " + lojas[j]);
                relatorioVendas[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite as metas: ");
            metas[i] = entrada.nextInt();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totCarros[j] += relatorioVendas[j][i];
                totalMatriz += relatorioVendas[j][i];
            }
        }


        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("O percentual do carro " + carrosModelos[i] +" em relação ao total é de: " + (totCarros[i]/(double)totalMatriz)*100 + "%");
        }

        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                totLoja[j] += relatorioVendas[i][j];
            }
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
        System.out.println("Total de carros por loja é de: " + totLoja[i]);
        }


        System.out.println("");
        for (int i = 0; i < 4; i++) {
            if (totCarros[i]>metas[i]){
                System.out.println("O carro " + carrosModelos[i] + " atingiu a meta");
            }
        }
















    }
}
