package com.Assignment5;
//Q3 person containment having job and job having joiningdate as an object using getter setter
import java.util.Scanner;

class JoiningDate{
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
class Job{
	private int jobId;
	private String profile;
	private JoiningDate jd;
	
	public void setJobId(int jobId)
	{
		this.jobId=jobId;
	}
	public int getJobId()
	{
		return jobId;
	}
	public void setProfile(String profile)
	{
		this.profile=profile;
	}
	public String getProfile()
	{
		return profile;
	}
	public void setJoiningDate(JoiningDate jd)
	{
		this.jd=jd;
	}
	public JoiningDate getJoiningDate()
	{
		return jd;
	}
}

public class Person {
	private int id;
	private String name;
	private Job job;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setJob(Job job)
	{
		this.job=job;
	}
	public Job getJob()
	{
		return job;
	}
	
	public static void main(String[] args) {
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
		
		Person p=new Person();
		Job j=new Job();
		JoiningDate jd=new JoiningDate();
		
		p.setId(id);
		p.setName(name);
		
		p.setJob(j);
		p.getJob().setJobId(jobId);
		p.getJob().setProfile(profile);
		
		j.setJoiningDate(jd);
		j.getJoiningDate().setDay(day);
		j.getJoiningDate().setMonth(month);
		j.getJoiningDate().setYear(year);
		
		System.out.println("Person id: "+p.getId());
		System.out.println("Person name: "+p.getName());
		System.out.println("Person's job id: "+p.getJob().getJobId());
		System.out.println("Person's job profile: "+p.getJob().getProfile());
		System.out.println("Person's joining date: "+j.getJoiningDate().getDay()+"-"+j.getJoiningDate().getMonth()+"-"+j.getJoiningDate().getYear());
		

	}

}
