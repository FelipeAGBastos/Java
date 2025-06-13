import java.util.Scanner;
public class robocop_v3_final {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bateriaCircuito = 80, bateriaUsoario = 0, sobraBat = 0, passosRestantes = 7, contagemPassos = 0, fimBat=0;

        System.out.println("para inicializar aperte enter");
        entrada.nextLine();

        System.out.println("  ______  ");
        System.out.println("|        |");
        System.out.println("|  @  @  |");
        System.out.println("|   ^    |");
        System.out.println("|  ____  | olá, quem é vc...ah, desculpe meus modos, acabei me assustando aqui...");
        System.out.println("| |    | | Fazia muito tempo que nao via um robo querendo enfrentar novos desafios por aqui...");
        System.out.println("| ______ | ");
        System.out.println("");
        System.out.println("");
        System.out.println("para continuar aperte enter");
        entrada.nextLine();

        System.out.println("  ______  ");
        System.out.println("|        |");
        System.out.println("|  @  @  |");
        System.out.println("|   ^    |");
        System.out.println("|  ____  | como faz bastante tempo que ninguem passa por esses lados te darei uma pequena dica...");
        System.out.println("| |    | | a bateria é algo essencial nesse circuito, necessita de " + bateriaCircuito + "% se nao falha a memoria");
        System.out.println("| ______ | ");
        System.out.println("");
        System.out.println("");
        System.out.println("para continuar aperte enter");
        entrada.nextLine();

        System.out.println("  ______  ");
        System.out.println("|        |");
        System.out.println("|  @  @  |");
        System.out.println("|   ^    |");
        System.out.println("|  ____  | sou um robo velho e meu unico desejo antes de partir é ver alguem completando esse desafio");
        System.out.println("| |    | | desejo muito saber qual sera o misterioso tesouro que se encontra aqui...mas lembre-se que se voce morrer nao tera salvação");
        System.out.println("| ______ | ");
        System.out.println("");
        System.out.println("");
        System.out.println("para continuar aperte enter");
        entrada.nextLine();

        System.out.println("  ______  ");
        System.out.println("|        |");
        System.out.println("|  @  @  |");
        System.out.println("|   ^    |");
        System.out.println("|  ____  | ");
        System.out.println("| |    | | bom, mas voltando ao assunto...gostaria que me informasse qual é a sua carga da bateria, para que possa te liberar");
        System.out.println("| ______ | nao aguento mais ver pessoas nao voltando desse labirinto...:");
        System.out.println("");
        System.out.println("primeiramente fale para o velho ansião robo a % da sua bateria");
        bateriaUsoario = entrada.nextInt();

        if (bateriaUsoario <= bateriaCircuito) {
            System.out.println("");
            sobraBat = bateriaCircuito - bateriaUsoario;
            System.out.println("  ______                                                        ----         ");
            System.out.println("|        |                                                      |==|         ");
            System.out.println("|  @  @  |                                                    --   --        ");
            System.out.println("|   ^    |                                                   | Battery|      ");
            System.out.println("|  ____  |                                                   |  low   |      ");
            System.out.println("| |    | | Voce não ira conseguir finalizar o circuito       |        |      ");
            System.out.println("| ______ | Carregue pelo menos mais " + sobraBat + "%");
            return;
        } else {
            System.out.println("");
            System.out.println("  ______  ");
            System.out.println("|        |");
            System.out.println("|  @  @  |");
            System.out.println("|   ^    |");
            System.out.println("|        | Otimo... voce tem bateria suficiente!!!!!");
            System.out.println("| |____| | agora podemos começar o DESAFIO, Boa sorte, pequeno gafanhoto...irá precisar");
            System.out.println("| ______ | ");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("BEM VINDO AO DESAFIO 01000110 01001001 01000001 01010000 01011111 01001101 01001111 01010010 01010100 01000001 01001100");
            System.out.println("mais conhecido como Desafio: Fiap_Mortal para os humanos");
            System.out.println("");
            System.out.println("voce tera que digitar os comandos: direita(1), baixo(2), cima(3), esquerda(4)");
            System.out.println("alem do mais tera que digitar ate mesmo seus passos para concluir a rota");
            fimBat += bateriaUsoario - bateriaCircuito;
        }
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            System.out.println("Digite o " + i + "º comando (direita, baixo, cima, esquerda):");
            String comando = entrada.next().toLowerCase();
            System.out.println("Digite a distancia:");
            int distancia = entrada.nextInt();

            if ((i == 1 && comando.equals("direita") && distancia == 4) ||
                    (i == 2 && comando.equals("baixo") && distancia == 9) ||
                    (i == 3 && comando.equals("direita") && distancia == 6) ||
                    (i == 4 && comando.equals("baixo") && distancia == 7) ||
                    (i == 5 && comando.equals("direita") && distancia == 6) ||
                    (i == 6 && comando.equals("cima") && distancia == 16) ||
                    (i == 7 && comando.equals("esquerda") && distancia == 9)) {
                passosRestantes--;
                contagemPassos++;
                fimBat += -1;
                System.out.println(contagemPassos + " passo concluido, so restam " + passosRestantes);
                System.out.println("");
                System.out.println("");
            } else {
                System.out.println("                 ");
                System.out.println(" --------        ");
                System.out.println("|________|----   ");
                System.out.println("|        |       ");
                System.out.println("|  x  x  |       ");
                System.out.println("|   ^    |       ");
                System.out.println("| ______ |       ");
                System.out.println("voce morreu");
                System.out.println("Comando errado ou invalido");
                System.out.println("--------------------Game over-----------------------------------------------------------");
                return;
            }
        }

        System.out.println("");
        System.out.println("Parabens meu jovem robo aventureiro!!!");
        System.out.println("Voce conseguiu terminar essa jornada");
        System.out.println("eba!!! O robô completou o caminho certo, pegue seu tesouro/premio");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  ______  ");
        System.out.println("|        |");
        System.out.println("|  @  @  |");
        System.out.println("|   ^    |");
        System.out.println("| |____| | Finalmente...finalmente alguem conseguiu completar esse desafio...me diga meu pequeno aventureiro, qual é o grande premio...");
        System.out.println("|        |");
        System.out.println("| ______ | ");
        System.out.println();
        System.out.println("");
        System.out.println(" --------        ");
        System.out.println("|________|----   ");
        System.out.println("|        |       ");
        System.out.println("|  @  @  |       ");
        System.out.println("|   ^    |  o verdadeiro premio é o aprendizado e os conhecimentos de java aprendidos pelo caminho");
        System.out.println("| ______ |       ");
        System.out.println("O robo terminou o codigo com: " + fimBat+ "% de bateria");
        System.out.println("");
        System.out.println("FIM!!!");
        System.out.println("Felipe Alves - 566463");
        System.out.println("Murilo Lopes Frade - 561545");
        System.out.println("Livia Rosa Borges - 564953");
        System.out.println("   ******       ******");
        System.out.println(" **********   **********");
        System.out.println("************* *************");
        System.out.println("*****************************");
        System.out.println(" ***************************");
        System.out.println("  ***********************");
        System.out.println("    *******************");
        System.out.println("      ***************");
        System.out.println("        ***********");
        System.out.println("          *****");
        System.out.println("            *");
    }
}