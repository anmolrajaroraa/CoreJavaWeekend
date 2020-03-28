package com.bmpl.Green.io;

public class SeatsLayoutStadium {

	public static void main(String[] args) {
		
		// Way 2 -> initializing only outer array (no values are provided) and inner elements are kept null
		int seats[][] = new int[11][];
		
		// Way 4 -> initializing shortcut, when elements (seat numbers) are almost same in each row
//		int seats[][] = new int[11][20];
//		seats[10] = new int[10];
		
		//int seats[][] = {new int[50], null, null, null, null, null, null, null, null, null, null};
		
		// Way 3 -> initialize outer array and provide new 1D arrays at each index using the new keyword (hybrid method)
		int seats_in_theatre[][] = { new int[20], new int[20], new int[20], new int[20], new int[20], new int[20], new int[20], new int[20], new int[20], new int[20], new int[20] };
		
		// Way 2 (continued) -> initialize inner arrays (no values are provided) at each index of outer array
//		seats[0] = new int[50];
//		seats[1] = new int[60];
//		seats[2] = new int[70];
//		seats[3] = new int[80];
//		seats[4] = new int[90];
//		seats[5] = new int[100];
//		seats[6] = new int[110];
//		seats[7] = new int[120];
//		seats[8] = new int[130];
//		seats[9] = new int[140];
//		seats[10] = new int[150];
		
		seats[0][0] = 1;
		seats[0][1] = 1;
		seats[0][2] = 1;
		seats[0][3] = 1;
		seats[0][4] = 1;
		
		
		int arr[] = new int[5];
		System.out.println();
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n");
		
		for(int i = 0; i < seats_in_theatre.length; i++) {
			for(int j = 0; j < seats_in_theatre[i].length; j++) {
				System.out.print(seats_in_theatre[i][j]);
			}
			System.out.println();
		}
		
	}

}
