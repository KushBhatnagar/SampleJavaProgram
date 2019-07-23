package myPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kush Verify that given String can be rearrange so that it can be
 *         palindrome Ex: String 'abcbcda' can be rearrange to 'abcdcba' which
 *         is palindrome
 */
public class CheckPallindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myString = scan.next();
		System.out.println(
				canMakePalindrom(myString) ? "True:String can be Palindrome" : "False:String can Not be Palindrome");
		scan.close();

	}

	private static boolean canMakePalindrom(String s) {
		Map<Character, Integer> countChars = new HashMap<>();

		// Count the occurrences of each character
		for (char c : s.toCharArray()) {

			Integer count = countChars.get(c);
			if (count == null) {
				// count = Integer.valueOf(1);
				count = 1;
			} else {
				count = count + 1;
			}
			countChars.put(c, count);
		}

		boolean hasOdd = false;
		for (int count : countChars.values()) {
			if (count % 2 == 1) {
				if (hasOdd) {
					// Found two chars with odd counts - return false;
					return false;
				} else {
					// Found the first char with odd count
					hasOdd = true;
				}
			}
		}

		// Haven't found more than one char with an odd count
		return true;
	}

}
