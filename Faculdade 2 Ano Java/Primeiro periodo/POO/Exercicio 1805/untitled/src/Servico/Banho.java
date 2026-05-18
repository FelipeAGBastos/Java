package Servico;

import Animal.Animal;

public class Banho extends Servico{

    public Banho(String descricao, double duracao) {
        super(descricao, duracao);
    }

    public double calcularCusto(Animal a){
        double custo;
        return custo = a.calcularPrecoBase() + getDuracao();
    }



}
