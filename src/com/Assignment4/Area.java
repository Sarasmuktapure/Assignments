package com.Assignment4;

import java.util.Scanner;

public class Area 
{
	public void printArea(int s)
	{
		
		System.out.println("Area of square is="+(s*s));
	}
	public void printArea(int l,int b)
	{
		
		System.out.println("Area of rectangle is="+(l*b));
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square");
		int s=sc.nextInt();
		System.out.println("Enter the length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		
		Area a=new Area();
		a.printArea(l, b);
		a.printArea(s);
		

	}

}
