package october.sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortByAbsoluteDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];

            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            int absDiff = sc.nextInt();

            sortingArrayByAbsDiff(arr, lengthOfArray, absDiff);
        }
    }

    private static void sortingArrayByAbsDiff(int[] arr, int n, int k) {

        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();

        // Store the values in a map with the difference with X as key
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(k - arr[i]);
            if (treeMap.containsKey(diff)) {
                ArrayList<Integer> al = treeMap.get(diff);
                al.add(arr[i]);
                treeMap.put(diff, al);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                treeMap.put(diff, al);
            }
        }

        // Update the values o array#
        int index = 0;
        for (Map.Entry entry :
                treeMap.entrySet()) {
            ArrayList<Integer> al = treeMap.get(entry.getKey());
            for (int i = 0; i < al.size(); i++) {
                arr[index++] = al.get(i);
            }
        }
    }
}
