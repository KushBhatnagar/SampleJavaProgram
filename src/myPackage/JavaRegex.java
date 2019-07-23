package myPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/* @author Kush:
 * Write a class called myRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern 
 * such that it can be used to validate an IP address. Use the following
 * definition of an IP address:
 * IP address is a string in the form "A.B.C.D",
 * where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3

**Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

**Sample Output:
true
true
true
false
false
false
 * 
 */

class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}
}

class MyRegex {
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

}