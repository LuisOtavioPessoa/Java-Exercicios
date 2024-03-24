//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio14 {
	public static void tarefaquatorze() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe o numero para montar a tabuada: ");
		int numero = teclado.nextInt();
		System.out.println("Informe o numero que a tabuada vai começar: ");
		int inicio = teclado.nextInt();
		System.out.println("Informe o numero que a tabuada vai terminar: ");
		int fim = teclado.nextInt();
		
		System.out.println("Montar a tabuada de: " + numero);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		
		for (; inicio <= fim; inicio++ ) {
			int tabuada = numero * inicio;
			System.out.println(numero + "x" + inicio + " = " + tabuada);
		}
		
	}
}
