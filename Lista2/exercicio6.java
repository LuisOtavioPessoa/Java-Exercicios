//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio6 {
	public static void tarefaseis() {
		Scanner teclado = new Scanner (System.in);
		int escolha = 0;
		
		do {
			System.out.println("Informe um número para calcular seu fatorial: ");
			double numero = teclado.nextDouble();
			double totalFatorial = 1;
			
		if( numero < 0 || numero > 15) {
				System.out.println("Só pode usar número Inteiros Positivos e Menores que 16");
				continue;
		}
	
		for (int i = 1; i <= numero ; i++ ) {
			totalFatorial *= i;
		}
		
		System.out.println("Fatorial de " + numero + " é: " + totalFatorial);
		System.out.println("\nQuer realizar outro calculo de fatorial? \n1-SIM \n2-NÃO");
		escolha = teclado.nextInt();
		} while (escolha == 1);
		
		System.out.println("PROGRAMA ENCERRADO");
		
	}
}
