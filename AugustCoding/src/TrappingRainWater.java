import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainWater {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            int unitOfWaterTrapped = trappingWater(arr, lengthOfArray);
            System.out.println("Total water trapped -> " + unitOfWaterTrapped);
        }
    }

    private static int trappingWater(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[0] = arr[n-1];
        for (int i = n-2; i >= 0; i++) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int water = 0;
        for (int i = 1; i < n-1; i++) {
            water += Math.max(0, Math.min(left[i], right[i]) - arr[i]);
        }
        return water;
    }
}
