package String_data_Structure;

import java.util.Scanner;

public class NaivePatternSearch {

	 public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
           
            if(Search.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/
class Search{
    
    /*  Function to search pattern in the given string
    *   pat: pattern given in input
    *   txt: string given in the input
    */
    static boolean search(String txt, String pat)
    {
		/*
		 * boolean value = false;
		 * 
		 * int subLength = pat.length() - txt.length(); for (int i=0; i<= subLength;
		 * i++) { String subString = pat.substring(i, i + txt.length());
		 * 
		 * if (subString.equals(txt)) { value = true; return value; } else { value =
		 * false; } } return value;
		 */
    	
    	int M = pat.length(); 
        int N = txt.length(); 

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
	                int j; 

	        /* For current index i, check for pattern match */
	        for (j = 0; j < M; j++) 
		        if (txt.charAt(i + j) != pat.charAt(j)) 
			        break; 

	        if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1] 
		        return true; 
            }

    return false;
    }
    
}