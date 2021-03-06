package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestPositiveMissingNumberInArray {

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

            int result = missingNumber(arr, lengthOfArray);
        }
    }

    private static int missingNumber(int[] A, int n) {

        // To mark the occurrence of elements
        boolean[] present = new boolean[n + 1];

        // Mark the occurrences
        for (int i = 0; i < n; i++) {

            // Only mark the required elements
            // All non-positive elements and
            // the elements greater n + 1 will never
            // be the answer
            // For example, the array will be {1, 2, 3}
            // in the worst case and the result
            // will be 4 which is n + 1
            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;
        }

        // Find the first element which didn't
        // appear in the original array
        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;

        // If the original array was of the
        // type {1, 2, 3} in its sorted form
        return n + 1;
    }
}


// For any Sequence
/*
* int N = A.length;
Set<Integer> set = new HashSet<>();
for (int a : A) {
    if (a > 0) {
        set.add(a);
    }
}
for (int i = 1; i <= N + 1; i++) {
    if (!set.contains(i)) {
        return i;
    }
}
* */