package com.Assignment8;
//sum of each element of column
import java.util.Scanner;

public class ColumnSum 
{
	public static void columSum(int a[][])
	{
		
				System.out.println("----------------------------------------------");
				System.out.println("Sum of each column elements are");
				for(int j=0;j<a.length;j++)
				{
					int sum=0;
					for(int i=0;i<a[j].length;i++)
					{
						sum=sum+a[i][j];
					}
					
					System.out.print(sum);
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		ColumnSum.columSum(a);

	}

}
