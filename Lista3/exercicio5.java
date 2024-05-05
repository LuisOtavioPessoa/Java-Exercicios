package principal;

import java.util.Scanner;

public class exercicio5 {
	public static void exerciciocinco() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int qntNumeros = teclado.nextInt();

        int[] numeros = new int[qntNumeros];

        for (int i = 0; i < qntNumeros; i++) {
            System.out.printf("Insira o %d° número: ", i + 1);
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Informe o número a ser verificado: ");
        int numeroVerificar = teclado.nextInt();

        boolean encontrado = false;
        for (int num : numeros) {
            if (num == numeroVerificar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(numeroVerificar + " está presente no array.");
        } else {
            System.out.println(numeroVerificar + " não está presente no array.");
        }
    }

}


