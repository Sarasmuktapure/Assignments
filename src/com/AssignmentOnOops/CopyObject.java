package com.AssignmentOnOops;

import java.util.Scanner;

public class CopyObject 
{
	private int a;
	private int b;
	public CopyObject(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	public CopyObject(CopyObject co)
	{
		a=co.a;
		b=co.b;
	}
	public void displayData()
	{
		System.out.println("Addition is="+(this.a+this.b));
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		int num1=sc.nextInt();
		System.out.println("Enter number2");
		int num2=sc.nextInt();
		
		CopyObject co=new CopyObject(num1,num2);
		co.displayData();
		CopyObject copyofco=new CopyObject(co);
		copyofco.displayData();
		
		

	}

}
