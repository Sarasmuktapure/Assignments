package com.Assignment7;
//// find sum and product of all element in an array
import java.util.Arrays;
import java.util.Scanner;

public class SumProduct 
{
	public static void sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all elements are="+sum);
		
	}
	public static void product(int a[])
	{
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			product=product*a[i];
		}
		System.out.println("Product of all elements are="+product);
		
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
		System.out.println(Arrays.toString(a));
		SumProduct.sum(a);
		SumProduct.product(a);

	}

}
