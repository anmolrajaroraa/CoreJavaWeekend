package com.bmpl.Green.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter some data...");
		
		String a = scannerObject.next(); //-> a word until a space or \n (line-break) is found
		scannerObject.nextLine();
		String b = scannerObject.nextLine(); // -> complete line until line-break
		int c = scannerObject.nextInt(); // fetch next integer from buffer
		long d = scannerObject.nextLong(); // fetch next long
		
		System.out.println("A is " + a);
		System.out.println("B is " + b);
		System.out.println("C is " + c);
		System.out.println("D is " + d);
		
		scannerObject.close();
		
	}

}




//next() -> java
//nextLine() -> \n 
//nextLine() -> programming is tough\n
//nextInt() -> 10
//nextLong() -> \n - error -> (long)392093202302300232l
//nextLine() -> \n
//nextLine() -> another line\n

