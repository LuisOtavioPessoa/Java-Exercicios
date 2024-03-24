//Autor: Luís Otávio Pessôa da Silva
//Data: 23/03/2024
package principal;

import java.util.Scanner;

public class exercicio7 {
	public static void tarefasete() {
		
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Digite um número inteiro:");
	    int numero = teclado.nextInt();
		
		boolean Primo = verificarPrimo(numero);
        
        if (Primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo. É divisível por:");
            for (int i = 2; i <= numero/2; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        
        teclado.close();
    }
    
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}