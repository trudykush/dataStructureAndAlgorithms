package String_data_Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeypadTyping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTest = sc.nextInt();
		List<String> inputList = new ArrayList<>();
		while (numberOfTest > 0) {
			inputList.add(sc.next());
			numberOfTest--;
		}
		
		keyboardStyleMessage(inputList);

	}

	private static void keyboardStyleMessage(List<String> inputList) {
		List<Integer> keypadNumberList = new ArrayList<Integer>();
		for(int i=0; i<inputList.size(); i++) {
			for (int j=0; j<inputList.get(i).length(); j++) {
				char x = inputList.get(i).charAt(j);;
				int equivalentNumber = fromSwitch(Character.toLowerCase(x));
				System.out.print(equivalentNumber);
				keypadNumberList.add(equivalentNumber);
			}
			System.out.println();
		}
		//System.out.println(keypadNumberList);
	}

	private static int fromSwitch(char x) {
		switch(x) {
		case 'a':
		case 'b':
		case 'c':
			return 2;
		case 'd':
		case 'e':
		case 'f':
			return 3;
		case 'g':
		case 'h':
		case 'i':
			return 3;
		case 'j':
		case 'k':
		case 'l':
			return 4;
		case 'm':
		case 'n':
		case 'o':
			return 5;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			return 6;
		case 't':
		case 'u':
		case 'v':
			return 7;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			return 8;
		}
		return 0;
	}

}
