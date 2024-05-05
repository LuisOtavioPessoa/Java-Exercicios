package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio11 {
    public static void exercicioonze() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qntElementos = teclado.nextInt();

        ArrayList<Object> elementos = new ArrayList<>();

        for (int i = 0; i < qntElementos; i++) {
            System.out.printf("Insira o %d° elemento: ", i + 1);
            elementos.add(teclado.next()); 
        }

        System.out.println("ArrayList: " + elementos);
        
        System.out.print("Informe o elemento a ser verificado: ");
        Object elementoVerificar = teclado.next(); 

        boolean encontrado = false;
        for (Object elem : elementos) {
            if (elem.equals(elementoVerificar)) { 
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(elementoVerificar + " está presente no ArrayList.");
        } else {
            System.out.println(elementoVerificar + " não está presente no ArrayList.");
        }
    }
}

