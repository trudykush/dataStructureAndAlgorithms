package october.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwapToSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            /* Works but buggy*/
            // int numberOfSwaps = findingMinimumSwapToSort(arr, lengthOfArray);

            int numberOfSwaps = findingMinSwap(arr, lengthOfArray);
        }
    }

    private static int findingMinSwap(int[] arr, int n) {

        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, n);

       // Hashmap which stores the indexes of input array
        HashMap<Integer, Integer> hashMap =
                new HashMap<>();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], i);
        }

        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(arr[i]));
        }

        for (int i = 0; i < n; i++) {
            //Now Checking that current element is in right place or now
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];

                // If not, swap this element with the index of the element
                // which should come here
                swap(arr, i, hashMap.get(temp[i]));

                // Update the indexes in
                // the hashmap accordingly
                hashMap.put(init, hashMap.get(temp[i]));
                hashMap.put(temp[i], i);
            }
        }

        return ans;
    }

    private static void swap(int[] arr, int i, Integer j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findingMinimumSwapToSort(int[] arr, int n) {

        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            int j = i+1, r = n-1;

            while (j < r) {
                if (arr[j] > arr[r]) {
                    int temp = arr[j];
                    arr[j] = arr[r];
                    arr[r] = temp;
                    j++;
                    r--;
                    numberOfSwaps++;
                } else {
                    j++;
                    r--;
                }
            }
        }
        return numberOfSwaps;
    }
}
