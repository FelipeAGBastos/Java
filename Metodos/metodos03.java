import java.util.Scanner;

public class metodos03 {

    static  Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao=0, n1=0, n2=0;
        while (opcao!=5){
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3-  Multiplicação");
            System.out.println("4-  Divisão");
            System.out.println("5-  Sair");
            opcao = entrada.nextInt();

            System.out.println("Digite o 1 numero: ");
            n1 = entrada.nextInt();
            System.out.println("Digite o 2 numero: ");
            n2 = entrada.nextInt();


            switch (opcao){
                case 1:
                    adicao(n1,n2);
                    break;
                case 2:
                    subtracao(n1,n2);
                    break;
                case 3:
                    multiplicacao(n1,n2);
                    break;
                case 4:
                    divisao(n1,n2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida, por favor digite um numero valido");
                    break;
            }

        }


    }


    public static void adicao(int n1, int n2){
        int soma = n1+n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void subtracao(int n1, int n2){
        int soma= n1 - n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void multiplicacao(int n1, int n2){
        int soma = n1 * n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void divisao(int n1, int n2){
        int soma = n1/n2;
        System.out.println("O resultado é : "  + soma);
    }



}
