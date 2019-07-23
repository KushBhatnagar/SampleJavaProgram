package myPackage;

import java.util.*;

public class ReverseAndRotateArray {
	public static void main(String[] args) 
	{    int[] myArray={67,15,89,78,2};
	     int d=2;
		//revereArray();
		//System.out.println();
		myArray=leftRotateArray(myArray,d);
		for(int i=0;i<myArray.length;i++)
		{
			System.out.print(myArray[i]+" ");	
		}
		
		
	}

		private static int[] leftRotateArray(int[] myArray, int d) {
		int n= myArray.length;
		  // Create a temporary d-element array to store elements shifted to the left of index 0:
		int[] tempArray = Arrays.copyOfRange(myArray, 0, d);
		
		 // Shift elements from indices d through n to indices 0 through d - 1:
		for(int i=d;i<n;i++){
			myArray[i-d]=myArray[i];
		}
		   // Copy the d shifted elements from the temporary array back to the original array:
		for(int i=n-d;i<n;i++)
		{
			myArray[i]=tempArray[i-n+d];
		}
				
		return myArray;
	}



	private static void revereArray() {
		int[] myArray={5,67,89,78,2};
		for(int i=myArray.length-1;i>=0;i--)
		{
			System.out.print(myArray[i]+" ");
		}
		
	}
	
	
}
