package com.TwoDimentionalArray;

import java.util.Scanner;

public class MulitDimentionalArray {

	public static void main(String[] args) {
		int[][] arr = {{21,22,23},{31,32,33},{41,42,43}};
		System.out.println(arr.length);
		
//Time complexity is = m*n
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
// elements from user input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the numbers of columns");
		int col = sc.nextInt();
		
		int[][] arr2 = new int[rows][col];
		System.out.println("Enter the elements");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying elements :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the row value");
		int x = sc.nextInt();
		System.out.println("Enter the col value");
		int y = sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(i==x || j==y) {
					arr2[i][j] =0;
				}
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
