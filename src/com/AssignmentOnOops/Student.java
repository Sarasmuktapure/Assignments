package com.AssignmentOnOops;
//create class student, create two objects,main method inside class, class and object program initialization through reference 
//Initialization of object means storing data into objects 
public class Student
{
	int id;
	String name;

	public static void main(String[] args)
	{
		Student s1=new Student();
		//Student s2=s1;//here s1 and s2 both pointing to same location
		Student s2=new Student();
		s1.id=2;
		s1.name="Aditya";
		s2.id=4;
		s2.name="Divya";
		
		//System.out.println(s1);
       // System.out.println(s2);		
		//here we have print two objects and conclude that their hash codes are different
		// here we have used new keyword for both object so they are pointing to different location
		
		System.out.println("Details of first student");
		System.out.println(s1.id+" "+s1.name);
		System.out.println("Details of second student");
		System.out.println(s2.id+" "+s2.name);
		

	}

}
