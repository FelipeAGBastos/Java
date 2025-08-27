import java.util.Scanner;
public class Lista2_ex06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int idade=0, quantPessoas=0, contA=0,contB=0, contC=0,contD=0,contE=0, mediaIdade=0;
        String opinoao="";

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();
        mediaIdade = mediaIdade+ idade;
        while (idade!=0){
            System.out.println("Digite sua opnião de A até E:");
            opinoao = entrada.next().toLowerCase().toUpperCase();
            switch (opinoao){
                case "A":
                    contA++;
                    break;
                case "B":
                    contB++;
                    break;
                case "C":
                    contC++;
                    break;
                case "D":
                    contD++;
                    break;
                case "E":
                    contE++;
                    break;
            }
            System.out.println("Digite a sua idade:");
            idade = entrada.nextInt();
            mediaIdade = mediaIdade + idade;
            quantPessoas++;
        }

        System.out.println("a media das idades é:"+mediaIdade/quantPessoas);
        System.out.println("A quantidade de pessoas é:"+quantPessoas);
        System.out.println("A media de A é "+ (contA/quantPessoas)*100);
        System.out.println("A media de B é "+ (contB/quantPessoas)*100);
        System.out.println("A media de C é "+ (contC/quantPessoas)*100);
        System.out.println("A media de D é "+ (contD/quantPessoas)*100);
        System.out.println("A media de E é "+ (contE/quantPessoas)*100);


    }

}
