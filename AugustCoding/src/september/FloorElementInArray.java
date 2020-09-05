package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorElementInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            long[] arr = new long[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            long floorOf = Long.parseLong(br.readLine().trim());

            long result = floorElement(arr, 0, lengthOfArray-1, floorOf);
            System.out.println("The floor element is : " + result);
        }
    }

    private static int floorElement(long[] arr, int left, int right, long floorOf) {
        int mid = 0;
        long ans = -1;

        while(left <= right) {
            //mid = left + (right - left)/2;
            mid = (left+right)>>1;


            if (floorOf >= arr[right]) {
                return right;
            }

            if (arr[mid] == floorOf) {
                return mid;
            }

            if (arr[mid] > floorOf) {
                right = mid - 1;
            }
            else if (arr[mid] < floorOf) {
                ans = mid;
                left = mid+1;
            }
        }
        return (int) ans;

    }

}


/*
*  int mid = 0;
        long ans = -1;

        while(left <= right) {
             // If low and high cross each other

            mid = (left+right)>>1;

        // If last element is smaller than x
        if (floorOf >= arr[right])
            return right;


        // If middle point is floor.
        if (arr[mid] == floorOf)
            return mid;


            if (arr[mid] > floorOf) {
                right = mid - 1;
            }
            else if (arr[mid] < floorOf) {
                ans = mid+1;
                left = mid+1;
            }
        }
         return (int) ans;
* */