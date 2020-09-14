package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountMoreThanN_By_K_Occurance {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {
            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[lengthOfArray];
            String[] arrayElements = br.readLine().trim().split("\\s+");
            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            int result = countOccurance(arr, lengthOfArray, k);
            System.out.println(result);
        }
    }

    private static int countOccurance(int[] arr, int n, int k) {

        int result = -1;



        return result;
    }
}
