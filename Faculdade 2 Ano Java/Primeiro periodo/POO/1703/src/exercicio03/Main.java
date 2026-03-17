package exercicio03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner entrada = new Scanner(System.in);
    static int index =0;

    public static void main(String[] args) {
        int opcao;


        do {
            System.out.println("------------- Sistema de Bilhete Unico ------------------");
            System.out.println("[1] Para cadastrar Clientes");
            System.out.println("[2] Para carregar Bilhetes");
            System.out.println("[3] Para Consultar Saldo");
            System.out.println("[4] Para passar na catraca");
            System.out.println("[5] Para Sair");
            opcao = entrada.nextInt();


            switch (opcao){

                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consultar();
                case 4 -> passarCatraca();
                case 5 -> encerrar();

                default-> System.out.println("Opcão invalida");
            }

        } while (opcao!=5);




    }

    private static void encerrar() {

    }

    private static void passarCatraca() {
    }

    private static void consultar() {
    }


    private static void carregar() {

    }


    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (index < bilhete.length){
            System.out.println("Digite seu nome: ");
            nome = entrada.next();
            System.out.println("Digite seu CPF");
            cpf = entrada.nextLong();
            System.out.println("Digite o Tipo de Tarifa");
            tipoTarifa=entrada.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }else {
            System.out.println("Erro ao gerar o bilhete, Procure um posto de atendimento da SPTRANS");
        }

    }

    public BilheteUnico pesquisar(){
        long cpf;
        System.out.println("Qual CPF para pesquisar?");
        cpf = entrada.nextLong();


        for (int i = 0; i < index; i++) {
            if (bilhete[i].usuario.cpf==cpf){
                return bilhete[i];
            }
        }
        System.out.println("CPF nao encontrado");
        return null;
    }

}