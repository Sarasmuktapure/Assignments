package com.Assignment6;

import java.util.Scanner;

interface Shape
{
	public void draw();
	public double getArea();
}
class Circle implements Shape{
	private double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}

	@Override
	public double getArea() {
		
		 return (3.14*this.radius*this.radius);
		
	}
	
	
}

public class AbstarctionDemo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r=sc.nextDouble();
		Shape s=new Circle(r);
		s.draw();
		System.out.println("Area of circle: "+s.getArea());
		
		
		

	}

}
