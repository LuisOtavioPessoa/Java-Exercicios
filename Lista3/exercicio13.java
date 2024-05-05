package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio13 {
    public static void exerciciotreze() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

        ArrayList<Object> elementos = new ArrayList<>();

        for (int i = 0; i < qntElementos; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos.add(teclado.next());
        }

        System.out.print("Informe o elemento que deseja encontrar: ");
        Object elementoProcurado = teclado.next();

        int indice = encontrarIndice(elementoProcurado, elementos);
        if (indice != -1) {
            System.out.println("O elemento " + elementoProcurado + " está no índice: " + indice);
        } else {
            System.out.println("O elemento " + elementoProcurado + " não está na lista.");
        }
    }

    public static int encontrarIndice(Object elemento, ArrayList<Object> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
}
