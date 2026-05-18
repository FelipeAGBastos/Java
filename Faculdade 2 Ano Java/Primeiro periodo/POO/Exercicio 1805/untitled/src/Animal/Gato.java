package Animal;

public class Gato extends Animal{

    private int tipoPelo;

    public Gato(String nome, double peso, int tipoPelo) {
        super(nome, peso);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public double calcularPrecoBase(){
        if (tipoPelo == 1){
          return 45;
        }else {
            return 65;
        }
    }


    public int getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(int tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
