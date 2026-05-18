package Servico;

import Animal.Animal;

public abstract class Servico {
    private String descricao;
    private double duracao;

    public Servico(String descricao, double duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public abstract double calcularCusto(Animal a);


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
