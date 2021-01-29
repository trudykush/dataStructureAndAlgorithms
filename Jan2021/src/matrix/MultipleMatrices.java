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

            multiplyingMatrices(firstMatrix, secondMatrix);
        }
    }

    private static int[][] multiplyingMatrices(int[][] A, int[][] B) {

        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        if(m1 != n2)
        {
            return new int[0][0];
        }
        else
        {
            int[][] result = new int[n1][m2];
            for(int i = 0; i  < n1; i++)
            {
                for(int j = 0; j < m2; j++)
                {
                    int sum=0;
                    for(int k=0; k<m1; k++)
                    {
                        sum += A[i][k] * B[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            return result;
        }
    }
}
