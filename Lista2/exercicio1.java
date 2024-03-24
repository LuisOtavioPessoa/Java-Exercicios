//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024

package principal;

public class exercicio1 {
	public static void tarefaum(){
		
		System.out.println("---Série de Fibonacci---");
		
		int num1 = 1;
		int num2 = 1;
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.print( num1 + " " );
			int proximoNumero = num1 + num2;
			num1 = num2;
			num2 = proximoNumero;
			
		
		}
		
	}

}
