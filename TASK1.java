package com.syntax.group17project;

import java.util.Scanner;

public class TASK1 {

	public static void main(String[] args) {
	/*
	 * Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
	 */
		
		      System.out.println("Enter the required size of the array : ");
		      Scanner input = new Scanner(System.in);
		      int size = input.nextInt();
		      int myArray[] = new int [size];
		      int sum = 0;
		    	 System.out.println("Enter the elements of the array one by one ");

		      for(int i=0; i<size; i++){
		         myArray[i] = input.nextInt();
		         sum = sum + myArray[i];
		      }
		      System.out.print("Elements of the array are: [ ");
		      for (int elements : myArray){
			      System.out.print(elements + " ");
		    	}
		      System.out.print("]");

		      System.out.println("");
		      System.out.println("Sum of the elements of the array: "+sum);
		      
		     
	}
}
