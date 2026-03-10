package ex05;

import java.util.Random;

public class BilheteUnico {

    int numero;
    String usuario;
    double saldo;
    String tipoTarifa;
    final static double tarifaBase = 5.40;

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random random = new Random();
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
        this.numero = random.nextInt(1000, 9999);
    }

    public void carregar(double valor) {
        if(valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public boolean passarNaCatraca() {

        double valor = tarifaBase;
        if(tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        // verifica se tem saldo disponível
        if(saldo < valor) {
            return false;
        }

        saldo = saldo - valor;
        return true;
    }

}
