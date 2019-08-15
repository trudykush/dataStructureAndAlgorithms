package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryArraySorting {
	
	public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int n =Integer.parseInt(st[0]);
            
            int arr[] = new int[n];
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st[i]);
            new BinarySort().binSort(arr, n);
            for(Integer x: arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

class BinarySort
{
    static void binSort(int arr[], int n)
    {
        int low = 0, high = n-1;
        
        while (low <= high) {
         
            if (arr[low] == 0) {
                low++; 
            } else if (arr[high] == 1) {
                high--;
            } else {
                int temp;
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            
        }
    }
}
