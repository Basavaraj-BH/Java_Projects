
// WAP sum of all even Numbers

package com.arrays;

import java.util.Scanner;

public class ArrayProblem_II {
	public static void getSumOfEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int evenNum = sc.nextInt();
		int arr[] = new int[evenNum];
		int sum = 0;
		for(int i=0;i<evenNum;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				sum = sum + arr[i];
			}
			
		}
		for(int i=0;i<evenNum;i++) {
			System.out.print(sum);
		}
	}

	public static void main(String[] args) {
		getSumOfEvenNumbers();

	}

}
