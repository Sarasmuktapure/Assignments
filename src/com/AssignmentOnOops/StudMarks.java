package com.AssignmentOnOops;

import java.util.Scanner;

public class StudMarks 
{
	int marks1;
	int marks2;
	int marks3;
	StudMarks(int m1,int m2,int m3)
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
		
	}
	public void display()
	{
		float per=(marks1+marks2+marks3)/3;
		System.out.println("Percentage of student is="+per);
		if(per>=80)
		{
			System.out.println("1st class");
		}
		else if(per>=60)
		{
			System.out.println("2nd class");
		}
		else if(per>=40)
		{
			System.out.println("3rd class");
		}
		else
		{
			System.out.println("pass class");
		}
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks1");
		int m1=sc.nextInt();
		System.out.println("Enter marks2");
		int m2=sc.nextInt();
		System.out.println("Enter marks3");
		int m3=sc.nextInt();
		StudMarks sm=new StudMarks(m1, m2, m3);
		sm.display();

	}

}
