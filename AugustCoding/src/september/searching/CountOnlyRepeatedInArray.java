package september;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class CountOnlyRepeatedInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        while(numberOfCases-- > 0) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            Integer[] arr = new Integer[lengthOfArray];

            String[] arrayElements = br.readLine().trim().split("\\s+");

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            Point p = findRepeated(arr, lengthOfArray);
            System.out.println(p.x + " " + p.y);

        }

    }

    private static Point findRepeated(Integer[] arr, int n) {

        Point p = sequence(new Vector<Integer>(Arrays.asList(arr)));
        return p;
    }

    static Point sequence(Vector<Integer> a) {

        if (a.size() == 0) {
            return new Point(0,0);
        }
        int start = 0;
        int end = a.size() - 1;

        while(start < end) {
            int mid = (start + end)/2;

            if (a.get(mid) >= mid + a.get(0)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return new Point(a.get(start), a.size() - (a.get(a.size() - 1) - a.get(0)));
    }
}
