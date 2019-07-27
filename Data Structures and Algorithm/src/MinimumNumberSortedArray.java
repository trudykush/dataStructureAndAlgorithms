import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumNumberSortedArray {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[(int)n];
            
            for(long i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            System.out.println(new MinimumNumber().minNumber(arr,0,n-1));
            
        }
    }
    
}

/*This is a function problem.
You only need to complete the function given below*/
class MinimumNumber{
    
    static long minNumber(int arr[], long low, long high)
    {
        // base case
        if (high < low)  
           return arr[0];

        if (high == low) 
           return arr[(int)low];
        long mid = low + (high - low)/2; 
        
        // check if mid+1 element is the minimum number
        if (mid < high && arr[(int)mid+1] < arr[(int)mid])
         return arr[(int)mid+1];
         
        // check if mid element is the minimum element
        if (mid > low && arr[(int)mid] < arr[(int)mid - 1])
            return arr[(int)mid];
        
        // recurse for left half
        if (arr[(int)high] > arr[(int)mid])
            return minNumber(arr, low, mid-1);
        
        // recurse for right half
        return minNumber(arr, mid+1, high);
    }
    
}