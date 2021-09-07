package october.random;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.next();
        String secondString = sc.next();

        boolean isAnagram = findingAnagram(firstString, secondString);
        System.out.println(isAnagram);
    }

    private static boolean findingAnagram(String firstString, String secondString) {

        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        if (firstCharArray.length != secondCharArray.length) {
            return false;
        }

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);


        for (int i = 0; i < firstCharArray.length; i++) {
            if (firstCharArray[i] != secondCharArray[i]) {
                return false;
            }
        }
        return true;
    }
}
