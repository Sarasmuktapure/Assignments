package com.Assignment3;

public class ArithmaticOperation 
{
	public int addition(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	public int substraction(int x,int y)
	{
		int sub=x-y;
		return sub;
	}
	public int multiplication(int x,int y)
	{
		int multi=x*y;
		return multi;
	}
	public int division(int x,int y)
	{
		int div=x/y;
		return div;
	}
	

	public static void main(String[] args) 
	{
		ArithmaticOperation ao=new ArithmaticOperation();
		int sum=ao.addition(6, 8);
		System.out.println("Adition is="+sum);
		int sub=ao.substraction(10,3);
		System.out.println("Substarction is="+sub);
		int multi=ao.multiplication(5, 6);
		System.out.println("Multiplication is="+multi);
		int div=ao.division(60, 3);
		System.out.println("Division is="+div);
		

	}

}
