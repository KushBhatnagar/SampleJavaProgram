/**
 * @author Kush
 * Two strings  and  are called anagrams if they consist same characters,
 * but may be in different orders.
 * So the list of anagrams of  is CAT is ACT,TCA,TAC,ATC,CTA
 *
 */
package myPackage;

import java.util.*;

public class Anagrams {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String myString1 = scan.next();
		String myString2 = scan.next();
		char[] myString1Array = myString1.toLowerCase().toCharArray();
		char[] myString2Array = myString2.toLowerCase().toCharArray();

		Arrays.sort(myString1Array);
		Arrays.sort(myString2Array);

		System.out.println(Arrays.equals(myString1Array, myString2Array) ? "Anagrams" : "Not Anagrams");

	}

}
