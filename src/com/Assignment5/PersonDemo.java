package com.Assignment5;
////Q3 person containment having job and job having joiningdate as an object using constructor

import java.util.Scanner;

class JoiningDetails
{
	int day;
	String month;
	int year;
	JoiningDetails(int day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		String s="joining date is="+day+"-"+month+"-"+year;
		return s;
	}
}
class JobDetails
{
	int jobId;
	String profile;
	JoiningDetails jd;
	JobDetails(int jobId,String profile,JoiningDetails jd)
	{
		this.jobId=jobId;
		this.profile=profile;
		this.jd=jd;
	}
	public String toString()
	{
		String s="Job id= "+jobId+", profile= "+profile+", "+jd; 
		return s;
	}
}
public class PersonDemo 
{
	int id;
    String name;
    JobDetails job;
    PersonDemo(int id,String name,JobDetails job)
    {
    	this.id=id;
    	this.name=name;
    	this.job=job;
    }
    public String toString()
	{
		String s="Person id= "+id+", name= "+name+", "+job; 
		return s;
	}
    
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person details");
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter the job details");
		System.out.println("Enter the job id");
		int jobId=sc.nextInt();
		System.out.println("enter the job profile");
		sc.nextLine();
		String profile=sc.nextLine();
		System.out.println("Enter the joining date details");
		System.out.println("Enter the day");
		int day=sc.nextInt();
		System.out.println("Enter the month");
		sc.nextLine();
		String month=sc.nextLine();
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		JoiningDetails jd=new JoiningDetails(day,month,year);
		JobDetails j=new JobDetails(jobId,profile,jd);
		PersonDemo p=new PersonDemo(id,name,j);
		System.out.println(p.toString());
		
		

	}

}
