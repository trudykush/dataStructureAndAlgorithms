import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSteps {
	public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            
            System.out.println(new Step().maxStep(arr, n));
        }
    }
    
    
}
    
class Step{
    
    // Function to find the maximum steps
    // arr[]: input array
    // n: size of the array
    static int maxStep(int arr[], int n){
        int jump = 0;
        int counter = 0;
        
        int low = 0, high = 1;
        
        for (int i=0; i<n-1; i++) {
            if (arr[high] > arr[low]) {
                jump++;
                counter++;
            } else {
                if (jump > 0) 
                     jump--;
            }
            low++; high++;
        }
        return jump;
    }
}