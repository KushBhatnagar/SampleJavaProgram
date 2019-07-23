package myPackage;

public class MaxMinInArray {
	public static void main(String[] args) {
		int[] myArray={1000,25,1,29};
		int max=myArray[0];
		int min=myArray[0];
		for(int i=0;i<myArray.length;i++)
		{
			
			if(myArray[i]>max){
				max=myArray[i];
			}
			if(myArray[i]<min){
				min=myArray[i];
			}
		}
		System.out.println("Maximum in Array is " + max);
		System.out.println("Minimum in Array is " + min);
	}
	

}
