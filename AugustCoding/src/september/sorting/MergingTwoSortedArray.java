package september.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergingTwoSortedArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfArray1 = Integer.parseInt(br.readLine().trim());
            int[] arr1 = new int[lengthOfArray1];

            String[] arrayElement1 = br.readLine().trim().split("\\s+");
            for (int i = 0; i < lengthOfArray1; i++) {
                arr1[i] = Integer.parseInt(arrayElement1[i]);
            }

            int lengthOfArray2 = Integer.parseInt(br.readLine().trim());
            int[] arr2 = new int[lengthOfArray2];

            String[] arrayElement2 = br.readLine().trim().split("\\s+");
            for (int i = 0; i < lengthOfArray2; i++) {
                arr2[i] = Integer.parseInt(arrayElement2[i]);
            }

            int[] resultArray = mergingArrays(arr1, lengthOfArray1, arr2, lengthOfArray2);
            System.out.println(Arrays.toString(resultArray));
        }
    }

    private static int[] mergingArrays(int[] arr1, int n1, int[] arr2, int n2) {

        int i = 0, j=0, k=0;
        int[] arrK = new int[n1+n2];
        while (i<n1 && j<n2) {

            if (arr1[i] <= arr2[j]) {
                arrK[k] = arr1[i];
                i++;
            } else {
                arrK[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arrK[k] = arr1[i];
            i++; k++;
        }

        while (j < n2) {
            arrK[k] = arr2[j];
            j++; k++;
        }

        return arrK;
    }
}
