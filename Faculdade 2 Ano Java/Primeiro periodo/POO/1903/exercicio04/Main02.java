package exercicio04;

import java.util.Scanner;


public class Main02 {


    static Veiculos veiculos[] = new Veiculos[10];
    static Scanner entrada = new Scanner(System.in);
    static int index = 0;



    public static void main(String[] args) {
        int opc=0;

        do {
            System.out.println("[1] Entrada de Veiculos: ");
            System.out.println("[2] Saída de veículo");
            System.out.println("[3] Imprimir veículos estacionados");
            System.out.println("[4] Imprimir a receita");
            System.out.println("[5] Finalizar");
            opc = entrada.nextInt();

            switch (opc){
                case 1 -> cadastrar();
                case 2 -> System.out.println("Obrigado por usar o programa");
            }

        } while (opc != 5);


    }

    private static void cadastrar() {
        String marca;
        String modelo;
        String placa;

        System.out.println("Qual a placa do carro");
        placa=entrada.next();
        System.out.println("Digite o Modelo");
        modelo=entrada.next();
        System.out.println("Marca");
        marca=entrada.next();
        Veiculos veiculos1 = new Veiculos(marca, modelo, placa);

    }

}
