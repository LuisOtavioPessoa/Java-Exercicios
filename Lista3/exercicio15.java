package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio15 {
	public static void exercicioquinze() {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

        ArrayList<Object> elementos = new ArrayList<>();

        for (int i = 0; i < qntElementos; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos.add(teclado.next());
        }

        System.out.print("Informe o elemento que deseja contar: ");
        Object elementoProcurado = teclado.next();

        int ocorrencias = contarOcorrencias(elementoProcurado, elementos);
        System.out.println("Número de ocorrências de " + elementoProcurado + ": " + ocorrencias);
    }

    public static int contarOcorrencias(Object elemento, ArrayList<Object> lista) {
        int contador = 0;
        for (Object obj : lista) {
            if (obj.equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

}

