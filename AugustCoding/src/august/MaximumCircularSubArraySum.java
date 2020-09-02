package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumCircularSubArraySum {

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

            int result = circularSubArray(arr, lengthOfArray);
            System.out.println("The maximum sum is " + result);
        }
    }

    private static int circularSubArray(int[] a, int n) {

        // Check if all numbers are negative and return the max
        int count = 0;
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i] > maxx) {
                maxx = a[i];
            }
            if (a[i] < 0) {
                count++;
            }
        }

        if (count == n) {
            return maxx;
        }

        // Perform Kandane's Algorithm to find maximum value
        int maxx_kandane = kandane(a, n);

        int maxx_reverseKandane = 0;
        for (int i = 0; i < n; i++) {
            maxx_reverseKandane += a[i];
            a[i] = -a[i];
        }

        // Performing reverse Kandane Algorithm
        maxx_reverseKandane = maxx_reverseKandane + kandane(a,n);

        return Math.max(maxx_kandane, maxx_reverseKandane);
    }

    private static int kandane(int[] a, int n) {

        int maxx_sum = a[0];
        int current_sum = maxx_sum;

        for (int i = 1; i < n; i++) {
            current_sum = Math.max(a[i]+current_sum, a[i]);
            maxx_sum = Math.max(current_sum, maxx_sum);
        }
        return maxx_sum;
    }
}
