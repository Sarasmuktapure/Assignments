package com.Assignment5;
// Q1.containment of student contain department object using constructor

import java.util.Scanner;

class Department1
{
	int did;
	String dname;
	
	Department1(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}

public class Student1 
{
	int id;
	String name;
	Department1 dept;
	
	Student1(int id, String name, Department1 dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details");
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		System.out.println("Enter the student name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the department details");
		System.out.println("Enter the department id");
		int did=sc.nextInt();
		System.out.println("enter the department name");
		sc.nextLine();
		String dname=sc.nextLine();
		
		Department1 d1=new Department1(did,dname);
		Student1 s1=new Student1(id,name,d1);
		System.out.println(s1);
		
	}

}
