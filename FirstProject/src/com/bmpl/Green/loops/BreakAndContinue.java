package com.bmpl.Green.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
	
		while(true) {
			for (int i = 0; i < 100; i++) {
//				
				if(i == 5) {
					System.out.println("Going to skip the printing");
					continue;
				}
				if(i == 9) {
					System.out.println("Going to break the loop");
					break;
				}
				System.out.println("I is " + i);
			}
			break;

		}
	}

}
