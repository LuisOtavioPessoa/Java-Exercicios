import java.util.Scanner;
import java.text.DecimalFormat;

class ex11Altura{
    public static void main(String[]args){
    System.out.println("---Seu peso ideal---");
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite a sua altura: ");
    float altura = teclado.nextFloat();

    float formula =(float) (72.7 * altura) - 58;

    DecimalFormat df = new DecimalFormat("#.##");
    String formulaNova= df.format(formula);

    System.out.println("Seu peso ideal é: " + formulaNova + "Kg .");
    }
}