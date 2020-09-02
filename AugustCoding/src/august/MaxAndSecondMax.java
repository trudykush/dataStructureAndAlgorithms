package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxAndSecondMax {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());

        while (testCases-- > 0) {

            int sizeOfArray = Integer.parseInt(bufferedReader.readLine());

            int arr[] = new int[sizeOfArray];
            String line = bufferedReader.readLine();
            String[] elements = line.trim().split("\\s+");

            for (int i=0; i<sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            largestAndSecondLargest(sizeOfArray, arr);
        }

    }

    private static void largestAndSecondLargest(int sizeOfArray, int[] arr) {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i=0; i<sizeOfArray; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if(arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }

            // if max2 has not been updated
            // then assign it to -1
            if(max2 == Integer.MIN_VALUE){
                max2 = -1;
            }
        }

        System.out.println(max + " --- " + max2);
    }
}
