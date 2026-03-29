package Pilha;


import java.util.Scanner;

public class PilhaMain {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Metodoss pilha = new Metodoss();


        pilha.init();
        pilha.push(60);
        pilha.push(50);
        pilha.push(40);
        pilha.push(30);
        pilha.push(20);
        pilha.push(10);
        pilha.push(5);


        System.out.println("");

        if (!pilha.isEmpty()) {
            pilha.top();
        } else {
            System.out.println("Pilha vazia, não há nada para ler!");
        }

        if (!pilha.isEmpty()) {
            System.out.println("Valor retirado: " + pilha.pop());
        } else {
            System.out.println("Pilha vazia, não há nada para ler!");
        }

        System.out.println("");
        pilha.esvaziaPilha();


        System.out.println("");
        System.out.println("");
        converterPaBN(1);
        verificarPalindromo();

    }


    public static void converterPaBN(int decimal) {
        Metodoss pilha = new Metodoss();


        if (decimal==0){
            System.out.println("Decimal: 0");
            return;
        }

        while (decimal>0){
            pilha.push(decimal % 2);
            decimal = decimal/2;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Resultado");
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

    }



    public static void verificarPalindromo() {
        Metodoss pilha = new Metodoss();
        pilha.init();

        int[] original = new int[pilha.N];
        int cont = 0;

        System.out.println("Digite números positivos (negativo para parar):");
        while (cont < pilha.N) {
            int valor = entrada.nextInt();
            if (valor < 0) break;
            original[cont] = valor;
            pilha.push(valor);
            cont++;
        }

        boolean ehPalindromo = true;
        for (int i = 0; i < cont; i++) {
            if (original[i] != pilha.pop()) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo && cont > 0) System.out.println("É um palíndromo!");
        else System.out.println("Não é um palíndromo.");
    }


}
