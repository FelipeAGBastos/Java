package GS_POOV2.eventos;

import GS_POOV2.interfaceres.InterferenciaDeSinal;

public class AmeacaPiratas extends AmecaOceanica implements InterferenciaDeSinal {
    private double velocidadeEmbarcacaoKm;
    private boolean armamentoDetectado;

    public AmeacaPiratas(int id, double distanciaNavio, double velocidadeEmbarcacaoKm, boolean armementoDetectado) {
        super(id, distanciaNavio);
        this.velocidadeEmbarcacaoKm = velocidadeEmbarcacaoKm;
        this.armamentoDetectado = armementoDetectado;
    }

    public double getVelocidadeEmbarcacaoKm() {
        return velocidadeEmbarcacaoKm;
    }

    public void setVelocidadeEmbarcacaoKm(double velocidadeEmbarcacaoKm) {
        this.velocidadeEmbarcacaoKm = velocidadeEmbarcacaoKm;
    }

    public boolean isArmementoDetectado() {
        return armamentoDetectado;
    }

    public void setArmementoDetectado(boolean armementoDetectado) {
        this.armamentoDetectado = armementoDetectado;
    }




    @Override
    public String GerarRelatorio(){
        String auxArmamentoDetectado;
        String auxRelatorioPiratas="";
        if (armamentoDetectado){
            auxArmamentoDetectado = "Sim";
        }else {
             auxArmamentoDetectado = "Não";

        }
        auxRelatorioPiratas += "-------- Embarcação Suspeita --------\n";
        auxRelatorioPiratas+= "ID do Evento: " + id;
        auxRelatorioPiratas+="\nDistancia do Navio Protegido: " + distanciaNavio +"Km";
        auxRelatorioPiratas +="\nVelocidade Da Embarcação: " + velocidadeEmbarcacaoKm+"Km/h";
        auxRelatorioPiratas += "\nArmamento Detectado: " + auxArmamentoDetectado;
        auxRelatorioPiratas += "\n-------------------------------------\n";
        return  auxRelatorioPiratas;
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
    public double CalcRisco(){
        double risco=5;
        if (distanciaNavio<=100){
            risco += 5;
        }else if (distanciaNavio<=200){
            risco += 4;
        }else if (distanciaNavio<=300){
            risco += 3;
        }else if (distanciaNavio<=400){
            risco += 2;
        }else{
            risco += 1;
        }
        risco += interferenciaSinal();
        if (armamentoDetectado){
            risco += 3;
        }
        return risco;
    }






}
