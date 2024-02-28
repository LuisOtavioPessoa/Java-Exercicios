import java.util.Scanner;

class ex3Media{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a 1° nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a 2° nota: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a 3° nota: ");
        float nota3 = teclado.nextFloat();
        System.out.println("Digite a 4° nota: ");
        float nota4 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas bimestrais é: " + media + " .");




    }
}