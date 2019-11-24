import java.util.Scanner;

public class FibonacciSeries {
	
	 public static void main(String args[])
	 {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t-- > 0)
	        {
	            int n = sc.nextInt();  // taking n as input
	            new PrintFib();
				System.out.println(PrintFib.fibonacci(n)); // print the nth fibonacci number
	        }
	 }
}

class PrintFib
{
    static long fibonacci(int n)
    {
       if ((n==1) || (n==2)) {
           return 1;
       } else {
           return fibonacci(n-1) + fibonacci(n-2);
       }
    }
}

