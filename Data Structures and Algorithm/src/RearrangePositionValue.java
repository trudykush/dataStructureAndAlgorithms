import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangePositionValue
{
  public static void main(String args[])throws IOException
  {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      int t =Integer.parseInt(read.readLine());
      
      while(t-- > 0)
      {
          int n = Integer.parseInt(read.readLine());
          String st[] = read.readLine().trim().split("\\s+");
          long arr[] = new long[(int)n];
          
          for(int i = 0; i < n; i++)
              arr[(int)i]  =Integer.parseInt(st[(int)i]);
              
         new rearrange().arrange(arr, n);
			/*
			 * for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
			 */
          System.out.println();
      }
  }
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class rearrange
{
  // Function to rearrange the elements
  // arr: input array
  // n: size of array
  static void arrange(long arr[], int n)
  {
      // your code here
      StringBuffer sb = new StringBuffer(n);
      for (int i=0; i<n; i++) {
          long currentPosition = arr[i];
          int x = (int) currentPosition;
          long arrayOfArrayNumber = arr[x];
          sb.append(arrayOfArrayNumber + " ");
         
      }
      System.out.print(sb);
  }
}