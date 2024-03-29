package com.bridgelabz.basicprogramming;

import utility.Utility;

public class PowerofTwo {

	public static void main(String[] args) {
		System.out.println("Power of Two");
		System.out.print("Enter a Number:"); // Taking input from user
		int n = Utility.returnInt();
		for (int i = 0; i <= n; i++) {
			System.out.print("\n");
			int table = (int) Math.pow(2, i); // Calculating the power of two up-to the given range
			System.out.print("2^" + i + " = " + table + " "); // Output Statement
		}
	}
}
