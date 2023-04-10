package com.Assignment5;
//Q10. 
public class Student2 
{
	int id;
	String name;
	Student2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}

	public static void main(String[] args) 
	{
		Student2 s1=new Student2(5, "rani");
		//Student2 s2=new Student2();
		
		//System.out.println(s1);
		//System.out.println(s2);
		//here both hash code are different
		
		Student2 s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		//here both object pointing to same location
		
		
	
		
		
		
		

	}

}
