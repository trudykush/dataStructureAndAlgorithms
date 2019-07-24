import java.util.Arrays;
import java.util.Scanner;

class CountOne {
    
    static int arr[] = new int[5000001];
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Ones obj = new Ones();
		    System.out.println(Ones.countOnes(n));
		    
		    
		}
		
	}
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Ones{
    
    // Object of Arrays class to access array declared in 
    // Arrays class
    static CountOne obj = new CountOne();
    
    // Function to count number of ones in the binary array
    // n: size of array
    static int counter = 0;
    public static int countOnes(int n) {
        int low = 0, high = n-1;
        
        int mid = (low+high)/2;
        
        // Binary Search
        while(low <= high){
            
            mid = (low + high)/2;
            
            // if mid is 1, then check for upper half
            if(CountOne.arr[mid] == 1 && mid+1 < n && CountOne.arr[mid+1] == 1){
                low = mid+1;
            }
            
            // if mid is 0, then iterate for upper half
            else if(CountOne.arr[mid] == 0){
                high = mid-1;
            }
            
            // else, iterate for lower half
            else if(CountOne.arr[mid] == 1 && 
            		((mid+1 < n && CountOne.arr[mid+1] == 0) || 
            				(mid == n-1))){
                return mid+1;
            }
            
        }
        return 0;
    }
    
}