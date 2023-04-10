package com.Assignment3;

import java.util.Scanner;

//to copy values of one object in to another by assigning the values of one object in to another
public class CopyObject 
{
	int age;
	String name;
	CopyObject(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	CopyObject(CopyObject co)
	{
		this.age=co.age;
		this.name=co.name;
	}
	public void displayData()
	{
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		CopyObject co=new CopyObject(age,name);
		System.out.println("Content of the original object");
		co.displayData();
		System.out.println("Content of the copied object");
		CopyObject copyOfco=new CopyObject(co);
		copyOfco.displayData();
		
		
		
		
		

	}

}
