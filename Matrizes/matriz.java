import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomeLoja = new String[2];
        String[] nomeProd = new String[4];
        int[][] matriz = new int[4][2];
        int menor=0, maior=0, prodMenor=0, prodMaior=0, lojaMaior=0, lojaMenor=0;



        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do produto");
            nomeProd[i] = entrada.next();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome da loja");
            nomeLoja[i] = entrada.next();
        }


        for (int i = 0; i < 4; i++) {
            System.out.println(nomeProd[i]);
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o preço da loja ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        menor = matriz[0][0];
        maior = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                    lojaMenor = j;
                    prodMenor = i;
                }
                if (matriz[i][j] > maior){
                    maior =matriz[i][j];
                    lojaMaior = j;
                    prodMaior = i;
                }
            }
        }

        System.out.println("RESULTADOS");
        System.out.println("Produto mais barato: " + nomeProd[prodMenor] + " Na loja: " + nomeLoja[lojaMenor] + " Com preço de: " + menor);
        System.out.println("Produto mais caro: " + nomeProd[prodMaior] + " Na loja: " + nomeLoja[lojaMaior]+ " Com preço de: " + maior);

    }
}
