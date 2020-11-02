package october.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge3SortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr1 = new int[lengthOfArray];
            for (int i = 0; i < lengthOfArray; i++) {
                arr1[i] = sc.nextInt();
            }

            int lengthOfArr2 = sc.nextInt();
            int[] arr2 = new int[lengthOfArr2];
            for (int i = 0; i < lengthOfArr2; i++) {
                arr2[i] = sc.nextInt();
            }

            int lenOfArr3 = sc.nextInt();
            int[] arr3 = new int[lenOfArr3];
            for (int i = 0; i < lenOfArr3; i++) {
                arr3[i] = sc.nextInt();
            }

            mergingAllThreeSortedArraysAsSingleSortedArray(arr1, arr2, arr3, lengthOfArray, lengthOfArr2, lenOfArr3);

        }
    }

    private static void mergingAllThreeSortedArraysAsSingleSortedArray(int[] arr1, int[] arr2, int[] arr3,
                                                                       int n1, int n2, int n3) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            int a = arr1[i];
            int b = arr2[j];
            int c = arr3[k];

            if (a <= b && a <= c) {
                mergedList.add(a);
                i++;
            } else if (b <= a && b <= c) {
                mergedList.add(b);
                j++;
            } else {
                mergedList.add(c);
                k++;
            }
        }

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }

        while (i < n1 && k < n3) {
            if (arr1[i] < arr3[k]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr3[k]);
                k++;
            }
        }

        while (j < n2 && k < n3) {
            if (arr2[j] < arr3[k]) {
                mergedList.add(arr2[j]);
                j++;
            } else {
                mergedList.add(arr3[k]);
                k++;
            }
        }

        while (i < n1) {
            mergedList.add(arr1[i]);
            i++;
        }
        while (j < n2) {
            mergedList.add(arr2[j]);
            j++;
        }
        while (k < n3) {
            mergedList.add(arr3[k]);
            k++;
        }

        for (Integer x :
                mergedList) {
            System.out.print(x + " ");
        }
    }
}
