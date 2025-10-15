import java.util.Scanner;

public class Metodos01 {

    static Scanner entrada = new Scanner(System.in); // Torna o scanner estático

    public static void main(String[] args) {
        verifica(); // Chama o método
    }

    public static void verifica() {
        int num1 = 0;
        System.out.println("Digite um numero: ");
        num1 = entrada.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
