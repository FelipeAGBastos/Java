package Pilha;

public class Metodoss {
    public final int N =6;
    int topo = 0;
    int dados[] = new int[N];

    public void init(){
        topo = 0;
    }


    public void push(int valor){
        if (!isFull()){
            dados[topo] = valor;
            topo++;

        } else {
            System.out.println("A pilha está cheia");
        }
    }




    public int pop(){
        topo--;
        return dados[topo];
    }




    public boolean isEmpty(){
        return (topo == 0);
    }




    public boolean isFull(){
        return (topo == N);
    }




    public void top(){
        System.out.println("O topo é: " + dados[topo-1]);
    }



    public void esvaziaPilha(){
       while (!isEmpty()){
           System.out.println("Valor retirado: " + pop());
       }

    }


}
