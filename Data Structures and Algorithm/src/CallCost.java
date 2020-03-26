import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import String_data_Structure.FindingSubstring;

public class CallCost {

	public static void main(String[] args) {
		
		solution("00:01:07,400-234-090\r\n" + 
					"00:05:01,701-080-080\r\n" + 
					"00:05:00,400-234-090");
	}
	
	 public static int solution(String S) {
		
		 String lines[] = S.split("\\r?\\n");
		 List<String> inputNumberList =  new ArrayList<String>(); 
		 List<String> inputDurationList = new ArrayList<String>(); 
		 String[] input = null;
		 
		 for (int i=0; i<lines.length; i++) {
			 input = lines[i].split(",");
			 inputNumberList.add(input[1]);
			 
		 }
		 
		 final Set<String> setToReturn = new HashSet<>(); 
		  final Set<String> set1 = new HashSet<>();

		   for (String yourNumber : inputNumberList)
		   {
		    if (!set1.add(yourNumber))
		    {
		    	inputDurationList.add(input[0]);
		    }
		   }
		   
		   System.out.println(inputDurationList.get(0));
		
		 return 0; 
	    }
	 

}
