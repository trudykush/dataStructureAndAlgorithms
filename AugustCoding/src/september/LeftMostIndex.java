package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftMostIndex {

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

            int indexToFindOf = Integer.parseInt(br.readLine().trim());

            int result = leftIndex(arr, lengthOfArray, indexToFindOf);
            System.out.println("The left most index is: " + result);
        }
    }

    // {1,1,2,2,3,4,5,5,6,7}
    private static int leftIndex(int[] arr, int n, int x) {

        int left = 0, right = n-1;
        int index = -1;

        while (left <= right) {
            int mid = left + ((right - left)/2);

            if (arr[mid] == x && (mid == 0 || arr[mid - 1] < x )) {
                return mid;
            }

            if (arr[mid] > x) {
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            }

        }
        return index;
    }
}
