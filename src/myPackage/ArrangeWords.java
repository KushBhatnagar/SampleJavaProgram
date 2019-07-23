package myPackage;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/*
 * This program will arrange words in a sentence alphabetically(lexicographic order
 */
public class ArrangeWords {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new BufferedInputStream(System.in));

			/*
			 * scan.useDelimiter(Pattern.compile("[\\s;:,.'\n]+",
			 * Pattern.MULTILINE)); scan.nextLine();
			 */

			Set<String> words = new TreeSet<String>();

			while (scan.hasNext()) {
				String word = scan.next().toLowerCase();
				words.add(word);
			}

			for (String word : words) {
				System.out.println(word);
			}

			scan.close();

		} catch (Exception e) {
			System.out.println("SomethingWrong");
		}

	}
}