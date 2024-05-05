package principal;

import java.util.Scanner;

public class exercicio4 {
    public static void exercicioquatro() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

       Object[] elementos = new Object[qntElementos];

        for (int i = 0; i < qntElementos; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos[i] = teclado.next();
        }

        System.out.print("Primeiro Array: ");
        for (Object num : elementos) {
            System.out.print(num + " ");
        }
        System.out.println();

        Object [] copiaElementos = new Object [qntElementos];

        for (int i = 0; i < qntElementos; i++) {
        	copiaElementos[i] = elementos[i];
        }

        System.out.print("Segundo Array (Cópia): ");
        for (Object num :copiaElementos) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
