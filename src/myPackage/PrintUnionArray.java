package myPackage;

import java.util.*;

public class PrintUnionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int arr1[] = new int[5];
		// int arr2[] = new int[3];
		int arr1[] = { 2, 11, 3, 10, 15 };
		int arr2[] = { 56, 2, 11, 15, 34 };
		int counter = 0;

		/*
		 * System.out.println("Enter Numbers for first array");
		 * 
		 * for(int i=0;i<arr1.length;i++) { arr1[i]=scan.nextInt(); }
		 * 
		 * System.out.println("Enter Numbers for second array");
		 * 
		 * for(int i=0;i<arr2.length;i++) { arr2[i]=scan.nextInt(); }
		 */

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		for (int j = 0; j < arr2.length; j++) {

			for (int i = 0; i < arr1.length; i++) {
				if (arr2[j] != arr1[i]) {
					counter = counter + 1;
				}

			}
			if (counter == arr1.length) {
				System.out.println(arr2[j]);
			}
			counter = 0;
		}

	}
}
