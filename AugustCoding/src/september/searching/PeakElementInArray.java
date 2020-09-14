package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeakElementInArray {

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

            int peakElement = peakElement(arr, lengthOfArray);
            System.out.println("The peak element is: " + peakElement);
        }
    }

    private static int peakElement(int[] arr, int n) {
        return findingPeakElement(arr, 0, n-1, n);
    }

    private static int findingPeakElement(int[] arr, int low, int high, int n) {
        int mid = 0;
            //mid = low + ((high - low) / 2);
            mid = (low+high)>>1;

            if ((mid == 0 || arr[mid-1] <= arr[mid]) &&
                    (arr[mid] == n-1 || arr[mid+1] <= arr[mid])) {
                return mid;
            }
            else if(mid>0 && arr[mid-1]>arr[mid]) {
                return findingPeakElement(arr, low, (mid-1), n);
            } else if (arr[mid] > arr[mid+1]) {
                return findingPeakElement(arr, (mid+1), high, n);
            }
        return -1;
    }
}
