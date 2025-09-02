import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] B = new int[]{5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};


        System.out.println("Elementos de A que não estão em B");
        for (int i = 0; i < A.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < B.length; j++) {

                if (A[i]==B[j]){
                    encontrado = true;
                    break;
                }//fim if

            }//fim for j

            if (!encontrado){
                System.out.println(A[i]);
            }

        }//fim for i

        System.out.println("Elementos de B que não estão em A");
        for (int i = 0; i < B.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < A.length; j++) {

                if (B[i]==A[j]){
                    encontrado = true;
                    break;
                }//fim if

            }//fim for j

            if (!encontrado){
                System.out.println(B[i]);
            }

        }//fim for i


    }
}
