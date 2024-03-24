//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio8 {
	public static void tarefaoito() {
		System.out.println("---Média Aritmética---");
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe a quantidade de Notas: ");
		double qntNotas = teclado.nextDouble();
		
		double totalNota = 0;
		
		for(int i = 1; i <= qntNotas ; i++) {
			System.out.printf("Informe a %dº Nota: " ,i);
			double nota = teclado.nextDouble();
			totalNota += nota;
		}
		
		double media = totalNota / qntNotas;
		System.out.println("A Média Aritmética das Notas é " + String.format("%.2f", media));
	}
}
