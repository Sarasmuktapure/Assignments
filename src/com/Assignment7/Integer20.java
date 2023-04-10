package com.Assignment7;
//take 20 input from user and print array and show number of positive number,
//number of negative number,number of odd numbers,number of even numbers,number of zeros.
import java.util.Arrays;
import java.util.Scanner;

public class Integer20
{
	public static void checkPNZ(int a[])
	{
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				positive++;
			}
			else if(a[i]<0)
			{
				negative++;
			}
			else
			{
				zero++;
			}	   
     	}
		System.out.println("Positive numbers are="+positive);
		System.out.println("Negative numbers are="+negative);
		System.out.println("Zeros are="+zero);
}
	public static void checkEvenOdd(int a[])
	{
		int odd=0;
		int even=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0 && a[i]>0)
			{
				even++;
			}
			else if(a[i]%2==1)
			{
				odd++;
			}
		}
		System.out.println("Even numbers are="+even);
		System.out.println("Odd numbers are="+odd);
	}

	public static void main(String[] args) 
	{
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(a[i]);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(Arrays.toString(a));
		Integer20.checkPNZ(a);
		Integer20.checkEvenOdd(a);
	

	}

}
