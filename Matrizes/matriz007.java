import java.util.Scanner;

public class matriz007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[]nomeProduto = new String[]{"ProdutoA", "ProdutoB", "ProdutoC", "ProdutoD", "ProdutoE"};
        String[]localVendas = new String[]{"Brás", "Piraporinha","Aparecida", "Belo Horizonte"};
        int[]totVendidasProduto = new int[5];
        int[]qtdLojas=new int[4];
        int[][]matriz = new int[5][4];
        //linha coluna
        int[]metaDeVendas = new int[5];
        int totVendasTotal=0, totalVendasPorLugar=0,menor=0, controleMetas=0, controle=0;

        for (int i = 0; i < 4; i++) {
            System.out.println("------------ " + localVendas[i]+" --------------");
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite a quantidade de itens vendidos do produto "+ nomeProduto[j]+ ": ");
                matriz[j][i] = entrada.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a meta de vendas: ");
            metaDeVendas[i] = entrada.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totVendidasProduto[i] += matriz[i][j];
                totVendasTotal += matriz[i][j];
            }
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("O percentual é: "+ (totVendidasProduto[i]/(double)totVendasTotal)*100);
        }


        System.out.println("");
        for (int i = 0; i < 4; i++) {
            totalVendasPorLugar=0;
            for (int j = 0; j < 5; j++) {
                totalVendasPorLugar += matriz[j][i];
            }
            System.out.println("O total de vendas em " + localVendas[i] + " é de: " + totalVendasPorLugar);
            qtdLojas[i] = totalVendasPorLugar;
        }

        menor = qtdLojas[0];
        for (int i = 0; i < qtdLojas.length; i++) {
            if (qtdLojas[i]<menor){
                menor = qtdLojas[i];
                controle = i;
            }
        }

        System.out.println("");
        System.out.println("O valor com menor circulação é: " + menor + " em: " + localVendas[controle]);


        System.out.println("");
        for (int i = 0; i < qtdLojas.length; i++) {

            if (qtdLojas[i]>metaDeVendas[i]){
                System.out.println("A loja " + nomeProduto[i] + " Atingiu a meta");
            }

        }








    }
}
