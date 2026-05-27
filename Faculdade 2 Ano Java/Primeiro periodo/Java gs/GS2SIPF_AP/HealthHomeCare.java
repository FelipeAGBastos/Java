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
               [2] Percorrer Filas
               [3] Dar Alta
               [4] Sair""");
            opc = entrada.nextInt();
            switch (opc){
                case 1 -> inserirFilaMonitoramento();
                case 2 -> percorrerFila();
                case 3 -> darAlta();
                case 4 -> encerrarSistema();
                default -> System.out.println("""
               +----------------------------------------+
               |    Opção Invalida, Digite Novamente    |
               +----------------------------------------+""");
            }

        }while (opc!=4);



    }

    private static void encerrarSistema() {
        System.out.println("+---------------------------+");
        System.out.println("|  Função Encerrar Sistema  |");
        System.out.println("+---------------------------+");
        System.out.println("");
        System.out.println("----------------- Fila Monitoramento ---------------");
        int qtdMonitoramento = filaMonitora.getControle();
        if (qtdMonitoramento == 0){
            System.out.println("Fila De Monitoramento Vazia");
        }else {
            for (int i = 0; i < qtdMonitoramento; i++) {
                filaMonitora.dequeue();
            }
        }

        System.out.println("----------------- Fila Atenção ---------------");
        int qtdAtencao = filaAtencao.getControle();
        if (qtdAtencao == 0){
            System.out.println("Fila De Monitoramento Vazia");
        }else {
            for (int i = 0; i < qtdAtencao; i++) {
                filaAtencao.dequeue();
            }
        }

    }

    private static void darAlta() {
        System.out.println("+-------------------+");
        System.out.println("|  Função Dar Alta  |");
        System.out.println("+-------------------+");
        System.out.println("");
        int qtdAlta = filaMonitora.getControle();
        if (qtdAlta == 0){
            System.out.println("Fila de monitoramento está vazia");
            return;
        }

        System.out.println("Digite o ID do paciente para dar alta:");
        int idPaciente = entrada.nextInt();

        boolean idEncontrado = false;
        for (int i = 0; i < qtdAlta; i++) {
            Paciente pacienteAlta = filaMonitora.dequeue();
            if (pacienteAlta.getIdentificacao() == idPaciente){
                System.out.println("+---------------------------------------------------+");
                System.out.println("|    Paciente ID " + idPaciente + " recebeu alta    |");
                System.out.println("+---------------------------------------------------+");
                idEncontrado = true;
            }else {
                filaMonitora.enqueue(pacienteAlta);
            }
        }

        if (!idEncontrado){
            System.out.println("Paciente com o ID " +  idPaciente +" Não foi encontrado na fila de monitoramento");
        }


    }

    private static void percorrerFila() {
        System.out.println("""
               +---------------------------------------------------+
               |              Função Percorrer Filas               |
               +---------------------------------------------------+""");

        boolean verificadorFila = false;
        do {
            System.out.println("Escolha a Função que deseja Realizar:");
            System.out.println("[1] Percorrer Fila Monitoramento");
            System.out.println("[2] Percorrer Fila Atenção");
            int opc = entrada.nextInt();

            if (opc == 1 || opc ==2){
                verificadorFila = true;
            }else {
                System.out.println("Opcão errada, digite novamente");
            }

            if (opc ==1){
                System.out.println("+---------------------------------------------------+");
                System.out.println("|           Fila Monitoramento Selecionada          |");
                System.out.println("+---------------------------------------------------+");
                System.out.println("");
                int qtd = filaMonitora.getControle();
                if (qtd == 0){
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|          ATENÇÃO:  A fila esta vazia no momento          |");
                    System.out.println("+----------------------------------------------------------+");
                    return;
                }else {

                    System.out.println("");
                    System.out.println("    Iniciando Ciclo de Monitoramento de Pacientes    ");

                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Foram encontrados " + qtd +" pacientes na Fila de Monitoramento");
                        System.out.println("");
                        Paciente paciente = filaMonitora.dequeue();
                        int cont=1;
                        System.out.println("ID Paciente"+ cont +" :" + paciente.getIdentificacao());
                        System.out.println("Digite a Pressão Sístole:");
                        double pressaSistole = entrada.nextDouble();
                        System.out.println("Digite a Pressão Diástole:");
                        double pressaoDiastole = entrada.nextDouble();
                        System.out.println("Digite a Frequacia Cardiaca:");
                        double frequenciaCardiaca = entrada.nextDouble();
                        paciente.setPressaoSistole(pressaSistole);
                        paciente.setPressaoDiastole(pressaoDiastole);
                        paciente.setFrequenciaCardiaca(frequenciaCardiaca);

                        /*La no PDF fala que Os valores considerados normais:
                        Sístole menor ou igual a 14 mmHg.
                        Diástole menor ou igual a 10 mmHg
                        frequência cardíaca acima de 110 batimentos/minuto ou abaixo de 60.
                        ent se o normal é isso eu devo colocar sempre o maior*/

                        if (paciente.getPressaoSistole()>14 || paciente.getPressaoDiastole()> 10 || paciente.getFrequenciaCardiaca()>110){
                            int controleAlteracao = paciente.getQtdAlteracoes();
                            paciente.setQtdAlteracoes(controleAlteracao+1);
                            System.out.println("+------------------------------------------------------------------------------+");
                            System.out.println("|        ATENÇÃO: PACIENTE MOVIDO PARA FILA DE ATENCÃO, STATUS ANORMAIS        |");
                            System.out.println("+------------------------------------------------------------------------------+");
                            filaAtencao.enqueue(paciente);
                        }else {
                            System.out.println("+----------------------------------------------------------------------------------+");
                            System.out.println("|        Paciente em estado normal, movido novamente para Fila Monitoramento       |");
                            System.out.println("+----------------------------------------------------------------------------------+");
                            filaMonitora.enqueue(paciente);
                        }
                    }

                }


            }else{
                System.out.println("+---------------------------------------------------+");
                System.out.println("|              Fila Atenção Selecionada             |");
                System.out.println("+---------------------------------------------------+");
                int controleFilaAtencao = filaAtencao.getControle();
                if (controleFilaAtencao == 0){
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|          ATENÇÃO:  A fila esta vazia no momento          |");
                    System.out.println("+----------------------------------------------------------+");
                }else {
                    System.out.println("");
                    System.out.println("    Iniciando Ciclo de Monitoramento de Pacientes    ");
                    for (int i = 0; i < controleFilaAtencao; i++) {
                        System.out.println("Foram encontrados " + controleFilaAtencao +" pacientes na Fila de Monitoramento");
                        System.out.println("");
                        Paciente pacienteAtencao = filaAtencao.dequeue();
                        int contAtencao = 1;
                        System.out.println("ID Paciente"+ contAtencao +" :" + pacienteAtencao.getIdentificacao());
                        System.out.println("Digite a Pressão Sístole:");
                        double pressaSistole = entrada.nextDouble();
                        System.out.println("Digite a Pressão Diástole:");
                        double pressaoDiastole = entrada.nextDouble();
                        System.out.println("Digite a Frequacia Cardiaca:");
                        double frequenciaCardiaca = entrada.nextDouble();
                        pacienteAtencao.setPressaoSistole(pressaSistole);
                        pacienteAtencao.setPressaoDiastole(pressaoDiastole);
                        pacienteAtencao.setFrequenciaCardiaca(frequenciaCardiaca);

                        if (pacienteAtencao.getPressaoSistole()>14 || pacienteAtencao.getPressaoDiastole()> 10 || pacienteAtencao.getFrequenciaCardiaca()>110){
                            int controleAlteracao = pacienteAtencao.getQtdAlteracoes();
                            pacienteAtencao.setQtdAlteracoes(controleAlteracao+1);
                            System.out.println("+-------------------------------------------------------------------------------------------+");
                            System.out.println("|          ATENÇÃO: 2 Verificação Alterada! Encaminhando Paciente para Teleconsulta         |");
                            System.out.println("+-------------------------------------------------------------------------------------------+");
                            System.out.println("O paciente foi encaminhado para o médico as pressas devido ao seu segundo alerta...");
                            System.out.println("O médico avaliou o paciente...Qual foi a sua desisão?");
                            System.out.println("[1] Medicar e retornar para a Fila de Monitoramento");
                            System.out.println("[2] Retornar para o hospital e interna-lo");
                            //Falta colocar o "try catch" pro usuario n colocar nd errado
                            int decisao = entrada.nextInt();
                            if (decisao ==1){
                                pacienteAtencao.setQtdAlteracoes(0);
                                filaMonitora.enqueue(pacienteAtencao);
                                System.out.println("+----------------------------------------------------------------+");
                                System.out.println("|   O paciente foi medicado e retornou a fila de monitoramento   |");
                                System.out.println("+----------------------------------------------------------------+");

                            }else {
                                System.out.println("+-------------------------------------------------------------------------------------------+");
                                System.out.println("|  Paciente retornou para o hospital para ser internad. Removido do Sistema HealthHomeCare  |");
                                System.out.println("+-------------------------------------------------------------------------------------------+");

                            }

                        }else if (pacienteAtencao.getQtdAlteracoes()>=1){
                            pacienteAtencao.setQtdAlteracoes(0);
                            filaAtencao.enqueue(pacienteAtencao);
                            System.out.println("+----------------------------------------------------------------+");
                            System.out.println("|  Sinais Normais. O paciente irá permanecer na Fila de Atenção  |");
                            System.out.println("+----------------------------------------------------------------+");
                        }else {
                            filaMonitora.enqueue(pacienteAtencao);
                            System.out.println("+----------------------------------------------------------------+");
                            System.out.println("| Sinais Normais. Paciente liberado para a fila de monitoramento |");
                            System.out.println("+----------------------------------------------------------------+");
                        }
                    }
                }
            }
        }while (!verificadorFila);
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
