package com.Assignment9;

import java.util.Scanner;

public class SecondOccurance 
{
	public static void secondOccurance(String s,char ch)
	{
		char cr[]=s.toCharArray();
		int n=2;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(cr[i]==ch)
			{
				count++;
				if(count==n)
				{
					int index=i;
					System.out.println(index);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		SecondOccurance.secondOccurance(s, ch);
	}

}
