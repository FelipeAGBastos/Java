import java.util.Scanner;
public class aula04ex1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade=0, contador=0, tot1=0,tot2=0,tot3=0,tot4=0,tot5=0;



        for (int i = 0; i < 20;i++){
            System.out.print("Digite a idade:");
            idade = entrada.nextInt();


            if (idade<=15){
                tot1++;
            }else{
                if (idade>=16 && idade<=30){
                    tot2++;
                }else {
                    if (idade>=31 && idade<=45){
                        tot3++;
                    }else{
                        if (idade>=46 && idade<=60){
                            tot4++;
                        }else {
                            tot5++;
                        }
                    }
                }
            }
        }

        System.out.println("1, faixa Etaria:"+tot1);
        System.out.println("2, faixa Etaria:"+tot2);
        System.out.println("3, faixa Etaria:"+tot3);
        System.out.println("4, faixa Etaria:"+tot4);
        System.out.println("5, faixa Etaria:"+tot5);

        System.out.println("A porcentagem da 1 faixa é:"+((tot1/20) *100) + "%");
    }
}
