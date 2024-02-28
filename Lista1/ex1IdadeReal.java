import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class ex1IdadeReal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int diaNascimento = teclado.nextInt();

        System.out.println("Digite o mês do seu nascimento (em números): ");
        int mesNascimento = teclado.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = teclado.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();

        System.out.println("Então posso afirmar que você possui " + idade + " anos.");
    }
}

