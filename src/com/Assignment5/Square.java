package com.Assignment5;
//Q6
class Rectangle
{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle is: "+(2*(length+breadth)));
	}
}




public class Square extends Rectangle
{
	int side;

	Square(int side) 
	{
		super(side,side);
		this.side=side;
	}
	public void area()
	{
		System.out.println("Area of square is: "+(side*side));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of square is: "+(4*side));
	}

	public static void main(String[] args) 
	{
		Square s=new Square(5);
		s.area();
		s.perimeter();
		Rectangle r=new Rectangle(8,5);
		r.area();
		r.perimeter();
		
	}

}
