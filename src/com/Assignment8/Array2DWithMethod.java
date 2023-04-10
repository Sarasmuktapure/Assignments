package com.Assignment8;

import java.util.Scanner;

// Pass 2D array to function and access all its elements
public class Array2DWithMethod
{
	public static void pass2D(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

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
		System.out.println("---------------------------------------------------");
		Array2DWithMethod.pass2D(a);

	}

}
