package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequencyInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {

            int lengthOfInput = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfInput];

            String[] inputs = br.readLine().trim().split("\\s+");
            for (int i=0; i<lengthOfInput; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
            frequencyCount(arr, lengthOfInput);
        }
    }

    private static void frequencyCount(int[] arr, int n) {

        int[] result = new int[n];

        for (int i=0; i<=n-1; i++) {
            result[arr[i]-1] += 1;
        }
        for (int i: result) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}


/*
*  public static void frequencycount(int arr[], int n)
    {
        for (int j =0; j<n; j++)
            arr[j] = arr[j]-1;

        // storing the frequency of elements using mathematical formula
        for (int i=0; i<n; i++)
            arr[arr[i]%n] = arr[arr[i]%n] + n;

        for (int i =0; i<n; i++)
            arr[i] = (arr[i]/n);
    }
* */