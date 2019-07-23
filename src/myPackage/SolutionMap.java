package myPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionMap {

	public static void main(String[] args) {
		
		Map<String,Integer> myMap=new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           
            myMap.put(name, phone);
        
        }
            while(in.hasNext()){
            String s = in.next();
            // Write code here
               	if (myMap.containsKey(s))System.out.println(s+" = "+myMap.get(s));
               	else System.out.println("Not Found");
            	
            }
           
           
           
             in.close();
	       
	       
	}
}
