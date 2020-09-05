package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElement = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElement[i]);
            }

            smallestPositive(arr, lengthOfArray);
        }
    }

    private static int smallestPositive(int[] arr, int n) {

        boolean[] isPositive = new boolean[n+1];

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 && arr[i] < n) {
                isPositive[arr[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!isPositive[i]) {
                return i;
            }
        }
        return -1;
    }
}
