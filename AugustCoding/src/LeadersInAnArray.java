import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInAnArray {

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

            ArrayList<Integer> output = leaders(arr, lengthOfArray);
            Collections.reverse(output);
            System.out.println(output);
        }
    }

    private static ArrayList<Integer> leaders(int[] arr, int n) {

        ArrayList<Integer> result = new ArrayList<>();

        int currentNumber = -1;
        for (int i=n-1; i>=0; i--){
            int x = arr[i];
            if(arr[i] >= currentNumber) {
                result.add(arr[i]);
                currentNumber = arr[i];
            }

        }
        return result;
    }
}
