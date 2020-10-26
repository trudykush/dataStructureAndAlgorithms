package september.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TripletWithZeroSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            boolean result = findingTriplets(arr, lengthOfArray);
            System.out.println(result);
        }
    }

    private static boolean findingTriplets(int[] arr, int n) {

        boolean found = false;
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            int l = i+1, r = n-1;

            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0) {
                    System.out.print(arr[i] + " " + arr[l] + " " + arr[r]);
                    System.out.println();

                    l++;
                    r--;
                    found = true;
                } else if (arr[i] + arr[l] + arr[r] < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return found;
    }
}
