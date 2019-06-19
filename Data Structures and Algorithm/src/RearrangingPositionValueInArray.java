import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangingPositionValueInArray {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			String st[] = read.readLine().trim().split("\\s+");
			long arr[] = new long[(int) n];

			for (int i = 0; i < n; i++)
				arr[(int) i] = Integer.parseInt(st[(int) i]);

			new rearrangeInArray().arrange(arr, n);
			
			  for(int i = 0; i < n; i++) {
				  System.out.print(arr[i] + " ");
			  }
			 
			System.out.println();
		}
	}
}

/*
 * I will use the formula Dividend = Divisor * Quotient + Remainder
where Divisor = size of array
           Quotient = New number at index i after rearrangement
           Remainder = Old Number at index i before rearrangement
           Dividend = The number stored at index i

While Traversing the array, we will Look for the value at arr[arr[i]] (which is to be stored at index i), multiply it with Divisor (size of array), and add the old value present at arr[i] to it.
Divisor is a value which is higher then values in array (in this case n - size of array, as array elements are between 0 to n-1)

And let's not forget to remove the multiplier n from the values while accessing and outputting the new values.
 * 
 * */
class rearrangeInArray {
	// Function to rearrange the elements
	// arr: input array
	// n: size of array
	static void arrange(long arr[], int n) {

		int i = 0;
		
		for (i=0; i<n; i++) {
			arr[i] += (arr[(int) arr[i]]%n) * n;
		}
		for (i=0; i<n; i++) {
			arr[i] = arr[i]/n;
		}
		
	}
}