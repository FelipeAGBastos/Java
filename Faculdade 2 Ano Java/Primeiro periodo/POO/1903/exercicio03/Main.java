package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner sc = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("1. Cadastrar bilhete");
            System.out.println("2. Carregar bilhete");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Passar na catraca");
            System.out.println("5. Finalizar");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consutarSaldo();
                case 4 -> passarCatraca();
                case 5 -> System.out.printf("Até Breve");
                default -> System.out.printf("Opção invalida");
            }

            System.out.println("\n#############################################################################");
        } while(opcao != 5);


    }

    private static void passarCatraca() {
        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {
            if (bilheteUnico.passarNaCatraca() == false) {
                System.out.println("Saldo insuficiente");
            }
            System.out.println("Passou");
            System.out.println("Saldo atual: R$: " + bilheteUnico.saldo);
        }
    }

    private static void consutarSaldo() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null) {
            System.out.println("Saldo Atual R$: " + df.format(bilheteUnico.saldo));
        }
    }

    private static void carregar() {
        double valor;
        BilheteUnico bilheteUnico = pesquisar();
        if (pesquisar() != null) {
            System.out.println("Valor da recarga");
            valor = sc.nextLong();
            bilheteUnico.carregar(valor);
        } else {


        }

    }

    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if(index < bilhete.length) {
            System.out.print("Nome do usuário: ");
            nome = sc.next();
            System.out.print("CPF: ");
            cpf = sc.nextLong();
            System.out.print("Tipo de tarifa (estudante | professor | normal): ");
            tipoTarifa = sc.next();
            Usuario usuario = new Usuario(nome, cpf, tipoTarifa);
            bilhete[index] = new BilheteUnico(usuario);
            index++;
        }
        else {
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento");
        }


    }












    public static BilheteUnico pesquisar() {
        long cpf;
        System.out.print("Qual o CPF para pesquisa? ");
        cpf = sc.nextLong();

        for(int i = 0; i < index; i++) {
            if(bilhete[i].usuario.cpf == cpf) {
                return bilhete[i];
            }
        }
        return null;
    }


}
