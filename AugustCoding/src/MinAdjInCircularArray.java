public class MinAdjInCircularArray {

    public static void main(String[] args) {

        int arr[] = {8,-8,9,-9,10,-11,12};

        int x = minAdjDiff(arr, arr.length);
        System.out.println(x);
    }

    public static int minAdjDiff(int arr[], int n) {

        int result = 0;
        // Your code here
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length - 2; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1;
            } else if (arr[i+1] < 0) {
                arr[i+1] = arr[i+1] * -1;
            }
            int addingNextValue = arr[i] + arr[i+1];
            if (addingNextValue > max || addingNextValue < result) {
                result = addingNextValue;
                max = addingNextValue;
            }
        }

        return result;
    }
}
