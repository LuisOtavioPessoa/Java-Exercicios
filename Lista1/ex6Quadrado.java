import java.util.Scanner;

class ex6Quadrado{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Área do Quadrado---");
        System.out.println("Digite o valor do Lado do Quadrado: ");
        int lado = teclado.nextInt();

        int area = lado * lado;

        System.out.println("A Área do Quadrado é: " + area +".");

        int dobro = area * 2;

        System.out.println("O dobro da Área do Quadrado é: " + dobro + ".");
    }
}