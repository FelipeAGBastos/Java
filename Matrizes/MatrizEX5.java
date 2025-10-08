import java.util.Scanner;

public class MatrizEX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[5][3];
        int[][] matriz2 = new int[5][3];
        int[][] matriz3 = new int[5][3];


        int[] totalMatriculasPorUnidade = new int[3];
        int[] totalMatriculasPorCurso = new int[5];


        System.out.println("------------------------------------------");
        System.out.println("1º Semestre");
        System.out.println("------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o nº de matrículas do curso " + (i + 1) + " na unidade " + (j + 1) + ": ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");
        System.out.println("2º Semestre");
        System.out.println("------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o nº de matrículas do curso " + (i + 1) + " na unidade " + (j + 1) + ": ");
                matriz2[i][j] = entrada.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("a) Quantidade de matrículas de cada curso por unidade no ano:");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Curso " + (i + 1) + ", Unidade " + (j + 1) + ": " + matriz3[i][j] + " matrículas");
            }
            System.out.println("----");
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                totalMatriculasPorUnidade[j] += matriz3[i][j];
            }
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("b) Total de matrículas por unidade no ano:");
        System.out.println("------------------------------------------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("Total na Unidade " + (j + 1) + ": " + totalMatriculasPorUnidade[j] + " matrículas");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                totalMatriculasPorCurso[i] += matriz3[i][j];
            }
        }
        System.out.println("\n------------------------------------------------------");
        System.out.println("c) Total de matrículas de cada curso no ano:");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Total no Curso " + (i + 1) + ": " + totalMatriculasPorCurso[i] + " matrículas");
        }

        int maiorNumeroDeMatriculas = totalMatriculasPorCurso[0];
        for (int i = 1; i < totalMatriculasPorCurso.length; i++) {
            if (totalMatriculasPorCurso[i] > maiorNumeroDeMatriculas) {
                maiorNumeroDeMatriculas = totalMatriculasPorCurso[i];
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("MAIOR NÚMERO DE MATRÍCULAS");
        System.out.println("-------------------------------------------");
        System.out.println("Maior número de matrículas:" + maiorNumeroDeMatriculas);

    }
}