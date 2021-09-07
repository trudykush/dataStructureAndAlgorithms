package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumOccuredInteger {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInt = Integer.parseInt(br.readLine());

        while (numberOfInt-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int left[] = new int[n];
            String leftElements = br.readLine();
            String[] leftInputs = leftElements.trim().split("\\s+");
            for(int i=0; i<n; i++){
                left[i] = Integer.parseInt(leftInputs[i]);
            }

            int right[] = new int[n];
            String rightElements = br.readLine();
            String[] rightInputs = rightElements.trim().split("\\s+");
            int maxx = Integer.MIN_VALUE;
            for (int j=0; j<n; j++) {
                right[j] = Integer.parseInt(rightInputs[j]);
                if (right[j] > maxx) {
                    maxx = right[j];
                }
            }

            System.out.println("Result is " + maxOccured(left, right, n, maxx));

        }
    }

    private static int maxOccured(int[] L, int[] R, int n, int maxx) {
        int arr[] = new int[100000];

        for(int i = 0;i<n;i++){
            arr[L[i]] += 1;
            arr[R[i]+1] -= 1;

            int hello = 0;  // Just for debugging stoppage
        }

        int msum = arr[0], ind = -1;

        for(int i = 1;i<=maxx;i++){
            int qw = arr[i];
            int we = arr[i - 1];
            arr[i] += arr[i-1];
            if(msum < arr[i]){
                msum = arr[i];
                ind = i;

                int hello  = 0; // Just for debugging stoppage
            }
        }

        return ind;
    }
}
