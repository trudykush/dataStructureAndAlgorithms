package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaneAlgorithm {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 1; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            arrayMaxConsecutive(arr, lengthOfArray);
        }
    }

    private static void arrayMaxConsecutive(int[] arr, int n) {

        int max_sum = arr[0];
        int current_sum = max_sum;

        for (int i = 0; i < n; i++) {
            current_sum = Math.max(arr[i]+current_sum, arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        System.out.println("Maximum sum array is " + max_sum);
    }
}
