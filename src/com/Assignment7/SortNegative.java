package com.Assignment7;
//Sort negative appear first then positive integer in an array
import java.util.Arrays;
import java.util.Scanner;


public class SortNegative
{
	public static void negativeShift(int[]a,int n)
	{
		int temp[]=new int[n];
		int pos=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				temp[pos]=a[i];
				pos++;
			}
		}
		
		
			for(int i=0;i<n;i++)
			{
				if(a[i]>=0)
				{
					temp[pos]=a[i];
					pos++;
				}
			}
			
			
			for(int i=0;i<n;i++)
			{
				a[i]=temp[i];
			
			}
			System.out.println(Arrays.toString(a));
	}
	


	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-----------------------------------------");
		
		SortNegative.negativeShift(a, n);

	}

}
