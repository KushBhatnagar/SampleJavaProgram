/**
 * 
 */
package myPackage;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kush This Program will copy unique values form 
 * 			one file to another file
 *         
 * 
 *
 */
public class UniqueValues {

	public static void main(String[] args) throws IOException {
		Scanner in = null;
		BufferedWriter out = null;
		try {
			in = new Scanner(new FileReader("Input.txt"));
			out = new BufferedWriter(new FileWriter("Output.txt"));
			Set<String> mySet = new HashSet<String>();
			while (in.hasNext()) {
				String tempVar = in.next();
				mySet.add(tempVar);
			}
			for (String myString : mySet) {
				out.append(myString);
				out.append("\n");
			}
		} catch (Exception e) {
			System.out.println("Something Wrong with Files");
		} finally {
			in.close();
			out.close();
		}
	}

}
