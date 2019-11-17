package String_data_Structure;

import java.util.ArrayList;

public class LargestNumberWIth5 {

	public static void main(String[] args) {

		 int[] A = new int[] {-1, -3};
		 
			int dataset = 670;	//  -999
			 int x = LargestNumberWIth5.solution(dataset);
			 System.out.println(x);
	}
	
	 public static int solution(int N) {
	       
		 if (N < 0) {
			Integer positiveIntger = Math.abs(N);
			String result = "-" + "5" + positiveIntger;
			return Integer.parseInt(result);
		 } 
			 
		 int temp = N;
		 ArrayList<Integer> array = new ArrayList<Integer>();
		 do{
		     array.add(0, temp % 10);
		     temp /= 10;
		 } while  (temp > 0);
		
		 
		 int minValue = Integer.MAX_VALUE;
		 int minimumIndex = 0;
		 for (int i=0; i<array.size(); i++) {
			 if (array.get(i) < minValue) {
				 minimumIndex = i;
				 minValue = array.get(i);
			 }
		 }
		 		 
		 array.add(minimumIndex, 5);
		 
		 
		 int result = 0;
		 for (Integer i : array) { // assuming list is of type List<Integer>
		     result = 10*result + i;
		 }
		 
		 return result;
	 }
	
	

}
