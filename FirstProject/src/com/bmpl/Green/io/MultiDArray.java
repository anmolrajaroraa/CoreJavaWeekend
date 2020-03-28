package com.bmpl.Green.io;

import java.util.ArrayList;

public class MultiDArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
//		for(int element : arr) {
//			System.out.println(element);
//		}
		
		int arr2D[][] = {  {1,2,3,4},  {11,2,2,3,4},
				{23,34,354},  {10}   };
		
		Integer new_arr[] = new Integer[5];
//		new_arr[0] = 1;
		new_arr[0] = Integer.valueOf(1);
		new_arr[1] = 2;
		new_arr[2] = 3;
		new_arr[3] = 4;
		new_arr[4] = 5;

//		for(Integer object : new_arr) {
//			System.out.println(object);
//		}
//		System.out.println(array);
		
		int new2DArray[][] = {  {1,2,3,4}, {11,22,33}, {100,200}, {10} };
		
//		{ { {12,33,34}, {}, {} },  { {}, {}, {} }, { {}, {}, {} }  }
		
		System.out.println( new2DArray[0][0] );
		new2DArray[2][0] = 1000;
//		System.out.println( new2DArray[2][0] );
//		System.out.println( new_arr );
		
		System.out.println("[ ");
		for( int[] arr : new2DArray) {
//			System.out.println(arr);
			System.out.print("  [ ");
			for( int element : arr ) {
				System.out.print(element + ", ");
			}
			System.out.println(" ]");
//			System.out.println();
		}
		System.out.println("]");
		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println( a[i] );
//		}
		
		System.out.println("[ ");
		for(int i = 0; i < new2DArray.length; i++) {
			
			System.out.print("  [ ");
			for( int j = 0; j < new2DArray[i].length; j++) {
				System.out.print( new2DArray[i][j]  + ", ");
			}
			System.out.println(" ]");
			
		}
		System.out.println("]");
		
		ArrayList<int[]> al = new ArrayList<>();
		al.add(a);
//		System.out.println(al);
		System.out.println( al.get(0)[0] );
		
		for(int i=0; i<new2DArray.length; i++) {
			for(int j=0; j<new2DArray[i].length; j++) {
				System.out.println("Arr" + "[" + i + "][" + j + "]=" + new2DArray[i][j]);
			}
		}
		
	}

}
