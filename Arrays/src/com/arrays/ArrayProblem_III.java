package com.arrays;

import java.util.Arrays;

public class ArrayProblem_III {
	
	public static int SecondLargestElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[i] = temp;
				}
			}
		}
		
//		Arrays.sort(arr);
		
		 for(int data:arr) {
			 System.out.println(data+" ");
		 }
		 return arr[arr.length-2];
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] arr2 = {5,10,20,15};
		
		int[] arr3 = {12,23,22,25,35};
		int result = SecondLargestElement(arr3);
		System.out.println();
		System.out.print(result);
		
	}

}
