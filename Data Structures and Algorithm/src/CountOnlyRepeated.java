import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOnlyRepeated {
	
	static int arr[] = new int[10000000];
	
	public static void main(String args[]) {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		try {
			t = Integer.parseInt(br.readLine());
			
			while (t-- > 0) {
				
				int n = Integer.parseInt(br.readLine());
				String line  = br.readLine();
				String[] str = line.trim().split("\\s+");
  				for (int i=0; i<n; i++) {
					int nextInput = Integer.parseInt(str[i]);
					arr[i] = nextInput;					
				}
  				//System.out.print(arr[3]);
  				Pair ans;
  	            ans = findRepeating(n);
  	           
  	            System.out.println(ans.a + " " + ans.b);  

  			// End of while
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	// End of Main method	
	}

//	Input:
//		2
//		5
//		1 2 3 3 4
//		5
//		2 3 4 5 5
//
//		Output:
//		3 2
//		5 2
	
	/*
	 * Number of times the element repeats. If the array is sorted and if
	 * max-difference of two adjacent elements is 1, then the length of the repeated
	 * sequence is 
	 * n-(arr[n-1]-arr[0]) 
	 * Value of the element. To the value, we do Binary Search.
	 */
	static Pair findRepeating(int n)   // return 0, 0 when n== 0
		        if(n == 0)
		        {
		            
		            return new Pair(0, 0);
		        }
		        
		        // when all the elements are distinct
		        if(n-(arr[n-1]-arr[0]) == 1)
		        {
		            
		            return new Pair(-1, -1);
		        }
		        
		        int lo = 0, hi = n-1;
		        int mid = 0;
		        
		        // apply binary search to find the repeating element
		        while(lo < hi)
		        {
		        
		            mid = (lo+hi)/2;
		        
		            if(arr[mid] >= mid + arr[0]){
		                lo = mid+1;
		            }
		            else{
		                hi = mid;
		            }
		        }
		        
		         
		        return new Pair(arr[mid],n-(arr[n-1]-arr[0]));
		   }	
	
	class Pair
	{
	    int a = 0;
	    int b = 0;
	    Pair(int x, int y)
	    {
	        a= x;
	        b = y;
	    }
	}
	
// End of class
}
