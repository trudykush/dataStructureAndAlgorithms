import java.util.Scanner;

public class PeakElement  {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		
			int A=new Peak().peakElement(a,n);
			int f=0;
			if(n==1)
			f=1;
			else
			if(A==0 && a[0]>=a[1])
			f=1;
			else if(A==n-1 && a[n-1]>=a[n-2])
			f=1;
			else if(a[A] >=a[A+1] && a[A]>= a[A-1])
			f=1;
			else
			f=0;
			System.out.println(f);
		}
	}
}

class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
        return findPeakUtil(a, 0, n-1, n);
    }
    
    int findPeakUtil(int arr[], int low, int high, int n)
{
   
    int mid = (low+high)>>1;
    
    // if mid is last or first index with first element
    // greater than next.
    // Also, check if mid element is greater than mid - 1 and mid+1
    if ((mid == 0 || arr[mid-1] <= arr[mid]) &&
            (mid == n-1 || arr[mid+1] <= arr[mid]))
        return mid;
        
    // If mid is other than 0, then check if mid element is less than prev.
    // If so, then recurse for lower half
    else if (mid > 0 && arr[mid-1] > arr[mid])
        return findPeakUtil(arr, low, (mid -1), n);
        
    // else recurse for the upper half
    else return findPeakUtil(arr, (mid + 1), high, n);
}

}