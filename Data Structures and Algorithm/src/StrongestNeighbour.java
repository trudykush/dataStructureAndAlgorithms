import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongestNeighbour {

	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    StrongestNeighbourInnerClass obj = new StrongestNeighbourInnerClass();
		    obj.maximumAdjacent(sizeOfArray, arr);
		    
		    System.out.println();
		}
	}
}

class StrongestNeighbourInnerClass{
    
    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
    	 StringBuffer sb = new StringBuffer(sizeOfArray);
         int lowerValue = arr[0], higherValue = arr[1];
         for (int i = 0; i < sizeOfArray - 1; i++) {
             lowerValue = arr[i];
             higherValue = arr[i+1];
             if (lowerValue >= higherValue) {
                 sb.append(lowerValue);
                 sb.append(" ");
             } else {
                 sb.append(higherValue);
                 sb.append(" ");
             }
         }
         System.out.print(sb);
        
    }
}
