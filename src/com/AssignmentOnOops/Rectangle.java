package com.AssignmentOnOops;
//creating multiple objects by one type only 

public class Rectangle
{
	int length;
	int width;
	public void insert(int l,int w)
	{
		length=l;
		width=w;
	}
	public void area()
	{
		System.out.println("Area of rectangle is="+(length*width));
	}
	
	  
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(),r2=new Rectangle();
		r1.insert(5, 3);
		r2.insert(8, 6);
		r1.area();
		r2.area();
	}

}
