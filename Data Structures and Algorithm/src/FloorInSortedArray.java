import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorInSortedArray {
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           System.out.println(new FloorSearch().findFloor(arr, 0, n-1, x));
          
        }
    }
    
}

class FloorSearch{

    // Function to find floor for the given x
    // this is just like binary search
    static int findFloor(long arr[], int low, int high, long x)
    {
        // If low and high cross each other 
        if (low > high) 
            return -1; 
  
        // If last element is smaller than x 
        if (x >= arr[high]) 
            return high; 
  
        // Find the middle point 
        int mid = (low+high)/2; 
  
        // If middle point is floor. 
        if (arr[mid] == x) 
            return mid; 
  
        // If x lies between mid-1 and mid 
        if (mid > 0 && arr[mid-1] <= x && x < 
                                    arr[mid]) 
            return mid-1; 
  
        // If x is smaller than mid, floor 
        // must be in left half. 
        if (x < arr[mid]) 
            return findFloor(arr, low,  
                               mid - 1, x); 
  
        // If mid-1 is not floor and x is 
        // greater than arr[mid], 
        return findFloor(arr, mid + 1, high, 
                                         x); 
    }
    
}