import java.util.Scanner;

public class AnalisadorDeVendasComRelatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precoUni[] = new double[3];
        int qtdVen[] = new int[3];
        int maior[] = new int[3];
        double total=0;
        int localizar=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o preço unitario de cada objeto:");
            precoUni[i] = entrada.nextDouble();
            System.out.println("Informe a quantidade de cada objeto:");
            qtdVen[i] = entrada.nextInt();
            System.out.println("");
        }

        maior[0] += qtdVen[0];
        for (int i = 0; i < 3; i++) {
            if (qtdVen[i] >  maior[0]){
                maior[0] += qtdVen[i];
                localizar++;
            }
        }


        for (int i = 0; i < 3; i++) {
            total += precoUni[i]* qtdVen[i];
        }

        System.out.println("RELATÓRIO DE VENDAS!!!");
        for (int i = 0; i < 3; i++) {
            System.out.println("Qtde: "+ qtdVen[i]+ "    Preço: "+precoUni[i]+"     Total:  "+  precoUni[i]* qtdVen[i]);
        }

        System.out.println("Total geral: "+ total);
        System.out.println("");
        System.out.println("Comissão: " + total * 0.05);
        System.out.println("");
        System.out.println("");

        System.out.println(maior[0] +" Com preço de " +  precoUni[localizar]);

    }
}
