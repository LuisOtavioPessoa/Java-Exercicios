package principal;

import java.util.Scanner;

public class exercicio6 {
	public static void exercicioseis() {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

        Object[] elementos = new Object[qntElementos];

        for (int i = 0; i < elementos.length; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos[i] = teclado.next();
        }

        System.out.print("Array antes da inversão: ");
        for (Object num : elementos) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < elementos.length / 2; i++) {
        	Object temp = elementos[i];
            elementos[i] = elementos[elementos.length - 1 - i];
            elementos[elementos.length - 1 - i] = temp;
        }

        System.out.print("Array após a inversão: ");
        for (Object num : elementos) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


