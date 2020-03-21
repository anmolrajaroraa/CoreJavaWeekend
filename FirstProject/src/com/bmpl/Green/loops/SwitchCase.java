package com.bmpl.Green.loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int dayOfWeek = scanner.nextInt();
//		
//		switch(dayOfWeek) {
//		
//		case 1 : 
//			System.out.println("Monday");
//			System.out.println("Another line");
//			break;
//		case 2 : 
//			System.out.println("Tuesday");
//			break;
//		case 3 : 
//			System.out.println("Wednesday");
//			break;
//		case 4 : 
//			System.out.println("Thursday");
//			break;
//		case 5 : 
//			System.out.println("Friday");
//			break;
//		case 6 : 
//			System.out.println("Saturday");
//			break;
//		case 7 : 
//			System.out.println("Sunday");
//			break;
//		default : System.out.println("Not a valid number!");
//		
//		}
		
		System.out.println("What do you want to order : ");
		String order = scanner.nextLine();
		
		switch(order) {
		case "burger":
			System.out.println("Here's your burger");
		case "fries":
			System.out.println("Do you want fries ? ");
			String choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here are your fries!");
			}
			break;
		case "pizza":
			System.out.println("Here's your pizza");
		case "soft drink":
			System.out.println("Do you want soft drink ? ");
			choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here is your soft drink!");
			}
			break;
		default:
			System.out.println("Sorry, we don't serve that!!");
		} //switch ends here
		System.out.println("Thank you for visiting us!!");
		scanner.close();
	}

}
