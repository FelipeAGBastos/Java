import java.util.Scanner;

public class ex2708 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];
        Float[] totVendas = new Float[3];
        Float[] comissao = new Float[3];
        String[] estado = new String[3];
        Float[] totAjustado = new Float[3];
        Float[] maior = new Float[3];
        Float[] menor=new Float[3];
        int totalEstado=0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionario:");
            nomes[i] = entrada.next();
            System.out.println("");
            System.out.println("Digite o total de vendas do funcionario "+nomes[i]);
            totVendas[i] = entrada.nextFloat();
            System.out.println("");
            System.out.println("Digite o total de comissão do vendedor ");
            comissao[i] = entrada.nextFloat()/100;
            totAjustado[i] = (totVendas[i]*comissao[i]);
            System.out.println("");
            System.out.println("Digite o estado do funcionario: ");
            estado[i] = entrada.next();
            if (estado[i].equalsIgnoreCase("SP")){
                totalEstado++;
            }
            System.out.println("");

            maior[0] = comissao[0];
            if (comissao[i]>maior[0]){
                maior[0] = comissao[i];
            }

            menor[0] = totVendas[0];
            if (totVendas[i]<menor[0]){
                menor[0] = totVendas[i];
            }

        }


        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("                         Resultado                       ");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.println(nomes[i]);
            System.out.println(totVendas[i]);
            System.out.println(comissao[i]);
            System.out.println(totAjustado[i]);
            System.out.println(estado[i]);
        }

        System.out.println("");
        System.out.println("O maior numero de comissão foi de "+maior[0]);
        System.out.println("Total de funcionario no estado de sp é: " + totalEstado);
        System.out.println("O menor numero de totVendas foi de "+menor[0]);

    }
}
