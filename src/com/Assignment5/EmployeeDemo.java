package com.Assignment5;
//Q2 Containment of employee with getter setter 

import java.util.Scanner;

class MyDateDemo
{
	private int day;
	private String month;
	private int year;
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(String month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public int getDay()
	{
		return day;
	}
	public String getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
}

class DepartDemo
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

public class EmployeeDemo 
{
	private int eid;
	private String ename;
	private float salary;
	private DepartDemo dept;
	private MyDateDemo date;
	
    public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public DepartDemo getDept() {
		return dept;
	}


	public void setDept(DepartDemo dept) {
		this.dept = dept;
	}


	public MyDateDemo getDate() {
		return date;
	}


	public void setDate(MyDateDemo date) {
		this.date = date;
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
		
		EmployeeDemo ed=new EmployeeDemo();
		DepartDemo dd=new DepartDemo();
		MyDateDemo md=new MyDateDemo();
		
		ed.setEid(id);
		ed.setEname(name);
		ed.setSalary(sal);
		
		ed.setDate(md);
		ed.getDate().setDay(day);
		ed.getDate().setMonth(month);
		ed.getDate().setYear(year);
		
		ed.setDept(dd);
		ed.getDept().setId(did);
		ed.getDept().setName(dname);
		
		System.out.println("Employee details are\n"+ed.getEid()+" "+ed.getEname()+" "+ed.getSalary());
		System.out.println("Date is\n"+ed.getDate().getDay()+"/"+ed.getDate().getMonth()+"/"+ed.getDate().getYear());
		System.out.println("Dept details are\n"+ed.getDept().getId()+" "+ed.getDept().getName());
		
		
		
		

	}

}
