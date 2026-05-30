package GS_POOV2.eventos;

import GS_POOV2.interfaceres.NivelDeIntensidade;

public class AmeacaIceBergs extends AmecaOceanica implements NivelDeIntensidade {
    private double tamanho;

    public AmeacaIceBergs(int id, double distanciaNavio, double tamanho) {
        super(id, distanciaNavio);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public String GerarRelatorio(){
        String auxIceBeargs="----  Relatorio IceBeargs ----\n";
        auxIceBeargs+="ID Do Evento:" + id;
        auxIceBeargs+="\nDistancia Navio Protegido: " + distanciaNavio +"Km";
        auxIceBeargs+= "\nTamanho: " + tamanho+"Metros\n";
        auxIceBeargs+="-------------------------------------";
        return auxIceBeargs;
    }

    @Override
    public int calcularIntensidade(){
        int pontosIntensidade = 0;

        if (tamanho>=100){
            pontosIntensidade = 10;
        } else if (tamanho >=50) {
            pontosIntensidade = 8;
        }else if (tamanho >=25) {
            pontosIntensidade = 6;
        }else {
            pontosIntensidade = 4;
        }

        return pontosIntensidade;
    }


    @Override
    public double CalcRisco(){
        double risco = 2;
        if (distanciaNavio<=100){
            risco+=5;
        }else if (distanciaNavio<=200){
            risco+=4;
        }else if (distanciaNavio<=300){
            risco+=3;
        }else if (distanciaNavio<=400){
            risco+=2;
        }else {
            risco+=1;
        }

        risco+= calcularIntensidade();
        return risco;
    }

}
