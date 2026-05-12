package PetShop.Animal;

public class Gato extends Animal{
    private int tipoPelo;


    public Gato(String nome, double peso, int tipoPelo) {
        super(nome, peso);
        this.tipoPelo = tipoPelo;
    }


    public int getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(int tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public double calcularPrecoBase(){
        double precoBase;

        if (tipoPelo == 1){
            precoBase = 45.00;
        }else {
            precoBase = 65.00;
        }

        return precoBase;
    }



}
