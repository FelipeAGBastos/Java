package GS_POOV2.eventos;

import GS_POOV2.interfaceres.InterferenciaDeSinal;
import GS_POOV2.interfaceres.NivelDeIntensidade;

public class AmeacaClimatica extends AmecaOceanica implements InterferenciaDeSinal, NivelDeIntensidade {
    private String tipoEventoClimatico;
    private double velocidade;

    public AmeacaClimatica(int id, double distanciaNavio, String tipoEventoClimatico, double velocidade) {
        super(id, distanciaNavio);
        this.tipoEventoClimatico = tipoEventoClimatico;
        this.velocidade = velocidade;
    }

    public String getTipoEventoClimatico() {
        return tipoEventoClimatico;
    }

    public void setTipoEventoClimatico(String tipo) {
        this.tipoEventoClimatico = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    @Override
    public String GerarRelatorio(){

        String auxEventoClimatico = tipoEventoClimatico;

        String auxRelatorioClimatico = "---- Relatorio Evento Climatico ----";
        auxRelatorioClimatico += "\nID do Evento: " + id;
        auxRelatorioClimatico += "\nDistancia Do Navio Protegido: " + distanciaNavio +"Km";
        auxRelatorioClimatico += "\nTipo de Evento Climatico: " + auxEventoClimatico;
        auxRelatorioClimatico+= "\n-------------------------------------";
        return auxRelatorioClimatico;
    }


    @Override
    public int interferenciaSinal(){
        int pontosInterferencia = 0;

        if (distanciaNavio<=100){
            pontosInterferencia +=5;
        } else if (distanciaNavio<=200) {
            pontosInterferencia+=4;
        } else if (distanciaNavio<=300) {
            pontosInterferencia += 3;
        } else if (distanciaNavio<=400) {
            pontosInterferencia += 2;
        }else {
            pontosInterferencia+=1;
        }

        return pontosInterferencia;
    }



    @Override
    public int calcularIntensidade(){
        int pontosIntensidade;
        String tipoEvetClimatico = tipoEventoClimatico.trim().toLowerCase();

        if (tipoEvetClimatico.equals("furacões") || tipoEvetClimatico.equals("furacao")){
            if (velocidade>=150){
                pontosIntensidade = 20;
            }else {
                pontosIntensidade = 10;
            }
        } else if (tipoEvetClimatico.equals("nevoeiro")) {
            pontosIntensidade = 15;
        } else if (tipoEventoClimatico.equals("mar agitado")) {
            if (velocidade>50){
                pontosIntensidade =10;
            }else {
                pontosIntensidade = 5;
            }
        } else {
            pontosIntensidade = 3;
        }

        return pontosIntensidade;
    }





    @Override
    public double CalcRisco(){

        double risco = 3;// caso nao identifique nenhum tipo de evento climatico "nao identificado, ele da esse valor ai"

        if (tipoEventoClimatico.equalsIgnoreCase("Furacões")){
             risco=4;
        } else if (tipoEventoClimatico.equalsIgnoreCase("Mar Agitado")) {
             risco=10;
        } else if (tipoEventoClimatico.equalsIgnoreCase("Nevoeiro")) {
             risco=6;
        }

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

        risco+= interferenciaSinal();
        risco+= calcularIntensidade();

        return risco;
    }


}
