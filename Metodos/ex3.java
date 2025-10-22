import java.util.Scanner;

public class ex3 {

    static Scanner entrada = new Scanner(System.in);







    public static void main(String[] args) {

        String[] nomes = new String[4];
        int[] tempo = new int[4];
        double[] salario = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = entrada.next();
            System.out.println("Digite o tempo: ");
            tempo[i] = entrada.nextInt();
            System.out.println("Digite o salario: ");
            salario[i] = entrada.nextDouble();
        }

        //chamada de metodos
        String[] analise = verificacao(tempo,salario);
        relatorio(nomes, analise);

    }


    public static String[] verificacao(int[] tempo , double[] salario){

        String[] analise = new String[4];
        for (int i = 0; i < 4; i++) {
            if (salario[i]<700 || tempo[i]<3){
                analise[i] = "Tem reajuste";
            }else{
                analise[i] = "Não tem reajuste";
            }
        }

        return analise;

    }


    public static void relatorio(String[] nomes,String[] analise){

        System.out.println("Relatorio RH: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nome: " + nomes[i] + " . " + analise[i]);
        }
    }





}
