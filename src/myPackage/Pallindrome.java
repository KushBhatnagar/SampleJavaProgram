package myPackage;
import java.util.Scanner;

public class Pallindrome {

	  public static void main (String args[])
		 {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the string to reverse ");
		 String s = in.next();
		 int i,n;
		 String r="";
		 n=s.length()-1;
		 for (i=n;i>=0;i--)
		 {
		 r= r+s.charAt(i);
		 }
		 System.out.println("Reverse String is " + r);
		 if (r.equals(s))
		 {
		 System.out.println("***String is PALLINDROME***");
		 }
		 else
		 {
		 System.out.println("***String is NOT PALLINDROME***");
		 }
		 
		 }
}
