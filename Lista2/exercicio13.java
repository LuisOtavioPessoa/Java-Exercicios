//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

public class exercicio13 {
	public static void tarefatreze() {
		double preco = 1.99;
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		for (int i = 1; i <= 50 ; i++) {
			System.out.println(i + "- R$" + String.format("%.2f", preco));
			preco += 1.99;
		}
	}
		
}
