//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio5 {
	public static void tarefacinco() {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe a Quantidade de Números: ");
		int quantidade = teclado.nextInt();
		
		double maior = -Double.MAX_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.printf("Informe o %d° número: ", i);
			int numero = teclado.nextInt();
			
		if(numero < 0 || numero > 1000) {
			System.out.println("Valores Inválidos,o Programa so aceita números entre 0 e 1000");
			System.out.printf("Informe novamente o %d° número: ", i);
			numero = teclado.nextInt();
			
		}
			
		soma += numero;
		
		if(numero < menor) {
			menor = numero;
		}
		if(numero > maior) {
			maior = numero;
		}
			
		}
		
		System.out.println("\nO Maior Número é: " + maior);
		System.out.println("O Menor Número é: " + menor);
		System.out.println("A soma do Conjunto de Números é: " + soma);
		
		
	}

}
