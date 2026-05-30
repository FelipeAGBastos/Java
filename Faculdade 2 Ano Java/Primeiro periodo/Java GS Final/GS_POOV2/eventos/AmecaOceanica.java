package GS_POOV2.eventos;


public abstract class AmecaOceanica {
    protected int id;
    protected double distanciaNavio;

    public AmecaOceanica(int id, double distanciaNavio) {
        this.id = id;
        this.distanciaNavio = distanciaNavio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistanciaNavio() {
        return distanciaNavio;
    }

    public void setDistanciaNavio(double distanciaNavio) {
        this.distanciaNavio = distanciaNavio;
    }

    public abstract double CalcRisco();

    public abstract String GerarRelatorio();




}
