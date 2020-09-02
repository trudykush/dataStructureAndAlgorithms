package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] inputLine = br.readLine().trim().split("\\s+");
            for (int i=0; i<lengthOfArray; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            convertToWaves(arr, lengthOfArray);
        }
    }

    private static void convertToWaves(int[] arr, int n) {

        for (int i=0; i<n - 1; i++) {
            if (i % 2 == 0) {  // Even - Greater Number

                if (!(arr[i] >= arr[i+1])) {
                  // Swap
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
                }

            } else {    // Odd - Smaller Number

                if (!(arr[i] <= arr[i+1]))  {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
