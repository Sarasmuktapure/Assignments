package com.Assignment7;
// check element is present or not in array
import java.util.Arrays;
import java.util.Scanner;

public class PresentElement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("------------------------------------");
		System.out.println(Arrays.toString(a));
		System.out.println("------------------------------------");
		
		System.out.println("To give a number to check present or not");
		int num=sc.nextInt();
		
		boolean ispresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				ispresent=true;
			}
		}
		if(ispresent)
		{
			System.out.println("Entered number is present");
		}
		else
		{
			System.out.println("Entered number is not present");
		}
		

	}

}
