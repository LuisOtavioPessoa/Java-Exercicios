//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;


public class exercicio2 {
	public static void tarefadois(){
		
		System.out.println("---Série de Fibonacci---");
		System.out.println("Gerando a série de Fibonacci até que um número maior que 500 seja alcançado.");
		
		int num1 = 1;
		int num2 = 1;
		int proximoNumero = 0;
		
		while (num1 <= 500 ) {
			System.out.print( num1 + " " );
			proximoNumero = num1 + num2;
			
			num1 = num2;
			num2 = proximoNumero;

		}
		 System.out.println("\nA Série Não pode ultrapassar o valor de 500");
	}

}
