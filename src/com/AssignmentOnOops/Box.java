package com.AssignmentOnOops;

public class Box 
{
	int length;
	int width;
	int height;
	Box(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
	}
	public void displayVolume()
	{
		int volume=length*width*height;
		System.out.println("Volume of the box is="+volume);
	}

	public static void main(String[] args)
	{
		
		Box b=new Box(6,3,5);
		b.displayVolume();
		

	}

}
