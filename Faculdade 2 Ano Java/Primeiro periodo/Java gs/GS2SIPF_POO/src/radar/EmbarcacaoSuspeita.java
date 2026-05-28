package radar;

public class EmbarcacaoSuspeita extends AlvoRadar{
    private int distanciaKmDoNavio;
    private double velocidadeNos;
    private boolean armementoDetectado;

    public EmbarcacaoSuspeita(int idRadar, double latitude, double longitude, int distanciaKmDoNavio, double velocidadeNos, boolean armementoDetectado) {
        super(idRadar, latitude, longitude);
        this.distanciaKmDoNavio = distanciaKmDoNavio;
        this.velocidadeNos = velocidadeNos;
        this.armementoDetectado = armementoDetectado;
    }


    public int getDistanciaKmDoNavio() {
        return distanciaKmDoNavio;
    }

    public void setDistanciaKmDoNavio(int distanciaKmDoNavio) {
        this.distanciaKmDoNavio = distanciaKmDoNavio;
    }

    public double getVelocidadeNos() {
        return velocidadeNos;
    }

    public void setVelocidadeNos(double velocidadeNos) {
        this.velocidadeNos = velocidadeNos;
    }

    public boolean isArmementoDetectado() {
        return armementoDetectado;
    }

    public void setArmementoDetectado(boolean armementoDetectado) {
        this.armementoDetectado = armementoDetectado;
    }

    @Override
    public void gerarRelatorio(){
        String verificadorArmamentoDetectado="Não";
        if (armementoDetectado){
            verificadorArmamentoDetectado = "Sim";
        }
        System.out.println("-----Navio suspeito detectado-----");
        System.out.println("Distancia do Navio Protegido: " + distanciaKmDoNavio);
        System.out.println("Velocidade da Embarcação Suspeite : " + velocidadeNos);
        System.out.println("Armementos Detectados? " + verificadorArmamentoDetectado);

        System.out.println("----- Posição GPS -----");
        System.out.println("ID Radar: " + idRadar);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }

    @Override
    public int calcularPerigo(){
        int perigo=0;
        if (velocidadeNos>=10 && distanciaKmDoNavio<1000|| armementoDetectado){
            perigo+= 5;
        }

        if (velocidadeNos>=5 && distanciaKmDoNavio<1000|| armementoDetectado){
            perigo += 2;
        }
        return perigo;
    }



}
