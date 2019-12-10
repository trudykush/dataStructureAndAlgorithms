package Searching;

import java.util.Scanner;

public class SearchInSortedArray {

	public static void main(String[] args) {
		
		String inputArray[] = new String[2];
		
		Scanner sc = new Scanner(System.in);
		int totalTest = sc.nextInt();
		sc.nextLine();
		inputArray = sc.nextLine().split(" ");
		int inputLength = Integer.parseInt(inputArray[0]);
		int intToSearch = Integer.parseInt(inputArray[1]);
		
		System.out.println(inputLength + " " + intToSearch);

	}

}
