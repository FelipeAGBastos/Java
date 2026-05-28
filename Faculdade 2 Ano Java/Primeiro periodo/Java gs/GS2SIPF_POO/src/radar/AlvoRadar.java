package radar;

import interfaces.CalcularPerigo;
import interfaces.GerarRelatorio;

public abstract class AlvoRadar implements  GerarRelatorio, CalcularPerigo{
    protected int idRadar;
    protected double latitude;
    protected double longitude;


    public AlvoRadar(int idRadar, double latitude, double longitude) {
        this.idRadar = idRadar;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public int getIdRadar() {
        return idRadar;
    }

    public void setIdRadar(int idRadar) {
        this.idRadar = idRadar;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public abstract void gerarRelatorio();

    public abstract int calcularPerigo();


}
