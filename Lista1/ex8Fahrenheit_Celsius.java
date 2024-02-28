import java.util.Scanner;

class ex8Fahrenheit_Celsius{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Fahrenheit para Celsius---");
        System.out.println("Digite a Temperatura em graus Fahrenheit: ");
        float fahrenheit = teclado.nextFloat();

        float celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.println(""+ fahrenheit +" °F Convertido para Celsius é " + celsius + " °C.");
    }

}