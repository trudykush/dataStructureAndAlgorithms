package String_data_Structure;

import java.util.HashSet;
import java.util.Set;

public class MissingLowestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] A = new int[] {1,3,6,4,1,2};
		 // {-1, -3}
		 
		 int result = MissingLowestNumber.solution(A);
		 System.out.println(result);	 
	}
	
	 public static int solution(int[] A) {
        // write your code in Java SE 8
         int result = 1;
	        
	        int N = A.length;
	        Set<Integer> set = new HashSet<>();
	        for (int a : A) {
	            if (a > 0) {
	                set.add(a);
	            }
	        }
	        for (int i = 1; i <= N + 1; i++) {
	            if (!set.contains(i)) {
	                return i;
	            }
	        }
	        
	        return result;
    }
}
