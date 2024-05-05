package principal;

import java.util.Scanner;

public class exercicio1 {
	public static void exercicioum() {
		Scanner teclado = new Scanner (System.in);
		
		double soma = 0;
		
		System.out.print("Informe a quantidade de números: ");
		int qntNumeros = teclado.nextInt();
		
		double [] numeros = new double [qntNumeros];
		
		for(int i = 0; i < qntNumeros; i++) {
			System.out.printf("Insira o %d° número: ",i + 1);
			numeros[i] = teclado.nextDouble();
			soma += numeros[i];;
		}
		
		double media = soma / qntNumeros;
		
		System.out.println("A média dos números inseridos é: " + media);
	}
}
