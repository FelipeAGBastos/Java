import java.util.Scanner;

public class metodos02 {

     static  Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao=0;
        while (opcao!=5){
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3-  Multiplicação");
            System.out.println("4-  Divisão");
            System.out.println("5-  Sair");
            opcao = entrada.nextInt();


            switch (opcao){
                case 1:
                    adicao();
                break;
                case 2:
                    subtracao();
                break;
                case 3:
                    multiplicacao();
                break;
                case 4:
                    divisao();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção invalida, por favor digite um numeri valido");
                break;
            }

        }


    }


    public static void adicao(){
        int n1=0, n2=0, soma=0;
        System.out.println("Digite o 1 numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o 2 numero: ");
        n2 = entrada.nextInt();
        soma = n1+n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void subtracao(){
        int n1=0, n2=0, soma=0;
        System.out.println("Digite o 1 numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o 2 numero: ");
        n2 = entrada.nextInt();
        soma = n1-n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void multiplicacao(){
        int n1=0, n2=0, soma=0;
        System.out.println("Digite o 1 numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o 2 numero: ");
        n2 = entrada.nextInt();
        soma = n1*n2;
        System.out.println("O resultado é : "  + soma);
    }

    public static void divisao(){
        int n1=0, n2=0, soma=0;
        System.out.println("Digite o 1 numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o 2 numero: ");
        n2 = entrada.nextInt();
        soma = n1/n2;
        System.out.println("O resultado é : "  + soma);
    }



}
