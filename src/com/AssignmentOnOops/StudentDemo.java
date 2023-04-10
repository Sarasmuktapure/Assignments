package com.AssignmentOnOops;

public class StudentDemo
{
	int id=4;
	String name="Karan";

	public static void main(String[] args)
	{
		//System.out.println(id);
		//here we can not directly access the instance variable without creating object
		StudentDemo sd=new StudentDemo();
		StudentDemo sd1=new StudentDemo();
		
		System.out.println(sd.id);
		System.out.println(sd.name);
		
		System.out.println(sd1.id);
		System.out.println(sd1.name);
		//here two objects have two separate set of data
		

	}

}
