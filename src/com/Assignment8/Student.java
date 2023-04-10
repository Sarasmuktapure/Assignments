package com.Assignment8;
//student class has a course object write a program to set isSpecial to be true if fees more than 50000
import java.util.Scanner;

class Course
{
	String cname;
	int fees;
	Course(String cname,int fees)
	{
		this.cname=cname;
		this.fees=fees;
	}
	public String toString()
	{
		return cname+" "+fees;
	}
}
public class Student
{
	int id;
	String name;
	boolean isSpecial;
	Course c;
	Student(int id, String name,boolean isSpecial, Course c)
	{
		this.id=id;
		this.name=name;
		this.isSpecial=isSpecial;
		this.c=c;
	}
	public String toString()
	{
		return id+" "+name+"  "+isSpecial+" "+c;
	}

	public static void main(String[] args) 
	{
		Student []std=new Student[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			
			
			System.out.println("Enter the student id");
			int id=sc.nextInt();
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the course name");
			String cname=sc.next();
			System.out.println("Enter the course fees");
			int fees =sc.nextInt();
			
			boolean isSpecial=false;
			if(fees>50000)
			{
				isSpecial=true;
				
			}
			Course c=new Course(cname,fees);
			std[i]=new Student(id,name,isSpecial,c);
			
			
			
			  
		}	
		for(int i=0;i<std.length;i++)
		{
		  System.out.println(std[i]);
		}
		

	}

}
