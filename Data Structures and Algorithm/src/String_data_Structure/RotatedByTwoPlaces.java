package String_data_Structure;

import java.util.Scanner;

public class RotatedByTwoPlaces {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    boolean flag = Rotation.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}

class Rotation{
    
    /*  Function to check if two strings are rotated
    *   s1, s2: input strings
    */
	//amazon	azonam
	public static boolean isRotated(String s1, String s2) {
        
	       boolean result = false;
	    	
	    	if (s1.length() <= 2 || s2.length() <= 2) {
	    	  if (s1.equals(s2)) {
	    	        return true;
	    	    } else {
	    	        return false;
	    	    }
	    	}
	    	
	    	if(s1.length() != s2.length()) {
	    		return false;
	    	}
	    	
	    	String subStringStartS1 = s1.substring(0, 2);
	    	String subStringEndS1 = s1.substring(2, s2.length());
	    	
	    	String rotatedString = subStringEndS1 + subStringStartS1;
	    	
	    	if (rotatedString.equals(s2)) {
	    		result = true;
	    	} else {
	        	String subStringStartS2 = s2.substring(0, 2);
	        	String subStringEndS2 = s2.substring(2, s2.length());
	        	
	        	String rotatedString2 = subStringEndS2 + subStringStartS2;
	        	
	        	if (rotatedString2.equals(s1)) {
	        		return true;
	        	} else {
	        	    return false;
	        	}
	    	}
	    	
	    	return result;
	}
}
