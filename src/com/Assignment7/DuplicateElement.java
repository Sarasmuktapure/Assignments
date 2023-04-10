package com.Assignment7;
//find and count the duplicate elements 
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement
{
	public static void duplicate(int[]a)
	{
		System.out.println("Duplicate elements are");
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				
				if(count>1)
				{
				System.out.println(a[i]+" occurs "+count+" times" );
				}
			}
		}
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
		DuplicateElement.duplicate(a);
		
	

	}

}
