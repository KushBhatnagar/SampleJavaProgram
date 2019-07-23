package myPackage;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HourGlass {
	
	 public static void main(String[] args) {
	        
		 Scanner in = new Scanner(System.in);
	        int arr[][] = new int[10][10];
	         int[] sum= new int[36];
		     int h=0;
	     
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        for(int i=0; i < 6; i++){
		            for(int j=0; j < 6; j++){
		              sum[h]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
		                		arr[i+1][j+1]+
		                		arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		                h++;
		            
		            }
		        }
		      Arrays.sort(sum);
		      System.out.println(sum[35]);
	       
	 }
		}

/*-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5*/
/*Output:-6*/