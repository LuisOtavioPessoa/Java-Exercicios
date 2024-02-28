import java.util.Scanner;
import java.text.DecimalFormat;

class ex12Altura_Genero{
    public static void main(String[]args){
    System.out.println("---Seu peso ideal---");
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite a sua altura: ");
    float altura = teclado.nextFloat();

    double formulaHomens = (72.7 * altura) - 58;
    double formulaMulheres = (62.1 * altura) - 44.7;

    DecimalFormat df = new DecimalFormat("#.##");
    String formula1= df.format(formulaHomens);
    String formula2= df.format(formulaMulheres);

    System.out.println("Para Homens seu peso ideal é: " + formula1 + "Kg .");
    System.out.println("Para Mulheres seu peso ideal é: " + formula2 + "Kg .");
    }
}