package PetShop.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase(){
        double precoBase;
        if (getPeso() <= 10){
            precoBase = 40.00;
        }else if (getPeso() <= 25){
            precoBase = 60.00;
        } else {
            precoBase = 85.00;
        }
        return precoBase;
    }

}
