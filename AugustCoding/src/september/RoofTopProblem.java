package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoofTopProblem {

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

            int result = roofTop(arr, lengthOfArray);
            System.out.println(result);
        }
    }

    private static int roofTop(int[] arr, int n) {

        int count = 0, max_count = 0;
        for (int i = 0; i < n-1; i++) {

            if(arr[i+1] > arr[i]) {
                count++;
            } else {
                count = 0;
            }

            if (count > max_count) {
                max_count = count;
            }
        }
        return max_count;
    }
}
