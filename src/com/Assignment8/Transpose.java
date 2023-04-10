package com.Assignment8;

import java.util.Scanner;

//to create transpose of array means row will be column and vice versa
public class Transpose
{
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
		System.out.println("Original Array is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of original array");
		
		for(int i=0;i<a[i].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		

	}

}
