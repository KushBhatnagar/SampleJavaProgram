package myPackage;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author bhatnaga:
 * 			Given a string, find out the lexicographically smallest and
 *         largest substring of length .
 * 
 *         [Note: Lexicographic order is also known as alphabetic order
 *         dictionary order. So "ball" is smaller than "cat", "dog" is smaller
 *         than "dorm". Capital letter always comes before smaller letter, so
 *         "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]
 * 
 *         Input Format
 * 
 *         First line will consist a string containing english alphabets which
 *         has at most characters. 2nd line will consist an integer .
 * 
 *         Output Format
 * 
 *         In the first line print the lexicographically minimum substring. In
 *         the second line print the lexicographically maximum substring.
 * 
 *         Sample Input:
 * 
 *         welcometojava 3
 *         
 *         Sample Output:
 * 
 *         ava wel Explanation
 * 
 *         Here is the list of all substrings of length :
 * 
 *         wel elc lco com ome met eto toj oja jav ava
 *
 */
public class StringCompare {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String myString = scan.next();
		int myInt = scan.nextInt();
		int loopLength = myString.length() - myInt;
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 0; i <= loopLength; i++) {

			String mySubstring = myString.substring(i, i + myInt);
			ts.add(mySubstring);

		}
		System.out.println(ts.first());
		System.out.println(ts.last());
		scan.close();
	}

}
