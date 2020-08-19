import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPointInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfTesCase = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfTesCase];

            String[] testInput = br.readLine().trim().split("\\s+");
            for (int i=0; i<lengthOfTesCase; i++) {
                arr[i] = Integer.parseInt(testInput[i]);
            }

            int output = equilibriumPoint(arr, lengthOfTesCase);
            System.out.println(output);
        }
    }

    private static int equilibriumPoint(int[] arr, int n) {

        int result = -1;

        int sum = 0;
        for (int i=0; i<n-1; i++) {
            sum += arr[i];
        }

        int sumFromFront = 0;

        for (int j=0; j<n; j++) {

            sum -= arr[j];

            if (sum == sumFromFront) {
                return (j + 1);
            }

            sumFromFront += arr[j];
        }
        return result;
    }
}
