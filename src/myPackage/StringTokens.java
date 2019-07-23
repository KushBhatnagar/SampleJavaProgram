package myPackage;

import java.util.*;

/**
 * @author Kush 
 * 		Given a string,s, matching the regular expression [A-Za-z
 *         !,?._'@]+, split the string into tokens. We define a token to be one
 *         or more consecutive English alphabetic letters. Then, print the
 *         number of tokens, followed by each token on a new line.
 *         
 *         Input: He is a very very good boy, isn't he? 
 *         Output: 10 He is a very very good boy isn t he
 *         
 *         Explanation: We consider a token to be a contiguous segment of alphabetic characters.
 *         There are a total of 10 such tokens in string s,and each token is printed in the same order 
 *         in which it appears in string
 */
public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		 if (s.trim().length()== 0 || s.trim().length() > 400000 )
		    {
		        System.out.println(0);
		        return;
		    }
		String delims="[,?._\\'@\\s!]+";
		String[] result = s.trim().split(delims);
		System.out.println(result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}
		scan.close();

	}

}
