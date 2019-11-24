package Searching;

import java.util.Scanner;

public class DigitalRoot {
	
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t-- > 0)
	        {
	            int n = sc.nextInt();
	            new Digital();
				System.out.println(Digital.digitalRoot(n));
	        }
	    }

}

class Digital
{
    // complete the function
    public static int digitalRoot(int n)
    {
        if(n/10 == 0) {
            return n;
        } else {
            return digitalRoot(SumDigit(n));
        }
    }
    
    private static int SumDigit(int n) {
        if (n/10 == 0) {
            return n;
        } else {
            return n%10 + SumDigit(n/10);
        }
    }
}
