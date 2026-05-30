package GS_POOV2.registarEventos;

public class RegistarEventos {
    private String dataHora;
    private String descricao;
    private int impactoIPO;

    public RegistarEventos(String dataHora, String descricao, int impactoIPO) {
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.impactoIPO = impactoIPO;
    }

    public String getdataHora() {
        return dataHora;
    }

    public void setdataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImpactoIPO() {
        return impactoIPO;
    }

    public void setImpactoIPO(int impactoIPO) {
        this.impactoIPO = impactoIPO;
    }


    public String gerarRelatorio(){
        String auxRelatorioRegistarEventos="";
        auxRelatorioRegistarEventos+="---- Relatorio Eventos ----\n";
        auxRelatorioRegistarEventos+="\nData: " + dataHora;
        auxRelatorioRegistarEventos+="\nDescrição: " + descricao;
        auxRelatorioRegistarEventos+="\nImpacto no IPO: " + impactoIPO + "\n";
        auxRelatorioRegistarEventos+="-----------------------------";

        return auxRelatorioRegistarEventos;
    }

}
