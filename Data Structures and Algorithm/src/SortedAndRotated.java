import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedAndRotated {
	 public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
			while(t-->0){
			    int n = Integer.parseInt(br.readLine()); // input size of array
			    int arr[] = new int[n];
			    String inputLine[] = br.readLine().trim().split("\\s+");
			    for(int i=0; i<n; i++){
			        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
			    }
			   
			 SortedRotated obj = new SortedRotated();
	        
	        if(!(obj.checkRotatedAndSorted(arr, n)))
	            System.out.println("No"); // print the result
	        else
	            System.out.println("Yes");
			}
		}
	}
	/*This is a function problem.You only need to complete the function given below*/
class SortedRotated{
    
    // Function to check if array is sorted and rotated
    // arr: input array
    // n: size of array
    static boolean checkRotatedAndSorted(int arr[], int n){
        int minInd = 0, maxInd = 0; 
        
        for(int i=0; i<n; i++){
            if(arr[i] < arr[minInd])
	            minInd = i;
	        else if(arr[i] > arr[maxInd])
	            maxInd = i;
        }
        
        //not sorted and rotated
	    if(Math.abs(minInd - maxInd) != 1){
	     
	        return false;
	    }
	    
	    // increasing order or decreasing order
	    boolean sorted = true;
        if(maxInd < minInd){
    	   
    	   // for decreasing order 
    	    for(int i=0;i<n-1;i++){
    	        
    	        if(arr[(minInd+i)%n] > arr[(minInd+i+1)%n]){
    	         
    	            sorted = false;
    	            break;
    	        }
    	    }
        }
	    else{
	        // for increasing order
	        for(int i=0;i<n-1;i++){
    	        
    	        if(arr[(minInd+n-i)%n] > arr[(minInd+n-i-1)%n]){
    	         
    	            sorted = false;
    	            break;
    	        }  
    	    }
	    }

	    if(sorted) return true;
	    else return false;
        
    }
    
}
