package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {
	public static void exerciciodez() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int qntNumeros = teclado.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < qntNumeros; i++) {
            System.out.printf("Insira o %d° número: ", i + 1);
            numeros.add(teclado.nextInt());
        }

        System.out.println("ArrayList: " + numeros);

        ArrayList<Integer> numerosCopia = new ArrayList<>();

        for (int num : numeros) {
            numerosCopia.add(num);
        }

        System.out.println("ArrayList cópia: " + numerosCopia);
    }
}