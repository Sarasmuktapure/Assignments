package com.Assignment5;
//Q1 containment of student having department object using getter setter 
import java.util.Scanner;

class Department
{
	private int did;
	private String dname;
	
	public void setId(int did)
	{
		this.did=did;
	}
	public void setName(String dname)
	{
		this.dname=dname;
	}
	public int getId()
	{
		return did;
	}
	public String getName()
	{
		return dname;
	}
	
}
public class Student
{
	private int id;
	private String name;
	private Department dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDepartment(Department dept)
	{
		this.dept=dept;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Department getDepartment()
	{
		return dept;
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
		
		Student std=new Student();
		Department d=new Department();
		
		std.setId(id);
		std.setName(name);
		std.setDepartment(d);
		std.getDepartment().setId(did);
		std.getDepartment().setName(dname);
		
		System.out.println(+std.getId()+" "+std.getName()+" "+std.getDepartment().getId()+" "+std.getDepartment().getName());
		
		

	}

}
