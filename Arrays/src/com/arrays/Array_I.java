package com.arrays;

import java.util.Scanner;

public class Array_I {

	public static void main(String[] args) {
//SYNTAX : data_type [] arrName = {e1,e2,e3,e4,....};
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {21,22,23};
		char[] arr3 = {'a','b','c'};
		Object[] arr4 = {1,2.4f,4.5,"hello",'a'};
		
//input from the user = here we can take n number of array size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr5 = new int[size];
		
//Here is how user needs to add array inside elements
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr5[i] = sc.nextInt();
		}
		
		System.out.println("Displaying the Array elements");
//read an array
		for(int i=0;i<size;i++) {
			System.out.print(arr5[i]+" "); 
		}

	}

}
