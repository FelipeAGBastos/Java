package GS2SIPF_AP;

public class FilaPacientes {

    private class NO{
        Paciente dado;
        NO prox;
    }

    private NO ini;
    private NO fim;
    private int controle;


    public void init(){
        ini = fim = null;
        controle =0;
    }

    public boolean isEmpty(){
        return (ini == null && fim == null);
    }


    public void enqueue(Paciente paciente){
        NO novoPaciente = new NO();
        novoPaciente.dado = paciente;
        novoPaciente.prox = null;

        if (isEmpty()){
            ini = novoPaciente;
        }else {
            fim.prox = novoPaciente;
        }
        fim = novoPaciente;
        controle++;
    }

    public Paciente dequeue(){

        if (isEmpty()){
            System.out.println("A fila de Paciente está Vazia");
        }

        Paciente valor = ini.dado;
        ini = ini.prox;

        if (ini == null){
            fim=null;
        }

        controle--;
        return valor;

    }

    public Paciente first(){
        if (isEmpty()){
            return null;
        }
        return ini.dado;
    }

    public int getControle() {
        return controle;
    }
}
