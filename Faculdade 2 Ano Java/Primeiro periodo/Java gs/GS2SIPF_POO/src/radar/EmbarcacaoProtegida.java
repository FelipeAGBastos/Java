package radar;

public class EmbarcacaoProtegida extends AlvoRadar{
    private String nomeNavio;
    private double valorCarga;
    private double velocidadeNos;

    public EmbarcacaoProtegida(int idRadar, double latitude, double longitude, String nomeNavio, double valorCarga, double velocidadeNos) {
        super(idRadar, latitude, longitude);
        this.nomeNavio = nomeNavio;
        this.valorCarga = valorCarga;
        this.velocidadeNos = velocidadeNos;
    }


    public String getNomeNavio() {
        return nomeNavio;
    }

    public void setNomeNavio(String nomeNavio) {
        this.nomeNavio = nomeNavio;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    public void setValorCarga(double valorCarga) {
        this.valorCarga = valorCarga;
    }

    public double getVelocidadeNos() {
        return velocidadeNos;
    }

    public void setVelocidadeNos(double velocidadeNos) {
        this.velocidadeNos = velocidadeNos;
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("----- Relatorio Embarcação Protegida -----");
        System.out.println("Nome do Navio: " + nomeNavio);
        System.out.println("Velocidade Navio: " + velocidadeNos);
        System.out.println("Valor da Carga: " + valorCarga);

        System.out.println("----- Posição Gps -----");
        System.out.println("Id Radar: " + idRadar);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }



    @Override
    public int calcularPerigo(){
        int perigoAtual=0;
        if (valorCarga>=10000){
            perigoAtual += 2;
        }else if (valorCarga>=5000){
            perigoAtual+= 1;
        }

        return perigoAtual;
    }

}
