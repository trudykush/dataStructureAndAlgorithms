package String_data_Structure;

import java.util.Scanner;

public class BinarySubString {
	    public static Scanner sc = new Scanner(System.in);
		public static void main (String[] args){
	        int t;
	    	t=sc.nextInt();
	    	sc.nextLine();
	    	while((t--)!=0){
	    	    int n=sc.nextInt();
	    	    sc.nextLine();
	    	    String s = new String();
	    	    s=sc.nextLine();
	    	    StringBinary obj = new StringBinary();
	    	    System.out.println(obj.binarySubstring(n, s));
	    	}
		}
	}
	/*This is a function problem.You only need to complete the function given below*/
	/*  Function to count the number of substrings 
	*   starting and ending with 1
	*   n: size of string
	*   a: input string
	*/
	class StringBinary{
	     public static int binarySubstring(int a, String str)
	    {
	         int c=0;
	         
	         // loop to count number of 1s in the string
	         for(int i=0;i<str.length();++i)
	         {
	             if(str.charAt(i)=='1')
	             ++c;
	         }
	         return (c*(c-1))/2;
	    }
	}