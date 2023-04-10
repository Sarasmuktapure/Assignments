package com.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Replace 
{
	public static void replaceLastDigit(int a[])
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==9)
			{
				b[i]=0;
			}
			else
			{
				b[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
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
		System.out.println("-------------------------------");
		Replace.replaceLastDigit(a);
		
	
		
	}

}