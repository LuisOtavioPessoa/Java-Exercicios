//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio10 {
	public static void tarefadez() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("--Eleição 2024-- \n Candidato Melky Gostosinha - Nº1 \n Candidato Dandan Abelhão - N°2 \n Candidato Felipe Borba - N°3");
		System.out.println("Informe a quantidade totais de eleitores: ");
		int eleitores = teclado.nextInt();
		
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		
		for(int i = 1; i <= eleitores; i++) {
			System.out.printf("Informe o voto do %d° Eleitor: ", i);
			int voto = teclado.nextInt();
		
		if (voto == 1) {
			++candidato1;
		}
		else if (voto == 2 ) {
			++candidato2;
		}
		else {
			++candidato3;
		}
		
		}
		
		System.out.println("Nº Votos Melky Gostosinha: " + candidato1);
		System.out.println("Nº Votos Dandan Abelhão: " + candidato2);
		System.out.println("Nº Votos Felipe Borba: " + candidato3);
	}
}
