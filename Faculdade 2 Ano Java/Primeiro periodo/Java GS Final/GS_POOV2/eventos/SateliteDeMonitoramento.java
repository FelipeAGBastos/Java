package GS_POOV2.eventos;

import GS_POOV2.interfaceres.InterferenciaDeSinal;

public class SateliteDeMonitoramento implements InterferenciaDeSinal {
    private int codigoSatelite;
    private boolean interferencia;


    public SateliteDeMonitoramento(int codigoSatelite, boolean interferencia) {
        this.codigoSatelite = codigoSatelite;
        this.interferencia = interferencia;
    }

    public int getCodigoSatelite() {
        return codigoSatelite;
    }

    public void setCodigoSatelite(int codigoSatelite) {
        this.codigoSatelite = codigoSatelite;
    }

    public boolean isInterferencia() {
        return interferencia;
    }

    public void setInterferencia(boolean interferencia) {
        this.interferencia = interferencia;
    }

    @Override
    public int interferenciaSinal(){
        int pontosInterferencia;
        if (interferencia){
            pontosInterferencia = 10;
        }else{
            pontosInterferencia = 0;
        }

        return pontosInterferencia;
    }

    public String gerarRelatorio(){

        String auxInterferencia="";
        if (interferencia){
             auxInterferencia = "Sim";
        }else {
             auxInterferencia = "Não";
        }

        String auxRelatorioSatelite = "---- Relatorio Satelite Monitoramento ----";
        auxRelatorioSatelite += "\nCodigo do Satelite: " + codigoSatelite;
        auxRelatorioSatelite += "\nSatelite com interferencia: " + auxInterferencia;
        auxRelatorioSatelite+= "\n------------------------------------------";
        return auxRelatorioSatelite;
    }


}
