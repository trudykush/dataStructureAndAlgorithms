package matrix;

import java.util.Scanner;

public class PrintMatrixSnakePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int m1 = sc.nextInt();
            int n1 = sc.nextInt();
            int[][] matrix = new int[m1][n1];

            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            snakePattern(matrix, m1, n1);
        }
    }

    private static void snakePattern(int[][] matrix, int m1, int n1) {

        for (int i = 0; i < matrix.length; i++) {

            // if the row is even -> print left to right
            if (i % 2 == 0) {
                for (int j = 0; j < m1; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else { // else print from right to left
                for (int j = m1 -1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
