package september.sorting;

import java.util.Scanner;

public class ThreeWayPartitioning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();

            int[] result = performingThreeWayPartitioning(arr, lengthOfArray, firstNumber, secondNumber);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+ " ");
            }
        }
    }

    private static int[] performingThreeWayPartitioning(int[] arr, int n, int lowValue, int highValue) {

        int start = 0, end = n-1;

        for (int i=0; i<end;) {

            if (arr[i] < lowValue) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;

            } else if (arr[i] > highValue) {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            } else {
                i++;
            }
        }
        return arr;
    }
}
