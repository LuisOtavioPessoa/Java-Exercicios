import java.util.Scanner;

class ex7Salario{
    public static void main (String[] args){
        System.out.println("---Salário do Mês---");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        int horaMes = teclado.nextInt(); 

        System.out.println("Número de horas trabalhadas? ");
        int horaTrabalhada = teclado.nextInt();

        System.out.println("Seu Salário nesse Mês será: " + horaMes * horaTrabalhada + " R$.");
    }
}