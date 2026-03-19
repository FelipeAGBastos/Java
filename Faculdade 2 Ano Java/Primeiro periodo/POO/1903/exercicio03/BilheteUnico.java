package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    final static double tarifaBase = 5.40;
    String tipoTarifa;
    Usuario usuario;

    public BilheteUnico(Usuario usuario) {
        Random random = new Random();
        this.numero = random.nextInt(1000, 9999);
        this.usuario = usuario;
    }

    public void carregar(double valor) {
        if(valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public double calcularTaifa(){

        double valor = tarifaBase;
        if(usuario.tipoTarifa.equalsIgnoreCase("estudante") ||
                usuario.tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        return valor;
    }


    public boolean passarNaCatraca() {

        double valor = calcularTaifa();
        // verifica se tem saldo disponível
        if(saldo < valor) {
            return false;
        }

        saldo = saldo - valor;
        return true;
    }

}
