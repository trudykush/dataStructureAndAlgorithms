package october.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumInArray {

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

            int sumNumber = Integer.parseInt(br.readLine().trim());

            findingTheTripletSumInArray(arr, lengthOfArray, sumNumber);
        }
    }

    private static void findingTheTripletSumInArray(int[] arr, int n, int sumNumber) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int l = i+1, r = n-1;

            while(l < r) {
                if (arr[i] + arr[l] + arr[r] == sumNumber) {
                    System.out.println(arr[i] +" "+ arr[l] +" "+ arr[r]);
                    System.out.println(true);
                    return;
                } else if (arr[i] + arr[l] + arr[r] < sumNumber) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}
