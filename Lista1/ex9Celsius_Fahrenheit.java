import java.util.Scanner;

class ex9Celsius_Fahrenheit{
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("---Celsius para Fahrenheit---");
    System.out.println("Digite a Temperatura em graus Celsius: ");
    float celsius = teclado.nextFloat();

    float fahrenheit = (celsius * 9/5) + 32;

    System.out.println("" + celsius + " °C Convertido para Fahrenheit é " + fahrenheit + " °F.");
    }
    
}