package com.AssignmentOnOops;
//class and object program main method outside class
class EmployeeDetails
{
	int id;
	String name;
	float salary;
	
	public void empDetails(int empId,String empName,float empSalary)
	{
		id=empId;
		name=empName;
		salary=empSalary;
	}
	public void display()
	{
		System.out.println("Id="+id+ ", Name="+name+", Salary="+salary);
	}
	
}


public class Employee {

	public static void main(String[] args)
	{
		EmployeeDetails ed=new EmployeeDetails();
		
		
		//EmployeeDetails ed1=ed;
		//System.out.println(ed);
		//System.out.println(ed1);
		//here we have created one object by using new and another by passing reference of first object so here they are pointing to same location  
		
		ed.empDetails(12, "Sara", 10000);
		ed.display();
		

	}

}
