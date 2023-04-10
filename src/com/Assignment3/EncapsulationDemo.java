package com.Assignment3;
import com.AccessModifier.*;
//here for creating object of class which is present in another package we have 
//to import that package here 

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		//EncapsulationDemo ed=new EncapsulationDemo();
		EmployeeDemo empd=new EmployeeDemo("Aditya",20);
		MyClass mc=new MyClass();
		//mc.print();
		
		System.out.println("Employee name is:"+empd.getName());
		System.out.println("Employee id is:"+empd.getEmpId());
		
		
		
		//Encapsulation is not completed without getter and setter methods
		
		

	}

}
