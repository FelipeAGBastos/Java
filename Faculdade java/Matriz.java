import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matrizNumero = new int[3][3];

        //carregar matriz


        //indice linha
        //primeiro for congela
        for (int linha = 0; linha < 3; linha++) {
            //movimenta na matriz
            for(int coluna = 0; coluna<3; coluna++){
                System.out.println("Informe o elemento da matriz - Linha " + linha+ " - Coluna "+coluna+ ":");
                matrizNumero[linha][coluna]=entrada.nextInt();
            }

        }

        //exibir matrix
        for(int linha=0; linha<3; linha++){

            for (int coluna=0; coluna<3;coluna++){
                System.out.println("Matriz numeros ["+ linha+","+coluna+"]"
                +matrizNumero[linha][coluna]);

            }

        }



        //exibir matrix em tabela
        for(int linha=0; linha<3; linha++){

            for (int coluna=0; coluna<3;coluna++){
                System.out.print(matrizNumero[linha][coluna]+"\t");
            }


        }



    }
}
