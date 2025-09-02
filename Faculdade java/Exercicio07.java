import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        DecimalFormat moeda = new DecimalFormat("R$#,##0.00");

        Random r = new Random();

        String[] produtos = new String[10];
        double[] preco = new double[10];
        int[] codigo = new int[10];
        double[] percentual = new double[10];
        double[] newpreco = new double[10];

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("Informe o produto: ");
            produtos[i] = entrada.next();

            preco[i]= r.nextDouble(1300);

            codigo[i] =r.nextInt(100)+1;

        }// fim for

        for (int i = 0; i < produtos.length; i++) {



            if (codigo[i] % 2 == 0 && preco[i] > 1000) {
                percentual[i] = 0.20;
            } else if (codigo[i] % 2 == 0) {
                percentual[i] = 0.15;
            } else if (preco[i] > 1000) {
                percentual[i] = 0.10;
            }

            newpreco[i] = preco[i]+(preco[i]*percentual[i]);

        }

        System.out.println("");
        System.out.println("Listagem de todos os produtos");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(codigo[i]+"\t "+produtos[i]+"\t "+moeda.format(preco[i])+"\t "+ percentual[i]+"\t "+moeda.format(newpreco[i]));
        }

        System.out.println("");
        System.out.println("Produtos com aumento");
        for (int i = 0; i < preco.length; i++) {

            if (percentual[i] > 0){
                System.out.println(codigo[i]+"\t "+produtos[i]+"\t "+moeda.format(preco[i])+"\t "+ percentual[i]+"\t "+moeda.format(newpreco[i]));
            }

        }

        //Produtos que não possuem aumento
        System.out.println("");
        System.out.println("Produtos sem aumento");
        for (int i = 0; i < preco.length; i++) {

            if (percentual[i] == 0){
                System.out.println(codigo[i]+"\t "+produtos[i]+"\t "+moeda.format(preco[i])+"\t "+ percentual[i]+"\t "+moeda.format(newpreco[i]));
            }

        }

    }
}
