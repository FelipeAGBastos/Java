import java.util.Scanner;

public class ExercicioFelipe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] lojaSPBrasil = new int[5][4];
        String[] nomeVeiculos = new String[]{"Fit", "Fit rebaixado","Fit bombado", "Fit Tunado","Fit Cromado"};
        int totVendidos=0, totVendidosLoja=0;

        for (int i = 0; i < 4; i++) {
                System.out.println("Veiculos vendidos na loja " + (i+1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o numero de veiculos vendidos do modelo: " + nomeVeiculos[j]);
                lojaSPBrasil[j][i] =  entrada.nextInt();
            }
        }


        System.out.println("");
        for (int i = 0; i <4; i++) {
            totVendidos=0;
            for (int j = 0; j < 5; j++) {
                totVendidos += lojaSPBrasil[j][i];
            }
            System.out.println("Total de veiculos vendidos por loja " + (i+1) + " "+ totVendidos);
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            totVendidosLoja=0;
            for (int j = 0; j < 4; j++) {
                totVendidosLoja += lojaSPBrasil[i][j];
            }
            System.out.println("Total de veiculos vendidos por modelo " + nomeVeiculos[i]+ " " + totVendidosLoja);
        }


    }
}
