package GS2SIPF_AP;

import java.util.Scanner;

public class HealthHomeCare {

    static Scanner entrada = new Scanner(System.in);
    static FilaPacientes filaMonitora = new FilaPacientes();
    static FilaPacientes filaAtencao = new FilaPacientes();


    public static void main(String[] args) {
        int opc = 0;
        do {
            System.out.println("""
                   
                    +---------------------------------------+
                    |         Condor HealthHomeCare         |
                    +---------------------------------------+
                    Escolha as Opcões que Deseja
                    [1] Inserir Paciente na Fila de Monitoramento
                    [2] Percorrer Fila Monitoramento
                    [3] Percorrer Fila Atenção
                    [4] Dar Alta
                    [5] Sair""");
            opc = entrada.nextInt();
            switch (opc) {
                case 1 -> inserirFilaMonitoramento();
                case 2 -> percorrerFilaMonitoramento();
                case 3 -> percorrerFilaAtencao();
                case 4 -> darAlta();
                case 5 -> encerrarSistema();
                default -> System.out.println("""
                        +----------------------------------------+
                        |    Opção Invalida, Digite Novamente    |
                        +----------------------------------------+""");
            }

        } while (opc != 5);


    }

    private static void encerrarSistema() {
        System.out.println("+---------------------------+");
        System.out.println("|  Função Encerrar Sistema  |");
        System.out.println("+---------------------------+");
        System.out.println("");
        System.out.println("----------------- Fila Monitoramento ---------------");
        int qtdMonitoramento = filaMonitora.getControle();
        if (qtdMonitoramento == 0) {
            System.out.println("Fila De Monitoramento Vazia");
        } else {
            for (int i = 0; i < qtdMonitoramento; i++) {
                Paciente paciente = filaMonitora.dequeue();
                System.out.println("Paciente retirado da Fila de Monitoramento ID: " + paciente.getIdentificacao());
            }
        }

        System.out.println("----------------- Fila Atenção ---------------");
        int qtdAtencao = filaAtencao.getControle();
        if (qtdAtencao == 0) {
            System.out.println("Fila De Atenção Vazia");
        } else {
            for (int i = 0; i < qtdAtencao; i++) {
                Paciente paciente = filaAtencao.dequeue();
                System.out.println("Paciente retirado da Fila de Monitoramento ID: " + paciente.getIdentificacao());
            }
        }

    }

    //ver se n é bom tirar o filaAtencao
    private static void darAlta() {
        System.out.println("+-------------------+");
        System.out.println("|  Função Dar Alta  |");
        System.out.println("+-------------------+");
        System.out.println("");
        int qtdMonitoramentoAlta = filaMonitora.getControle();

        System.out.println("+------------------------+");
        System.out.println("|  Pacientes Internados  |");
        System.out.println("+------------------------+");
        System.out.println("");
        System.out.println("---- Fila Monitoramento ----");
        for (int i = 0; i < qtdMonitoramentoAlta; i++) {
            Paciente pacienteAlta = filaMonitora.dequeue();
            System.out.println("ID Paciente: " + pacienteAlta.getIdentificacao());
            filaMonitora.enqueue(pacienteAlta);
        }
        int qtdAtencaoAlta = filaAtencao.getControle();
        System.out.println("---- Fila Atenção ----");
        for (int i = 0; i < qtdAtencaoAlta; i++) {
            Paciente pacienteAlta = filaAtencao.dequeue();
            System.out.println("ID Paciente: " + pacienteAlta.getIdentificacao());
            filaAtencao.enqueue(pacienteAlta);
        }

        if (qtdMonitoramentoAlta == 0) {
            System.out.println("Fila de monitoramento está vazia");
            return;
        }

        System.out.println("Digite o ID do paciente para dar alta:");
        int idPaciente = entrada.nextInt();

        boolean idEncontrado = false;
        for (int i = 0; i < qtdMonitoramentoAlta; i++) {
            Paciente pacienteAlta = filaMonitora.dequeue();
            if (pacienteAlta.getIdentificacao() == idPaciente) {
                System.out.println("+---------------------------------------------------+");
                System.out.println("|    Paciente ID " + idPaciente + " recebeu alta    |");
                System.out.println("+---------------------------------------------------+");
                idEncontrado = true;
            } else {
                filaMonitora.enqueue(pacienteAlta);
            }
        }

        if (!idEncontrado) {
            System.out.println("+----------------------------------------------------------------------------------+");
            System.out.println("| Paciente com o ID " + idPaciente + " Não foi encontrado na fila de monitoramento |");
            System.out.println("+----------------------------------------------------------------------------------+");
        }


    }

    private static void percorrerFilaMonitoramento() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|           Fila Monitoramento Selecionada          |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        int qtd = filaMonitora.getControle();
        if (qtd == 0) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|          ATENÇÃO:  A fila esta vazia no momento          |");
            System.out.println("+----------------------------------------------------------+");
            return;
        } else {

            System.out.println("");
            System.out.println("    Iniciando Ciclo de Monitoramento de Pacientes    ");
            System.out.println("Foram encontrados " + qtd + " pacientes na Fila de Monitoramento");
            for (int i = 0; i < qtd; i++) {
                System.out.println("");
                Paciente paciente = filaMonitora.dequeue();
                System.out.println("ID Paciente " + (i + 1) + ": " + paciente.getIdentificacao());
                System.out.println("Digite a Pressão Sístole:");
                double pressaSistole = entrada.nextDouble();
                System.out.println("Digite a Pressão Diástole:");
                double pressaoDiastole = entrada.nextDouble();
                System.out.println("Digite a Frequacia Cardiaca:");
                double frequenciaCardiaca = entrada.nextDouble();
                paciente.setPressaoSistole(pressaSistole);
                paciente.setPressaoDiastole(pressaoDiastole);
                paciente.setFrequenciaCardiaca(frequenciaCardiaca);


                if (paciente.getPressaoSistole() > 14 || paciente.getPressaoDiastole() > 10 || paciente.getFrequenciaCardiaca() > 110 || paciente.getFrequenciaCardiaca() < 60) {
                    int controleAlteracao = paciente.getQtdAlteracoes();
                    paciente.setQtdAlteracoes(controleAlteracao + 1);
                    System.out.println("+------------------------------------------------------------------------------+");
                    System.out.println("|        ATENÇÃO: PACIENTE MOVIDO PARA FILA DE ATENCÃO, STATUS ANORMAIS        |");
                    System.out.println("+------------------------------------------------------------------------------+");
                    filaAtencao.enqueue(paciente);
                } else {
                    System.out.println("+----------------------------------------------------------------------------------+");
                    System.out.println("|        Paciente em estado normal, movido novamente para Fila Monitoramento       |");
                    System.out.println("+----------------------------------------------------------------------------------+");
                    filaMonitora.enqueue(paciente);
                }

            }

        }
    }


    private static void percorrerFilaAtencao() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|              Fila Atenção Selecionada             |");
        System.out.println("+---------------------------------------------------+");
        int controleFilaAtencao = filaAtencao.getControle();
        if (controleFilaAtencao == 0) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|          ATENÇÃO:  A fila esta vazia no momento          |");
            System.out.println("+----------------------------------------------------------+");
        } else {
            System.out.println("");
            System.out.println("    Iniciando Ciclo de Monitoramento de Pacientes    ");
            System.out.println("Foram encontrados " + controleFilaAtencao + " pacientes na Fila de Monitoramento");
            for (int i = 0; i < controleFilaAtencao; i++) {
                System.out.println("");
                Paciente pacienteAtencao = filaAtencao.dequeue();
                System.out.println("ID Paciente " + (i + 1) + ": " + pacienteAtencao.getIdentificacao());
                System.out.println("Digite a Pressão Sístole:");
                double pressaSistole = entrada.nextDouble();
                System.out.println("Digite a Pressão Diástole:");
                double pressaoDiastole = entrada.nextDouble();
                System.out.println("Digite a Frequacia Cardiaca:");
                double frequenciaCardiaca = entrada.nextDouble();
                pacienteAtencao.setPressaoSistole(pressaSistole);
                pacienteAtencao.setPressaoDiastole(pressaoDiastole);
                pacienteAtencao.setFrequenciaCardiaca(frequenciaCardiaca);

                if (pacienteAtencao.getPressaoSistole() > 14 || pacienteAtencao.getPressaoDiastole() > 10 || pacienteAtencao.getFrequenciaCardiaca() > 110 || pacienteAtencao.getFrequenciaCardiaca() < 60) {
                    int controleAlteracao = pacienteAtencao.getQtdAlteracoes();
                    pacienteAtencao.setQtdAlteracoes(controleAlteracao + 1);
                    System.out.println("+-------------------------------------------------------------------------------------------+");
                    System.out.println("|          ATENÇÃO: 2 Verificação Alterada! Encaminhando Paciente para Teleconsulta         |");
                    System.out.println("+-------------------------------------------------------------------------------------------+");
                    System.out.println("O paciente foi encaminhado para o médico as pressas devido ao seu segundo alerta...");
                    System.out.println("O médico avaliou o paciente...Qual foi a sua desisão?");
                    System.out.println("[1] Medicar e retornar para a Fila de Monitoramento");
                    System.out.println("[2] Retornar para o hospital e interna-lo");
                    int decisao = entrada.nextInt();

                    if (decisao == 1) {
                        pacienteAtencao.setQtdAlteracoes(0);
                        filaMonitora.enqueue(pacienteAtencao);
                        System.out.println("+----------------------------------------------------------------+");
                        System.out.println("|   O paciente foi medicado e retornou a fila de monitoramento   |");
                        System.out.println("+----------------------------------------------------------------+");

                    } else {
                        System.out.println("+-------------------------------------------------------------------------------------------+");
                        System.out.println("|  Paciente retornou para o hospital para ser internad. Removido do Sistema HealthHomeCare  |");
                        System.out.println("+-------------------------------------------------------------------------------------------+");

                    }

                } else if (pacienteAtencao.getQtdAlteracoes() >= 1) {
                    pacienteAtencao.setQtdAlteracoes(0);
                    filaAtencao.enqueue(pacienteAtencao);
                    System.out.println("+----------------------------------------------------------------+");
                    System.out.println("|  Sinais Normais. O paciente irá permanecer na Fila de Atenção  |");
                    System.out.println("+----------------------------------------------------------------+");
                } else {
                    filaMonitora.enqueue(pacienteAtencao);
                    System.out.println("+----------------------------------------------------------------+");
                    System.out.println("| Sinais Normais. Paciente liberado para a fila de monitoramento |");
                    System.out.println("+----------------------------------------------------------------+");
                }
            }
        }
    }


    private static void inserirFilaMonitoramento() {
        System.out.println("+-----------------------------------------+");
        System.out.println("|        Função Cadastrar Paciente        |");
        System.out.println("+-----------------------------------------+");
        System.out.println("Digite o ID do Paciente:");
        int identificacao = entrada.nextInt();
        Paciente novoPaciente = new Paciente(identificacao, 0.0, 0.0, 0.0);
        filaMonitora.enqueue(novoPaciente);

        System.out.println("+-----------------------------------------------+");
        System.out.println("|        Paciente Cadastrado com Sucesso        |");
        System.out.println("+-----------------------------------------------+");
    }


}
