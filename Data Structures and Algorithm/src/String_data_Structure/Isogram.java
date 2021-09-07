package String_data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Isogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0) {
			String data = br.readLine();
			System.out.println(isIsogram(data) ? "1" : "0");
		}
	}
	
	static boolean isIsogram(String data){
	    
	    int lengthOfData = data.length();
	    int[] map = new int[256];
	    Arrays.fill(map, -1);
	    for (int i=0; i<lengthOfData; i++) {
	    	if(map[data.charAt(i)] == -1) {
	    		map[data.charAt(i)] = 1;
	    	} else {
	    		return false;
	    	}
	    }
	    
	    return true;
	}

}
