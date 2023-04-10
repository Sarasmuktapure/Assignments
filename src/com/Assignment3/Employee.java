package com.Assignment3;

public class Employee 
{
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

    public void setId(int id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    public double getSalary() {
		return salary;
	}

    public void setSalary(double salary) {
		this.salary = salary;
	}

    public static void main(String[] args)
    {
    	Employee e=new Employee();
    	e.setId(2);
    	e.setName("Aditya");
    	e.setSalary(50000d);
    	System.out.println("Employee details are");
    	System.out.println("Id="+e.getId());
    	System.out.println("Name="+e.getName());
    	System.out.println("Salary="+e.getSalary());
    	
    	
    	//System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	

	}
}
