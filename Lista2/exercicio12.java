//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio12 {
	public static void tarefadoze() {
		Scanner teclado = new Scanner (System.in);
		double preco = 0;
		System.out.println("Informe a Quantidade de CDs: ");
		int cd = teclado.nextInt();
		
		for (int i = 1; i <= cd; i++) {
			System.out.printf("Informe o preço do %d° CD: ", i);
			preco += teclado.nextDouble();
		}
		
		double media = preco / cd;
		
		System.out.println("\nO valor total investido em CDs foi de R$ " + String.format("%.2f", preco));
		System.out.println("O valor medio gasto em CDs foi de R$ " + String.format("%.2f", media));
		
	}

}
