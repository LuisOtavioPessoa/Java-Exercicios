import java.util.Scanner;

class ex10Calcule_Mostre{
    public static void main (String [] args){
        System.out.println(" ---Calcule e Mostre ---");
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o 1° número Inteiro: ");
    int num1 = teclado.nextInt();
    System.out.println("Digite o 2° número Inteiro: ");
    int num2 = teclado.nextInt();
    System.out.println("Digite um número Real: ");
    float numReal = teclado.nextFloat();

    System.out.println("O produto do dobro do primeiro com metade do segundo .");
    System.out.println(+ num1 * 2 + " x " + num2 / 2 + " = " + (num1 * 2 ) * (num2 / 2) +  " ." );

    System.out.println("A soma do triplo do primeiro com o terceiro .");
    System.out.println(+ num1 * 3 + " + " + numReal + " = " + ((num1 * 3) + numReal) + " .");

    System.out.println("O terceiro elevado ao cubo .");
    System.out.println(+ numReal +" elevado ao cubo: " + numReal * numReal * numReal + " .");


    }
}