import java.util.Scanner;

public class RearrangeAlternate {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
        
		int t = in.nextInt();
		
		while(t-- >0)
		{
		    int n = in.nextInt();
		    int[] temp= new int[n];
		    
		    for(int i=0;i<n;i++)
		        temp[i] = in.nextInt();
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    RearrangeAlt obj = new RearrangeAlt();
		    
		    obj.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
class RearrangeAlt{
    
    // This function wants you to rearrange the temp array as required
    // and returns a StringBuffer with all elements of modified temp array
    // appended to it.
    // temp: input array
    // n: size of array
    public static void rearrange(int arr[], int n){
        
        int max = Integer.MIN_VALUE;
        
        StringBuffer sb = new StringBuffer();
        
    	for(int i=0; i<n; i++) {
    		
    		if (arr[i] > max) {
    			
    		}
    	}
    	
        
        
    }
    
}
