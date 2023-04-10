package com.Assignment4;

public class Cycle
{
	int noOfWheels;
	String brand;
	
	Cycle()
	{
		System.out.println("I am default constructor");
	}
	
	Cycle(int c_wheels,String c_brand)
	{
		this();
		System.out.println("I am another constructor");
		noOfWheels=c_wheels;
		brand=c_brand;
	}

	public static void main(String[] args)
	{
		//Cycle c=new Cycle();
		
		Cycle c1=new Cycle(2,"Atlas");
		

	}

}
