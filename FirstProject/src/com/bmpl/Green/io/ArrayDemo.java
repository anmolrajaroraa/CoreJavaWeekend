package com.bmpl.Green.io;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int l = a.length;
		int b[] = new int[5];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		System.out.println(a);
//		String s = "hello".intern();
//		System.out.println(s);
//		System.out.println(s.toString());
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			a[i]++;
		}
		System.out.println("************");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("#############");
		
		for(int element : b) {
			System.out.println(element);
			element++;
		}
		System.out.println("***********");
		for(int element : b) {
			System.out.println(element);
			element++;
		}
		System.out.println(b[5]);
		
	}

}
