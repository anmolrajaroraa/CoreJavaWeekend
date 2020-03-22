package com.bmpl.Green.io;

import java.util.ArrayList;

public class ArrayDemo {
	
	void doSomething() {
		
	}

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
//		al.add(Integer.valueOf(10));
//		Integer i = Integer.valueOf(10);
//		al.add("twenty");
//		al.add(30.3);
//		al.add(true);
//		al.add('a');
		//autoboxing
//		Integer i = Integer.valueOf(10);
		
		
//		Character obj = Character.valueOf('a');
//		al.add(obj);
//		char ch = 'a';
//		al.add(ch);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int aa[] = {1,2,100,4,5};
		aa[2]= 100;
		System.out.println(aa);
//		for(int element: aa) {
//			System.out.print(element + " ");
//		}
		al.add(2, 100);  //no overwriting of values
		//values are shifted to the right
//		System.out.println(al.toString());
//		for(Integer i : al) {
//			System.out.println(i);
//		}
		
		String s = "Ram";
		al.set(2, 200);
		
		System.out.println(al);
		
		//value is overwritten by the new value
//		System.out.println(al);
//		System.out.println(al.get(2));
////		Integer i = al[6];
//		
//		//lambda expression
//		for(int element: aa) System.out.print(element + " ");
//		
//		al.forEach(element -> System.out.println(element));
//		
//		al.forEach(element -> {
//			System.out.println(element);
//			element++;
//		});
		System.out.println("Index of 1000 is " + al.indexOf(1000));
		System.out.println("100 found : " + al.contains(100));
//		System.out.println(al.get(-1));
//		al.remove(2);
//		System.out.println(al);
//		aa[2] = 0;
//		for(int element: aa) {
//			System.out.print(element + " ");
//		}
//		System.out.println("Size is " + al.size());
		System.out.println("Sublist is " + al.subList(0, 2));
//		
		String s2 = "hello,this is java-programming";
//		char x = s.charAt(0);
//		char y = s.charAt(s.length() - 1);
//		System.out.println(x);
//		System.out.println(y);
		System.out.println(s2.substring(10));
		System.out.println(s2.substring(10,20));
		System.out.println(s2.charAt(19));
//		String letter = s.substring(0,1);
//		System.out.println("letter is " + letter);
		
		char character = s2.charAt(0);
		
		String character2 = s2.substring(0,1);
//		
		String words[] = s2.split("[ ,!/?@-]");
		for(String word : words) {
			System.out.println(word);
		}
		
//		hello,this is java-programming
//		olleh,siht si avaj-gnimmargorp
		
		for(int element : aa) {
			System.out.println(element);
		}
		
		al.forEach( (object) -> {
			System.out.println(object);
		});
		
	}
//
}
