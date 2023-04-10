package com.Assignment8;
//find minimum element in each column
import java.util.Scanner;

public class MinColumn
{
	public static void minColm(int a[][])
	{
		System.out.println("Min element from each column");
		for(int j=0;j<a.length;j++)
		{
			int min=a[j][0];
			for(int i=0;i<a[j].length;i++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
			}
			System.out.print(min+" ");
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
		System.out.println("-------------------------------------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		MinColumn.minColm(a);
		

	}

}
