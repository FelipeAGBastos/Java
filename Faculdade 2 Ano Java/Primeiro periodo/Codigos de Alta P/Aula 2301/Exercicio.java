import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=0;
        System.out.println("Digite o valor de N");
        n= entrada.nextInt();
        while (n!=1){

            if (n % 2 != 0){
                n = n*3 + 1;
            }else{
                n = n/2;
            }
            System.out.println(n);

        }



    }
}
