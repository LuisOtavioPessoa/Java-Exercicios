package principal;

import java.util.Scanner;

public class exercicio2 {
	public static void exerciciodois() {
		Scanner teclado = new Scanner (System.in);
		
		double maior = -Double.MAX_VALUE;
		double menor = Double.MAX_VALUE;
		int numero;
		
		System.out.print("Informe a quantidade de números: ");
		int qntNumeros = teclado.nextInt();
		
		int [] numeros = new int [qntNumeros];
		
		for(int i = 0; i < qntNumeros; i++) {
			System.out.printf("Insira o %d° número: ",i + 1);
			numeros[i] = teclado.nextInt();
			numero = numeros[i];
			
			if(numero < menor) {
				menor = numero;
			}
			if(numero > maior) {
				maior = numero;
			}
			
		}
		System.out.println("\nO Maior Número é: " + maior);
		System.out.println("O Menor Número é: " + menor);
	}

}
