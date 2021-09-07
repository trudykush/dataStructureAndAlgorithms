package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajorityElementInArray {

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

            int result = maximumElement(arr, lengthOfArray);
            if (result > 0) {
                System.out.println("The number " + result + " occurs maximum times");
            } else {
                System.out.println("No Maximum");
            }
        }
    }

    private static int maximumElement(int[] arr, int n) {
        int candidate = findCandidate(arr, n);

        boolean isMaxTimes = isMajority(arr, n, candidate);

        if (isMaxTimes) {
            return candidate;
        } else {
            return -1;
        }
    }

    private static boolean isMajority(int[] arr, int n, int candidate) {

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > n/2) {
            return true;
        }
        return false;
    }

    private static int findCandidate(int[] arr, int n) {
        int majority_Element = 0;
        int count = 1;
        int ans = -1;
        for (int i = 1; i < n; i++) {

            if(arr[majority_Element] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majority_Element++;
                count = 1;
            } else {
                ans = arr[i];
            }
        }
        return ans;
    }
}
