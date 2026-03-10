package exercicio01;

public class Conta {

    String titular;
    int numConta;
    double saldo;



    public void depositar(double valor){
        saldo = saldo + valor;
    }


    public void sacar(double valor){
        saldo = saldo - valor;
    }

}







