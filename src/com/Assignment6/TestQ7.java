package com.Assignment6;
//Q7.

interface X
{
	void methodX();
	
}
class Y implements X
{

	@Override
	public void methodX() {
		System.out.println("Method X");
		
	}
	
}
public class TestQ7 {

	public static void main(String[] args)
	{
		X y=new Y();
		y.methodX();
	}
}

