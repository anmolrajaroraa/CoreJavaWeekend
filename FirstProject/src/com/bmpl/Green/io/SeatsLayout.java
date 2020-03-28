package com.bmpl.Green.io;

public class SeatsLayout {

	public static void main(String[] args) {
		
		//Way 1 - pure initializer method (provide values also) for outer and inner 1D arrays
		int seats[][] = { {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,1,1}, 
				{0,0,1,1}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, 
				{0,0,0,0,0} };
		
		seats[4][2] = 2;
		seats[4][3] = 2;
		seats[seats.length - 1][0] = 2;
		seats[seats.length - 1][1] = 2;
		seats[seats.length - 1][2] = 2;
		seats[seats.length - 1][3] = 2;
		seats[seats.length - 1][4] = 2;
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j]);
				if(i == seats.length - 1) {
					continue;
				}
				if(j == 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
