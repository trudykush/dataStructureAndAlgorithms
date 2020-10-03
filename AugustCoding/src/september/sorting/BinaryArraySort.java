package september.sorting;

import java.util.Scanner;

public class BinaryArraySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while(numberOfCases-- > 0) {

            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            sortingBinaryArray(arr, lengthOfArray);
            printingResult(arr);
        }
    }

    private static void printingResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sortingBinaryArray(int[] arr, int n) {

        int low = 0, high = n-1;

        while(low <= high) {
            if(arr[low] == 0) {
                low++;
            } else if (arr[high] == 1) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

    }
}
