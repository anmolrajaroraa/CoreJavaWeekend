package com.bmpl.Green.loops;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter a number : ");
			int num = scanner.nextInt();
			
//			System.out.println("Going to check if number is greater than i");
//			if(num > i) {
//				System.out.println("Number is greater than i");
//			}
//			
//			System.out.println("Going to check if number is less than i");
//			if(num < i) {
//				System.out.println("Number is less than i");
//			}
//			
//			System.out.println("Going to check if number is equal to i");
//			if(num == i) {
//				System.out.println("Number is equal to i");
//			}
			
//			if(num > i) {
//				System.out.println("Number is greater than i");
//			}
//			else if(num < i) {
//				System.out.println("Number is less than i");
//			}
//			else {
//				System.out.println("Number is equal to i");
//			}
			
//			if(num > i) {
//				System.out.println("Number is greater than i");
//				continue;
//			}
//			else if(num < i) {
//				System.out.println("Number is less than i");
//				continue;
//			}
//			System.out.println("Number is equal to i");
			
			if(num > i || num < i) 
				System.out.println("Number is not equal to i");
//			else if(num > i && num == i) {
//				System.out.println("Number is greater than equal to i");
//			}
			else {
				System.out.println("Number is equal to i");
			}
			
		}
		
		scanner.close();
	}
}
