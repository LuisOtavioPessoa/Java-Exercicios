//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio11 {
	public static void tarefaonze() {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe a Quantidade de Turmas: ");
		double qntTurma = teclado.nextDouble();
		
		double totalAlunos = 0;
		
		for (int i = 1; i <= qntTurma; i++) {
			System.out.printf("Informe a Quantidade de Alunos da %dº Turma: " , i);
			double qntAluno = teclado.nextDouble();
			
			if (qntAluno > 40) {
				System.out.println("A Turma " + i + " não pode ter mais de 40 Alunos.");
				return;
			}
			totalAlunos += qntAluno;
		}
		
		double media = (double) totalAlunos / qntTurma;

        System.out.println("A Média de Alunos por Turma é " + String.format("%.2f", media));
	
	}

}
