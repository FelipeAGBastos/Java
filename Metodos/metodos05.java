import java.util.Scanner;

public class metodos05 {

      static Scanner entrada = new Scanner(System.in);
      static String nome;

    public static void main(String[] args) {
        double media=calcular();
        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
        System.out.println(analiseResultado(media));

    }

    public static double calcular(){
        double checkpoint=0, sprint=0, gs=0, media=0;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        System.out.println("Digite a nota do Chekpoint: ");
        checkpoint=entrada.nextDouble();
        System.out.println("Calcule a nota da Sprint: ");
        sprint = entrada.nextDouble();
        System.out.println("Digite a nota da gs: ");
        gs = entrada.nextDouble();

        media=(checkpoint+sprint+gs)/3;
        return media;
    }

    public static String analiseResultado(double media){
        String analise;

        if (media>=6){
            analise="Aprovado";
        } else  if (media>=4){
            analise="Exame";
        }else{
            analise="DP";
        }

        return analise;
    }

    public static String alura(double media){
        String alura;
        if (media > 6){
            alura="Ativada";
        }else {
            alura="Desativada";
        }
        return alura;
    }

}
