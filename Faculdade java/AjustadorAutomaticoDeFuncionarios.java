import java.util.Scanner;

public class AjustadorAutomaticoDeFuncionarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome [] = new String[4];
        Double salario [] = new Double[4];
        int tempo [] = new int[4];
        Boolean nomeFunc [] = new Boolean[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do funcionarios:");
            nome[i] = entrada.next();
            System.out.println("Digite o salario do funcionarios:");
            salario[i] = entrada.nextDouble();
            System.out.println("Digite o tempo do funcionarios:");
            tempo[i] = entrada.nextInt();
        }

        //maior q 5 anos e menor que 780 reais
        for (int i = 0; i < 4; i++) {
            if (salario[i] < 780 && tempo[i] > 5){
                nomeFunc[i] = true;
                salario[i] += salario[i] * 0.35;
            } else if (tempo[i] > 5){
                nomeFunc[i] = true;
                salario[i] += salario[i] * 0.25;
            }else if (salario[i] < 780){
                nomeFunc[i] = true;
               salario[i] += salario[i] * 0.15;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (nomeFunc[i] = true){
                System.out.println("" + nome[i]+ " COM AUMENTO DE: "+ salario[i]);
            }else {
                System.out.println("" + nome + " SEM AUMENTO" );

            }
        }
    }
}

