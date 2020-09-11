package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumElementInSortedRotatedArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            long result = minNumber(arr, 0, lengthOfArray-1);
            System.out.println("The minumber element is : " + result);
        }
    }

    private static long minNumber(int[] arr, long low, long high) {

        if (high < low) {
            return arr[0];
        }

        if (high == low) {
            return arr[(int) low];
        }

        long mid = (low+high)>>1;

        if (mid < high && arr[(int) (mid+1)] < arr[(int) mid]) {
            return arr[(int) (mid+1)];
        }

        if (mid > low && arr[(int) (mid-1)] > arr[(int) mid]) {
            return arr[(int) mid];
        }

        if (arr[(int) mid] > arr[(int) high]) {
            return minNumber(arr, mid+1, high);
        } else {
            return minNumber(arr, low, mid-1);
        }
    }
}
