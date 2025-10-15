import java.util.Scanner;

public class metodo06 {


    static Scanner entrada = new Scanner(System.in);
    static String nome;


    public static void main(String[] args) {
        int tipoDeAcomodacao=0, qtdDiarias=0;
        System.out.println("Digite o nome do hospede");
        nome = entrada.next();
        System.out.println("Digite o tipo de acomodação: 1-Standard, 2-Luxo, 3-(Super Luxo");
        tipoDeAcomodacao = entrada.nextInt();
        System.out.println("Digite a quantidade de diarias: ");
        qtdDiarias = entrada.nextInt();



        double estadia = tipoDeAcomodacao(qtdDiarias, tipoDeAcomodacao);
        verificacaoPagamento(estadia);


    }

    public static double tipoDeAcomodacao(int qtdDiarias, int tipoDeAcomodacao){
        double estadia=0;
        switch (tipoDeAcomodacao){
            case 1:
                estadia = 380*qtdDiarias;
            break;
            case 2:
                estadia = 450*qtdDiarias;
            break;
            case 3:
                estadia=560*qtdDiarias;
            break;
        }
        return estadia;
    }

    public static void verificacaoPagamento(double estadia){
        String pagamento;
        System.out.println("Voce ira pagar a vista? (SIM/NAO)");
        pagamento = entrada.next();
        if (pagamento.equalsIgnoreCase("Sim")){
            estadia = estadia - (estadia*0.10);
        }
        System.out.println(estadia);
    }
}
