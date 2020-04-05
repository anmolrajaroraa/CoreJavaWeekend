package com.bmpl.Green.oops;

import java.util.Scanner;

class Student{
	int id; //4
	String name; //10
	String courseName; //18
	int courseDuration = 2; //4
	static Scanner scanner = new Scanner(System.in);
	
	void showDetails() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Course name is " + courseName);
		System.out.println("Course duration is " + courseDuration);
	}
	
	void takeInput(int sid, String sname, String course, int duration) {
		id = sid; 
		name = sname;
		courseName = course;
		courseDuration = duration;
	}
	
	void takeInputUsingScanner() {
		System.out.println("Enter id");
		id = scanner.nextInt(); //101
		
		scanner.nextLine();
		
		System.out.println("Enter name");
		name = scanner.nextLine(); // \n
		System.out.println("Enter course name");
		courseName = scanner.nextLine();
		System.out.println("Enter course duration");
		courseDuration = scanner.nextInt();
	}
	
//	int length() {
//		return 10;
//	}
	
//	s.toUpperCase
//	s.toCharArray
//	s.charAt
	
	//CRUD
//	void addStudent() {
//		
//	}
//	void showDetails() {
//		
//	}
//	void updateDetails() {
//		
//	}
//	void deleteStudent() {
//		
//	}
	
}

public class OOPSDemo {

	public static void main(String[] args) {
		
		Student obj1 = new Student();
//		obj1.takeInput(101, "Ram", "Core Java", 4);
		obj1.takeInputUsingScanner();
		obj1.showDetails();
		
//		obj1.length();
//		obj1.name.length();
		
//		System.out.println("Id is " + obj1.id);
//		System.out.println("Name is " + obj1.name);
//		System.out.println("Course name is " + obj1.courseName);
//		System.out.println("Course duration is " + obj1.courseDuration);
		
		Student student = new Student();
		
//		student.id = 102;
//		student.name = "shyam";
//		student.courseName = "Advance java";
//		student.courseDuration = 4;
//		System.out.println(student);
		student.takeInput(102, "Shyam", "Advance Java", 3);
		student.showDetails();
	
//		System.out.println("Id is " + student.id);
//		System.out.println("Name is " + student.name);
//		System.out.println("Course name is " + student.courseName);
//		System.out.println("Course duration is " + student.courseDuration);
		
//		int array[] = new int[5];
//		System.out.println(array);

	}

}



//// Why class ever came to the existence ?
//// - every variable and fn gets created as global in C language
//// - name conflicts among variables and fns

// class has scope for both member variables (instance variables) and methods (member functions)
// class has static members also and constructors are also available also

// class is like a category for us (blueprint)
// objects are like products of this category (blueprint)

// class name should always be noun and in title case
// variable name should always be action and in camel case

//ArrayList
//AbstractCollection
//HashMap
//HashSet
//LinkedList
//Linked_list
//string String

// class is a blueprint so it doesnt consume any memory
// objects consume physical memory

//
//// Customer
//class Customer{
//void add() {
//	
//}
//}
//
//// Account
//class Account{
//void add() {
//	
//}
//}
//
//// Loan
//class Loan{
//void add() {
//	
//}
//void addAmount() {
//	
//}
//}
//
//Customer obj = new Customer();
//obj.add();

// Unit testing (JUnit) - stub