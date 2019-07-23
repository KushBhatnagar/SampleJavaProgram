/**
 * 
 */
package myPackage;

/**
 * @author Kush
 * This Program will covert string into either upper case or lower case based on the minimum number of operations
 * Eg: string 'abcEg' will convert into 'abceg'  as only one upper case i.e 'E' is present and all other are lower cases character
 *
 */
public class CovertCases {
public static void main(String[] args) {
	
	String myString = "kushbhatnagar";//abcEfg ,123A,!@6#2
	String myNewString = null;
	int noOfOperation = 0;
	int countUpper = 0;
	int countLower = 0;
	int countAlpha = 0;

	char[] myStringArray = myString.toCharArray();

	for (int i = 0; i < myStringArray.length; i++) {

		if (Character.isAlphabetic(myStringArray[i])) {
			countAlpha++;
			if (Character.isUpperCase(myStringArray[i])) {
				countUpper++;
			} else {
				countLower++;
			}
		}

	}
	if (countAlpha <= 0) {
		System.out.println("Invalid Input");
	} else {
		if (countLower > 0 || countUpper > 0) {
			if (countUpper > countLower) {
				myNewString = myString.toUpperCase();
				noOfOperation = countLower;
				System.out
						.printf("Input String %s is converted into %s after  performing %d operations",
								myString, myNewString, noOfOperation);
			} else {
				myNewString = myString.toLowerCase();
				noOfOperation = countUpper;
				System.out
						.printf("Input String %s is converted into %s after  performing %d operations",
								myString, myNewString, noOfOperation);
			}
		} else {
			myNewString = myString;
			noOfOperation = 0;
			System.out
					.printf("Input String %s is converted into %s after  performing %d operations",
							myString, myNewString, noOfOperation);
		}
	}

}
}

