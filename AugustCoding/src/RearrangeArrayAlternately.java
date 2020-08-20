import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangeArrayAlternately {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i=0; i<lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            reArrange(arr, lengthOfArray);
        }
    }

    /*
    * Here, We will use the formula
    * Dividend = Divisor * Quotient + Remainder
           where
           Divisor = max_element
           Quotient = New number at index i after rearrangement
           Remainder = Old Number at index i before rearrangement
           Dividend = The number stored at index i
    * */

    private static void reArrange(int[] arr, int n) {

        // initialize index of first minimum and first
        // maximum element
        int max_idx = n - 1, min_idx = 0;
        int max_element = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            // Even Index
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            } else {
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_element;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
