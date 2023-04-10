package com.Assignment8;
//create an array of theater has movie object
import java.util.Scanner;

class Movie{
	int mid;
	String mname;
	String rating;
	Movie(int mid,String mname,String rating)
	{
		this.mid=mid;
		this.mname=mname;
		this.rating=rating;
	}
	public String toString()
	{
		return mid+" "+mname+" "+rating;
	}
}

public class Theatre 
{
	int tid;
	String tname;
	String location;
	Movie m;
	Theatre(int tid, String tname, String location, Movie m)
	{
		this.tid=tid;
		this.tname=tname;
		this.location=location;
		this.m=m;
	}
	public String toString()
	{
		return tid+" "+tname+" "+location+" "+m;
	}

	public static void main(String[] args)
	{
		Theatre t[]=new Theatre[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Enter the theatre id");
			int tid=sc.nextInt();
			System.out.println("Enter the theatre name");
			String tname=sc.next();
			System.out.println("Enter the theatre location");
			String location=sc.next();
			System.out.println("Enter the movie id");
			int mid=sc.nextInt();
			System.out.println("Enter the movie name");
			String mname=sc.next();
			System.out.println("Enter the movie rating");
			String rating=sc.next();
			
			Movie m=new Movie(mid,mname,rating);
			t[i]=new Theatre(tid,tname,location,m);
		}
		for(int i=0;i<t.length;i++)
		{
		  System.out.println(t[i]);
		}
		

	}

}
