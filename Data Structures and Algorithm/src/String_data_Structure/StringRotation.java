package String_data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRotation {

	public static void main (String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s = br.readLine();
		    String x = br.readLine();
		    
		    Rotate obj = new Rotate();
		    
		    if(obj.areRotations(s,x))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}

class Rotate {

	/*
	 * Function to check if two strings are rotations of each other s1, s2: are the
	 * input strings
	 */
	public static boolean areRotations(String s, String x) {
		boolean result = false;

		if (s.length() != x.length()) {
			return false;
		}

		String comboString = s + s;

		if (comboString.contains(x)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}