package october.sorting;

import java.util.Scanner;

public class Sorting012s {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            sortingTheArrayOf012s(arr, lengthOfArray);

            printArray(arr, lengthOfArray);
        }

    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sortingTheArrayOf012s(int[] arr, int n) {

        int low = 0, high = n-1;
        int mid = 0, temp = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
