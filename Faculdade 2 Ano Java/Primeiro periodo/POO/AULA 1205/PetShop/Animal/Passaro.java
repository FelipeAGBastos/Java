package PetShop.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    public double calcularPrecoBase(){
        double precoBase;
        precoBase = 30.00;
        return precoBase;
    }




}
