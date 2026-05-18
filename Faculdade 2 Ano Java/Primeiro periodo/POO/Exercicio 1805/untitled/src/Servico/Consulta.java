package Servico;

import Animal.Animal;

public  abstract class Consulta extends Servico{
    public Consulta(String descricao, double duracao) {
        super(descricao, duracao);
    }

    public double calcularCusto(Animal a){
        double custo;
        return custo = a.calcularPrecoBase() + 35;
    }



}
