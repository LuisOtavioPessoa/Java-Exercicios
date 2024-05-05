package principal;

import java.util.Scanner;

public class exercicio3 {
	public static void exerciciotres() {
		Scanner teclado = new Scanner (System.in);
		
		int maior = Integer.MIN_VALUE;
		int secundomaior = Integer.MIN_VALUE;
		int numero;
		
		System.out.print("Informe a quantidade de números: ");
		int qntNumeros = teclado.nextInt();
		
		int [] numeros = new int [qntNumeros];
		
		for(int i = 0; i < qntNumeros; i++) {
			System.out.printf("Insira o %d° número: ",i + 1);
			numeros[i] = teclado.nextInt();
			numero = numeros[i];
			
			if(numero > maior) {
				secundomaior = maior;
				maior = numero;
			}else if (numero > secundomaior && numero != maior) {
				secundomaior = numero;
			}
		}
		System.out.println("Segundo maior elemento: " + secundomaior);
		
	}

}
