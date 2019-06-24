import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Trapping Rain Water
Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1. Compute how much water can be trapped in between blocks after raining.
Structure is like below:
| |
|_|
We can trap 2 units of water in the middle gap.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. Each test case contains an integer N denoting the size of the array, followed by N space separated numbers to be stored in array.

Output:
Output the total unit of water trapped in between the blocks.

User Task:
The task is to complete the function trappingWater() which returns the total amount of water that can be trapped.

Constraints:
1 <= T <= 100
3 <= N <= 107
0 <= Ai <= 108

Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0

Explanation:
Testcase 1: Water trapped by block of height 4 is 3 units, block of height 0 is 7 units. So, total unit of water trapped is 10 units.
 * */
public class TrappingRainWater {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int low=0, high=n-1, res=0;
        int leftMax = 0, rightMax = 0;
        
        while (low <= high) {
            
            // update max on right
            if (arr[low] <= arr[high]) {
                if (arr[low] > leftMax) {
                    leftMax = arr[low];
                } else {
                    res += leftMax - arr[low];
                }
                low++;
            } else {    // update max on left
                if (arr[high] > rightMax) {
                    rightMax = arr[high];
                } else {
                    res += rightMax - arr[high];
                }
                high--;
            }
        }
        return res;
    } 
}

