package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    Usuario usuario;

    final static double TARIFABASE = 5.40;

    public BilheteUnico(Usuario usuario) {
        this.usuario = usuario;
        this.numero = gerarNumero();
        this.saldo = 0;
    }

    private int gerarNumero() {
        Random random = new Random();
        return random.nextInt(1000, 10000);
    }

    public double calcularTarifa() {
        if (usuario.tipoTarifa.equalsIgnoreCase("estudante") || usuario.tipoTarifa.equalsIgnoreCase("professor")) {
            return TARIFABASE / 2;
        }
        return TARIFABASE;
    }

    public boolean passarNaCatraca() {
        double valorCusto = calcularTarifa();

        if (this.saldo >= valorCusto) {
            this.saldo -= valorCusto;
            return true;
        }
        return false;
    }

    public void carregar(double valor) {
        if (valor > 0) this.saldo += valor;
    }
}