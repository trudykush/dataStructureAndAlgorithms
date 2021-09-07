package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangingArrayByPosition {

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

            arrangeByPosition(arr, lengthOfArray);
        }
    }

    private static void arrangeByPosition(int[] arr, int n) {

       int i = 0;

       for (i = 0; i< n; i++) {
           arr[i] += (arr[arr[i]] % n) * n;
       }

       for (i = 0; i < n; i++) {
           arr[i] = arr[i] / n;
       }

        for (int j: arr) {
            System.out.print(j + " ");
        }
    }
}
