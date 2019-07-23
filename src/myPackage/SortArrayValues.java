/**
 * 
 */
package myPackage;

/**
 * @author Kush This program will sort values from an array which have only two
 *         kind of values i.e. '0' and '1' Note: We need to sort in most
 *         efficient way as this array might contains millions of elements
 *
 */
public class SortArrayValues {

	public static void main(String[] args) {

		int[] myArray = { 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1,
				0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0,
				1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0, 1,
				0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 0, 1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1,
				0, 1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,
				1, 0, 0, 1, 0, 1, 10, 1, 1, 1, 0, 1, 0, 1 };
		int sum = 0;
		int n = myArray.length;
		for (int i : myArray) {
			sum += myArray[i];
		}
		for (int i = 0; i < n - sum; i++) {
			myArray[i] = 0;
		}
		for (int i = n - sum; i < n; i++) {
			myArray[i] = 1;
		}
		for (int i : myArray) {
			System.out.print(i+",");
			}
	}

}
