import java.util.Scanner;
import java.text.DecimalFormat;

class ex15Download{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("---Download do Arquivo---");
        System.out.println("Digite o tamanho do arquivo(MB): ");
        double tamanho = teclado.nextDouble();
        System.out.println("Digite a velocidade do link de Internet(Mbps): ");
        double velocidade = teclado.nextDouble();

        double tempo = tamanho * (8 / velocidade);

        double minutos = tempo / 60;

        DecimalFormat df = new DecimalFormat("#.##");
        String minutosNovo = df.format(minutos);

        System.out.println("O tempo aproximado de Download do arquivo é " + minutosNovo  + " minutos." );



    }
}