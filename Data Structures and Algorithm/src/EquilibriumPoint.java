import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i]=Long.parseLong(inputLine[i]);
            }
            
            Equilibrium obj = new Equilibrium();
            
            System.out.println(obj.equilibriumPoint(arr, n));
        }
    }
}


class Equilibrium{
    
    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n){
        
        // Your code here
        long leftSum = 0;
        long sum = 0;
        
        // To get the sum of array and save in Sum
        for (int i=0; i<n; i++) {
            sum = sum + arr[i];
        }
        
        // To Subtract number at arr[position] from sum and
        // add up arr[position] at leftSum to meet at intersection
        for (int j=0; j<n; j++) {
        	sum = sum - arr[j];
        	
        	if (sum == leftSum) {
        		return j+1;
        	} else {
        		leftSum = leftSum + arr[j];
        	}
        }
        return -1;
    }
    
}