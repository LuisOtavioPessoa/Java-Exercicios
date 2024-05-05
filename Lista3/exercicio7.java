package principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio7 {
    public static void exerciciosete() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

        Object[] elementos = new Object[qntElementos];

        for (int i = 0; i < elementos.length; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos[i] = teclado.next();
        }

        Map<Object, Integer> contagemElementos = new HashMap<>();

        for (Object elemento : elementos) {
            if (contagemElementos.containsKey(elemento)) {
                contagemElementos.put(elemento, contagemElementos.get(elemento) + 1);
            } else {
                contagemElementos.put(elemento, 1);
            }
        }

        System.out.println("Elementos duplicados e suas contagens:");
        for (Map.Entry<Object, Integer> entry : contagemElementos.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
