package com.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeros 
{
	public static void shiftZeros(int[]a)
	{
		int j=a.length;
		int k=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[k]=a[i];
				k++;
			}
		}
		while(k<a.length)
		{
			a[k]=0;
			k++;
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
		System.out.println("------------------------------");
		ShiftZeros.shiftZeros(a);

	}

}
