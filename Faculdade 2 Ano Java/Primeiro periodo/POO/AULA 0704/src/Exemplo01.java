import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Exemplo01 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
      /* showMessageDialog(null, "Bom dia!");
       showInputDialog("Qual sua idade?");
       showConfirmDialog(null, "Tem certeza que deseja finalizar?");
       */


        int valor1, valor2, resultado;
        valor1 = parseInt(showInputDialog("Primeiro valor: "));
        valor2 = parseInt(showInputDialog("Primeiro valor: "));
        resultado = valor1 + valor2;
        showMessageDialog(null, resultado);



    }






}
