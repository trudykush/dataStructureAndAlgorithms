package matrix;

import java.util.Scanner;

public class UpperAndLowerTriangleSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int m1 = sc.nextInt();
            int n1 = sc.nextInt();
            int[][] matrix = new int[m1][n1];

            for (int i = 0; i < m1; i++) {      // Looping through Row
                for (int j = 0; j < n1; j++) {  // Looping through Column
                    matrix[i][j] = sc.nextInt();
                }
            }

            sumOfUpperAndLowerTriangle(matrix, m1, n1);
        }
    }

    private static void sumOfUpperAndLowerTriangle(int[][] matrix, int m1, int n1) {

        int upper_sum = 0;
        int lower_sum = 0;

        // Upper Triangle Sum
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                if(i <= j) {
                    upper_sum += matrix[i][j];
                }
            }
        }

        // Lower Triangle Sum
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                if (i >= j) {
                    lower_sum += matrix[i][j];
                }
            }
        }

        System.out.println("The sum of upper triangle is: " + upper_sum);
        System.out.println("The sum of lower triangle is: " + lower_sum);

    }
}
