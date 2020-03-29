package com.bmpl.Green.solutions;

public class Solution2 {

	public static void main(String[] args) {
		
		// user input
		// how many elements you want to put in array
		// for loop -> create an array
		// how much rotation you want
		
		// 5
		// [23,42,66,823,65]
		// 2 -> left shift
		// -2 -> right shift
		
		// 2 -> [66,823,65,23,42]
		// -2 -> [823, 65, 23, 42, 66]
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int rotation = 3;
		
		int temp_array[] = new int[rotation];
		
		for(int i = 0; i < rotation; i++) {
			temp_array[i] = arr[i];
		}
		
		for(int i = rotation; i < arr.length; i++) {
			arr[i - rotation] = arr[i];
		}
		
		for(int i = 0; i < rotation; i++) {
			arr[arr.length - rotation + i] = temp_array[i];
		}

	}

}
