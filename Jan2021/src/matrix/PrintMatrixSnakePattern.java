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

}
