package com.bmpl.Green.solutions;

public class Recursion {
	
	static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial (num - 1);
	}

	public static void main(String[] args) {
		
		int i = 5;
		
		System.out.println(factorial(i));

	}

}
