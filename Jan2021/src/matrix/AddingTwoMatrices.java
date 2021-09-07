package matrix;

import java.util.Scanner;

public class AddingTwoMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while(numberOfCases-- > 0) {
            int m1 = sc.nextInt();
            int n1 = sc.nextInt();
            int[][] firstMatrix = new int[m1][n1];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    firstMatrix[i][j] = sc.nextInt();
                }
            }

            int m2 = sc.nextInt();
            int n2 = sc.nextInt();
            int[][] secondMatrix = new int[m2][n2];
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    secondMatrix[i][j] = sc.nextInt();
                }
            }

            int[][] result = sumOfMatrices(firstMatrix, secondMatrix);
            if (result.length == 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    private static int[][] sumOfMatrices(int[][] A, int[][] B) {

        int m1 = A.length;
        int n1 = A[0].length;

        int m2 = B.length;
        int n2 = B[0].length;

        int[][] result;
        if (m1 != m2 || n1 != n2) {
            result = new int[0][0];
        } else {
            result = new int[m1][n1];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    result[i][j] = A[i][j] + B[i][j];
                }
            }
        }

        return result;
    }
}
