package PetShop.Servico;

import PetShop.Animal.Animal;

public abstract class Servico {
    protected String descricao;
    protected double duracaoEmMinutos;


    public Servico(String descricao, double duracaoEmMinutos) {
        this.descricao = descricao;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public abstract double calcularCusto(Animal a);


}
