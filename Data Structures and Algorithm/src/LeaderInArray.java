import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeaderInArray {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.leaders(arr, n);
		    
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    System.out.println(str);
		}
		
	}
}

class Leader{
	
	static ArrayList<Integer> leaders(int arr[], int n){
        int max = arr[n-1];
        
    	ArrayList<Integer> leaderList = new ArrayList<Integer>();
        for (int i=n-1; i>=0; i--) {
        	
        	if (arr[i] >= max) {
        		leaderList.add(arr[i]);
        		max = arr[i];
        	}
            
        }
        Collections.reverse(leaderList);
        return leaderList;
    }
    
}