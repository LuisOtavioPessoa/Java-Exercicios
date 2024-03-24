//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio3 {
    public static void tarefatres() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número para calcular seu fatorial: ");
        int numero = teclado.nextInt();

        int totalFatorial = 1;

        for (int i = 1; i <= numero; i++) {
            totalFatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + totalFatorial);
    }
}

