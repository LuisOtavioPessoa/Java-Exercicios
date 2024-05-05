package principal;

import java.util.Scanner;

public class exercicio9 {
	public static void exercicionove() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as dimensões da matriz A (m x n):");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.println("Entre com as dimensões da matriz B (n x p):");
        int n2 = scanner.nextInt();
        int p2 = scanner.nextInt();

        if (n1 != n2) {
            System.out.println("Erro: As matrizes não podem ser multiplicadas.");
            return;
        }

        int[][] A = new int[m1][n1];
        int[][] B = new int[n1][p2];
        int[][] C = new int[m1][p2];

        System.out.println("Entre com os elementos da matriz A:");
        inputMatrix(A, scanner);

        System.out.println("Entre com os elementos da matriz B:");
        inputMatrix(B, scanner);

        multiplyMatrices(A, B, C);

        System.out.println("Resultado da multiplicação das matrizes:");
        printMatrix(C);
    }

    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void multiplyMatrices(int[][] A, int[][] B, int[][] C) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


