package com.bmpl.Green.io;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
//		{{1,2,3},{4,5,6}}
		String s_arr[] = new String[10];
		char c[] = new char[10];
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
		for(int i = 0; i < l; i++) {
//			System.out.println(a[i]);
			a[i]++;
		}
		System.out.println("************");
		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
		}
		System.out.println("#############");
		//Enhanced for loop
		for(int element : b) {
//			System.out.println(element);
			element++;
		}
		System.out.println("***********");
		for(int ele : b) {
//			System.out.println(ele);
			ele++;
		}
//		System.out.println(b[5]);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
//		al.add("twenty");
//		al.add(30.3);
//		al.add(true);
//		al.add('a');
//		Character obj = Character.valueOf('a');
//		al.add(obj);
//		char ch = 'a';
//		al.add(ch);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int aa[] = {1,2,3,4,5};
		aa[2]= 100;
//		System.out.println(aa);
		for(int element: aa) {
			System.out.print(element + " ");
		}
		al.add(2, 100);
		System.out.println(al);
		al.set(2, 200);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//lambda expression
		al.forEach(element -> System.out.println(element));
		System.out.println("Index of 10 is " + al.indexOf(10));
		System.out.println("100 found : " + al.contains(100));
		al.remove(2);
		System.out.println(al);
		aa[2] = 0;
		for(int element: aa) {
			System.out.print(element + " ");
		}
		System.out.println("Size is " + al.size());
		System.out.println(al.subList(0, 2));
		
		String s = "hello,this is java-programming";
		char x = s.charAt(0);
		char y = s.charAt(s.length() - 1);
		System.out.println(x);
		System.out.println(y);
		System.out.println(s.substring(10));
		System.out.println(s.substring(10,20));
		String letter = s.substring(0,1);
		System.out.println("letter is " + letter);
		
		String words[] = s.split("[ ,!/?@-]");
		for(String word : words) {
			System.out.println(word);
		}
	}

}
