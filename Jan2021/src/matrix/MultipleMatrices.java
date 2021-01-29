package matrix;

import java.util.Scanner;

public class MultipleMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
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

            multiplyingMatrices(firstMatrix, m1, n1,
                                secondMatrix, m2, n2);
        }
    }

    private static void multiplyingMatrices(int[][] firstMatrix, int m1, int n1, int[][] secondMatrix, int m2, int n2) {
        
    }
}
