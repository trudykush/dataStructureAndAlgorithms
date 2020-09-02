package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinAdjInCircularArray {

    public static void main(String[] args) throws IOException {

//        int arr[] = {8,-8,9,-9,10,-11,12};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];
            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for (int i=0; i<sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            int x = minAdjDiff(arr, arr.length);
            System.out.println(x);
        }
    }

    public static int minAdjDiff(int arr[], int n) {

       int result = 0;
       result = Math.abs(arr[0] - arr[1]);

       for (int i=2; i<n; i++) {
           result = Math.min(result, Math.abs(arr[i] - arr[i-1]));
       }

       result = Math.min(result, Math.abs(arr[0] - arr[n - 1]));
       return result;
    }
}
