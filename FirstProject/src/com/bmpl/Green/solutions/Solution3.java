package com.bmpl.Green.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		// hellothisisjavaprogramming
		
		// lowercase replace
		
		// hel
		
		// lothis
		
		// isjav
		
		// aprog
		
		// ram
		
		// ming
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s = scanner.nextLine().toLowerCase().replace(" ", "");
		scanner.close();
		
//		System.out.println(s);
		
//		char []temp_char_array = new char[s.length()];
		
		String temp_substring = "";
		
		ArrayList<String> array_of_substrings = new ArrayList<>();
		
		boolean duplicateFound = true;
		
		while(duplicateFound) {
			duplicateFound = false;
			for(int i = 0; i < s.length(); i++) {
				char letter = s.charAt(i);
				if(temp_substring.indexOf(letter) == -1) {
					temp_substring = s.substring(0, i + 1);
					continue;
				}
				else {
					array_of_substrings.add(temp_substring);
					temp_substring = "";
					s = s.substring(i);
					duplicateFound = true;
					break;
				}
			}
		}
		
		array_of_substrings.add(s);
		
		System.out.println(array_of_substrings);
		
//		for(int i = 0; i < s.length(); i++) {
//			char letter = s.charAt(i);
//			for(int j = 0; j < temp_char_array.length; j++) {
//				if( temp_char_array[j] == '') {
//					break;
//				}
//				if( letter == temp_char_array[j] ) {
//					array_of_substrings.add(s.substring(0, i));
//					temp_char_array = new char[s.length() - i];
//					break;
//				}
//			}
//			temp_char_array[i] = letter;
//		}

	}

}
