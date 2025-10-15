import java.util.Scanner;

public class metodo07 {


    static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {
        int codVeiculo=0, codigoCarga=0,estado=0, carga=0;
        System.out.println("Digite o codigo do caminhão");
        codVeiculo = entrada.nextInt();
        System.out.println("Digite o codigo da carga: ");
        codigoCarga = entrada.nextInt();
        System.out.println("Digite o peso do caminhao em toneladas:");
        carga = entrada.nextInt();
        System.out.println("Digite o estado: (1-4)");
        estado = entrada.nextInt();

        int precoQuiloCodigo = codCaminhao(codigoCarga, carga);
        double cargaImpostoFinal = imposto(estado, precoQuiloCodigo);
    }


    public static int codCaminhao(int codigoCarga, int carga){
        int precoQuiloCodigo=0;
        
        if (codigoCarga>=1 && codigoCarga<=10){
            precoQuiloCodigo = 120*carga;
        } else if (codigoCarga>=11 && codigoCarga<= 20) {
            precoQuiloCodigo= 200*carga;
        } else {
            precoQuiloCodigo=280*carga;
        }
        return precoQuiloCodigo;
    }


    public static double imposto(int estado, int precoQuiloCodigo){
        double cargaImpostoFinal = 0;

        switch (estado){
            case 1:
                cargaImpostoFinal = precoQuiloCodigo * 0.75;
                break;
            case 2:
                cargaImpostoFinal = precoQuiloCodigo * 0.80;
                break;
            case 3:
                cargaImpostoFinal = precoQuiloCodigo * 0.85;
                break;
            case 4:
                cargaImpostoFinal = precoQuiloCodigo;
                break;

            default:
                break;
        }

        return cargaImpostoFinal;
    }






}
