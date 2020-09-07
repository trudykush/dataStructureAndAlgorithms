package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.MarshalException;

class Pair {
    public int first;
    public int second;
}

public class TwoRepeatedElements {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < numberOfCases; i++) {

            int lengthOfArray = Integer.parseInt(br.readLine().trim());
            String[] arrayElements = br.readLine().trim().split("\\s+");
            int[] arr = new int[arrayElements.length];
            for (int j = 0; j < arr.length; j++) {
                arr[i] = Integer.parseInt(arrayElements[i]);
            }

            Pair result = twoRepeated(arr, lengthOfArray);
            System.out.println("The result is : " + result.first + " " + result.second);

        }

    }

    private static Pair twoRepeated(int[] arr, int n) {
        boolean first = false;
        Pair res = new Pair();
        // iterating over the array elements
        for(int p=0;p<n+2;p++)
        {

            // check if the element is visited or not
            // if not, then make it negative
            if(arr[Math.abs(arr[p])] > 0)
            {
                arr[Math.abs(arr[p])] = -arr[Math.abs(arr[p])];
            }
            // else, if it is already visited, then print the element
            // it means it is repeated
            else
            {
                if(first==false)
                {
                    res.first = Math.abs(arr[p]);
                    first = true;
                }
                else
                    res.second = Math.abs(arr[p]);

            }
        }
        return res;
    }
}


/*
* private static Pair twoRepeated(int[] arr, int n) {
        boolean first = false;
        Pair res = new Pair();

        for (int i = 0; i < n + 2; i++) {

            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {

                if (first == false) {
                    res.first = Math.abs(arr[i]);
                    first = true;
                } else {
                    res.second = Math.abs(arr[i]);
                }
            }
        }

        return res;
    }
* */