import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaveArray {
	    
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
			
			while(t-->0)
			{
			    int n = Integer.parseInt(br.readLine().trim());// taking size of array
			    int arr[] = new int[n]; // declaring array of size n
			    String inputLine[] = br.readLine().trim().split(" ");
			    for(int i=0; i<n; i++){
			        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
			    }
			    
			    Wave obj = new Wave();
			    
			    
			    obj.convertToWave(arr, n);
			    
			    StringBuffer sb = new StringBuffer(); 
	            for (int i = 0; i < n; i++) 
	                sb.append(arr[i] + " "); 
	                
			    System.out.println(sb); // print array
			}
		}	
}

class Wave{
    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    	 public static void swap(int arr[], int x, int y){
    	        int tmp = arr[x];
    	        arr[x] = arr[y];
    	        arr[y] = tmp;
    	    }
    	    
    	    public static void convertToWave(int arr[], int n){
    	        
    	        // just iterating over the array and swapping the elements
    	        for(int i=0;i<n-1;i=i+2){
    			        swap(arr, i, i+1);
    			    }
    	        return;
    	    }
}

/*
 * public static void convertToWave(int arr[], int n){
 * 
 * for (int i = 0; i < n - 1; i=i+2) {
 * 
 * int lowerNum = arr[i]; int higherNum = arr[i+1];
 * 
 * int temp = lowerNum; lowerNum = higherNum; higherNum = temp;
 * 
 * } return; }
 */
