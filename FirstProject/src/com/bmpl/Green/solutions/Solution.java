package com.bmpl.Green.solutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
//		Input 
//		
//		5
//		1234
//		1234 can be fitted in:
//		*short
//		*int
//		*long
//		12
//		12 can be fitted in:
//		*byte
//		*short
//		*int
//		*long
//		1217813919313913993
//		can be fitted in:
//			*long
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no. of iterations : ");
		byte n = scanner.nextByte();
		
		for (int i = 0; i < n; i++) {
			long l = 0;
//			int j = 0;
			try {
				l = scanner.nextLong();
//				j = 0;
//				throw InputMismatchException;
			}
			catch(Exception e) {
				System.out.println(e);
				System.out.println(scanner.next() + "Cannot be fitted anywhere");
				continue;
			}
			System.out.println(l + " can be fitted in :");
//			System.out.println("j is " + j);
			if(l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE ) {
				System.out.println("*byte");
			}
			if(l >= Short.MIN_VALUE && l <= Short.MAX_VALUE ) {
				System.out.println("*short");
			}
			if(l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE ) {
				System.out.println("*int");
			}
			if(l >= Long.MIN_VALUE && l <= Long.MAX_VALUE){
				System.out.println("*long");
			}
		}
		
		scanner.close();
		
	}

}
