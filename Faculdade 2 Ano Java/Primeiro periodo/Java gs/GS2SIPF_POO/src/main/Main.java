package main;

import radar.AlvoRadar;
import radar.EmbarcacaoProtegida;
import radar.EmbarcacaoSuspeita;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<AlvoRadar> alvoRadars = new ArrayList<>();
    static ArrayList<EmbarcacaoProtegida> embarcacaoProtegidas = new ArrayList<>();
    static ArrayList<EmbarcacaoSuspeita> embarcacaoSuspeitas = new ArrayList<>();

    public static void main(String[] args) {



        int opc;

        do {
            System.out.println("""
                [1] Cadastrar Embarcação a Ser Protegida
                [2] Cadastrar Perigo
                [3] Realizar Varredura na Area
                [4] Gerar Relatorio
                [5] Calcular Perigo(IPO)
                [6] Sair
                """);
            opc = entrada.nextInt();
            switch (opc){
                case 1 -> cadastrarEmbarcacao();
                case 2-> cadastrarPerigo();
                case 3-> realizarVarredura();
                case 4-> gerarRelatorio();
                case 5 -> calcularPerigo();
                case 6 -> System.out.println("Tenha um Bom Dia");
                default -> System.out.println("Opção incorreta, digite valores entre 1 e 6");
            }
        }while (opc!=6);








    }

    private static void calcularPerigo() {

    }

    private static void gerarRelatorio() {


    }

    private static void realizarVarredura() {
    }

    private static void cadastrarPerigo() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("|             Função Cadastrar Perigo              |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Digite o ID do radar para realizar o monitoramento: ");
        int radar = entrada.nextInt();
        System.out.println("Digite a Latitude do Embarcação Suspeita para realizar o travamento do rastreio: ");
        double latitude = entrada.nextDouble();
        System.out.println("Digite a Longitude do Embarcação Suspeita para realizar o travamento do rastreio:");
        double longitude = entrada.nextDouble();
        System.out.println("Digite a Distancia do Embarcação Suspeita ate o barco");
        int distanciaKmDoNavio = entrada.nextInt();
        System.out.println("Digite a velocidade da Embarcação Suspeita");
        double velocidadeNos = entrada.nextDouble();
        System.out.println("A embarcação suspeitas possui armamento?");
        String auxArmamento = entrada.next();
        boolean armementoDetectado;
        if (auxArmamento.equalsIgnoreCase("Sim")){
            armementoDetectado = true;
        }else {
            armementoDetectado = false;
        }


        EmbarcacaoSuspeita novoEmbarcacaoSuspeita = new EmbarcacaoSuspeita(radar, latitude, longitude, distanciaKmDoNavio, velocidadeNos, armementoDetectado);
        embarcacaoSuspeitas.add(novoEmbarcacaoSuspeita);

    }

    private static void cadastrarEmbarcacao() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("|               Cadastrar Embarcação               |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Digite o ID do radar para realizar o monitoramento: ");
        int radar = entrada.nextInt();
        System.out.println("Digite a Latitude do navio para realizar o travamento do rastreio: ");
        double latitude = entrada.nextDouble();
        System.out.println("Digite a Longitude do navio para realizar o travamento do rastreio:");
        double longitude = entrada.nextDouble();
        System.out.println("Digite o Nome do navio:");
        String nomeNavio = entrada.next().toUpperCase();
        System.out.println("Digite o Valor da Carga:");
        double valorCarga = entrada.nextDouble();
        System.out.println("Digite a velocidade Maxima do navio:");
        double valocidadeNosMax = entrada.nextDouble();
        EmbarcacaoProtegida novoEmbarcacaoProtegida = new EmbarcacaoProtegida(radar, latitude, longitude, nomeNavio, valorCarga, valocidadeNosMax);
        System.out.println("");
        embarcacaoProtegidas.add(novoEmbarcacaoProtegida);
        System.out.println("+--------------------------------------------------+");
        System.out.println("|         Embarcação Cadastrada com Sucesso        |");
        System.out.println("+--------------------------------------------------+");

    }

}
