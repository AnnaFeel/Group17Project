package com.syntax.group17project;

import java.util.Scanner;

public class TASK6 {

	public static void main(String[] args) {
		/*
		  	Write a java program to check whether a given number is prime or not?	
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer to check if it's Prime or not?");
		int num = input.nextInt();

		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		

	


}
