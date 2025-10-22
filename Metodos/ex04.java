import java.util.Scanner;

public class ex04 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] chamados = carregar();
        relatorioErros(chamados);
    }

    public static int[][] carregar() {
        int[][] chamados = new int[5][3];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o id do funcionario: ");
            chamados[i][0] = entrada.nextInt();

            System.out.println("Digite o codigo do erro (1, 2 ou 3): ");
            chamados[i][1] = entrada.nextInt();
            while (chamados[i][1] < 1 || chamados[i][1] > 3) {
                System.out.println("Código de erro inválido! Digite 1, 2 ou 3: ");
                chamados[i][1] = entrada.nextInt();
            }

            System.out.println("Digite o critério do erro (1, 2 ou 3): ");
            chamados[i][2] = entrada.nextInt();
            while (chamados[i][2] < 1 || chamados[i][2] > 3) {
                System.out.println("Critério inválido! Digite 1, 2 ou 3: ");
                chamados[i][2] = entrada.nextInt();
            }
        }
        return chamados;
    }

    public static void relatorioErros(int[][] chamados) {
        int[] erros = new int[3];

        for (int i = 0; i < 5; i++) {
            if (chamados[i][1] == 1) {
                erros[0]++;
            } else if (chamados[i][1] == 2) {
                erros[1]++;
            } else if (chamados[i][1] == 3) {
                erros[2]++;
            }
        }

        // Exibe o relatório de erros
        System.out.println("Relatório de erros:");
        System.out.println("Erro 1: " + erros[0]);
        System.out.println("Erro 2: " + erros[1]);
        System.out.println("Erro 3: " + erros[2]);
    }
}