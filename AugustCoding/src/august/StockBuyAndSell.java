package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Solution Structure
class Interval{
    int buy, sell;
}

public class StockBuyAndSell {

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

            stockBuySell(arr, lengthOfArray);
        }
    }

    private static void stockBuySell(int[] price, int n) {

        if(n == 1) {
            return;
        }

        int count = 0;

        ArrayList<Interval> solutionArray = new ArrayList<>();

        int i = 0;
        while(i < n-1) {

            // Finding the Local Minima. Note that the limit is (n-2)
            // as we are comparing the current element to the next element.
            while((i<n-1) && (price[i+1] <= price[i])) {
                i++;
            }

            if (i == n-1) {
                break;
            }

            Interval interval = new Interval();
            interval.buy = i++;

            // Finding the Local Maxima. Note that the limit is (n-1)
            // as we are comparing to previous element
            while((i<n) && (price[i] >= price[i-1])) {
                i++;
            }

            interval.sell = i-1;

            solutionArray.add(interval);

            count++;
        }

        if (count == 0) {
            System.out.println("There is no day when buying the stock will make profit");
        } else {
            for (int j=0; j<count; j++) {
                System.out.println("Buy on day " + solutionArray.get(j).buy + " " +
                            " Sell on day " + solutionArray.get(j).sell);
            }
        }

        return;
    }
}
