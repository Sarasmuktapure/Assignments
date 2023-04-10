package com.Assignment4;

public class Student
{
	String name;
	int age;
	String address;
	
	public void set_Info(String name, int age)
	{
		this.set_Info("Aditya", 26, "Latur");
	}
	public void set_Info(String name, int age, String address)
	{
		System.out.println("Name is="+name+", Age is="+age+", Address is="+address);
	}
	
	

	public static void main(String[] args)
	{
		Student std=new Student();
		std.set_Info("Aditya", 26);
				
		
	}

}
