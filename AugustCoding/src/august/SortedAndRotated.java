package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedAndRotated {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            boolean result = checkRotatedAndSorted(arr, lengthOfArray);
            System.out.println(result);
        }
    }

    private static boolean checkRotatedAndSorted(int[] arr, int n) {

        return IncreSorted(arr, n) || DecreSorted(arr, n);
    }

    private static boolean DecreSorted(int[] arr, int n) {

        int i=0;
        while((i<n-1) && (arr[i] >= arr[i+1])) {
            i++;
        }

        if (i == n-1) return false;

        i++;
        while((i<n-1) && (arr[i] >= arr[i+1])) {
            i++;
        }

        if(i == n-1 && arr[n-1] >= arr[0]) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean IncreSorted(int[] arr, int n) {

        int i=0;

        while((i<n-1) && (arr[i] <= arr[i+1])) {
            i++;
        }

        if (i == n-1) return false;

        i++;
        while ((i<n-1) && (arr[i] <= arr[i+1])) {
            i++;
        }

        if (i == n-1 && arr[n-1] <= arr[0]) {
            return true;
        } else {
            return false;
        }
    }
}
