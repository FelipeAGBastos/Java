package PetShop.Main;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    /*1. Cadastrar animal — escolha entre Cachorro, Gato ou Pássaro e preencha nome e peso.
    2. Registrar serviço — seleciona um animal cadastrado e escolhe entre Banho ou Consulta.
    3. Calcular conta total — soma o custo de todos os serviços registrados no dia.
    4. Exibir relatório — lista todos os animais atendidos e os serviços prestados.
    5. Finalizar*/



    public static void main(String[] args) {

        int opc =0;


        do {
            String menu = showInputDialog(null, """
                     1. Cadastrar animal — escolha entre Cachorro, Gato ou Pássaro e preencha nome e peso.
                     2. Registrar serviço — seleciona um animal cadastrado e escolhe entre Banho ou Consulta.
                     3. Calcular conta total — soma o custo de todos os serviços registrados no dia.
                     4. Exibir relatório — lista todos os animais atendidos e os serviços prestados.
                     5. Finalizar
                 """);
            opc  = Integer.parseInt(menu);

            switch (opc){
                case 1 -> cadastrarAnimal();
                case 2 -> registarServico();
                case 3 -> calcularConta();
                case 4 -> exibirReltorio();
                case 5 -> System.out.println("Até Mais");
            }

        }while (opc != 5);

        




    }

    private static void exibirReltorio() {

    }

    private static void calcularConta() {
    }

    private static void registarServico() {
    }

    private static void cadastrarAnimal() {
        boolean liberado = false;

        while (liberado == false){
            String menu = showInputDialog(null, """
                Qual o tipo de animal? 
                [1] Gato
                [2] Cachorro
                [3] Pássaro
                """);
            int tipo = Integer.parseInt(menu);
            if (tipo >= 1 && tipo <= 3) {
                liberado = true;
            }
        }


         String aa = showInputDialog("Digite o peso:");
         int peso = Integer.parseInt(aa);









    }

}
