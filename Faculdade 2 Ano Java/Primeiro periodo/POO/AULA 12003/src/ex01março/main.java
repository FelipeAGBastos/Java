package ex01março;

import java.util.Scanner;

public class main {




    public static void main(String[] args) {
        MonitorEnergia calc = new MonitorEnergia(100);
        calc.registrar(1);
        calc.registrar(3);
        calc.registrar(2);
        calc.registrar(3);
        calc.registrar(2);

        System.out.println("Media de consumo: " + calc.calcularMedia() );
        System.out.println("Media de consumo: " + calc.calcularMedia(2,4) );

    }

}
