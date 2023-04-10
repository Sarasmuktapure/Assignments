package com.Assignment5;
//Q2 containment of employee has department and mydate object using constructor 

import java.util.Scanner;

class MyDate
{
	int day;
	String month;
	int year;
	MyDate(int day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		String s="Mydate is="+day+"/"+month+"/"+year;
		return s;
	}
}
class DepartmentDemo
{
	int did;
	String dname;
	
	DepartmentDemo(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		String s="Department id="+did+"\nDepartment name="+dname;
		return s;
	}
}



public class Employee 
{
	int eid;
	String ename;
	float salary;
	DepartmentDemo dept;
	MyDate date;
	
	Employee(int eid,String ename,float salary,DepartmentDemo dept,MyDate date)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
		this.date=date;
	}
	public String toString()
	{
		String s="Employee id="+eid+"\nEmployee name="+ename+"\nEmployee department details\n"+dept+"\n"+date;
	return s;
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the salary");
		float sal=sc.nextFloat();
		System.out.println("Enter the department details");
		System.out.println("Enter the dept id");
		int did=sc.nextInt();
		System.out.println("enter the dept name");
		sc.nextLine();
		String dname=sc.nextLine();
		System.out.println("Enter the mydate details");
		System.out.println("Enter the day");
		int day=sc.nextInt();
		System.out.println("Enter the month");
		sc.nextLine();
		String month=sc.nextLine();
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		MyDate md=new MyDate(day,month,year);
		DepartmentDemo deptd=new DepartmentDemo(did,dname);
		Employee emp=new Employee(id,name,sal,deptd,md);
		System.out.println(emp);
		
		
	}

}
