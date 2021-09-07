package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRoot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while (numberOfCases-- > 0) {

            long testNumber = Long.parseLong(br.readLine().trim());

            long result = findingSquareRoot(testNumber);
            System.out.println("The Result is " + result);
        }
    }

    private static long findingSquareRoot(long x) {

        if (x == 0 || x == 1) {
            return x;
        }

        long start = 0, end = x, ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return mid;
            }
            else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}


/*  // Too long as per time complexity, does linear search
*  long result = -1;

        for (int i = 1; i < n; i++) {

            long multiplyingCurrentNum = i * i;

            if (multiplyingCurrentNum == n) {
                result = i;
            } else if (multiplyingCurrentNum < n) {
                result = i;
            } else {
            }
        }

        return result;
* */