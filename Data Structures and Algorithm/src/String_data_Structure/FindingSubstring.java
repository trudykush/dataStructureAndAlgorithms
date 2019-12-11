package String_data_Structure;

import java.util.Scanner;

public class FindingSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfTest = sc.nextInt();
		sc.nextLine();
		while(numberOfTest > 0) {
			
			String line = sc.nextLine();
			String mainWord = line.split(" ")[0];
			String pattern = line.split(" ")[1];
			
			MethodClass mClass = new MethodClass();
			System.out.println(mClass.findPatternMethod(mainWord, pattern));
			
			numberOfTest--;
		}
		
	// End of Main Method	
	}
	
// End of Class
}

// GeeksForGeeks For
// GeeksForGeeks Fr

class MethodClass {

	int findPatternMethod(String mainWord, String pattern) {
		int index = -1;
		
		int mainWordLen = mainWord.length();
		int patternLen = pattern.length();
		
		for (int i=0; i<=mainWordLen - patternLen; i++) {
			
			if (mainWord.charAt(i) == pattern.charAt(0)) {
				if(mainWord.substring(i, i+patternLen).equals(pattern)) {
					return i;
				}
			}
		}
	return index;	
	}
	
}