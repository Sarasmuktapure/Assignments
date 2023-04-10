package com.Assignment3;

public class Student 
{
	int id=6;
	String name="Sara";
	
	public int getId()
	{
		return id;
		//System.out.println(this.id);
	}
	public void displayData()
	{
		this.getId();
		this.id=id;
		System.out.println(id);
		
	}
	
	public void display()
	{
		id=9;
		name="aashu";
		System.out.println(id+" "+name);
		
	}
	

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.displayData();
		s1.display();
		
		System.out.println("--------------------------");
		Student s2=new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println("--------------------------");
		
		s1.id=8;
		s1.name="aadi";
		s2.id=10;
		s2.name="divya";
		System.out.println(s1.id+" "+s1.name+" "+s2.id+" "+s2.name);
		System.out.println("-----------------------------");
	
		
		
		
	}

}
