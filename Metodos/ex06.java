import java.util.Scanner;

public class ex06 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] produtos = new String[]{"Notbook", "Computadores", "Tablet", "Servidores"};
        int[] venda = new int[]{100, 150, 200, 250};

    }

    public static int[][] entradaDados(int[] produtos){
        int[][] matriz = new int[4][3];
        for (int i = 0; i < 4; i++) {
            System.out.println("--------- Produto: " + produtos[i] + " -------------");
            for (int j = 0; j < 3; j++) {
                System.out.println("");
                System.out.println("Digite o numero de vendas desse produto selecionado: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }


}
