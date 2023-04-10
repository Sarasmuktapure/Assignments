package com.AssignmentOnOops;

import java.util.Scanner;

public class RectangleArea 
{
	int length;
	int breadth;
	RectangleArea(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void area()
	{
		System.out.println("Area of rectangle is="+(length*breadth));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		RectangleArea ra=new RectangleArea(l,b);
		ra.area();
		
		
		
		

	}

}
