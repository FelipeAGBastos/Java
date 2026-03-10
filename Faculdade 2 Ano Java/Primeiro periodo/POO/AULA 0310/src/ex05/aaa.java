package ex05;

import java.util.Scanner;

public class aaa {

    static Scanner entrada = new Scanner(System.in);
    static BilheteUnico bu;

    static {
        String usuario, tipoTarifa;

        System.out.println("---------- BILHETE UNICO ----------");
        System.out.println("");
        System.out.println("Digite seu numero de usuario: ");
        usuario = entrada.next();
        System.out.println("Digite o tipo de tarifa: ");
        tipoTarifa = entrada.next();
        System.out.println("------------------------------------");
        bu = new BilheteUnico(usuario, tipoTarifa);
    }

    public static void main(String[] args) {

        int opc = 0;

        do {
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("1- Para carregar o bilhete");
            System.out.println("2- Para passar na catraca");
            System.out.println("3- Para consultar o saldo");
            System.out.println("4- Para finalizar");
            System.out.println("------------------------------------");

            opc = entrada.nextInt();

            switch (opc) {

                case 1 -> carregar();
                case 2 -> pCatraca();
                case 3 -> saldo();
                case 4 -> System.out.println("Obrigado por usar nosso app");
                default-> System.out.println("Opcão invalida");
            }

        } while (opc != 4);

    }


    private static void carregar() {
        double valor;
        System.out.println("Digite o valor de recarga: ");
        valor = entrada.nextDouble();
        bu.carregar(valor);
        System.out.println("Precione enter para continuar");
        entrada.nextLine();
        entrada.nextLine();
    }


    private static void pCatraca() {
        if (bu.passarNaCatraca() == false){
            System.out.println("ERRO: SALDO INSULFICIENTE");
        }else {

            System.out.println("Passou na catraca");
            bu.passarNaCatraca();
            System.out.println("Precione enter para continuar");
            entrada.nextLine();
            entrada.nextLine();
        }
        saldo();

    }

    private static void saldo() {
        System.out.println("Seu saldo é: ");
        System.out.println("Saldo: " + bu.saldo);
        System.out.println("Precione enter para continuar");
        entrada.nextLine();
        entrada.nextLine();
    }
}