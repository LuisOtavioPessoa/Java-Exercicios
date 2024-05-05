package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio14 {
	public static void exerciciocatorze() {
		  Scanner teclado = new Scanner(System.in);

	        System.out.print("Informe a quantidade de elementos: ");
	        int qntElementos = teclado.nextInt();

	        ArrayList<Object> elementos = new ArrayList<>();

	        for (int i = 0; i < qntElementos; i++) {
	            System.out.printf("Insira o %d° elemento: ", i + 1);
	            elementos.add(teclado.next());
	        }
	        System.out.println("Elementos antes da remoção: " + elementos);

	        elementos.clear();

	        System.out.println("Elementos após a remoção: " + elementos);
	}

}
