package PetShop.Servico;

import PetShop.Animal.Animal;

public class Banho extends Servico{
    public Banho(String descricao, double duracaoEmMinutos) {
        super(descricao, duracaoEmMinutos);
    }

    public double calcularCusto(Animal a){
        double custo = a.calcularPrecoBase() + (getDuracaoEmMinutos() * 0.5);
        return  custo;
    }

}
