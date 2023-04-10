package com.Assignment7;
//write method that return the average of an array and invoke the method from main
import java.util.Arrays;
import java.util.Scanner;

public class Average
{
	public static int average(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int average=sum/a.length;
		System.out.println("Average of array elements are="+average);
		return average;
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
		Average.average(a);
	

	}

}
