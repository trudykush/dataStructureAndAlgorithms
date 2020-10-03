package september.sorting;

import java.util.Scanner;

public class InversionOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            long lengthOfArray = sc.nextInt();
            long[] arr = new long[(int) lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            long result = arrayInversion(arr, lengthOfArray);
            System.out.println(result);
        }
    }

    private static long arrayInversion(long[] arr, long n) {


        return 0;
    }
}
