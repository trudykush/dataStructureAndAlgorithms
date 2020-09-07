package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int kthElement = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            int result = kthElementMethod(arr, lengthOfArray, kthElement);
            System.out.println(result);
        }
    }

    private static int kthElementMethod(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int result = arr[k-1];

        return result;
    }
}
