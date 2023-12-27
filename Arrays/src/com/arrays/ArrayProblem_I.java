
// WAP to find sum of elements of an array

package com.arrays;

import java.util.Scanner;

public class ArrayProblem_I {

	public static void getSumOfArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		
		int sum = 0;
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum = "+ sum);
	}
	public static void main(String[] args) {
		getSumOfArray();
		

	}

}
