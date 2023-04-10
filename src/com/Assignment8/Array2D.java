package com.Assignment8;

import java.util.Scanner;

//Initialize and print all elements of a 2D array
public class Array2D {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows for array");
		int rowsa=sc.nextInt();
		System.out.println("Enter the size of column for array");
		int colma=sc.nextInt();
		int [][]a=new int[rowsa][colma];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("--------------------------------------------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
