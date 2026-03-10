package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class User {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        Conta saudadesMuliro = new Conta();
        double valor=0;


        System.out.println("Digite o nome do correntista: ");
        saudadesMuliro.titular = entrada.next();
        saudadesMuliro.numConta = random.nextInt(1000,9999);

        System.out.println();

        int opc=0;
        System.out.println("Seu saldo atual é: " + saudadesMuliro.saldo);
        System.out.println("Informe o valor de deposito: ");
        valor = entrada.nextDouble();
        saudadesMuliro.depositar(valor);
        System.out.println("Seu saldo atual é: " + saudadesMuliro.saldo);
        System.out.println("Informe o valor de saque: ");
        valor = entrada.nextDouble();
        saudadesMuliro.sacar(valor);
        System.out.println("Seu saldo atual é: " + saudadesMuliro.saldo);




    }





}
