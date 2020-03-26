import java.util.Arrays;

public class guidewire {

	public static void main(String[] args) {
		
		String x = solve(1,8,3,2,6,4);
		System.out.println(x);
	}
	//1,2,3,4,6,8
	
	public static String solve(int A, int B, int C, int D, int E, int F) {
		  int[] inputArray = {A, B, C, D, E, F};
		  Arrays.sort(inputArray);
		  if (inputArray[4] < 6) { // 2nd largest digit is smaller 6, we can just fill up
		    if (10 * inputArray[0] + inputArray[1] < 24)
		      return "" + inputArray[0] + inputArray[1] + ":" + inputArray[2] + inputArray[3] + ":" + inputArray[4] + inputArray[5];
		    else
		      return "NOT POSSIBLE";
		  } else if (inputArray[3] < 6) { // 3rd largest digit is smaller 6, put 2nd largest in 4th position
		    if (10 * inputArray[0] + inputArray[1] < 24)
		      return "" + inputArray[0] + inputArray[1] + ":" + inputArray[2] + inputArray[4] + ":" + inputArray[3] + inputArray[5];
		    else
		      return "NOT POSSIBLE";
		  } else if (inputArray[2] < 6) { // 4th largest digit is smaller 6, put 3rd largest in 2nd position
		    if (10 * inputArray[0] + inputArray[3] < 24)
		      return "" + inputArray[0] + inputArray[3] + ":" + inputArray[1] + inputArray[4] + ":" + inputArray[2] + inputArray[5];
		    else
		      return "NOT POSSIBLE";
		  } else {
		      return "NOT POSSIBLE";
		  }
		}

}

