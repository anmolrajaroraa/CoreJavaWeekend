package com.bmpl.Green.loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
		}
//		System.out.println("i is " + i);
		
		/*
		 * Differences 
		 * 
		 * 1. Local & global variable
		 * 2. Control over the iteration
		 * 3. While loop is used for menu-driven programs
		 */
		
		int j = 0;
		while(j < 10) {  //Entry controlled loop
			System.out.println("j is " + j);
			if(j < 5) {
				j++;
			}
			else {
				j = j + 2;
			}
		}
		
//		while(true) {
//			System.out.println("next iteration...");
//		}
//		
		Scanner scanner = new Scanner(System.in);
		
//		int userInput = 0;
//		while(userInput < 10) {
//			userInput = scanner.nextInt();
//			System.out.println(userInput);
//		}
		
		int userInput;
		do {
			userInput = scanner.nextInt();
			System.out.println(userInput);
		}while(userInput < 10);  //Exit controlled loop
		
		System.out.println("Program terminated...");
		
		while(true){
			System.out.print("Enter a number : ");
			userInput = scanner.nextInt();
			if(userInput % 2 == 0) {
				System.out.println(false);
			}
			else {
				System.out.println(true);
			}
			System.out.println("Do you want to continue?");
			String userChoice = scanner.next();
			if(userChoice == "no") {
				break;
			}
		}
		
		scanner.close();
		
	}

}
