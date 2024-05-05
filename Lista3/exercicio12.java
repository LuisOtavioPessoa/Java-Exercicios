package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio12 {
	public static void exerciciodoze() {
		 Scanner teclado = new Scanner(System.in);

	        System.out.print("Informe a quantidade de elementos: ");
	        int qntElementos = teclado.nextInt();

	        ArrayList<Object> elementos = new ArrayList<>();

	        for (int i = 0; i < qntElementos; i++) {
	            System.out.printf("Insira o %d° elemento: ", i + 1);
	            elementos.add(teclado.next()); 
	        }

	        System.out.println("ArrayList original: " + elementos);

	        ArrayList<Object> elementosInvertidos = new ArrayList<>();
	        for (int i = elementos.size() - 1; i >= 0; i--) {
	            elementosInvertidos.add(elementos.get(i));
	        }

	        System.out.println("ArrayList invertido: " + elementosInvertidos);
	    }
	}

