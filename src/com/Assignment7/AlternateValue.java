package com.Assignment7;
// to print alternate value from an array
import java.util.Arrays;
import java.util.Scanner;

public class AlternateValue
{
	public static void alternateVal(int a[])
	{
		System.out.println("Alternate elements are");
		for(int i=0;i<a.length;i+=2)
		{
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------------");
		
		AlternateValue.alternateVal(a);
		
		

	}

}
