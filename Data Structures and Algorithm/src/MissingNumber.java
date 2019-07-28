import java.util.Scanner;

public class MissingNumber {
	public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Missing obj = new Missing();
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

class Missing{
    
    static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;  // increment count of non-positive integers 
           }
        } 
        return j;
    }
    
    static int findMissingPositive(int arr[], int size)
    {
      // Mark arr[i] as visited by making arr[arr[i] - 1] negative. 
      // Note that 1 is subtracted because index start 
      // from 0 and positive numbers start from 1 
      int i;
      for(i = 0; i < size; i++)
      {
        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
      }
      // Return the first index value at which is positive 
      for(i = 0; i < size; i++)
        if (arr[i] > 0)// 1 is added because indexes start from 0 
          return i+1;
      return size+1;
    }
    
    static int missingNumber(int arr[], int size)
    {
        // First separate positive and negative numbers
        int shift = segregate (arr, size);
        int arr2[] = new int[size-shift];
        int j=0;
        for(int i=shift;i<(size);i++)
        {
            arr2[j] = arr[i];
            j++;
        }    
       return findMissingPositive(arr2, j);
    }
    
}