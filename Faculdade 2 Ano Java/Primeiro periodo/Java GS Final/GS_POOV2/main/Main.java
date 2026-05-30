package GS_POOV2.main;

import GS_POOV2.eventos.*;
import GS_POOV2.registarEventos.RegistarEventos;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<AmecaOceanica> saleliteRadarAmeaca = new ArrayList<>();
    static ArrayList<SateliteDeMonitoramento> constelacaoDeSaltelite = new ArrayList<>();
    static ArrayList<RegistarEventos> historicoEventosArray = new ArrayList<>();

    public static void main(String[] args) {


        int opcMenu =0;
        do {

            String menu = """
                [1] Cadastrar Nova Ameaça
                [2] Listar Ameaças Cadastradas
                [3] Executar Calculo de Risco
                [4] Registrar Evento
                [5] Historico de Eventos
                [6] Calcular IPO
                [7] Sair
                """;

            try {
                String entradaMenu = showInputDialog(null, menu);
                if (entradaMenu == null){
                    opcMenu = 7;
                }else {
                    opcMenu = Integer.parseInt(entradaMenu);
                }

            }catch (NumberFormatException e){
                showMessageDialog(null, "Erro, Por Favor, Digite apenas numeros.");
            }


            switch (opcMenu){
                case 1-> cadastrarAmeaca();
                case 2-> listarAmeaca();
                case 3-> executarCalculoRisco();
                case 4-> registrarEvento();
                case 5-> historicoEventos();
                case 6 -> calcularIPO();
                case 7 -> showMessageDialog(null, "Desligando satelite...Volte sempre");
            }


        }while (opcMenu!=7);

    }

    private static void calcularIPO() {
        double ipoTotal = 0;

        for (AmecaOceanica amecasOceanica : saleliteRadarAmeaca){
            ipoTotal += amecasOceanica.CalcRisco();
        }

        for (SateliteDeMonitoramento sateliteMonitoramento : constelacaoDeSaltelite){
            ipoTotal += sateliteMonitoramento.interferenciaSinal();
        }

        for (RegistarEventos registarEvento : historicoEventosArray){
            ipoTotal+= registarEvento.getImpactoIPO();
        }

        String status;
        if (ipoTotal>=80){
            status = "VERMELHO (ALERTA CRITICO - NAVEGAÇÃO COMPROMETIDA. MUITO RISCO \n ESCAMINHANDO CASO PARA A MARINHA)";
        } else if (ipoTotal>=40) {
            status = "AMARELO (Atenção Requirida. Nivel de Risco Moderado\n Reforçando Escolta Via Satelite)";
        }else {
            status = "VERDE (Operação Segura - Baixo indice de Risco)";
        }

        String relatorioIPO = "------------- Relatorio IPO -------------\n";
        relatorioIPO += "Risco Total do IPO: " + ipoTotal + "\n";
        relatorioIPO += "Status do Sistema:\n " + status + "\n\n";
        relatorioIPO += "--- Fatores que Somaram no Calculo --- \n";
        relatorioIPO += "Ameaças Ativas Rastreadas por Nosso satelite: " + saleliteRadarAmeaca.size() + "\n";
        relatorioIPO += "Satelites na Constelação em Estado de Atenção: " + constelacaoDeSaltelite.size() + "\n";
        relatorioIPO += "Eventos Registrados: " + historicoEventosArray.size() + "\n";
        relatorioIPO += "------------------------------------------------------------------------";

        showMessageDialog(null, relatorioIPO);

    }

    private static void historicoEventos() {
        if (historicoEventosArray.isEmpty()){
            showMessageDialog(null, "Nenhum Evento Cadastrado");
            return;
        }

        String relatorioHistoricoEvento = "\n--- Historico de Eventos---";
        for (RegistarEventos registarEvento : historicoEventosArray){
            relatorioHistoricoEvento += registarEvento.gerarRelatorio() + "\n";
        }
        showMessageDialog(null, relatorioHistoricoEvento, "Historico", INFORMATION_MESSAGE);
    }

    private static void registrarEvento() {

        try {
            String dataHora = showInputDialog(null, "Digite Que Horas Ocorreu o Evento (Ex: 12:30)");
            String descicao = showInputDialog(null, "Faça a Descrição do Evento Ocorrido (Ex: Perda de sinal)");
            int impacto = Integer.parseInt(showInputDialog("Digite o Impacto no Caluculo de IPO"));
            historicoEventosArray.add(new RegistarEventos(dataHora, descicao, impacto));
            showMessageDialog(null, "Evento Registrado com Sucesso");
        } catch (Exception e) {
            showMessageDialog(null, "Erro, Por Favor digite a DataHora e Descrição Corretamente. Impacto IPO Precisa Ser um Numero Inteiro .");
        }

    }

    private static void executarCalculoRisco() {
        if (saleliteRadarAmeaca.isEmpty()){
            showMessageDialog(null, "O Radar de Satelite e a Constelação estão Limpos. Nenhuma Entidade Ameaça Cadastrada");
            return;
        }

        String relatorioRisco = "--- Analise de Risco do Radar\n";
        for (AmecaOceanica amecasOceanica : saleliteRadarAmeaca){
            relatorioRisco += "\nAmeaça ID: " + amecasOceanica.getId() + "\n";
            relatorioRisco += "Nivel de Risco Calculado: " + amecasOceanica.CalcRisco() + "Pontos \n";
            relatorioRisco += "----------------------------------------";
        }

        showMessageDialog(null, relatorioRisco, "Calculo De Risco", WARNING_MESSAGE);
    }

    private static void listarAmeaca() {
        if (saleliteRadarAmeaca.isEmpty() && constelacaoDeSaltelite.isEmpty()){
            showMessageDialog(null, "O Radar de Satelite e a Constelação estão Limpos. Nenhuma Entidade Ameaça Cadastrada");
            return;
        }


        String relatorioGeral = "--- Relatorio Do Sistema Orbital ---\n";
        if (!constelacaoDeSaltelite.isEmpty()){
            relatorioGeral += "\n--- Constelação de Satelites ---\n";
            for (SateliteDeMonitoramento sateliteMonitoramento : constelacaoDeSaltelite) {
                relatorioGeral += sateliteMonitoramento.gerarRelatorio() + "\n\n";
            }
        }

        if (!saleliteRadarAmeaca.isEmpty()){
            relatorioGeral+= "\n--- Ameaças detectadas do Radar ---\n";
            for (AmecaOceanica amecasOceanica : saleliteRadarAmeaca){
                relatorioGeral+= amecasOceanica.GerarRelatorio() + "\n\n";
            }
        }

        showMessageDialog(null, relatorioGeral, "Status das Entidades", INFORMATION_MESSAGE);


    }

    private static void cadastrarAmeaca() {
        String menuCadastrarEntidade = showInputDialog(null, """
                Sistema de Cadastro de Ameaças
                [1] Piratas
                [2] IceBergs
                [3] Evento Climarico
                [4] Satelite com Interferencia
                """);
        try {
            if (menuCadastrarEntidade == null) {
                return;
            }

            int opcCadastrarEntidade = Integer.parseInt(menuCadastrarEntidade);

            if (opcCadastrarEntidade == 1){

                int id = Integer.parseInt(showInputDialog(null, "Digite o ID da Ameaça:"));
                double distanciaNavio = Double.parseDouble(showInputDialog(null, "Digite a Distancia que a Embarcação Suspeita está do navio(Em KM):"));
                double velocidadeEmbarcacao = Double.parseDouble(showInputDialog(null, "Digite a velocidade da Embarcação Suspeita(Em Km/H:"));
                int auxArmamento = (showConfirmDialog(null, "a Embarcação Suspeita Está com armamento?"));
                boolean armamento = false;
                if (auxArmamento == 0){
                    armamento = true;
                }
                saleliteRadarAmeaca.add(new AmeacaPiratas(id, distanciaNavio, velocidadeEmbarcacao, armamento));
                showMessageDialog(null, "Ameaça Cadastrada Com Sucesso.");

            } else if (opcCadastrarEntidade == 2) {
                int id = Integer.parseInt(showInputDialog(null, "Digite o ID da Ameaça:"));
                double distanciaNavio = Double.parseDouble(showInputDialog(null, "Digite a Distancia que o IceBerg está do navio(Em KM):"));
                double tamanho = Double.parseDouble(showInputDialog(null, "Digite o tamanho do IceBerg(Metros):"));
                saleliteRadarAmeaca.add(new AmeacaIceBergs(id, distanciaNavio, tamanho));
                showMessageDialog(null, "Ameaça Cadastrada Com Sucesso.");

            } else if (opcCadastrarEntidade == 3){
                int id = Integer.parseInt(showInputDialog(null, "Digite o ID da Ameaça:"));
                double distanciaNavio = Double.parseDouble(showInputDialog(null, "Digite a Distancia que o Evento Climatico está do navio(Em KM):"));
                String tipoEvento = showInputDialog(null, "Digite o tipo de Evento Climatico (Furacão, Nevoeiro ou Mar agitado)");
                double velocidade = Double.parseDouble(showInputDialog(null, "Digite a velocidade do Evento Climatico(Em KM):"));
                saleliteRadarAmeaca.add(new AmeacaClimatica(id, distanciaNavio, tipoEvento, velocidade));
                showMessageDialog(null, "Ameaça Cadastrada Com Sucesso.");
            } else if (opcCadastrarEntidade == 4) {
                int id = Integer.parseInt(showInputDialog(null, "Digite o ID do Satelite:"));
                int interferencia = (showConfirmDialog(null, "O Satelite está com intererencia?(2 Verificação para 100% de certeza)"));
                boolean auxInterferencia = false;
                if (interferencia == 0){
                    auxInterferencia = true;
                }
                constelacaoDeSaltelite.add(new SateliteDeMonitoramento(id, auxInterferencia));
                showMessageDialog(null, "Satelite com Possivel Risco Cadastrado Com Sucesso.");

            }else {
                showMessageDialog(null, "Erro, Por Favor, Digite apenas numeros de 1-4. Voltando ao menu principal.");
            }


        }catch (NumberFormatException e){
            showMessageDialog(null, "Erro, Por Favor, Digite apenas numeros. Voltando ao menu principal.");
        }

    }

}
