package PetShop.Servico;

import PetShop.Animal.Animal;

public class Consulta extends Servico {
    public Consulta(String descricao, double duracaoEmMinutos) {
        super(descricao, duracaoEmMinutos);
    }

    public double calcularCusto(Animal a){
        double custoConsulta;
        custoConsulta = a.calcularPrecoBase() + 35.00;
        return custoConsulta;
    }

}
