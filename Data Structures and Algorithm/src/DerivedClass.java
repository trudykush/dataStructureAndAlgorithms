import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DerivedClass {
	
	public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
    	   String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		new RotateArray().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer(n);
            for(int t1=0;t1<n;t1++)
             sb.append(arr[t1]+" ");
             System.out.println(sb);
         }
    }
}


/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class RotateArray
{
	
    static void rotateArr(int arr[], int d, int n)
    {
        int[] rotarr=new int[d];
        
        // reverse first d elements
        for(int l=0;l<d;l++)
        {
            rotarr[l]=arr[l];
        }
            int k=0;
            
            // now reverse the last d elements
            for(int m=d;m<n;m++)
            {
                arr[k]=arr[m];k++;
             }
             
            // now reverse the whole array
           for(int p=0;p<d;p++)
           {
              arr[k]=rotarr[p];k++;
            }
    }
}
