package com.Assignment5;
//Q7

class X
{
	public X(int i)
	{
		System.out.println(1);
	}
}
public class Test extends X
{
	

	//implicit X() constructor undefined must explicitely invoke another constructor
		
	
	public Test(int i)
	{
		super(i);
		System.out.println(2);
	}


	public static void main(String[] args)
	{
		Test t=new Test(8);
		
		

	}

}
