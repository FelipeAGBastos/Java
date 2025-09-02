import java.util.Scanner;

public class Quiz_inverso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[]{"Ana","Luis","Carlos"};

        for (int i = nomes.length-1; i >=0; i--) {
            System.out.println(nomes[i]+"["+(i)+"]");
        }


    }
}
