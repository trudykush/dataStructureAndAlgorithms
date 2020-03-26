package String_data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
	
	public static void main (String[] args)throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0)
			{
			    String str = br.readLine();
			    String s1 = str.split(" ")[0];
			    String s2 = str.split(" ")[1];
			    
			    if(AnagramInnerClass.isAnagram(s1,s2))
			    {
			        System.out.println("YES");
			    }
			    else
			    {
			         System.out.println("NO");
			    }
			}
		}
	}

	class AnagramInnerClass{    
	    /*  Function to check if two strings are anagram
	    *   c, d: input string
	    */
	    public static boolean isAnagram(String str1,String str2)
	    {
	    	  if (str1.length() != str2.length())  
	    	    {  
	    	        return false;  
	    	    }  
	    	  
	    	    // To store the xor value  
	    	    int value = 0;  
	    	  
	    	    for (int i = 0; i < str1.length(); i++)  
	    	    {  
	    	    	int x = (int) str1.charAt(i);
	    	    	int y = (int) str2.charAt(i);
	    	        value = value ^ x;  
	    	        value = value ^ y;  
	    	    }  
	    	  
	    	    return value == 0;  
	    }
	}