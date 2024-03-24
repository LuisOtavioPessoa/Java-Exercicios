//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio9 {
	public static void tarefanove() {
		
		Scanner teclado = new Scanner (System.in);
		double acumulador = 0;
		System.out.println("Informe a quantidade de pessoas: ");
		int pessoas = teclado.nextInt();
		
		for (int i = 1 ; i <= pessoas ; i++) {
			System.out.printf("Informe a idade da %dº pessoa: " , i);
			acumulador += teclado.nextDouble();
		}
		
		double media = acumulador / pessoas;
		
		if(media <= 25) {
			System.out.println("A Turma é Jovem!");
		}
		else if (media >= 26 & media <= 60) {
			System.out.println("A Turma é Adulta!");
		}
		else {
			System.out.println("A Turma é Idosa!");
		}
	}
}
