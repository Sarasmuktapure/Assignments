package com.Assignment7;
//// to check if elements of an array are same or not it read from front or back(using palindrome concept
import java.util.Arrays;
import java.util.Scanner;

public class FrontBack
{
	public static void frontBack(int a[])
	{
		boolean isSame=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[a.length-i-1])
			{
				isSame=true;
				break;
			}	
		}
		if(isSame==true)
		{
			System.out.println(" Elements are same if read from front or back");
		}
		else
			{
				System.out.println(" Elements are not same if read from front or back");
			}
		}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("-----------------------------------------------------------");
		
   
		FrontBack.frontBack(a);

		
		
		
	}

}
