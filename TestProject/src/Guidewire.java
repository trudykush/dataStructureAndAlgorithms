import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Guidewire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] A = new int[] {-1, -3};
		 
		// int x = Guidewire.solution(A);
		 //System.out.println(x);
		 
		 int dataSet = -999;
		 int x = Guidewire.solution(dataSet);
		 System.out.println(x);
		 
	}
	
	 public static int solution(int N) {
	        // write your code in Java SE 8
		 
		 
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
	
	
	 
	 
	 
	/*
	 * public String solution(String S) { String result = "";
	 * 
	 * 
	 * 
	 * return result; }
	 * 
	 * public static int solution(int[] A) {
	 */
	        // write your code in Java SE 8
	/*
	 * int result = 1;
	 * 
	 * int N = A.length; Set<Integer> set = new HashSet<>(); for (int a : A) { if (a
	 * > 0) { set.add(a); } } for (int i = 1; i <= N + 1; i++) { if
	 * (!set.contains(i)) { return i; } }
	 * 
	 * return result; }
	 */

}
