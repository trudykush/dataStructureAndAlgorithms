package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchingAnElement {

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

            int elementToSearch = Integer.parseInt(br.readLine().trim());

            int result = searching(arr, lengthOfArray, elementToSearch);
            System.out.println("The element is at position " + result);

        }
    }

    private static int searching(int[] arr, int n, int x) {

        for (int i=0; i<n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
