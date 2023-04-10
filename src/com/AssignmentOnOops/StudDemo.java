package com.AssignmentOnOops;

import java.util.Scanner;

public class StudDemo 
{
	int ids;
	String sname;
	int sage;
	public void display()
	{
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter details of student");
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the student id");
			int id=sc.nextInt();
			System.out.println("Enter the student age");
			int age=sc.nextInt();
			StudDemo sd1=new StudDemo();
			System.out.println(sd1.ids);
		}
		
		//StudDemo sd1=new StudDemo();
		//StudDemo sd2=new StudDemo();
		//sd1.display();
		//sd2.display();
		//System.out.println(sd1.ids);
		
				
		
		
		

	}

}
