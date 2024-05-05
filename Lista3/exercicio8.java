package principal;

import java.util.Arrays;

public class exercicio8 {
	public static void exerciciooito() {

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean saoIguais = verificarMatrizesIguais(matriz1, matriz2);

        if (saoIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
    }

    public static boolean verificarMatrizesIguais(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }	
}


