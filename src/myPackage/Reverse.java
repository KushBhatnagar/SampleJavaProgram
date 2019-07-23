package myPackage;
import java.util.Scanner;

/* This class is having 2 functions which will print Reverse of provided String,Integer */

public class Reverse {
	
	public static void main(String[] args) {
		
		String myString;
		int myInt;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		myString = in.nextLine();
		System.out.println("Enter the integer to reverse");
		myInt=in.nextInt();
				
		String reverseStr=strReverse(myString);
		System.out.println("Reverse String for "+ myString +" is "+reverseStr);
		
		int reverseInt=intReverse(myInt);
		System.out.println("Reverse Integer for "+ myInt +" is "+reverseInt);	
	}
	
	
	private static int intReverse(int myInt) {
		int myReverse=0;
		while(myInt!=0){
			myReverse=myReverse*10;
			myReverse=myReverse+myInt%10;
			myInt=myInt/10;
			}
		return myReverse;
	}


	public static String strReverse(String myString) {
		String myReverse="";
		for(int i=myString.length()-1;i>=0;i--)
		{
		myReverse=myReverse+myString.charAt(i);
		}
		return myReverse;
	}


	
}

	
		
		

	

