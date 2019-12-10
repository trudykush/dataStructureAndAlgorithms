package String_data_Structure;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfTestCases = sc.nextInt();
		int numberOfInput = sc.nextInt();
		
		sc.nextLine();
		sc.useDelimiter("\\s");
		
		String[] splittingInput = new String[numberOfInput];
		splittingInput = sc.nextLine().split(" ");
		
		int smallestWordLen = Integer.MAX_VALUE;
		for (int i=0; i<numberOfInput; i++) {
			if (splittingInput[i].length() < smallestWordLen) {
				smallestWordLen = splittingInput[i].length();
			}
			System.out.println(splittingInput[i]);
		}
		System.out.println(smallestWordLen);
	}
}


//Take the smallest length word and keep that as a reference case.
// now compare it's first character with everyone using a for-loop and maintain
// a counter with every matching character.
// ON MISMATCH break and return.

