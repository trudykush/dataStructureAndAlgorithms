import java.util.Scanner;

public class SquareRootFloor {
	
			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t>0)
				{
					long a = sc.nextInt();
					SquareRoot obj = new SquareRoot();
					System.out.println(obj.floorSqrt(a));
				t--;
				}
			}
		}
		
		/*This is a function problem.You only need to complete 
		the function given below*/
		/*You are required to complete
		this function*/
		// Function to find square root
		// x: element to find square root

/*
 * Square root Given an integer x. The task is to find the square root of x. If
 * x is not a perfect square, then return floor(√x).
 */
		class SquareRoot
		{
			long floorSqrt(long x)
			 {
				// Your code here
				long low = 0, high = x;
				long mid = (low+high)/2;
				
				while (low <= high) {
				    
				    mid = (low+high)/2;
				    
				    if ((mid*mid) == x) {
				        return mid;
				    } 
				    
				    if ((mid*mid) < x) {
				        if (((mid+1)*(mid+1)) > (x)) {
				            return mid;
				        }
				        low = mid+1;
				    } else if ((mid*mid) > x) {
				        high = mid-1;
				    }
				}
				return -1;
			 }
		}