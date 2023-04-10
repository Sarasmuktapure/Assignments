package com.Assignment8;
//to create array of 3 employee each employee will have different department
import java.util.Scanner;


class Department{
	int deptid;
	String deptname;
	Department(int deptid,String deptname)
	{
		this.deptid=deptid;
		this.deptname=deptname;
	}
	public String toString()
	{
		return deptid+" "+deptname;
	}
}



public class Employee 
{
	int empno;
	String empname;
	Department dept;
	Employee(int empno,String empname,Department dept)
	{
		this.empno=empno;
		this.empname=empname;
		this.dept=dept;
	}
	public String toString()
	{
		return empno+" "+empname+" "+dept;
	}

	public static void main(String[] args)
	{
		Employee []emp=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			
			
			System.out.println("Enter the emp id");
			int empno=sc.nextInt();
			System.out.println("Enter the emp name");
			String empname=sc.next();
			
			
			System.out.println("Enter dept id");
			int deptid=sc.nextInt();
			System.out.println("Enter the dept name");
			String deptname=sc.next();
		
		
		Department d=new Department(deptid,deptname);
		emp[i]=new Employee(empno,empname,d);
		}	
		for(int i=0;i<emp.length;i++)
		{
		  System.out.println(emp[i]);
		}
	
		
		}

	}


