package myPackage;

import java.util.*;

public class Solution
{
   
   public static void main(String []args)
   {
	   int count=0;
	
	Scanner scan = new Scanner(System.in);
	   int N=scan.nextInt();
       String[] str= new String[N];
       for(int i =0 ; i<N;i++){
    	   str[i]=scan.next();
    	  
       }
       
       int Q= scan.nextInt();
       String[] query= new String[Q];
      for(int j =0 ; j<Q;j++){
    	  query[j]=scan.next();
    	 
      }
             
        for(int j=0;j<Q;j++){
        	
    	 for(int i=0 ;i<N;i++)
    	 {
          		 if(query[j].equals(str[i]))
    			 count++;
         }
    	 System.out.println(count);
   		 count=0;

    	 
     } 
  /*   for(int i =0 ; i<N;i++){
   	  System.out.println("STR["+i+"] "+str[i]);
      }
         
     for(int j =0 ; j<Q;j++){
    System.out.println("Q["+j+"] "+query[j]);
   	   }*/
	    
	 /* String[] query= new String[]{"aba","xzxb","ab"};
	   String[] str= new String[]{"aba","baba","aba","xzxb"};
	   for(int j=0;j<3;j++){
	    	 for(int i=0 ;i<4;i++){
	    		 if(query[j].equals(str[i]))count++;
	    	 }
	    	 System.out.println(count);
	    	 count=0;
	     } */
    
   }
}
