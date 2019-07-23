package myPackage;
import java.io.*;
import java.util.*;
public class SearchSubString {
	
	 public static void main(String[] args) {
	        /* Code to find string from substring*/
		/* Scanner scan= new Scanner(System.in);
		 String myString=scan.next();
		 String mysubString=scan.next();*/
		 String myString="foxfoldbhaagjohny";
		 String mysubString="johny";
		 int i=0;
		 int j=0;
		 
		 char[] myStringArray=myString.toCharArray();
		 char[] mysubStringArray=mysubString.toCharArray();
		 
		 while(i<myStringArray.length && j<mysubStringArray.length)
		    {
		        if(myStringArray[i]==mysubStringArray[j])
		        {
		            i++;
		            j++;
		        }
		        else
		        {
		            i++;
		            j=0;
		        }
		        if(j == mysubStringArray.length)
		        {
		            System.out.println("String " + mysubString + " is part of string " + myString);
		        }
		      		        
		    }
		 if(j==0){
			 System.out.println("String " + mysubString + " is NOT part of string " + myString); 
		 }
		
	
	 }
}
