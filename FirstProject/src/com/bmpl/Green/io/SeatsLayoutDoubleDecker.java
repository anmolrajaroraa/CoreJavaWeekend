package com.bmpl.Green.io;

public class SeatsLayoutDoubleDecker {

	public static void main(String[] args) {
		
		int seats[][][] = { new int[10][4], new int[10][4] };
		seats[0][9] = new int[5];
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				for(int k = 0; k < seats[i][j].length; k++) {
					System.out.print(seats[i][j][k]);
					if(j == seats[i].length - 1 && i == 0) {
						continue;
					}
					if(k == 1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
//		char array[] = {'o', 'l', 'l', 'e', 'h'};
//		String s = new String(array);
//		System.out.println(s);
		

	}

}
