import java.util.Scanner;

class ex2Soma{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o 1° número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o 2° número: ");
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é igual a " + soma + " .");


    }
}