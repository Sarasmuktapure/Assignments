package com.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort 
{
	public static void sort(String s[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].length()<s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				else if(s[i].length()==s[j].length())
				{
					if(s[i].charAt(0)>s[j].charAt(0))
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
			     }
			
	      	}
		
	}
		System.out.println(Arrays.toString(s));
}
	
	public static void main(String[] args)
	{
		
		//String s[]= {"hi","how","are","you","doing"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		String s[]=new String[size];
		int n=s.length;
		
		System.out.println("Enter the array elements");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		StringSort.sort(s, n);
	}

}
