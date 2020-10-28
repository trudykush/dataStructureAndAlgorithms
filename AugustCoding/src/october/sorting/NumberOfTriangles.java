package october.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfTriangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            countingNumberOfPossibleTriangles(arr, lengthOfArray);
        }
    }

    private static void countingNumberOfPossibleTriangles(int[] arr, int n) {

        Arrays.sort(arr);

        int count = 0;
        for (int i = n-1; i > 1; i--) {
            int l = 0, r = i-1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += r - l;

                    r--;
                } else {
                    l++;
                }
            }
        }
        System.out.println("Number of possible triangles is " + count);
    }
}
