package GS2SIPF_AP;

public class Paciente {
    private int identificacao;
    private double pressaoSistole;
    private double pressaoDiastole;
    private double frequenciaCardiaca;
    private int qtdAlteracoes;

    public Paciente(int identificacao, double pressaoSistole, double pressaoDiastole, double frequenciaCardiaca) {
        this.identificacao = identificacao;
        this.pressaoSistole = pressaoSistole;
        this.pressaoDiastole = pressaoDiastole;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.qtdAlteracoes = 0;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public double getPressaoSistole() {
        return pressaoSistole;
    }

    public void setPressaoSistole(double pressaoSistole) {
        this.pressaoSistole = pressaoSistole;
    }

    public double getPressaoDiastole() {
        return pressaoDiastole;
    }

    public void setPressaoDiastole(double pressaoDiastole) {
        this.pressaoDiastole = pressaoDiastole;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public int getQtdAlteracoes() {
        return qtdAlteracoes;
    }

    public void setQtdAlteracoes(int qtdAlteracoes) {
        this.qtdAlteracoes = qtdAlteracoes;
    }
}
