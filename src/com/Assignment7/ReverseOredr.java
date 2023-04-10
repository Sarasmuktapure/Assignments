package com.Assignment7;
//take 10 number print array and print another array with these numbers but in reverse order
import java.util.Arrays;
import java.util.Scanner;

public class ReverseOredr
{
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
		System.out.println("The array in reverse order is");

		int[]m=new int[10];
		int pos=9;
		
		for(int i=0;i<a.length;i++)
		{
			m[pos]=a[i];
			pos--;
		}
		System.out.println(Arrays.toString(m));
	}

}

