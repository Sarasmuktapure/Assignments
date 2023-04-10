package com.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

//take 10 integer input from user and store them in array and print
public class Array1D {

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
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(a));

	}

}
