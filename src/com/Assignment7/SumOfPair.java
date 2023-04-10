package com.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPair
{
	public static void sumOfPair(int a[], int sum)
	{
		System.out.println("The pair of elements are");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					count++;
					System.out.println(a[i]+" and "+a[j]);
				}
			}
			
	    }
		System.out.println("Count of pairs are="+count);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("-----------------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number which you want to check the pair of sum ");
		int sum=sc.nextInt();
		SumOfPair.sumOfPair(a, sum);
		
		

	}

}
