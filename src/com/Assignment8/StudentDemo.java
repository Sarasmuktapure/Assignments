package com.Assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo 
{
	int rollno;
	String name;
	int marks;
	StudentDemo(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return rollno+" "+name+" "+marks;
	}
	
	public static void sortRecords(StudentDemo sd[])
	{
		for(int i=0;i<sd.length;i++)
		{
			for(int j=i+1;j<sd.length;j++)
			{
				if(sd[i].marks>sd[j].marks)
				{
					StudentDemo temp=sd[i];
					sd[i]=sd[j];
					sd[j]=temp;
				}
			}
		}
	}
	
	public static void showRecord(StudentDemo sd[])
	{
		for(StudentDemo x:sd)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) 
	{
		StudentDemo sd[]=new StudentDemo[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of student");
		for(int i=0;i<sd.length;i++)
		{
			
			System.out.println("Enter the roll number");
			int rollno=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			sd[i]=new StudentDemo(rollno,name,marks);
		
		}
		
       // for(int i=0;i<sd.length;i++)
		//{
			//System.out.println(sd[i]+" ");
			
		
		//}
		System.out.println("----------------------------------------------------");
		StudentDemo.sortRecords(sd);
		System.out.println(Arrays.toString(sd));
		StudentDemo.showRecord(sd);

	}

}
