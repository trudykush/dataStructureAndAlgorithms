import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftIndexSearch {
	public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[]= new int[sizeOfArray];
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
            
            int elementToSearch = Integer.parseInt(read.readLine());
            
            System.out.println(new LeftIndex().leftIndex(sizeOfArray, arr, elementToSearch));
        }
    }
}

/*This is a function problem.
You only need to complete the function given below*/
//n = sizeOfArray, x = elementToSearch
class LeftIndex{ 
	 static int leftIndex(int sizeOfArray, int arr[], int elementToSearch)
	    {
	       int lo = 0, hi = sizeOfArray-1, mid = lo + ((hi-lo)/2);
	    
	        // looping through array using binary search
	        while(lo <= hi){
	        // calculate mid
	         mid = lo + ((hi-lo)/2);
	    
	        // if element is equal to arr[mid]
	        // element is found, return true
	        if(arr[mid] == elementToSearch && (arr[mid-1] < elementToSearch)){
	            return mid;
	        }
	        
	        // if elemntToSearch > middle of current array,
	        // go for higher part of array
	        if(elementToSearch > arr[mid]){
	            lo = mid+1;
	        }
	        else
	        // if elemntToSearch < middle of current array,
	        // go for lower part of array
	            hi = mid-1;
	        
	    }
	    
	        // if element is not there in the array, return false
	        return -1;
	    }
	}