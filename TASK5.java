package com.syntax.group17project;

public class TASK5 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		System.out.println("Before swapping");
		int x = 10;
		int y = 20;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
		System.out.println("After swapping");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);

	}

}
