package september.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while(numberOfCases-- > 0) {
            int lengthOfArrayOne = sc.nextInt();
            int[] arr1 = new int[lengthOfArrayOne];

            for (int i = 0; i < lengthOfArrayOne; i++) {
                arr1[i] = sc.nextInt();
            }

            int lengthOfArrayTwo = sc.nextInt();
            int[] arr2 = new int[lengthOfArrayTwo];

            for (int i = 0; i < lengthOfArrayTwo; i++) {
                arr2[i] = sc.nextInt();
            }

            ArrayList<Integer> result = unionOfArrays(arr1, arr2, lengthOfArrayOne, lengthOfArrayTwo);
            System.out.println(result);
        }
    }

    private static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2, int n1, int n2) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i<n1 && j<n2) {

            while(i+1<n1 && arr1[i]==arr1[i+1]) {
                i++;
            }

            while(j+1<n2 && arr2[j]==arr2[j+1]) {
                j++;
            }

            if(arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                result.add(arr2[j]);
                j++;
            }
            else if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i<n1 ) {
            while (i+1<n1 && arr1[i]==arr1[i+1]) {
                i++;
            }
            result.add(arr1[i++]);
        }

        while (j<n2) {
            while(j+1<n2 && arr2[j]==arr2[j+1]) {
                j++;
            }
            result.add(arr2[j++]);
        }
        return result;
    }
}
