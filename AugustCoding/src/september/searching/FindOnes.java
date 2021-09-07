package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOnes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i <lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            numberOfOnes(arr, lengthOfArray);
        }
    }

    private static int numberOfOnes(int[] arr, int n) {
        int left = 0, right = n-1;
        int mid;

        while(left <= right) {
            mid = left + (right  - left)/2;

            if (arr[mid] == 1 && mid+1 < n && arr[mid+1] == 1) {
                left = mid+1;
            }
            else if(arr[mid] == 0) {
                right = mid - 1;
            }
            else if (arr[mid] == 1 && ((mid+1 < n && arr[mid+1] == 0) || (mid == n-1))) {
                return mid+1;
            }
        }
        return 0;
    }
}
