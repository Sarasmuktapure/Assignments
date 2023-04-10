package com.Assignment4;

public class IntegerChar
{
	public void display(int n,char ch)
	{
		System.out.println(n+" "+ch);
	}
	public void display(char ch,int n)
	{
		System.out.println(ch+" "+n);
	}
	

	public static void main(String[] args) 
	{
		IntegerChar ic=new IntegerChar();
		ic.display(12, 'A');
		ic.display('D', 15);
		

	}

}
