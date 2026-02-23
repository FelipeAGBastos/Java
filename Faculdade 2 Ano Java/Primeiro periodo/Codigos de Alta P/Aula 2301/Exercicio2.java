import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=0;
        int i=0;
        int contn=1;
        int conti=1;
        int conttotal=0;
        System.out.println("Digite o valor de N");
        n= entrada.nextInt();
        System.out.println("Digite o valor de I");
        i= entrada.nextInt();
        while (n!=1){

            if (n % 2 != 0){
                n = n*3 + 1;
                contn++;
            }else{
                n = n/2;
                contn++;
            }


        }
        while (i!=1){

            if (i % 2 != 0){
                i = i*3 + 1;
                conti++;
            }else{
                i = n/2;
                conti++;
            }


        }

        conttotal=conti+contn;
        System.out.println(conttotal);


    }
}
