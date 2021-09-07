import java.util.Arrays;
public class TestClass {

	public static void main(String[] args) {
		
		int[] A = {6, 1, 4, 6, 3, 2, 7};
		solution(A, 3, 2);
		//indexK = 1
		//indexL = 5
	}
	
	public static int solution(int[] A, int K, int L) {
        // write your code in Java SE 8
		int aliceCount = 0;
        int bobCount = 0;
        
        int newL = K + K + L - 1;
        
        if(A.length >= newL - 1 + L)
        {
            
            for(int i=K - 1; i<(K-1) + K; i++)
            {
                aliceCount+= A[i];
            }
       
            for(int i=newL -1 ; i<newL -1 + L; i++)
            {
                bobCount+= A[i];
            }
        }
        else{
            return -1;
        }
        
        return aliceCount + bobCount;
    }
}
