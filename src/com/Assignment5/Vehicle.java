package com.Assignment5;
//Q4 and Q5
class Bike
{
	//private void display()
	//{
		//System.out.println("This is parent class");
	//}
	
	public void display()
	{
		System.out.println("This is parent class");
	}
	
}
public class Vehicle extends Bike
{
	public void view()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) 
	{
		Bike b=new Bike();
		Vehicle v=new Vehicle();
		b.display();
		v.view();
		v.display();
		
	}

}
