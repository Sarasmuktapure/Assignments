package com.Assignment8;
import java.util.Arrays;
//Student of array and shows those whose marks are more than 60 and age is less than 15
import java.util.Scanner;

public class StudentMarks
{
	int rollno;
	String name;
	int age;
	int marks;
	StudentMarks(int rollno,String name,int age,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public String toString()
	{
		return rollno+" "+name+" "+age+" "+marks;
	}
	
	public static void sortName(StudentMarks sm[])
	{
		
		for(int i=0;i<sm.length;i++)
		{
			for(int j=i+1;j<sm.length;j++)
			{
				if(sm[i].name.charAt(0)>sm[j].name.charAt(0))
				{
					StudentMarks temp=sm[i];
					sm[i]=sm[j];
					sm[j]=temp;
				}
			}	
	}
		System.out.println(Arrays.toString(sm));
}

	public static void main(String[] args)
	{
		StudentMarks sm[]=new StudentMarks[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of student");
		for(int i=0;i<sm.length;i++)
		{
			
			System.out.println("Enter the roll number");
			int rollno=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			sm[i]=new StudentMarks(rollno,name,age,marks);
		
		}
		
        for(int i=0;i<sm.length;i++)
		{
			System.out.println(sm[i]+" ");
			
		
		}
		System.out.println("----------------------------------------------------");
		
		for(int i=0;i<sm.length;i++)
		{
			if(sm[i].marks>60 && sm[i].age<15)
			{
				System.out.println(sm[i]+" ");
			}
		}
		System.out.println("----------------------------------------------------");
		
			StudentMarks.sortName(sm);
			//System.out.println(Arrays.toString(sm));
			
		}
		
		

	}


