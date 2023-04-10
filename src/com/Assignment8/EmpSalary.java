package com.Assignment8;

import java.util.Scanner;

//show only those employee whose salary is same
public class EmpSalary 
{
	int id;
	String name;
	int salary;
	
	EmpSalary(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;  
	}


	public static void main(String[] args) 
	{
		EmpSalary[]es=new EmpSalary[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<es.length;i++)
		{
			System.out.println("Enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter the salary");
			int sal=sc.nextInt();
			es[i]=new EmpSalary(eid,ename,sal);
			System.out.println("----------------------------------------------");
		}	
		
		    for(int i=0;i<es.length;i++)
		   {
			      System.out.println(es[i]);
		   }
		    
		   System.out.println("-----------------------------------------------------");
		   
		   for(int i=0;i<es.length;i++)
		   {
			   
				boolean isvisited=false;
				for(int k=i-1;k>=0;k--)
				{
					if(es[i].salary==es[k].salary)
					{
						isvisited=true;
						break;
					}
				}
				if(isvisited==false)
				{
					for(int j=i+1;j<es.length;j++)
					{
						if(es[i].salary==es[j].salary)
						{
							System.out.println(es[i]+" and "+es[j]);
						}
					}
					
		        }
	
		
	      }
	}
}



