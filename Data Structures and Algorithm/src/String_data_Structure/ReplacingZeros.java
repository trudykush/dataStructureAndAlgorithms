package String_data_Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplacingZeros {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			System.out.println(new GfG().convertfive(N));
			T--;
		}
		
	}

}

class GfG
{
    int convertfive(int num) {
    	if (num == 0) 
            return 5; 
        else
            return convert0To5Rec(num); 
    // End of convertfive
    }

	private int convert0To5Rec(int num) {

    	if (num == 0) {
    		return 0;
    	}
    	
    	int digit = num % 10;
    	if (digit == 0) {
    		digit = 5;
    	}

        return convert0To5Rec(num / 10) * 10 + digit;   
	}
}
